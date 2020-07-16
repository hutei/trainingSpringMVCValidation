<%--
  Created by IntelliJ IDEA.
  User: Hutei Volodymyr
  Date: 7/15/2020
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer registration form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
        Fill out the form.Asterisk(*) means required.

    <form:form action="processForm" modelAttribute="customer">
        First name(*): <form:input path="firstName"></form:input>
        <form:errors path="firstName" cssClass="error"></form:errors>
        <br><br>
        Last name(*) : <form:input path="lastName"></form:input>
        <form:errors path="lastName" cssClass="error"></form:errors>
        <br><br>
        <input type="submit" value="Submit">

    </form:form>


</body>
</html>
