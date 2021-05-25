<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
html, body {

    margin: 0;

    height: 100%;

    overflow: hidden;

}
.box {
 display:table;
     height: 1000px;
}
.box > span {
 display:table-cell;
 vertical-align:middle; 
}
</style>
</head>
<body>
	<jsp:include page="../header.jsp" flush="false" />
	<div class="floor_h80 flex center">
	
	
		<div class="shadow padding_50 width25 login_minw login_minh">
			<div class="login container" align=center>
				<div>
					<div class="font_design2 container_w5">
					<div>LOGO</div>
					<!-- 	<img alt="logo" class="margin_left_10 padding groupbox" width=74 height=55
							src="resources/img/logo2.PNG"> -->
					</div>
					<hr>
				</div>


			</div>
			
			
			
			 <div class="wrapper flex center" style="background:white; height:350px;" align=center>
    <div class="flex center" style="height:100%;">
       <div><h1> 회원가입 되셨습니다.</h1><p>
       <div class="button_submit2 flex center" style="margin-top:100px;">
       <a href="home" class="" style="color: white; font-size:20px;">main</a>
        
       </div>
       </div>
    </div>
	
		</div>
	
					

	
   
 </div>
 </div>
<jsp:include page="../tail.jsp" flush="false" />
</body>
</html>