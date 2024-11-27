<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <%-- WEB-INF안에 만들면 url을 통해 접근이 불가능하다 --%>
    <jsp:forward page="/WEB-INF/views/main/main.jsp"/>
</body>
</html>