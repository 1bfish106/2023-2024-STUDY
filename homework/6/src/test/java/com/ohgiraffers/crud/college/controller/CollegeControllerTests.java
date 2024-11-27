package com.ohgiraffers.crud.college.controller;

import com.ohgiraffers.crud.configuration.Chap09CrudApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@SpringBootTest
@ContextConfiguration(classes = {Chap09CrudApplication.class})
public class CollegeControllerTests {

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(collegeController).build();
    }

    @Autowired
    private CollegeController collegeController;

    @Test
    public void 전체_대학_조회용_컨트롤러_테스트() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/college/list"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.forwardedUrl("college/list"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    @Transactional
    public void 신규_대학_등록용_컨트롤러_테스트() throws Exception {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("collegeName", "컨트롤러테스트");

        mockMvc.perform(MockMvcRequestBuilders.post("/college/regist").params(params))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/college/list"))
                .andDo(MockMvcResultHandlers.print());
    }
}
