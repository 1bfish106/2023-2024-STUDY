package com.ohgiraffers.mvc.Product.controller;

import com.ohgiraffers.mvc.Product.model.dto.ProductDTO;
import com.ohgiraffers.mvc.Product.model.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/product/insert")
public class InsertProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String productName = req.getParameter("productName");
        String originCost = req.getParameter("originCost");
        String releaseDate = req.getParameter("releaseDate");
        String discountRate = req.getParameter("discountRate");
        String salesQuantity = req.getParameter("salesQuantity");
        String stockQuantity = req.getParameter("stockQuantity");
        String categoryCode = req.getParameter("categoryCode");
        String productionStatus = req.getParameter("productionStatus");

        ProductDTO product = new ProductDTO();
        product.setProductName(productName);
        product.setOriginCost(originCost);
        product.setReleaseDate(releaseDate);
        product.setDiscountRate(discountRate);
        product.setSalesQuantity(salesQuantity);
        product.setStockQuantity(stockQuantity);
        product.setCategoryCode(categoryCode);
        product.setProductionStatus(productionStatus);

        System.out.println("insert request product : " + product);

        ProductService productService = new ProductService();
        int result = productService.insertProduct(product);

        if(result > 0 ){
            /*insert가 성공했을경우 요청 url이 그대로 남아있으면 브라우저 새로고침 시 insert 재요청이 발생한다.
            * redirect 처리가 필요하며 전체 사원 목록을 조회하는 기능을 요청하도록 한다.
            **/
            resp.sendRedirect(req.getContextPath()+ "/product/list");
        }else {
            req.setAttribute("message", "신규 상품 등록에 실패하였습니다.");
            req.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }
    }
}
