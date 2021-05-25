<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>

<body>
<div class="floor_h7 shadow container_w100">
	<div class="font_design2 container_w5">
	<a href="home.do" class="margin_left_10 padding">LOGO</a>
</div>

<div class="container_w30 flex center">				
	<c:set var="admin" value="admin" />
	<c:if test="${name != null}"> <!-- 로그인을 했으면 프로필 창을 보이게 -->
		<img alt="logo" class="" width="40" height="40" onclick="seeprofile()" style="border-radius:50px; margin-right:15px; overflow:hidden" src="resources/profile/${imgname}">
	</c:if>
	${name}${welcome}<br>
	<c:if test="${name == admin}"> <!-- 관리자만 볼수 있는 히든매뉴 -->
		<a href="makestudyroom" style="margin-left:20px; font-weight:900;">병력 관리</a>
	</c:if>
</div>
<div class="container_w25 flex center">
</div>
<div class="container_w30 flex center font_design3">
<div class=" hover flex center width33 height100"><a href="reserveok" class="btn-5 width100 height100 hover flex center">버튼1</a></div>
<div class=" hover flex center width33 height100"><a href="studyroom" class="btn-5 width100 height100 hover flex center">버튼2</a></div>
<div class=" hover flex center width33 height100"><a href="joingroup" class="btn-5 width100 height100 hover flex center">버튼3</a></div>
 <div class="hover flex center width33 height100"><a href="signup.do" class="btn-5 width100 height100 hover flex center">JOINUS</a></div> 
 <div class="hover flex center width33 height100">

			<%
				if (session.getAttribute("name") == null)//세션변수가 없다면 즉 로그인을 했다면, 안했다면
				{
			%>
			<a href="login.do" class="btn-5 width100 height100 hover flex center">LOGIN</a>
			<%
				} else
				{
			%>
			<a href="logout.do" class="btn-5 width100 height100 hover flex center">LOGOUT</a>
			<%
			} 
			%>


</div>
<!--  -->
</div>
<div class="container_w10 flex center ">
	
	<a href="invited" class="flex center width100 height100 hover btn-5">${messege}<span class="messege flex center fontweight900" onclick="">
	 	<c:if test="${invitenum != 0}">
	 	${invitenum}
				</c:if>
	 </span></a>
	
</div>
</div>

<div class="floor_h5">

</div>
</body>
</html>