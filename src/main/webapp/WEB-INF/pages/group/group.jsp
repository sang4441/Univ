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
    <c:choose>
        <c:when test="${not empty content}">
            <c:set var="content" value="${content}.jsp"/>
            <jsp:include page="${content}"/>
        </c:when>
        <c:otherwise>
            <%--<jsp:include page="find_club.jsp"/>--%>
        </c:otherwise>
    </c:choose>
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