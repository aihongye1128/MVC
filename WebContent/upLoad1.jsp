<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/uploadify/uploadify.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/uploadify/jquery.uploadify.js"></script>

<script type="text/javascript">


$(function(){

	$("#attach").uploadify({
		swf:$("#ctx").val()+"/uploadify/uploadify.swf",
		uploader:$("#ctx").val()+"/aa",
		fileObjName:"attach",
		atuo:true,
		fileTypeExts:"*.txt"
	});
	
	
})


</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>

</style>
</head>
<body>

<input type="hidden"  id="ctx" value="<%=request.getContextPath()%>">
<input type="file"  name="attach" id="attach">
</body>
</html>