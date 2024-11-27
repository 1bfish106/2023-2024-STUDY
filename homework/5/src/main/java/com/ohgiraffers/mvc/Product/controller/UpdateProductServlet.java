package com.ohgiraffers.mvc.Product.controller;

import com.ohgiraffers.mvc.Product.model.dto.ProductDTO;
import com.ohgiraffers.mvc.Product.model.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product/update")
public class UpdateProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String productCode = req.getParameter("productCode");
        String productName = req.getParameter("productName");

        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductCode(Integer.parseInt(productCode));
        productDTO.setProductName(productName);

        ProductService employeeService = new ProductService();
        int result = employeeService.updateProduct(productDTO);

        if(result > 0) {
            resp.sendRedirect(req.getContextPath() + "/product/select?productCode="+productCode);
        }else {
            req.setAttribute("message", "상품 정보 수정에 실패하였습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }
    }
}
