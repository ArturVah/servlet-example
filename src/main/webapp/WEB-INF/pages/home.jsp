<%@ page import="com.mainserver.webik.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome <%=((User) request.getSession().getAttribute("user")).getUsername()%>
</body>
</html>
