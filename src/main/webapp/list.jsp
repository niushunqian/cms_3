<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function fenye(pageNum) {
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	function insert() {
		location="add.jsp";
	}
	function delone(gid) {
		confirm("确定要删除吗？")
		$.post("delete.do",{gid:gid},function(){
			location="list.do";
			
		},"json")
	}
	function del() {
		var gid = $("[name=ck]:checked").map(function() {
			return this.value;
		}).get().join();
		$.post("delete.do",{gid:gid},function(){
			location="list.do";
			
		},"json")
	}
	function update(gid) {
		location="update.jsp?gid="+gid;
	}
</script>
</head>
<body>
<form action="list.do" method="post">
	<input type="hidden" name="pageNum" value="${con.pageNum}">
	商品名称：<input type="text" name="gname" value="${con.gname}">
	<input type="submit" value="查询">
</form>
	<table border="1">
		<tr>
			<td></td>
			<td>商品ID</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<td>图片</td>
			<td>操作
				<button onclick="insert()">新增</button>
			</td>
		</tr>
		<c:forEach items="${list}" var="g" varStatus="count">
			<tr>
			<td>
				<input type="checkbox" name="ck" value="${g.gid}">
			</td>
			<td>${count.count+page.startRow-1}</td>
			<td>${g.gname}</td>
			<td>${g.egname}</td>
			<td>${g.brand.bname}</td>
			<td>${g.kind.kname}</td>
			<td>${g.size}</td>
			<td>${g.price}</td>
			<td>${g.number}</td>
			<td>${g.bq}</td>
			<td>
				<img alt="" src="/load/${g.picture}">
			</td>
			<td>
				<button onclick="selectOne(${g.gid})">商品详情</button>
				<button onclick="update(${g.gid})">商品编辑</button>
				<button onclick="delone(${g.gid})">删除</button>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>
				当前第${page.pageNum}/${page.pages}页，共${page.pages}页
				<button onclick="del()">批量删除</button>
			</td>
		</tr>
	</table>
</body>
</html>