<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
  <HEAD>
    <TITLE>Hello-Webapp</TITLE>
  </HEAD>
<BODY>
<c:choose>
    <c:when test="${user!=null}">
        </br> <c:out value="Hello, ${user}!"/>
    </c:when>
    <c:otherwise>
        </br> <c:out value="Hello World!"/>
    </c:otherwise>
</c:choose>
</BODY>
</HTML>