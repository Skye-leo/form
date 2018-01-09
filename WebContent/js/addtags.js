$(function(){
			
			$(".tag_button").click(function(){
				var value = $(this).val();
				if(value==1){
					showInput_tag();
				}else if(value==2){
					showCheck_tag();
				}else if(value==3){
					showSelect_tag();
				}else if(value==4){
					showTextarea_tag();
				}
				remove_tag();
				addcheck();
				$(".tj").remove();
				$("form").append('<button type="button" class="btn btn-primary tj">确定</button>');
				submit();
			});
			
		});

		function submit(){
			$(".tj").click(function(){
				$(".multi_valuebox").each(function(){
					var json = {};
					var i = 1;
					$($(this).find(".multi_value")).each(function(){
						json[i] = $(this).val();
						i++;
					});
					var jsonstr = JSON.stringify(json);
					$(this).find(".multixx").eq(0).val(jsonstr);
				});
				
				$("form").submit();
			});
			
		}

		function remove_tag(){
			$(".remove_tag").click(function(){
				$(this).parent().parent().remove();
				if($("input").length==0){
					$(".tj").remove();
				}
			});
		}

		function addcheck(){
			var str = '<input type="text" class="form-control multi_value" placeholder="">';
			$(".morecheck").click(function(){
				$(this).parent().append(str);
			});
		}

		function showInput_tag(){
			var str = '<div class="panel panel-default">'+
					    '<div class="panel-heading">增加表单字段</div>'+
						    '<div class="panel-body">'+
						    	  '<input type="hidden" name="tag_id" value="1">'+
								  '<div class="form-group">'+
								    '<label>面板对应名称</label>'+
								    '<input type="text" class="form-control" name="label_name" placeholder="面板名称">'+
								  '</div>'+
								  '<div class="form-group">'+
									'<label>默认值</label>'+
									'<input type="text" class="form-control" name="default_value" placeholder="默认值">'+
								  '</div>'+
								  '<div class="form-group">'+
									'<label>字段类型</label>'+
									'<select class="form-control" name="check_rule">'+
									  '<option>字段类型</option>'+
									  '<option value="1">文本格式(100字以内汉字)</option>'+
									  '<option value="2">日期格式(例：2017-8-16)</option>'+
									  '<option value="3">数字(13位以内整数)</option>'+
									  '<option value="4">小数(13位有效数字，小数点后四位)</option>'+
									'</select>'+
								  '</div>'+
								  '<div class="form-group">'+
								    '<label>标签排序</label>'+
								    '<input type="text" class="form-control" id="" placeholder="index">'+
								  '</div>'+
								  '<button type="button" class="btn btn-danger remove_tag">移除</button>'+
							'</div>'+
						'</div>';
			$(".tag_form").append(str);
		}

		function showCheck_tag(){
			var str = '<div class="panel panel-default">'+
					    '<div class="panel-heading">增加选择框</div>'+
						    '<div class="panel-body">'+
						    	  '<input type="hidden" name="tag_id" value="2">'+
								  '<div class="form-group">'+
								    '<label>面板对应名称</label>'+
								    '<input type="text" class="form-control" name="label_name" placeholder="面板名称">'+
								  '</div>'+
								  '<div class="form-group">'+
									'<label>默认值</label>'+
									'<input type="text" class="form-control" name="default_value" placeholder="默认值">'+
								  '</div>'+
								  '<div class="form-group">'+
								    '<label>标签排序</label>'+
								    '<input type="text" class="form-control" id="" placeholder="index">'+
								  '</div>'+
								  '<div class="form-inline multi_valuebox">'+
								    '<input type="hidden" name="multi_value" class="multixx" value="">'+
								  	'<label>请输入内容</label>'+
								  	'<button type="button" class="btn btn-primary morecheck" style="margin-left:5px;margin-right:5px;">添加更多内容</button>'+
								    '<input type="text"  class="form-control multi_value" placeholder="">'+								    
								  '</div>'+
								  '<button type="button" class="btn btn-danger remove_tag" style="margin-top:10px;">移除</button>'+
							'</div>'+
						'</div>';
			$(".tag_form").append(str);
		}

		function showSelect_tag(){
			var str = '<div class="panel panel-default">'+
					    '<div class="panel-heading">增加下拉框选项</div>'+
						    '<div class="panel-body">'+
						    	  '<input type="hidden" name="tag_id" value="3">'+
								  '<div class="form-group">'+
								    '<label>面板对应名称</label>'+
								    '<input type="text" class="form-control" name="label_name" placeholder="面板名称">'+
								  '</div>'+
								  '<div class="form-group">'+
								    '<label>标签排序</label>'+
								    '<input type="text" class="form-control" id="" placeholder="index">'+
								  '</div>'+
								  '<div class="form-group">'+
									'<label>默认值</label>'+
									'<input type="text" class="form-control" name="default_value" placeholder="默认值">'+
								  '</div>'+
								  '<div class="form-inline multi_valuebox">'+
								    '<input type="hidden" class="multixx" name="multi_value" value="">'+
								  	'<label>请输入内容</label>'+
								  	'<button type="button" class="btn btn-primary morecheck" style="margin-left:5px;margin-right:5px;">添加下拉框内容</button>'+
								    '<input type="text" class="form-control multi_value" placeholder="">'+								    
								  '</div>'+
								  '<button type="button" class="btn btn-danger remove_tag">移除</button>'+
							'</div>'+
						'</div>';
			$(".tag_form").append(str);
		}

		function showTextarea_tag(){
			var str = '<div class="panel panel-default">'+
					    '<div class="panel-heading">增加长文本框</div>'+
						    '<div class="panel-body">'+
						    	  '<input type="hidden" name="tag_id" value="4">'+
								  '<div class="form-group">'+
								    '<label>面板对应名称</label>'+
								    '<input type="text" class="form-control" name="label_name" placeholder="面板名称">'+
								  '</div>'+
								  '<div class="form-group">'+
									'<label>默认值</label>'+
									'<input type="text" class="form-control" name="default_value" placeholder="默认值">'+
								  '</div>'+
								  '<div class="form-group">'+
								    '<label>标签排序</label>'+
								    '<input type="text" class="form-control" id="" placeholder="index">'+
								  '</div>'+
								  '<button type="button" class="btn btn-danger remove_tag">移除</button>'+
							'</div>'+
						'</div>';
			$(".tag_form").append(str);
		}
