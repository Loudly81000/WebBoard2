<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/15/2017
  Time: 5:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<html>
<head>
    <title>WebBoard</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<label>Test</label>
  <s:form action ="insertPost" >
      <s:textfield name="title" label="Title"/>
      <s:textfield name="user" label="User"/>
      <s:textfield name="message" label="Message"/>
      <s:textfield name="deadline" label="Deadline" var="dateObject"/>
      <fmt:formatDate value="${dateObject}" pattern="YYYY-MM-DD"/>
      <%--<c:set value="10/23/2014 - 15:15:22" var="dateString"/>--%>
      <%--<fmt:parseDate value="${dateString}" var="dateObject"--%>
                     <%--pattern="MM/dd/yyyy - HH:mm:ss"/>--%>
      <%--<fmt:formatDate value="${dateObject}" pattern="dd/MM/yyyy - hh:mm a"/>--%>
      <s:submit value="Submit" label="Submit"></s:submit>
  </s:form>
</body>
</html>
