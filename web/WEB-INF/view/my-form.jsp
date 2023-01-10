<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input
        path="firstName"/> <!-- Spring MVC will call student.getFirstName() (modelAttribute.getPath) -->

    <br><br>

    Last name: <form:input path="lastName"/> <!-- Spring MVC will call student.getLastName() -->

    <br><br>

    <input type="submit"/>
</form:form>

</body>
</html>