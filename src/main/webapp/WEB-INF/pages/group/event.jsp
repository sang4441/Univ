<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="side_nav.jsp"/>
<div class="content-right">
    <div class="event-header">
        <p><a class="btn btn-default" id="create-event" role="button">Create event/meeting</a></p>
    </div>
    <div class="event-wrap">
        <div class="event-content">
            <div class="event-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png"> UW act
            </div>
            <div class="event-name">Meeting name: Event name</div>
            <div class="event-description">Description: My description</div>
            <div class="event-location">Location: RCH 301</div>
            <div class="event-created-time">10 hours ago</div>
        </div>
        <div class="event-date-wrap">
            <div class="event-date-container">
                <div class="event-month-year"><span class="event-month">Jan</span><span class="event-year">'14</span></div>
                <div class="event-day">7th</div>
                <div class="event-time">8:00 pm</div>
            </div>
        </div>
    </div>
    <div class="event-wrap">
        <div class="event-content">
            <div class="event-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png"> UW act
            </div>
            <div class="event-name">Meeting name: Event name</div>
            <div class="event-description">Description: My description</div>
            <div class="event-location">Location: RCH 301</div>
            <div class="event-created-time">10 hours ago</div>
        </div>
        <div class="event-date-wrap">
            <div class="event-date-container">
                <div class="event-month-year"><span class="event-month">Jan</span><span class="event-year">'14</span></div>
                <div class="event-day">7th</div>
                <div class="event-time">8:00 pm</div>
            </div>
        </div>
    </div>
    <div class="event-wrap">
        <div class="event-content">
            <div class="event-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png"> UW act
            </div>
            <div class="event-name">Meeting name: Event name</div>
            <div class="event-description">Description: My description</div>
            <div class="event-location">Location: RCH 301</div>
            <div class="event-created-time">10 hours ago</div>
        </div>
        <div class="event-date-wrap">
            <div class="event-date-container">
                <div class="event-month-year-past"><span class="event-month">Jan</span><span class="event-year-past">'14</span></div>
                <div class="event-day">7th</div>
                <div class="event-time">8:00 pm</div>
            </div>
        </div>
    </div>
    <div class="event-wrap">
        <div class="event-content">
            <div class="event-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png"> UW act
            </div>
            <div class="event-name">Meeting name: Event name</div>
            <div class="event-description"> Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description</div>
            <div class="event-location">Location: RCH 301</div>
            <div class="event-created-time">10 hours ago</div>
        </div>
        <div class="event-date-wrap">
            <div class="event-date-container">
                <div class="event-month-year-past"><span class="event-month">Jan</span><span class="event-year-past">'14</span></div>
                <div class="event-day">7th</div>
                <div class="event-time">8:00 pm</div>
            </div>
        </div>
    </div>
    <div class="event-wrap">
        <div class="event-content">
            <div class="event-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png"> UW act
            </div>
            <div class="event-name">Meeting name: Event name</div>
            <div class="event-description">Description: My description</div>
            <div class="event-location">Location: RCH 301</div>
            <div class="event-created-time">10 hours ago</div>
        </div>
        <div class="event-date-wrap">
            <div class="event-date-container">
                <div class="event-month-year-past"><span class="event-month">Jan</span><span class="event-year-past">'14</span></div>
                <div class="event-day">7th</div>
                <div class="event-time">8:00 pm</div>
            </div>
        </div>
    </div>

</div>
<script>
    $(document).ready(function() {
        $('#create-event').click(function() {
            $.colorbox({href:"${pageContext.request.contextPath}/create_event_form/${group.id}"});
        })
    });
</script>