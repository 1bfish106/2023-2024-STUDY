package com.ohgiraffers.mvc.Product.controller;

import com.ohgiraffers.mvc.Product.model.dto.ProductDTO;
import com.ohgiraffers.mvc.Product.model.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product/select")
public class SelectOneProductByCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int productCode = Integer.parseInt(req.getParameter("productCode"));
        System.out.println("productCode : " + productCode);

        ProductService productService = new ProductService();
        ProductDTO selectedProduct = productService.selectOneProductByCode(Integer.parseInt(String.valueOf(productCode)));
        System.out.println("selectedProduct : " + selectedProduct);

        String path = "";
        if(selectedProduct != null){
            path = "/WEB-INF/views/product/showProductInfo.jsp";
            req.setAttribute("selectedProduct", selectedProduct);
        }else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "해당 상품은 존재하지않습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
