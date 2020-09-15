<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="include/header.jsp"%>

<!-- Content Wrapper -->
<div id="content-wrapper" class="d-flex flex-column">

	<!-- Main Content -->
	<div id="content">

		<!-- Begin Page Content -->
		<div class="container-fluid">

			<!-- Page Heading -->
			<h1 class="h3 mb-2 text-gray-800">MEMBER LIST</h1>

			<p class="mb-4">
				회원목록 &nbsp;&nbsp;&nbsp;<a href="/member/register">회원가입<a>
			</p>
			<form action="/auth/login" method="post">
				<p class="mb-4">

					<c:choose>
						<c:when test="${empty loginMember}">
						
							이메일 : <input type="text" name="email"> &nbsp;암호 : <input
								type="password" name="pwd">
							<input type="submit" value="LOGIN">
						</c:when>
						<c:otherwise>
							<a href="/auth/logout"><input type="button" value="LOGOUT"></a>
						</c:otherwise>
					</c:choose>

				</p>
			</form>
			<!-- DataTales Example -->

			<div class="card shadow mb-4">

				<div class="card-body">
					<div class="table-responsive">
						<table class="table table-bordered" id="dataTable" width="100%"
							cellspacing="0">
							<thead>
								<tr>
									<th>회원번호</th>
									<th>이름</th>
									<th>이메일</th>
									<th>작성일</th>
									<th>수정일</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${members}" var="member">
									<tr>
										<td><c:out value="${member.mno}" /></td>
										<td><a
											href='member/update?mno=<c:out value="${member.mno}" />'><c:out
													value="${member.mname}" /></a></td>
										<td><c:out value="${member.email}" /></td>
										<td><fmt:formatDate pattern="yyyy-MM-dd"
												value="${member.cre_date}" /></td>
										<td><fmt:formatDate pattern="yyyy-MM-dd"
												value="${member.mod_date}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>
		<!-- /.container-fluid -->

	</div>
	<!-- End of Main Content -->


</div>
<!-- End of Content Wrapper -->

<%@include file="include/footer.jsp"%>
</body>
</html>