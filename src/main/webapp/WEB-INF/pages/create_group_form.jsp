<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<jsp:include page="header.jsp" />

    <h1>Group create!!!</h1>
	
	<%--<form:form action="/create_group" method="post" modelAttribute="group">--%>
		<%--<div><form:input type="text" path="name" placeholder="name"/></div>--%>
		<%--<div><form:textarea path="description" rows="4" cols="50" placeholder="description"/></div>--%>
		<%--<div>--%>
			<%--<form:select path="type_id">--%>
			  <%--<option disabled>Choose type of your group</option>--%>
			  <%--<option value="1">Club</option>--%>
			  <%--<option value="2">Team</option>--%>
			<%--</form:select>--%>
		<%--</div>--%>
		<%--<div>--%>
			<%--<form:select path="category_id">--%>
			  <%--<option disabled>Choose category of your group</option>					--%>
			  <%--<option value="2">Sports & athletic</option>--%>
			  <%--<option value="3">Arts & Music</option>--%>
			  <%--<option value="4">Charitable, cummunity service</option>--%>
			  <%--<option value="5">Health</option>--%>
			  <%--<option value="6">Learning & Academics & project</option>--%>
			  <%--<option value="7">Entertainment & leisure & life style</option>--%>
			  <%--<option value="8">Business, leadership, enterpreneur</option>--%>
			  <%--<option value="9">Religion & Culture</option>--%>
			<%--</form:select>--%>
		<%--</div>--%>
		<%--<div><input type="submit" value="Create group"></div>--%>
	<%--</form:form>--%>

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
    <div><input type="submit" value="Create group"></div>
</form>