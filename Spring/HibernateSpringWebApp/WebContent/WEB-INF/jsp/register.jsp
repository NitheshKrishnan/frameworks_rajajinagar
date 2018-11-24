<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="saveemployee" modelAttribute="employee">

<form:input placeholder="Enter Username" path="username"/><br>
<form:input placeholder="Enter Password" path="password"/><br>
<form:input placeholder="Enter First Name" path="firstName"/><br>
<form:input placeholder="Enter Middle Name" path="middleName"/><br>
<form:input placeholder="Enter Last Name" path="lastName"/><br>
<form:input placeholder="Enter Gender" path="gender"/><br>
<form:input placeholder="Enter Experience" path="experience"/><br>
<form:input placeholder="Enter Salary" path="salary"/><br>
<input type="submit" value="Register">

</form:form>

</body>
</html>