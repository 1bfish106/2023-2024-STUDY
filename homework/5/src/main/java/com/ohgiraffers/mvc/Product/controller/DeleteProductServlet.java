package com.ohgiraffers.mvc.Product.controller;

import com.ohgiraffers.mvc.Product.model.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product/delete")
public class DeleteProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String productCode = req.getParameter("productCode");

        ProductService employeeService = new ProductService();
        int result = employeeService.deleteProduct(Integer.parseInt(productCode));

        if(result > 0 ){
            resp.sendRedirect(req.getContextPath()+ "/product/list");
        }else {
            req.setAttribute("message", "상품 삭제에 실패하였습니다.");
            req.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }
    }
}
