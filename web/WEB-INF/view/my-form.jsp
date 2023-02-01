<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>

<style>
    .error {
        color: red
    }
</style>

<body>

<i>Fill out the form. Asterisk (*) means required.</i>

<br><br>
<form:form action="processForm" modelAttribute="student">

    First name: <form:input
        path="firstName"/> <!-- Spring MVC will call student.setFirstName() (modelAttribute.setPath) -->

    <br><br>

    Last name: <form:input path="lastName"/> <!-- Spring MVC will call student.setLastName() -->
    <form:errors path="lastName" cssClass="error"/>

    <br><br>

    Country:

    <form:select path="country"> <!-- Spring MVC will call student.setCountry() -->
        <form:options items="${student.countryOptions}"/> <!-- Spring MVC will call student.getCountryOptions() -->

    </form:select>

    <br><br>

    Favorite language:

    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>

    <br><br>

    Operating systems:

    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

    <br><br>
    Free passes: <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>

    <br><br>
    Postal code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>

    <br><br>
    Course code: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>

    <br><br>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>