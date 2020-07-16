<%--
  Created by IntelliJ IDEA.
  User: Hutei Volodymyr
  Date: 7/9/2020
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>student registration form</title>
</head>
<body>

        <form:form action="processForm" modelAttribute="student">

            First name: <form:input path="firstName"></form:input>

            <br>

            Last name: <form:input path="lastName"/>

            <br>
            <form:select path="country">
                <form:options items="${student.countryOptions}"></form:options>
            </form:select>
            <br>
            JAVA<form:radiobutton path="favoriteLanguage" value="JAVA"></form:radiobutton>
            C#<form:radiobutton path="favoriteLanguage" value="C#"></form:radiobutton>
            Python<form:radiobutton path="favoriteLanguage" value="Python"></form:radiobutton>
            JavaScript<form:radiobutton path="favoriteLanguage" value="JavaScript"></form:radiobutton>
            <br>

            <input type="submit" value="Submit"/>

        </form:form>



</body>
</html>
