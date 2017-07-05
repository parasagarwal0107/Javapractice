<jsp:useBean id="u" class="bean.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

Record Of only Name:
<br>
<jsp:getProperty property="name" name="u" /><br>

<a href="second.jsp">Visit Page</a>