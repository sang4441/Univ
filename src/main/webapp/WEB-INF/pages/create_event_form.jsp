<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>



    <h1>Event create!!!</h1>

<form action="create_event" method="post">
    <div><input type="text" name="name" placeholder="name"/></div>
    <div><textarea name="description" rows="4" cols="50" placeholder="description"></textarea></div>
    <div>
        <select name="groupId">
            <option disabled>Choose category of your group</option>
            <option value="2">Sports & athletic</option>
            <option value="3">Arts & Music</option>
            <option value="4">Charitable, cummunity service</option>
            <option value="5">Health</option>
            <option value="6">Learning & Academics & project</option>
            <option value="7">Entertainment & leisure & life style</option>
            <option value="8">Business, leadership, enterpreneur</option>
            <option value="9">Religion & Culture</option>
        </select>
    </div>
    <div><input type="submit" value="Create event"></div>
</form>