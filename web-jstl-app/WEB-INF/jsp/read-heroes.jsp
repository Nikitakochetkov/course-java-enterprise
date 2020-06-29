<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/24/2020
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="/WEB-INF/jsp/common/jstl-connect.jsp"  %>
<html>
<head>
    <title>Read Heroes</title>
</head>
<body>
<%@include file="/WEB-INF/jsp/common/header.jsp"  %>
<main>
    <nav class="navbar">
        <div class="col-4"></div>
        <div class="col-4">
            <h4 class="p-3">Heroes</h4>
            <c:forEach items="${sessionScope.heroesList}" var="heroes">
                <table border="1" class="border border-primary">
                    <tr>
                        <td class="pl-3">
                            <a href="${pageContext.request.contextPath}/heroServlet?heroId=${heroes.id}">
                                    ${heroes.name}
                            </a>
                        </td>
                    </tr>
                </table>
            </c:forEach>
        </div>
        <div class="col-4"></div>
    </nav>
</main>
<%@include file="/WEB-INF/jsp/common/footer.jsp" %>
</body>
</html>
