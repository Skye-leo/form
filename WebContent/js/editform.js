$(function(){
	
	getdata();
});

function getdata(){
	var id = $("#form_id").val();
	$.post("gotoPage",{form_id:id},function(data){
		var i = 1;
		for(var p=0;p<data.length;p++){
			var str = '<tr>'+
			'<th scope="row">'+i+'</th>'+
			'<td>'+data[p].label_name+'</td>'+
			'<td>不得大于50个汉字</td>'+
			'<td>'+data[p].default_value+'</td>'+
			'<td><a class="btn btn-danger btn-sm" href="#" role="button">删除</a></td>'+
			'</tr>';
			$("tbody").append(str);
			i++;
		}
	});
}