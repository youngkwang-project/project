<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>회원가입</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/checkout/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.5/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<!-- Favicons -->
<link rel="apple-touch-icon"
	href="https://getbootstrap.com/docs/4.5/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon"
	href="https://getbootstrap.com/docs/4.5/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon"
	href="https://getbootstrap.com/docs/4.5/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest"
	href="https://getbootstrap.com/docs/4.5/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="https://getbootstrap.com/docs/4.5/assets/img/favicons/safari-pinned-tab.svg"
	color="#563d7c">
<link rel="icon"
	href="https://getbootstrap.com/docs/4.5/assets/img/favicons/favicon.ico">
<meta name="msapplication-config"
	content="/docs/4.5/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<script src="https://code.jquery.com/jquery-3.5.1.js"
	integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
	crossorigin="anonymous">
   
</script>
<script>
$().ready(function() {

   $("#check").click(function() {
      $.ajax({
         url : '/rest/check',
          data : {
            name : $("#firstName").val(),
         }, 
         dataType : 'text', /*html, text, json, xml, script*/
         method : 'get',
         success : function(data) {
            
        	 alert(data);

         }
    
      });
   });
   
});
</script>
<!-- Custom styles for this template -->
<link href="form-validation.css" rel="stylesheet">
</head>
<body class="bg-light">
	<div class="container">
		<div class="py-5 text-center">
			<img class="d-block mx-auto mb-4" src="" alt="" width="72"
				height="72">
			<h>MEMBER REGISTER
			</h2>
			<p class="lead">welcome to member</p>
		</div>
		<div class="col-md-8 order-md-1">
			<h4 class="mb-3">회원가입</h4>
			<form class="needs-validation" action="register" method="post"
				novalidate>
				<div class="row">
					<div class="col-md-6 mb-3">
						<label for="firstName">이름</label> <input type="text"
							class="form-control" name="mname" id="firstName" placeholder=""
							value="" required> <input type="button" id="check"
							value="중복확인">
						<div class="invalid-feedback">Valid first name is required.
						</div>
					</div>
				</div>
				<div class="mb-3">
					<label for="email">이메일 <span class="text-muted">(Optional)</span></label>
					<input type="email" class="form-control" name="email" id="email"
						placeholder="you@example.com">
					<div class="invalid-feedback">Please enter a valid email
						address for shipping updates.</div>
				</div>

				<div class="mb-3">
					<label for="password">암호</label> <input type="text"
						class="form-control" name="pwd" id="password" placeholder=""
						required>
					<div class="invalid-feedback">Please enter your password.</div>
				</div>

				<hr class="mb-4">
				<button class="btn btn-primary btn-lg btn-block" type="submit">회원가입</button>
			</form>
			<%@include file="include/footer.jsp"%>
</body>
</html>