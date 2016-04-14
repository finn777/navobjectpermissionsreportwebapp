<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>index</title>
</head>
<body>

<h3>NAVObjectPermissionsReportWebApp</h3>
${textURL}
${textRowsCount}
<form action="<c:url value="/"/>" method="POST">
    <table>
        <tr>
            <td>Object Type: <input type="text" name="filterobjecttype" value="${filter.filterobjecttype}"/><br/></td>
            <td>Object ID  : <input type="text" name="filterobjectid"  value="${filter.filterobjectid}"/><br/></td>
            <td><input type="submit" name="search" value="Search"/></td>
        </tr>
    </table>
</form>

<p/>
<table border = "1">
    <tr>
        <th>ObjectType</th>
        <th>ModuleName</th>
        <th>VersionName</th>
        <th>Read</th>
        <th>Insert</th>
        <th>Modify</th>
        <th>Delete</th>
        <th>Execute</th>
        <th>ProductLine</th>
    </tr>
    <c:forEach var="row" items="${rows}">
        <tr>
            <td><c:out value="${row.objecttype}"/></td>
            <td><c:out value="${row.modulename}"/></td>
            <td><c:out value="${row.versionname}"/></td>
            <td><c:out value="${row.read}"/></td>
            <td><c:out value="${row.insert}"/></td>
            <td><c:out value="${row.modify}"/></td>
            <td><c:out value="${row.delete}"/></td>
            <td><c:out value="${row.execute}"/></td>
            <td><c:out value="${row.productline}"/></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
