<%--<%@ page language="java" import="javax.servlet.jsp.PageContent" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>--%>
<!DOCTYPE HTML>
<html>
<head>
<title>Univ</title>
<link rel="stylesheet" href="resources/css/styles.css" />
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
</head>

<body>
<div class="row-fluid">
	<div class="span8 offset4">
		<input type="text" placeholder="search"/>
		<button type="button">Search</button>
		<a href="signup"><button type="button">Sign up</button></a>
		<a href="create_group_form"><button type="button">Create Group</button></a>
	</div>
</div>


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