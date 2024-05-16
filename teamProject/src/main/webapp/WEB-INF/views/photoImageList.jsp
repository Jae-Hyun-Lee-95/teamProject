<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp 파일에서 if나 foreach를 사용할 수 없을 때  -->
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사진 목록</title>
</head>
<body>

<!-- 
	 1) 상품이미지를 가져와서 3열로 나열 출력 
	 2) 해당 상품 이미지를 클릭하면 해당 게시글 보기
-->

<h1>사진 목록</h1>

<table border='2'>
    <tr>
        <c:forEach items="${photoList}" var="image" varStatus="loop">
            <c:if test="${loop.index % 3 == 0}">   
            </tr><tr>
            </c:if>
            <td class="image-cell">
                <c:choose>
                    <c:when test="${image.picFsize==0}">
                        첨부파일없음
                    </c:when>
                    <c:otherwise>
                        <a href='photoGetBoard.do?PicNum=${image.picNum}'>
                            <img src="/teamProject/resources/upload/${image.picId}" alt="이미지">
                        </a>
                    </c:otherwise>
                </c:choose>
            </td>
        </c:forEach>
    </tr>
</table>

</body>
</html>