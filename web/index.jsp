<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/11/2017
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="ckeditor/ckeditor.js"></script>
  </head>
  <body>
  <form>
      <textarea id="editor1">
      Hello World! 這是 CKeditor!
      </textarea>
  </form>
  <script>
      CKEDITOR.replace( 'editor1' );
  </script>
  </body>
</html>
