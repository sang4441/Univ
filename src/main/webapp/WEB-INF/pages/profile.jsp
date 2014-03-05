<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row-fluid">
    <div class="span8 offset2">
        <div class="span3">
            <img src="${pageContext.request.contextPath}/resources/img/effel.jpg" alt="effel tower">
            <div>My Clubs</div>
            <ul>
                <c:forEach items="${myGroups}" var="myGroup">
                    <li><a href="${pageContext.request.contextPath}/group/${myGroup.id}">${myGroup.name}</a></li>
                </c:forEach>
            </ul>
        </div>
        <div class="span5">
            <div>Events</div>
            <ul>
                <li>Events 1</li>
                <li>Events 1</li>
                <li>Events 1</li>
                <li>Events 1</li>
                <li>Events 1</li>
                <li>Events 1</li>
            </ul>
        </div>
    </div>
</div>
