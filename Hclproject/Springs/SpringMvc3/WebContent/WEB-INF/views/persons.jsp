<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.red{
color:red;
}
</style>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/persons/process"
		modelAttribute="p" method="post">

FirstName<form:input path="firstName" />
		<span><form:errors path="firstName" cssClass="red"></form:errors></span>
		<br>
LastName<form:input path="lastName" />
		<span><form:errors path="lastName" cssClass="red"></form:errors></span>

		<br>
		<input type="submit" value="submit">

	</form:form>
</body>
</html>