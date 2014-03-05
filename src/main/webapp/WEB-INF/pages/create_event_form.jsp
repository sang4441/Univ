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
        <h1>New meeting/event</h1>
        <form action="create_event" method="post">
            <div><input class="span10" type="text" name="name" placeholder="name"/></div>
            <div><textarea class="span10" name="description" rows="4" cols="50" placeholder="description"></textarea></div>
            <div><input class="span10" type="text" name="location" placeholder="location"/></div>
            <%--<div><input type="text" name="date" placeholder="date"</div>--%>
            <label class="radio">
                <input type="radio" name="event_type" id="optionsRadios1" value="1" checked>
                meeting
            </label>
            <label calss="radio">
                <input type="radio" name="event_type" id="optionsRadios2" value="2">
                public event
            </label>
            <div>Date:
                <input  class="span8" type="text" name="event_date" placeholder="Event date" id="datepicker">
                <select name="time" multiple="multiple">
                    <option>12:00</option>
                    <option>12:30</option>
                    <option>13:00</option>
                    <option>13:30</option>
                    <option>14:00</option>
                </select>
            </div>

            <label class="checkbox">
                <input type="checkbox" name="emailNotice" value="">
                Send email notifications to all members
            </label>
            <div><input type="submit" value="Create event"></div>
        </form>
    </div>
</div>