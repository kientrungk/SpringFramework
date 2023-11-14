<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Danh S�ch Sinh Vi�n</title>
</head>
<body>
    <h2>Danh S�ch Sinh Vi�n</h2>
    
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Points</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="entity : ${entityList}">
                <td th:text="${entity.id}"></td>
                <td th:text="${entity.name}"></td>
                <td th:text="${entity.email}"></td>
                <td th:text="${entity.points}"></td>
            </tr>
        </tbody>
    </table>
</body>
</html>