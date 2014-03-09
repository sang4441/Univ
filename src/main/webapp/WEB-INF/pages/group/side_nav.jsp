<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/Univ/resources/js/utils.js"></script>
<script src="/Univ/resources/js/router.js"></script>
<div class="content-left">
    <ul class="nav-left">
        <li class="nav-left-img"><a><img width="200px" height="130" src="${pageContext.request.contextPath}/resources/img/waterloo_logo.png" alt="effel tower"></a></li>
        <li class="nav-left-menu"><a href="${pageContext.request.contextPath}/group/${group.id}#about">About UW Act</a></li>
        <li class="nav-left-menu"><a href="${pageContext.request.contextPath}/group/${group.id}#event">Meeting/Events <span class="badge">1</span></a></li>
        <li class="nav-left-menu"><a href="#">Images/Videos</a></li>
        <li class="nav-left-menu"><a href="${pageContext.request.contextPath}/group/${group.id}#chat">Chat <span class="badge">42</span></a></li>
        <li class="nav-left-menu active"><a href="#">Members</a></li>
    </ul>
</div>
<div class="content-right"></div>

