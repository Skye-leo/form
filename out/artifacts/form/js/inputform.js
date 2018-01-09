	
$(function(){
	
	getformsList();
	
});

function getformsList(){
	$.post("getformsList",{},function(data){
		for(var p in data){
			var str = '<li><a href="#" class="formList" value="'+data[p].id+'">'+data[p].name_paraphrase+'</a></li>';
			$(".dropdown-menu").append(str);
		}
	
	$(".formList").click(function(){
		var id = $(this).attr("value");
		var title = $(this).html();
		$("#form_title").html(title);
		$.post("showinputform",{id:id},function(data){
			$("form").empty();
			if(data){
				$("form").append(data);
				$("form").append('<input type="hidden" name="id" value="'+id+'">'+
						'<input class="btn btn-default" type="submit" value="提交">');
			}else{
				$("form").append('<h3>该表单没有字段，请前往添加</h3>');
			}
			
		});
	});
	
	});
}