<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit sales</title>
</head>
<body>
    <div align="center">
        <h1>Sales Adding</h1>
        <form:form action="saveSales" method="post" modelAttribute="sales">
        <table>
            <tr>  
                <td><form:hidden path="orderId"/></td>
            </tr>
            <tr>
                <td>county</td>
                <td><form:input path="county" /></td>
            </tr>
            <tr>
                <td>itemType:</td>
                <td><form:input path="itemType" /></td>
            </tr>
            
             <tr>
                <td>channel:</td>
                <td><form:input path="channel" /></td>
            </tr>
            
             <tr>
                <td>priority:</td>
                <td><form:input path="priority" /></td>
            </tr>
            
            
            <tr>
                <td>date:</td>
                <td><form:input type="text" path="date" /></td>
            </tr>
            
             <tr>
                <td>shipdate:</td>
                <td><form:input type="text" path="shipdate" /></td>
            </tr>
            
             <tr>
                <td>units:</td>
                <td><form:input path="units" /></td>
            </tr>
            
             <tr>
                <td>price:</td>
                <td><form:input path="price" /></td>
            </tr>
            
            <tr>
                <td>unitCost:</td>
                <td><form:input path="unitCost" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>