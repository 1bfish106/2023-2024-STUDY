package com.ohgiraffers.crud.college.controller;

import com.ohgiraffers.crud.college.model.dto.subjectDTO;
import com.ohgiraffers.crud.college.model.dto.collegeDTO;
import com.ohgiraffers.crud.college.model.service.CollegeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/college")
public class CollegeController {

    /* logger 객체 생성*/
    private static final Logger logger = LoggerFactory.getLogger(CollegeController.class);

    private final CollegeService collegeService;

    private final MessageSource messageSource;

    public CollegeController(
            CollegeService collegeService, MessageSource messageSource) {
        this.collegeService = collegeService;
        this.messageSource = messageSource;
    }

    @GetMapping("/list")
    public String findCollegeList(Model model) {

        List<collegeDTO> collegeList = collegeService.findAllCollege();

        model.addAttribute("collegeList", collegeList);

        return "college/list";
    }

    @GetMapping("/regist")
    public void registPage(){

    }

    @GetMapping("/category")
    public @ResponseBody List<subjectDTO> findSubjectList(){
        return collegeService.findSubjectList();
    }

    @PostMapping("/regist")
    public String registCollege(@ModelAttribute collegeDTO college, RedirectAttributes rttr, Locale locale){

        collegeService.registCollege(college);

        rttr.addFlashAttribute("successMessage",messageSource.getMessage("registCollege",null,locale));

        return "redirect:/college/list";
    }

}
