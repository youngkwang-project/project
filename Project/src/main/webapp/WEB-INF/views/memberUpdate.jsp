<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link href="/resources/sources/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="/resources/sources/css/sb-admin-2.min.css" rel="stylesheet">
  
<title>회원정보 수정</title>

</head>
<body>

<div class="container">
		<div class="p-5">
			<div class="text-center">
				<h1 class="h4 text-gray-900 mb-4">회원정보수정</h1>
			</div>
			<form class="user" action="update" method="post">
				<div class="form-group row">
					<div class="col-sm-6 mb-3 mb-sm-0">
							회원번호 : <input type="text" class="form-control form-control-user"
							id="exampleFirstName" name="mno" value="${member.mno}"readonly>
					</div>
					<div class="col-sm-6">
							이름 : <input type="text" class="form-control form-control-user"
							id="exampleLastName" name="mname" value="${member.mname}">
					</div>
				</div>
				<div class="form-group">
						이메일 : <input type="email" class="form-control form-control-user"
						id="exampleInputEmail" name="email" value="${member.email}">
				</div>
				<div class="form-group row">
					<div class="col-sm-6 mb-3 mb-sm-0">
						비밀번호 : <input type="password" class="form-control form-control-user"
							id="exampleInputPassword" name="pwd" value="${member.pwd}">
							
					</div>
					<div class="col-sm-6 mb-3 mb-sm-0">
						가입일 : <input type="text" class="form-control form-control-user"
							id="exampleInputPassword"  value='<fmt:formatDate value="${member.cre_date}" type="date"></fmt:formatDate>' readonly>
					</div>
					<!-- <div class="col-sm-6">
						<input type="password" class="form-control form-control-user"
							id="exampleRepeatPassword" placeholder="Repeat Password">
					</div> -->
				</div>
				
				<input type="submit" class="btn btn-primary btn-user btn-block" value="수정"><br>
				<input type="reset" class="btn btn-primary btn-user btn-block" value="초기화"><br>
				<a href="/"><input type="button" class="btn btn-primary btn-user btn-block" value="처음으로"></a>
				<a href="delete?mno=${member.mno}"><input type="button" style="margin-top: 25px" class="btn btn-primary btn-user btn-block" value="삭제"></a>
			</form>
				
		</div>
	</div>





	<!-- Bootstrap core JavaScript-->
  <script src="/resources/sources/jquery/jquery.min.js"></script>
  <script src="/resources/sources/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="/resources/sources/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="/resources/sources/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="/resources/sources/chart.js/Chart.min.js"></script> s

  <!-- Page level custom scripts -->
  <script src="/resources/sourcesjs/demo/chart-area-demo.js"></script>
  <script src="/resources/sourcesjs/demo/chart-pie-demo.js"></script>
</body>
</html>