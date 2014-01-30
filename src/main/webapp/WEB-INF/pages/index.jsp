<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Univ</title>
    <link rel="stylesheet" href="resources/css/styles.css" />
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
</head>

<body>

<jsp:include page="header.jsp" />
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <ul class="nav nav-tabs nav-stacked">
                <li><a><small>Category</small></a></li>
                <li><a>All</a></li>
                <li><a>Sports & athletic</a></li>
                <li><a>Arts & Music</a></li>
                <li><a>Charitable, cummunity service</a></li>
                <li><a>Health</a></li>
                <li><a>Learning & Academics & project</a></li>
                <li><a>Entertainment & leisure & life style</a></li>
                <li><a>Business, leadership, enterpreneur</a></li>
                <li><a>Religion & Culture</a></li>
            </ul>
        </div>

        <%--<div id="content" class="span10">--%>
            <c:choose>
                <c:when test="${not empty content}">
                    <c:set var="content" value="${content}.jsp"/>
                    <jsp:include page="${content}"/>
                </c:when>
                <c:otherwise>
                    <jsp:include page="body.jsp"/>
                </c:otherwise>
            </c:choose>

            <%--<jsp:include page="${content}"/>--%>
            <%--<div class="group-box">--%>
                <%--<div class="group-info">--%>
                    <%--<h3>A Capella Club, UW</h3>--%>
                    <%--<div>Category: Music</div>--%>
                    <%--<div>Leader: John Kim</div>--%>
                    <%--<div>Members: 184</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>
</div>
<jsp:include page="footer.jsp" />

<script src="resources/lib/jquery-1.7.1.min.js"></script>
<script src="resources/lib/underscore-min.js"></script>
<script src="resources/lib/backbone-min.js"></script>
<script src="resources/lib/bootstrap.min.js"></script>

<script src="resources/js/utils.js"></script>
<script src="resources/js/models/clubmodel.js"></script>
<script src="resources/js/views/header.js"></script>
<script src="resources/js/views/clublist.js"></script>
<script src="resources/js/main.js"></script>

<script type="text/javascript">
    $(document).ready(function() {
        $('.nav.myMenu > li').bind('mouseover', openSubMenu);
        $('.nav.myMenu > li').bind('mouseout', closeSubMenu);

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