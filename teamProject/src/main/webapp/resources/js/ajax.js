window.addEventListener('DOMContentLoaded', event => {

	

    
    $("#replyConfirm").click(function(){
		
		
		var param = $("#replyFrm").serialize();
		
		$.ajax({
			type : "post"
			,data: param
			,url : "./replies/new"
			,success : function(result){
				//alert(result);
				$("#content").val('');
				replyList();
			}
			,error : function(err){
				//alert("error");
				console.log(err);
			}
		})
	})
	
	replyList();
	function replyList(){
		$.ajax({
			type : "get"
			,url : "./replies"
			,data: { boardId : $("#boardId").val() }
			,dataType : "json"
			,success: function(result){
				
				var replyList = $("#replyList");
				
				replyList.empty();
				for(row of result){
					var tr = $("<tr/>");
					
					var content = $("<td/>").text(row["content"]);
					tr.append(content);
					
					var userEmail = $("<td/>").text(row["userEmail"]);
					tr.append(userEmail);
					
					var createDate = $("<td/>").text(row["createDate"]);
					tr.append(createDate);
					
					replyList.append(tr);
				}
			}
			,error : function(err){
				
				console.log(err);
			}
		})
	}
	
	

});