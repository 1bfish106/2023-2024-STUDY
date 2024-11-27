<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>상품 목록 전체 조회</title>
</head>
<body>
    <h1>상품 목록 전체 조회</h1>
    <table>
        <tr>
            <th>상품코드</th>
            <th>상품명</th>
            <th>원가</th>
            <th>출시일</th>
            <th>할인율</th>
            <th>판매량</th>
            <th>재고량</th>
            <th>제품분류코드</th>
            <th>생산상태</th>
        </tr>
        <c:forEach items="${ productList }" var="product">
            <tr>
                <td>${ product.productCode }</td>
                <td>${ product.productName }</td>
                <td>${ product.originCost }</td>
                <td>${ product.releaseDate }</td>
                <td>${ product.discountRate }</td>
                <td>${ product.salesQuantity }</td>
                <td>${ product.stockQuantity }</td>
                <td>${ product.categoryCode }</td>
                <td>${ product.productionStatus }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
