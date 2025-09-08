<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>결과 출력</title>
</head>
<body>
<h2>자기소개</h2>
<p><%= request.getAttribute("name") %>님은
    <%=request.getAttribute("age")%>살의 <%= request.getAttribute("mbti")%> 성격을 가진 분이며, 좋아하는 음식으로는
    <%
        String[] foods = (String[]) request.getAttribute("foods");
        for (int i = 0; i < foods.length; i++) {
            out.print(foods[i].trim());
            if (i < foods.length - 1) {
                out.print(", ");
            }
        }
    %>


<%--    <c:forEach var="food" items="${foods}" varStatus="s">--%>
<%--  zz      ${food}<c:if test="${!s.last}">, </c:if>--%>
<%--    </c:forEach>--%>



    등이 있습니다.</p>

</body>
</html>