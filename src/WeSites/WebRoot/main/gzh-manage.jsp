<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gzh-manage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="../dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
      body {
        margin-top: 60px;
        font-family:"Microsoft Yahei",微软雅黑,"Helvetica Neue",Arial,sans-serif;
        color: black;
      }
    </style>
  </head>
  
  <body>
    <!-- 页面主要内容 -->
    <a class="btn btn-success btn-sm"  href = "showAccount.action">已注册公众号</a>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../dist/css/jquery-3.1.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../dist/js/bootstrap.min.js"></script>
  </body>
</html>
