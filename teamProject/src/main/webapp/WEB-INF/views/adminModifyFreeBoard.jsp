<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    	
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title> adminModifyBoard.jsp </title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
        <script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js" type="text/javascript"></script>
  		
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <link href="./resources/css/styles.css" rel="stylesheet" />
        
        
    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar1 navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="adminDashBoard">회사이름</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#!">설정</a></li>
                        <li><a class="dropdown-item" href="#!">마이페이지</a></li>
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="#!">로그아웃</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <a class="nav-link" href="adminDashBoard">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                회원관리
                            </a>
                            
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                공지사항
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="adminAnnouncements">공지사항</a>
                                    <a class="nav-link" href="adminWrite">공지 남기기</a>
                                </nav>
                            </div>
                            
                             <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                게시판 관리
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="adminBoard">자유게시판</a>
                                    <a class="nav-link" href="adminPictureBoard">사진게시판</a>
                                </nav>
                            </div>
                           
                            <a class="nav-link" href="adminQuestion">
                                <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                               	1:1문의
                            </a>
                            
                            <a class="nav-link" href="adminChart">
                                <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                                통계
                            </a>
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">관리자</div>
                        아무개
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">관리자</h1>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                자유게시판 수정하기
                            </div>
                            <div class="card-body">
                                <form action="adminUpdateFreeBoard" method='post'>
                                	<input type="hidden" name="boardId" value="${freeBoard.boardId}" />
                                	<table >
                                		<tr>
                                			<td>관리자 아이디 :</td>
                                			<td>${sessionScope.adminLoginId}</td>
                                		</tr>
                                		<tr>
                                			<td>유저 이메일 :</td>
                                			<td>${freeBoard.userEmail}</td>
                                		</tr>
                                		<tr>
                                			<td>게시판 제목</td>
                                			<td><input type='text' name="title" value="${freeBoard.title }" /></td>
                                		</tr>
                                		<tr>
                                			<td>내용</td>
                                			<td><textarea cols='100' rows='15' name="content">${freeBoard.content }</textarea></td>
                                		</tr>
                                		<tr>
                                			<td colspan='2' align='right'><input type='submit' value='수정하기' /></td>
                                		</tr>
                                	</table>
                                </form>
                                
                                
                                
                            </div>
                        </div>
                    </div>
                </main>
                <main>
				<div class="container-fluid px-4">
                        
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                               		댓글
                            </div>
                            <div class="card-body">
                            	<form name="replyFrm" id="replyFrm">
                        			<input type="hidden" name="boardId" id="boardId" value="${detailFreeBoard.boardId }" >
                            		<input type="hidden" name="userEmail" value="${sessionScope.logEmail}" />
                            		<input type="text" name="content" id="content" >
		                            <div class="btnBox">
		                              <input type="button" value="댓글추가"  class="boardBtn" id="replyConfirm2">
		                            </div>
                      			 </form>
                      			 
                      			
                      			 
                      			 <table id="adminReplyList">
                      			 	
	                      			 	
									
                      			 </table>	
                            	
                                
                            </div>
                        </div>
                    </div>
                </main>
                	
                
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2023</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
                        
                        
                        
                        
        <script src="https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=6634a93aefaafa41dc30c070" type="text/javascript" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  		<script src="/teamProject/resources/js/webflow.js" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="./resources/js/scripts.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js" crossorigin="anonymous"></script>
        <script src="./resources/js/datatables-simple-demo.js"></script>
        <script src="./resources/js/ajax.js" type="text/javascript"></script>
    </body>
</html>
