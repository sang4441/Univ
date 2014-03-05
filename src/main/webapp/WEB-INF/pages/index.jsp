<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Univ</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/colorbox.css">

    <script src="${pageContext.request.contextPath}/resources/lib/jquery-1.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/jquery-ui.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/jquery.colorbox-min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/underscore-min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/backbone-min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/bootstrap.min.js"></script>

    <script src="${pageContext.request.contextPath}/resources/js/utils.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/models/clubmodel.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/views/header.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/views/clublist.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</head>

<body>


<%--<div class="span12">--%>
    <%--<div class="span10 offset1 navbar">--%>
        <%--<div class="nav-collapse collapse" id="top-category-nav">--%>
            <%--<ul class="nav myMenu">--%>
                <%--<li>--%>
                    <%--<a href="/Univ/category/1">All</a>--%>
                    <%--<div class="category-dropdown">--%>
                        <%--<ul>--%>
                            <%--<li><a href="">test</a></li>--%>
                            <%--<li><a href="">test</a></li>--%>
                            <%--<li><a href="">test</a></li>--%>
                            <%--<li><a href="">test</a></li>--%>
                        <%--</ul>--%>
                    <%--</div>--%>
                <%--</li>--%>
                <%--<li><a href="/Univ/category/2">Sports & athletic</a></li>--%>
                <%--<li><a href="/Univ/category/3">Arts & Music</a></li>--%>
                <%--<li><a href="/Univ/category/4">Charitable, cummunity</a></li>--%>
                <%--<li><a href="/Univ/category/5">Health</a></li>--%>
                <%--<li><a href="/Univ/category/6">Learning & Academics</a></li>--%>
                <%--<li><a href="/Univ/category/7">Entertainment & leisure</a></li>--%>
                <%--<li><a href="/Univ/category/8">Business, leadership</a></li>--%>
                <%--<li><a href="/Univ/category/9">Religion & Culture</a></li>--%>
            <%--</ul>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

<c:choose>
    <c:when test="${not empty sessionScope.user.email}">
        <jsp:include page="header.jsp" />
        <div id="content-body">
            <div class="container-fluid">
                <div class="row-fluid">
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
            </div>
        </div>
    </c:when>
    <c:otherwise>
        <div class="container-fluid">
            <div class="span4 offset6">
                <jsp:include page="sign_in.jsp" />

            </div>
            <div class="span5">
                <jsp:include page="sign_up.jsp" />
            </div>
        </div>


        <%--<a href="${pageContext.request.contextPath}/sign_up_page"><button class="btn" type="button">Sign up</button></a>--%>
        <%--<a href="${pageContext.request.contextPath}/sign_in_page"><button class="btn" type="button">Sign in</button></a>--%>
    </c:otherwise>
</c:choose>

<jsp:include page="footer.jsp" />



<script type="text/javascript">
    $(document).ready(function() {


        $('#top-category-nav ul li').bind('mouseover', openSubMenu);
        $('#top-category-nav ul li').bind('mouseout', closeSubMenu);

        function openSubMenu() {
            $(this).find('ul').css('visibility', 'visible');
        };

        function closeSubMenu() {
            $(this).find('ul').css('visibility', 'hidden');
        };
    });
</script>
</body>

</html>