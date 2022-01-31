<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Spring Boot 에서 JSP</title>
    <meta charset="UTF-8" />
    <style>
        table, tr, td, th {
            border: 1px solid #444444;
        }
    </style>
</head>
<body>
<div>
    <table>
        <tr>
            <th>언어</th>
            <th>통합 개발 환경</th>
            <th>빌드 도구</th>
        </tr>
        <tr>
            <td>${map.Language}</td>
            <td>${map.IDE}</td>
            <td>${map.BuildTool}</td>
        </tr>
    </table>
</div>
<div>
    <table>
        <c:forEach items="${list}" var="task">
            <tr>
                <td>${task}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>