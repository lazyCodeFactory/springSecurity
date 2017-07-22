<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../commonLayout/commonInclude.jsp" flush="true" />
<link rel="stylesheet" href="/resources/css/enroll/enroll.css">
</head>
<body>
	<div class="container">
		<jsp:include page="../commonLayout/commonHeader.jsp" flush="true" />
 		<div class="row">
			<div class="col-md-offset-3 col-md-6 col-md-offset-3">
				<form action="/insertUser" method="post">
					<div class="form-group" id="divId">
						<label for="inputId" class="col-lg-2 control-label">아이디</label>
						<div class="col-lg-10">
							<input type="text" class="form-control onlyAlphabetAndNumber"
								id="id" name="id" data-rule-required="true"
								placeholder="30자이내의 알파벳, 언더스코어(_), 숫자만 입력 가능합니다." maxlength="30">
						</div>
					</div>
					<div class="form-group" id="divPassword">
						<label for="inputPassword" class="col-lg-2 control-label">패스워드</label>
						<div class="col-lg-10">
							<input type="password" class="form-control" id="password"
								name="password" name="excludeHangul" data-rule-required="true"
								placeholder="패스워드" maxlength="30">
						</div>
					</div>
					<div class="form-group" id="divPasswordCheck">
						<label for="inputPasswordCheck" class="col-lg-2 control-label">패스워드
							확인</label>
						<div class="col-lg-10">
							<input type="password" class="form-control" id="passwordCheck"
								name="passwordCheck" data-rule-required="true"
								placeholder="패스워드 확인" maxlength="30">
						</div>
					</div>
					<div class="form-group" id="divName">
						<label for="inputName" class="col-lg-2 control-label">이름</label>
						<div class="col-lg-10">
							<input type="text" class="form-control onlyHangul" id="name"
								name="name" data-rule-required="true"
								placeholder="한글만 입력 가능합니다." maxlength="15">
						</div>
					</div>

					<div class="form-group" id="divNickname">
						<label for="inputNickname" class="col-lg-2 control-label">별명</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" id="nickname"
								name="nickname" data-rule-required="true" placeholder="별명"
								maxlength="15">
						</div>
					</div>

					<div class="form-group" id="divEmail">
						<label for="inputEmail" class="col-lg-2 control-label">이메일</label>
						<div class="col-lg-10">
							<input type="email" class="form-control" id="email" name="email"
								data-rule-required="true" placeholder="이메일" maxlength="40">
						</div>
					</div>
					<div class="form-group" id="divPhoneNumber">
						<label for="inputPhoneNumber" class="col-lg-2 control-label">휴대폰
							<br />번호
						</label>
						<div class="col-lg-10">
							<input type="tel" class="form-control onlyNumber"
								name="phoneNumber" id="phoneNumber" data-rule-required="true"
								placeholder="-를 제외하고 숫자만 입력하세요." maxlength="11">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPhoneNumber" class="col-lg-2 control-label">성별</label>
						<div class="col-lg-10">
							<select class="form-control" id="gender" name="gender">
								<option value="M">남</option>
								<option value="F">여</option>
							</select>
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<button type="submit" class="btn btn-default">Sign in</button>
						</div>
					</div>
				</form>
			</div>

		</div>

		<jsp:include page="../commonLayout/commonFooter.jsp" flush="true" />

	</div>



</body>