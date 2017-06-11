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
                <input type="text" name="date" placeholder="Введите дату начала работы выбранного работника"/>
            </span>
    </div>

    <input type="submit" value="Добавить рабочего в департамент"/>

</form>

<form action="#" id='send' method='POST'>
    <fieldset>
        <label>Имя</label>
        <input type='text' name='name' placeholder='Имя' required><span></span>
        <br>
        <label>Фамилия</label>
        <input type='text' name='surname' placeholder='Фамилия' required><span></span>
        <br>
        <label>Город</label>
        <input type='text' name='city' placeholder='Город' required><span></span>
        <br>
    </fieldset>
    <fieldset>
        <label>Эл. почта</label>
        <input type='email' name='email' placeholder='Эл. почта' required><span></span>
        <br>
        <label>Пароль</label>
        <input type='password' name='pass' placeholder='Пароль' required><span></span>
        <br>
        <label>Повторите</label>
        <input type='password' name='repeat' placeholder='Повторите' required><span></span>
        <br>
    </fieldset>
    <fieldset>
        <p>Введите число с картинки</p>
        <img src="https://c22blog.files.wordpress.com/2010/10/input-black.gif">
        <input type='text' name='capcha' placeholder='число' required><span></span>
    </fieldset>
</form>
<div class="sum">
    <input type="submit" value="Зарегестрироваться" form='send'>
</div>


</body>
</html>