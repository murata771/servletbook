<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,java.text.SimpleDateFormat"%>
<%--占いを行ってブラウザに表示するアプリケーション --%>
<%
String[] luckArray={"大吉","中吉","小吉","凶"};
 double index=Math.random()*3;
 String luck;
if(index<3&&index>2.5)luck=luckArray[0];
else if(index<=2.5&&index<1.7)luck=luckArray[1];
else if(index<=1.7&&index<0.88)luck=luckArray[2];
else luck=luckArray[3];
Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
String today=sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>占い</title>
</head>
<body>
<p><%=today %>の運勢は<%=luck %>です</p>
</body>
</html>