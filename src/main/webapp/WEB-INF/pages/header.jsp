<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>
<div class="row-fluid">
    <div class="span8 offset4">
        <a href="index"><button class="btn" type="button">Home</button></a>
        <input type="text" placeholder="search"/>
        <button class="btn" type="button">Search</button>
        <c:choose>
            <c:when test="${not empty sessionScope.user.email}">
                Hi ${user.email}
                <a href="create_group_form"><button class="btn" type="button">Create Group</button></a>
                <a href="log_out"><button class="btn" type="button">Log Out</button></a>
            </c:when>
            <c:otherwise>
                <a href="sign_up_page"><button class="btn" type="button">Sign up</button></a>
                <a href="sign_in_page"><button class="btn" type="button">Sign in</button></a>
            </c:otherwise>
        </c:choose>
    </div>
</div>
