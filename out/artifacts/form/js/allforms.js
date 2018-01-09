$(function(){
	
	getbasedata();
	
});

function getbasedata(){
	$.get("getbasedata",function(data){
		for(var i=0;i<data.forms.length;i++){
			var str = '<tr>'+
		          '<th scope="row">'+data.forms[i].id+'</th>'+
		          '<td>'+data.forms[i].form_name+'</td>'+
		          '<td><a class="btn btn-primary btn-sm" href="editform.jsp?form_id='+data.forms[i].form_id+'" role="button">查看表单</a></td>'+
		        '</tr>';
			$("tbody").append(str);
		}
	});
}

function submit_btn(){
	var name = $(".form_name").val();
	console.log(name+"------name");
	console.log(name.length+"------length");
	if(name!=""&&name.length<50){
		$("#newform").submit();
	}
}