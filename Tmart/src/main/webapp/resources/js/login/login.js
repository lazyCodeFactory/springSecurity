$(function() {
	   window.fbAsyncInit = function() {
	    FB.init({
	      appId      : '1915397915370031',
	      cookie     : true,
	      xfbml      : true,
	      version    : 'v2.8'
	    });
	    FB.AppEvents.logPageView();   
	  };

	  (function(d, s, id){
	     var js, fjs = d.getElementsByTagName(s)[0];
	     if (d.getElementById(id)) {return;}
	     js = d.createElement(s); js.id = id;
	     js.src = "//connect.facebook.net/en_US/sdk.js";
	     fjs.parentNode.insertBefore(js, fjs);
	   }(document, 'script', 'facebook-jssdk'));
 	
	  //페이지를 읽어들이는 중에 사용자의 로그인 상태를 확인하기 위해 실행되는 코드
	  FB.getLoginStatus(function(response) {
		    statusChangeCallback(response);
		});
	  
	  
	  
	  function checkLoginState() {
		  FB.getLoginStatus(function(response) {
		    statusChangeCallback(response);
		  });
		}
	  
	  
});