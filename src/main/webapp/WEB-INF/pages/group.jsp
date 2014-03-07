<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="content-left">
    <ul class="nav-left">
        <li><a><img width="299px" src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png" alt="effel tower"></a></li>
        <li class="nav-left-menu"><a href="#">UW Act</a></li>
        <li class="nav-left-menu"><a href="#">Meeting/Events</a></li>
        <li class="nav-left-menu"><a href="#">Images/Videos</a></li>
        <li class="nav-left-menu"><a href="#">Chat</a></li>
        <li class="nav-left-menu active"><a href="#">Members</a></li>
    </ul>
</div>
<div class="content-right">
    <div>About</div>
    <div>Meeting</div>
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
    <div>Chatting</div>
        <div class="post-input-wrap">
            <form>
                <div class="post-input">
                    <textarea name="post-input-content"></textarea>
                </div>
                <div class="post-input-submit">
                    <input type="submit" value="Chat"/>
                </div>
            </form>
        </div>
        <div class="post-output-wrap">
            <div class="post-output-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png">
            </div>
            <div class="post-output">
                <div class="post-output-name">SANGHWAN KIM</div>
                <div class="post-output-content">w: auto; overflow: aulow: auto; overflow: auto;</div>
                <div class="post-output-time">10 hours ago</div>
            </div>
        </div>
        <div class="post-output-wrap">
            <div class="post-output-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png">
            </div>
            <div class="post-output">
                <div class="post-output-name">SANGHWAN KIM</div>
                <div class="post-output-content">w: auto; overflow: auto; overflow: auto;o; overflow: auto; overflow: auto; o; overflow: auto; overflow: auto;</div>
                <div class="post-output-time">10 hours ago</div>
            </div>
        </div>
        <div class="post-output-wrap">
            <div class="post-output-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png">
            </div>
            <div class="post-output">
                <div class="post-output-name">SANGHWAN KIM</div>
                <div class="post-output-content">w: auto; overflow: auto; overflow: auto;o; overflow: auto; overflow: auto; o; overflow: auto; overflow: auto;</div>
                <div class="post-output-time">10 hours ago</div>
            </div>
        </div>
        <div class="post-output-wrap">
            <div class="post-output-img">
                <img width="40px" height="40px " src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png">
            </div>
            <div class="post-output">
                <div class="post-output-name">SANGHWAN KIM</div>
                <div class="post-output-content">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>
                <div class="post-output-time">10 hours ago</div>
            </div>
        </div>

    <div>Members</div>
    <div>Images</div>
</div>


<%--<div class="row-fluid">--%>
    <%--<div class="span8 offset2">--%>
        <%--<c:if test="${isAdmin}">--%>
            <%--<div id="create-event"><button>Create event/meeting</button></div>--%>
            <%--<div><button>Invite members</button></div>--%>
        <%--</c:if>--%>
    <%--</div>--%>
    <%--<div class="span8 offset2">--%>
        <%--<img src="${pageContext.request.contextPath}/resources/img/effel.jpg" alt="effel tower">--%>
        <%--<div><h2>${group.name}</h2></div>--%>
        <%--<div>${group.description}</div>--%>
        <%--<div>Events</div>--%>
        <%--<hr>--%>
        <%--<c:forEach items="${events}" var="event">--%>
            <%--<div>--%>
                <%--<div>Name: ${event.name}</div>--%>
                <%--<div>Description: ${event.description}</div>--%>
                <%--<div>Location: ${event.location}</div>--%>
                <%--<div>Date: ${event.date_event}</div>--%>
                <%--<hr>--%>
            <%--</div>--%>
        <%--</c:forEach>--%>
    <%--</div>--%>
<%--</div>--%>

<script>
    $(document).ready(function() {
        $('#create-event').click(function() {
            $.colorbox({href:"${pageContext.request.contextPath}/create_event_form/${group.id}"});
        })
    });
</script>