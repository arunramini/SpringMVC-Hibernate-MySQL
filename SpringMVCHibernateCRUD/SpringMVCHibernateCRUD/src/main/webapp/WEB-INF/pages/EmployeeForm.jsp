<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Employee</h1>
        <form:form action="saveEmployee" method="post" modelAttribute="employee">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>FirstName:</td>
                <td><form:input path="firstname" /></td>
            </tr>
            <tr>
                <td>LastName:</td>
                <td><form:input path="lastname" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Telephone1:</td>
                <td><form:input path="telephone1" /></td>
            </tr>
            <tr>
                <td>Telephone2:</td>
                <td><form:input path="telephone2" /></td>
            </tr>
            <tr>
                <td>county:</td>
                <td><form:input path="county" /></td>
            </tr>
            
             <tr>
                <td>postal:</td>
                <td><form:input path="postal" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>