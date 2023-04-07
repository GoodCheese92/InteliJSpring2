<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>${data}</h3>
    <table>
        <c:forEach var="vo" items="${visit_list}">
            <tr>
                <td>${vo.idx}</td>
                <td>${vo.name}</td>
                <td>${vo.content}</td>
                <td>${vo.pwd}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
