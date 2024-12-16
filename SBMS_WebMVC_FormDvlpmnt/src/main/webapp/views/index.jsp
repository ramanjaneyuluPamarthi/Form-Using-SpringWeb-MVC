<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Product Form
<form:form action="saveProduct" modelAttribute="prod" method="POST" >
<table>
<tr>
<td>Product Id  :</td>
<td><form:input path="peId"/></td>
</tr>
<tr>
<td>Product Name :</td>
<td><form:input path="peName"/></td>
</tr>
<tr>
<td>Product Price:</td>
<td><form:input path="pePrice"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>
</body>
</html>