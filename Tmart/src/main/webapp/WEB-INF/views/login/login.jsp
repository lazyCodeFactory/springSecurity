<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../commonLayout/commonInclude.jsp" flush="true" />
<link rel="stylesheet" href="/resources/css/login/login.css">

</head>
<body>
	<div class="container body">
		<jsp:include page="../commonLayout/commonHeader.jsp" flush="true" />
		${errMsg }
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-offset-2 col-md-8 col-md-offset-2">
					<div class="loginform">
						<form action="/loginProcess" method="post">
							<div class="fieldArea">
								<div class="filedbox">
									<div class="col-md-offset-2 field col-md-8 col-md-offset-2" >
										<div class="headMessage">
											<h2>로그인</h2> 
										</div>
									</div>
									<div class="field col-md-7">
										<div class="loginItem">
 											<label class="title col-md-4">아이디</label>
											<input type="text" name="id" id="id" class="inputClass col-md-8" />
										</div>
										<div class="loginItem">
											<label class="title col-md-4"> 패스워드 </label>
											<input type="password" name="passwd" id="passwd" class="inputClass col-md-8" />
										</div>
									</div>
									<div class="btnArea col-md-5">
										<input type="submit" value="완료" class="subbtn">
									</div>
								</div>
 								<div class="snsLogin">
									<a href="#">페이스북 로그인 </a> <a href="#">네이버 로그인</a>

								</div>

							</div>

							


						</form>

					</div>
				</div>
			</div>
		</div>
		<jsp:include page="../commonLayout/commonFooter.jsp" flush="true" />

	</div>
</body>