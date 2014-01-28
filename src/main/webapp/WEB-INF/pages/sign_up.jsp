<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


    <jsp:include page="header.jsp" />
	<h1>sign up pagae</h1>
	
	<%--<form:form method="post" action="create_user" modelAttribute="userForm">--%>

        <%--<div><form:input type="text" path="email" placeholder="email"/></div>--%>
        <%--<div><form:input type="password" path="password" placeholder="password"/></div>--%>
        <%--<div><form:input type="text" path="firstName" placeholder="first name"/></div>--%>

        <%--<div><form:input type="text" path="lastName" placeholder="last name"/></div>--%>
		<%--<div><input type="submit" value="Sign up"></div>--%>
	<%--</form:form>--%>

<%--<form:form method="post" action="/create_user" modelAttribute="user">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td>First Name :</td>--%>
            <%--&lt;%&ndash;<td><form:input path="email" /></td>&ndash;%&gt;--%>
        <%--</tr>--%>

    <%--</table>--%>
<%--</form:form>--%>


<form method="post" action="create_user">

    <div><input type="text" name="email" placeholder="email"/></div>
    <div><input type="password" name="password" placeholder="password"/></div>
    <div><input type="text" name="firstName" placeholder="first name"/></div>

    <div><input type="text" name="lastName" placeholder="last name"/></div>
    <div><input type="submit" value="Sign up"></div>
</form>