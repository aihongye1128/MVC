<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

${message }
<form action="${pageContext.request.contextPath}/UpLoad" method="post" enctype="multipart/form-data">
  		上传文件1：<input type="file" name="multipartFile"><br>
  		上传文件2：<input type="file" name="multipartFile"><br>
  		上传文件3：<input type="file" name="multipartFile"><br>
  		<input type="submit" value="提交">
</form>

 <h2>文件下载</h2>
<a href="${pageContext.request.contextPath}/DownLoad?filename=项目.txt">下载</a>

 <h2>文件批量下载</h2>
  	 <form action="${pageContext.request.contextPath}/Batch" method="post">
  	 	<input type="checkbox"  name="filename" value="java笔记.txt">Image2
  	 	<input type="checkbox"  name="filename" value="mysql合集.txt">Image3
  	 	<input type="checkbox"  name="filename" value="站内信.txt">Image4
  	 	<input type="submit" value="下载">
  	 </form> 
</body>
</html>