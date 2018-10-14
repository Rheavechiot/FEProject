<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/addSupplier" method="post">

Supplier Name: <input type="text" name="sName"/>
Supplier Address: <input type="text" name="sAddress"/>

<input type="submit" value="Supplier Insert"/>
</form>

</body>
</html>