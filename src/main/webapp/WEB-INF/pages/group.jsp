<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row-fluid">
    <div class="span8 offset2">
        <c:if test="${isAdmin}">
            <div id="create-event"><button>Create event/meeting</button></div>
        </c:if>
        <div><button>Invite members</button></div>
    </div>
</div>


<script>
    $(document).ready(function() {
        $('#create-event').click(function() {
            $.colorbox({href:"${pageContext.request.contextPath}/create_event_form"});
        })
    });
</script>