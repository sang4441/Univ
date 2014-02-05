<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<h1>Event create</h1>
<form action="create_event" method="post">
    <div><input type="text" name="title" placeholder="title"/></div>
    <div><textarea name="description" rows="4" cols="50" placeholder="description"></textarea></div>
    <div><input type="text" name="location" placeholder="location"/></div>
    <%--<div><input type="text" name="date" placeholder="date"</div>--%>
    <label class="radio">
        <input type="radio" name="privacy_level" id="optionsRadios1" value="1" checked>
        public
    </label>
    <%--<div><input type="text" name="privacy" placeholder="privacy"></div>--%>
    <div><input type="submit" value="Create event"></div>
</form>