<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>


<div class="row-fluid">
    <div class="span8 offset2">
        <a href="/Univ"><button class="btn" type="button">Home</button></a>
        <input type="text" class="span8" placeholder="search"/>
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
    <div class="span12">
        <div class="span10 offset1 navbar">
            <div class="nav-collapse collapse" id="top-category-nav">
                <ul class="nav myMenu">
                    <li class="top-category">
                        <a href="#">All</a>
                        <div class="category-dropdown">
                            <ul>
                                <li><a href="">test</a></li>
                                <li><a href="">test</a></li>
                                <li><a href="">test</a></li>
                                <li><a href="">test</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="top-category"><a href="#">Sports & athletic</a>
                        <%--<ul class="sub-category">--%>
                            <%--<li><a href="Programmation.html">PROGRAMMATION</a></li>--%>
                            <%--<li><a href="Reseautique.html">RÉSEAUTIQUE</a></li>--%>
                        <%--</ul>--%>
                    </li>
                    <li><a href="#">Arts & Music</a></li>
                    <li><a href="#">Charitable, cummunity</a></li>
                    <li><a href="#">Health</a></li>
                    <li><a href="#">Learning & Academics</a></li>
                    <li><a href="#">Entertainment & leisure</a></li>
                    <li><a href="#">Business, leadership</a></li>
                    <li><a href="#">Religion & Culture</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>

