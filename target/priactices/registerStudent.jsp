<%--
  Created by IntelliJ IDEA.
  User: 忍
  Date: 2019/4/2
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/student/add1.do" method="get">
        姓名：<input type="text" name="name"/><br/>
        年龄：<input type="text" name="age"><br/>
        学校名称：<input type="text" name="school.schoolName">
        学校地址：<input type="text" name="school.address">
        <input type="submit" value="注册">
    </form>
</body>
</html>
