<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<h1>Sign In</h1>
<form method="post" action="${pageContext.request.contextPath}/signin">
    <div><input type="text" name="email" placeholder="email"/></div>
    <div><input type="password" name="password" placeholder="password"/></div>
    <div><input type="submit" value="Sign In"></div>
    <c:if test="${not empty err}">
        <div><c:out value="${err}"/></div>
    </c:if>
</form>
