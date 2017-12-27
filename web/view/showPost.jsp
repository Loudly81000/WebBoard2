<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/15/2017
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<html>
<head>
    <title>WebBoard</title>
</head>
<body>
<table>
    <a href="queryPost.action">顯示留言</a>
    <s:iterator value="postInfoList">
    <s:property value = "title"/><br>
    <s:property value = "user"/><br>
    <s:property value = "message"/><br>
    <s:property value = "deadline"/>
    </s:iterator>
</table>
</body>
</html>
