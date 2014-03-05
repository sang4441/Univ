<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>


<div class="row-fluid">
    <div class="span8 offset2">
        <a href="/Univ"><button class="btn" type="button">${user.email}</button></a>
        <div class="btn-group">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="/Univ/club">
                Find club
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <c:forEach items="${categories}" var="category">
                    <li><a href="/Univ/category/${category.id}">${category.name}</a></li>
                </c:forEach>
            </ul>
        </div>
        <input type="text" class="span6" placeholder="search"/>
        <button class="btn" type="button">Search</button>
        <a href="${pageContext.request.contextPath}/log_out"><button class="btn" type="button">Log Out</button></a>

    </div>
</div>

