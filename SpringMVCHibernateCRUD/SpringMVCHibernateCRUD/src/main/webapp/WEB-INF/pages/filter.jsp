<%@page import="com.jwt.model.Sales"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Filter sales</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
    <div align="center">
        <h1>Sales Adding</h1>
        <form action="getSales">
        <table>
            <tr>
                <td>county</td>
                <td><input name="county" id="county"/></td>
            </tr>
            

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Get"></td>
            </tr>
            
        </table>
        
        <c:if test='${not empty sales}'>
        <table>
  <tr>
    <th>OrderID</th>
    <th>County</th>
    <th>ItemType</th>
    <th>Sales</th>
    <th>Channel</th>
    <th>Priority</th>
    <th>Units</th>
    <th>Price</th>
    <th>UnitCost</th>
    <th>Date</th>
    <th>ShipDate</th>
  </tr>
  <c:forEach items="${sales}" var="temp">
  <tr>
    <td>${temp.orderId}</td>
     <td>${temp.county}</td>
     <td>${temp.itemType}</td>
      <td>${temp.sales}</td>
       <td>${temp.channel}</td>
        <td>${temp.priority}</td>
      <td>${temp.units}</td>
       <td>${temp.price}</td>
        <td>${temp.unitCost}</td>
     <td>${temp.date}</td>
       <td>${temp.shipdate}</td>
  </tr>
  </c:forEach>
</table>
</c:if>
        <form>
    </div>
</body>
</html>