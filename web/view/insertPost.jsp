<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/15/2017
  Time: 5:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<html>
<head>
    <title>WebBoard</title>
</head>
<body>
  <form action ="insertPost">
      <input type = "text" name = "id"/>
      <input type = "text" name = "title"/>
      <input type = "text" name = "user"/>
      <input type = "text" name = "message"/>
      <input type = "text" name = "deadline"/>
      <input tyep="submit" value="留言">
  </form>

</body>
</html>
