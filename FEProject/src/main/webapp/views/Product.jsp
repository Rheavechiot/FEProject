<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/welcome" method="post">

Product Name: <input type="text" name="pName"/>
Product Cost: <input type="text" name="pCost"/>
Supplier ID: <input type="text" name="sId"/>
<input type="submit" value="Product Insert"/>
</form>

</body>
</html>
