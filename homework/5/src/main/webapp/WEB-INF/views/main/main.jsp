<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>

<h1>PRODUCT 테이블에서 PRODUCT_CODE를 이용하여 상품 정보 조회해오기</h1>
<form action="${pageContext.servletContext.contextPath}/product/select">
    <label>조회할 상품 : </label>
    <input type="text" name="productCode" id="productCode">
    <button>조회하기</button>
</form>

<h1>PRODUCT 테이블에서 상품 전체 정보 조회(판매 중인 상품만 조회)</h1>
<button onclick="location.href='${pageContext.servletContext.contextPath}/product/list'">
    상품 정보 전체 조회하기
</button>
<h1>PRODUCT 테이블에서 신규 상품 정보 추가</h1>
<form action="${ pageContext.servletContext.contextPath }/product/insert" method="post">
    상품명 : <input type="text" name="productName"><br>
    상품가격 : <input type="text" name="originCost"><br>
    출시일 : <input type="text" name="releaseDate"><br>
    할인율 : <input type="text" name="discountRate"><br>
    판매량 : <input type="text" name="salesQuantity"><br>
    재고량 : <input type="text" name="stockQuantity"><br>
    제품분류코드 : <select name="categoryCode">
        <option value="D1">1</option>
        <option value="D2">2</option>
        <option value="D3">3</option>
        <option value="D3">4</option>
        <option value="D3">5</option>
    </select>
    <br>
    판매가능상태 : <select name="productionStatus">
        <option value="y">y</option>
        <option value="n">n</option>
    </select>
    <br>
    <button type="submit">등록하기</button>
</form>

<h1>PRODUCT 테이블에서 상품명 수정</h1>
<form action="${ pageContext.servletContext.contextPath }/product/update" method="post">
    상품번호 : <input type="text" name="productCode"/>
    변경할 상품명 : <input type="text" name="productName"/>
    <button type="submit">상품명 변경</button>
</form>

<h1>PRODUCT 테이블에서 상품 정보 삭제</h1>
<form action="${ pageContext.servletContext.contextPath }/product/delete" method="post">
    사번 : <input type="text" name="productCode"/>
    <button type="submit">상품 정보 삭제</button>
</form>
</body>
</html>