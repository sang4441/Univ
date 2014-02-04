<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>



    <h1>Event create!!!</h1>

<form action="create_event" method="post">
    <div><input type="text" name="title" placeholder="title"/></div>
    <div><textarea name="description" rows="4" cols="50" placeholder="description"></textarea></div>
    <div><input type="text" name="location" placeholder="location"/></div>
    <%--<div><input type="text" name="date" placeholder="date"</div>--%>
    <label class="radio">
        <input type="radio" name="public" id="optionsRadios1" value="public" checked>
        public</label>
    <label class="radio">
        <input type="radio" name="private" id="optionsRadios2" value="private">
        private
    </label>
    <div><input type="text" name="privacy" placeholder="privacy"></div>
    <div><input type="submit" value="Create event"></div>
</form>