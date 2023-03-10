<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}
<!-- calls student.getFirstName(), student.getLastName() -->

<br><br>

Country: ${student.country} <!-- calls student.getCountry() -->

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

<br><br>

Free passes: ${student.freePasses}

<br><br>

Postal code: ${student.postalCode}

<br><br>

Course code: ${student.courseCode}

</body>

</html>