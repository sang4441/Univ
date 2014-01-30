<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<h1>sign up pagae</h1>

<form method="post" action="create_user">

    <div><input type="text" name="email" placeholder="email"/></div>
    <div><input type="password" name="password" placeholder="password"/></div>
    <div><input type="text" name="firstName" placeholder="first name"/></div>

    <div><input type="text" name="lastName" placeholder="last name"/></div>
    <div><input type="submit" value="Sign up"></div>
</form>
