
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>사원 정보</title>
</head>
<body>
    <h1>${ param.productCode }번 상품의 정보</h1>
    <h4>사원명 : ${ selectedProduct.productName }</h4>
    <h4>상품코드 : ${ selectedProduct.productCode }</h4>
    <h4>상품가격 : ${ selectedProduct.originCost }</h4>
    <h4>상품 출시일 : ${ selectedProduct.releaseDate }</h4>

</body>
</html>
