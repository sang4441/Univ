<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="row-fluid">
    <div class="span8 offset2">
        <h1>Create new group</h1>
        <form action="create_group" method="post">
            <div><input type="text" name="name" placeholder="name"/></div>
            <div><textarea name="description" rows="4" cols="50" placeholder="description"></textarea></div>
            <div>
                <select name="typeId">
                    <option disabled>Choose type of your group</option>
                    <option value="1">Club</option>
                    <option value="2">Team</option>
                </select>
            </div>
            <div>
                <select name="categoryId">
                    <option disabled>Choose category of your group</option>
                    <c:forEach items="${categories}" var="cagegory">
                        <option value="${cagegory.id}">${cagegory.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div><input type="submit" value="Create group"></div>
        </form>
    </div>
</div>