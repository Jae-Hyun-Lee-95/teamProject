<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><!--  This site was created in Webflow. https://www.webflow.com  --><!--  Last Published: Tue May 07 2024 06:04:56 GMT+0000 (Coordinated Universal Time)  -->
<html data-wf-page="6634a93befaafa41dc30c189" data-wf-site="6634a93aefaafa41dc30c070">
<head>
  <meta charset="utf-8">
  <title>Sign Up | Zastock | Webflow Ecommerce Website Template</title>
  <meta content="Sign Up | Zastock | Webflow Ecommerce Website Template" property="og:title">
  <meta content="Sign Up | Zastock | Webflow Ecommerce Website Template" property="twitter:title">
  <meta content="width=device-width, initial-scale=1" name="viewport">
  <meta content="Webflow" name="generator">
  <link href="/teamProject/resources/css/normalize.css" rel="stylesheet" type="text/css">
  <link href="/teamProject/resources/css/webflow.css" rel="stylesheet" type="text/css">
  <link href="/teamProject/resources/css/jiwons-dynamite-site-d2dd58.webflow.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com" rel="preconnect">
  <link href="https://fonts.gstatic.com" rel="preconnect" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js" type="text/javascript"></script>
  <script type="text/javascript">WebFont.load({  google: {    families: ["Unbounded:regular,500,600,700"]  }});</script>
  <script type="text/javascript">!function(o,c){var n=c.documentElement,t=" w-mod-";n.className+=t+"js",("ontouchstart"in o||o.DocumentTouch&&c instanceof DocumentTouch)&&(n.className+=t+"touch")}(window,document);</script>
  <link href="/teamProject/resources/images/favicon.png" rel="shortcut icon" type="image/x-icon">
  <link href="/teamProject/resources/images/webclip.png" rel="apple-touch-icon">
</head>
<body>
  <div class="preloader-wrapper">
    <div class="preloader-content-wrapper">
      <div class="preloader-lottie" data-w-id="0e60aa46-827b-a19c-1ffa-1e25f89fcaa9" data-animation-type="lottie" data-src="https://uploads-ssl.webflow.com/65cc87ce23ae1b8cf737a29d/65e06170e48f67f758b25b29_Zastock.json" data-loop="0" data-direction="1" data-autoplay="1" data-is-ix2-target="0" data-renderer="svg" data-default-duration="1.65" data-duration="0"></div>
    </div>
  </div>
  <div style="opacity:0" class="pages-wrapper">
    <section class="section authentication">
      <div class="container">
        <div class="authentication-content">
          <div class="log-in">
            <div class="sign-in-form-wrap w-form">
              <form id="wf-form-Register-Email-Form" name="wf-form-Register-Email-Form" data-name="Register Email Form" method="post" action="../user-pages/insertUser.do" class="sign-in-form" data-wf-page-id="6634a93befaafa41dc30c189" data-wf-element-id="0bf3ed0e-71f8-bd1b-a1f2-834f09bfc473">
                <div class="sign-in-form-content-wrap">
                  <h3 class="sign-in-title">sign Up to Zastock</h3>
                  <div class="sign-in-alternative">
                    <div class="alternative-details">Already have an account? <a href="sign-in.do" class="alternative-link">Sign In</a>
                    </div>
                  </div>
                </div>
                <div class="sign-in-single-fields">
	                  <!-- 이메일 -->
	                  <div class="sign-in-single-field-wrap"><label for="your-email-2" class="sign-in-field-label">이메일</label>
	                  <input class="sign-in-field w-input" maxlength="256" name="userEmail" data-name="Your Email 2" type="email" id="your-email-2" required=""></div>	<!-- placeholder="" -->
	                  <!-- 비밀번호 -->
	                  <div class="sign-in-single-field-wrap"><label for="your-password" class="sign-in-field-label">비밀번호</label>
	                  <input class="sign-in-field w-input" maxlength="256" name="userPassword" data-name="Your Password" type="password" id="your-password" pattern="[A-Za-z1-9]{4,15}" required=""></div>
	                  <!-- 이름 -->
	                  <div class="sign-in-single-field-wrap"><label for="Your-Name" class="sign-in-field-label">이름</label>
	                  <input class="sign-in-field w-input" maxlength="256" name="userName" data-name="Your Name" type="text" id="Your-Name" pattern="[가-힣]{2,5}" required=""></div>
	                  <!-- 생년월일 8자리 -->
	                  <div class="sign-in-single-field-wrap"><label for="Your-Birth" class="sign-in-field-label">생년월일 8자리</label>
	                  <input class="sign-in-field w-input" maxlength="256" name="userBirth" data-name="Your Birth" type="text" id="Your-Birth" pattern="[0-9]{8}" required=""></div>
	                  <!-- 전화번호 -->
	                  <div class="sign-in-single-field-wrap"><label for="Your-Tel" class="sign-in-field-label">휴대전화번호</label>
	                  <input class="sign-in-field w-input" maxlength="256" name="userTel" data-name="Your Name" type="text" id="Your-Tel" pattern="[0-9]{11}" required=""></div>
	                  <!-- 체크박스 -->
	                  <div class="sign-in-single-field-wrap flex"><label class="w-checkbox sign-in-checkbox-wrap">
					  <div class="w-checkbox-input w-checkbox-input--inputType-custom sign-in-checkbox"></div>
	                  <input type="checkbox" name="checkbox" id="checkbox" data-name="Checkbox" style="opacity:0;position:absolute;z-index:-1" required=""><span class="sign-in-checkbox-label w-form-label" for="checkbox">I Agree To all The <a href="#" class="terms-conditions-link">Terms &amp; Conditions</a></span>
	                  </label></div><input type="submit" data-wait="잠시만 기다려주세요..." class="sign-in-submit-button w-button" value="Sign Up">
                  <div class="sign-in-or-wrap">
                    <div class="or-border"></div>
                    <div class="or-text-wrap">
                      <div class="or-text">Or Continue With</div>
                    </div>
                    <div class="or-border"></div>
                  </div>
                  <div class="sign-in-app-link-wrap">
                    <a href="https://www.facebook.com/" target="_blank" class="sign-in-app-link w-inline-block"><img loading="lazy" src="/teamProject/resources/images/Sign-In-App-Image1.svg" alt=""></a>
                    <a href="https://www.google.com/" target="_blank" class="sign-in-app-link w-inline-block"><img loading="lazy" src="/teamProject/resources/images/Sign-In-App-Image2.svg" alt=""></a>
                  </div>
                </div>
              </form>
              <div class="w-form-done">
                <div>축하합니다. 회원가입이 완료되었습니다.</div>
              </div>
              <div class="w-form-fail">
                <div>회원가입에 실패하였습니다.</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
  <script src="https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=6634a93aefaafa41dc30c070" type="text/javascript" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  <script src="/teamProject/resources/js/webflow.js" type="text/javascript"></script>
</body>
</html>