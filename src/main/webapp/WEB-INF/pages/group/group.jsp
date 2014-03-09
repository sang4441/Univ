<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="side_nav.jsp"/>
<script src="${pageContext.request.contextPath}/resources/js/router.js"></script>
<div class="content-right">
    <div class="event-header">
        <p><a class="btn btn-default" id="create-event" role="button">Create event/meeting</a></p>
    </div>
    <div id="content-event">

    </div>
</div>



<%--<script>--%>
    <%--$(document).ready(function() {--%>
        <%--$('#create-event').click(function() {--%>
            <%--$.colorbox({href:"${pageContext.request.contextPath}/create_event_form/${group.id}"});--%>
        <%--})--%>
    <%--});--%>
<%--</script>--%>