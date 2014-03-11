<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<script>
    $(function() {
        $( "#datepicker" ).datepicker();
    });
</script>
<div class="row-fluid">
    <div class="span10 offset1">
        <h2>New meeting & event</h2>
        <form action="${pageContext.request.contextPath}/create_event" method="post">
            <div class="input-group">
                <div><input class="form-control" type="text" name="name" placeholder="name of the event"/></div>
                <div><textarea class="form-control" name="description" rows="4" cols="50" placeholder="description"></textarea></div>
                <div><input class="form-control" type="text" name="location" placeholder="location"/></div>
            </div>

            <%--<div><input type="text" name="date" placeholder="date"</div>--%>
            <label class="radio">
                <input type="radio" name="type_id" id="optionsRadios1" value="1" checked>
                meeting
            </label>
            <label calss="radio">
                <input type="radio" name="type_id" id="optionsRadios2" value="2">
                public event
            </label>
            <div>Date:
                <input type="date" name="date_event_string">
                <%--<input  class="span8" type="text" name="date_event" placeholder="Event date" id="datepicker">--%>
                <select name="time_event_string" multiple="multiple">
                    <option value="12:00:00">12:00</option>
                    <option value="12:30:00">12:30</option>
                    <option value="13:00:00">13:00</option>
                    <option value="13:30:00">13:30</option>
                    <option value="14:00:00">14:00</option>
                </select>
            </div>

            <label class="checkbox">
                <input type="checkbox" name="emailNotice" value="">
                Send email notifications to all members
            </label>
            <input type="hidden" name="group_id" value="${group.id}">
            <div><input type="submit" value="Create event"></div>
        </form>
    </div>
</div>