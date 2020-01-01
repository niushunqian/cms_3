<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(function() {
	var gid=${param.gid};
	alert(gid)
	$.post("selectGoods.do",{gid:gid},function(goods){
		$("[name=gname]").val(goods.gname);
		$("[name=egname]").val(goods.egname);
		$("[name=size]").val(goods.size);
		$("[name=price]").val(goods.price);
		$("[name=number]").val(goods.number);
		$("[name=bq]").val(goods.bq);
		$.post("selectBrand.do",function(brand){
			for ( var i in brand) {
				$("#brand").append("<option value='"+brand[i].bid+"'>"+brand[i].bname+"</option>");
				if(goods.bid==brand[i].bid){
					$("#brand").val(brand[i].bname)
				}
			}
		},"json")
		$.post("selectKind.do",function(kind){
			for ( var i in kind) {
				$("#kind").append("<option value='"+kind[i].kid+"'>"+kind[i].kname+"</option>");
				if(goods.kid==kind[i].kid){
					$("#kind").val(kind[i].kname)
				}
			}
		},"json")
	},"josn")
})

	function upd() {
		var param=$("form").serialize();
		$.post("upd.do",param,function(flag){
			if(flag){
				alert("修改成功")
				location="list.do";
			}else{
				alert("修改失败")
				location="add.jsp";
			}
			
		},"json")
	}
</script>
</head>
<body>
	<form method="post">
	<table>
		<tr>
			<td>商品名称：</td>
			<td>
				<input type="text" name="gname">
			</td>
		</tr>
		<tr>
			<td>英文名称：</td>
			<td>
				<input type="text" name="egname">
			</td>
		</tr>
		<tr>
			<td>商品品牌：</td>
			<td>
				<select id="brand" name="bid"></select>
			</td>
		</tr>
		<tr>
			<td>商品种类：</td>
			<td>
				<select id="kind" name="kid"></select>
			</td>
		</tr>
		<tr>
			<td>尺寸：</td>
			<td>
				<input type="text" name="size">
			</td>
		</tr>
		<tr>
			<td>单价：</td>
			<td>
				<input type="text" name="price">
			</td>
		</tr>
		<tr>
			<td>数量：</td>
			<td>
				<input type="text" name="number">
			</td>
		</tr>
		<tr>
			<td>标签：</td>
			<td>
				<input type="text" name="bq">
			</td>
		</tr>
		<tr>
			<td>商品图片上传：</td>
			<td>
				<input type="file" name="myFile">
			</td>
		</tr>
		<tr>
			<td>
				<input type="button" onclick="upd()" value="提交">
			</td>
		</tr>
	</table>
</form>
</body>
</html>