<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title> Nhân Viên</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        #addButton {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Employe</h2>

  <a href="./addform">Thêm </a> 

    <table>
        <thead>
            <tr>
                <th>STT</th>
                <th>Tên</th>
                <th>Tiền Lương</th>
               
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="o">
         	 <tr >
                <td > ${o.id}</td>
                <td > ${o.name}</td>
                <td > ${o.wage}</td>
                </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>