package com.ohgiraffers.mvc.Product.controller;

import com.ohgiraffers.mvc.Product.model.dto.ProductDTO;
import com.ohgiraffers.mvc.Product.model.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/product/list")
public class SelectAllProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService productService = new ProductService();
        List<ProductDTO> productList = productService.selectAllProduct();

        String path = "";
        if(productList != null && !productList.isEmpty()){
            path = "/WEB-INF/views/product/productList.jsp";
            req.setAttribute("productList", productList);
        }else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "상품 전체 목록이 조회 되지 않습니다.");

        }

        req.getRequestDispatcher(path).forward(req, resp);

    }
}
