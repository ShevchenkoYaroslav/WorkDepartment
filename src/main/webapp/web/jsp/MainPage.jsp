<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>WorkDepartment</title>
    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    <meta charset="utf-8">
</head>
<body>

<form action="<c:url value='/MainPage' />" method="post">
    <div>
            <span>firstNameOfWorker:
                <input type="text" name="firstNameOfWorker" placeholder="Введите имя работника"/>
            </span>
    </div>

    <div>
            <span>lastNameOfWorker:
                <input type="text" name="lastNameOfWorker" placeholder="Введите фамилию работника"/>
            </span>
    </div>

    <div>
            <span>mailOfWorker:
                <input type="text" name="mailOfWorker" placeholder="Введите адресс эл. почты работника"/>
            </span>
    </div>

    <div>
            <span>ageOfWorker:
                <input type="text" name="ageOfWorker" placeholder="Введите возраст работника"/>
            </span>
    </div>

    <div>
            <span>date:
                <input type="text" name="date" placeholder="Введите дату начала работы"/>
            </span>
    </div>

    <input type="submit" value="Добавить рабочего"/>

</form>

</body>
</html>