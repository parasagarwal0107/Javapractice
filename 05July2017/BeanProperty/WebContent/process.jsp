<%--    Setting all the values
 --%>

<%--
<jsp:useBean id="u" class="bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

Record:
<br>
<jsp:getProperty property="name" name="u" /><br>
<jsp:getProperty property="password" name="u" /><br>
<jsp:getProperty property="email" name="u" /><br>
--%>

<%--  Setting Specific Value
 --%>

<%-- 
    <jsp:useBean id="u" class="bean.User"></jsp:useBean>  
    <%  
    String name="arjun";  
    %>  
    <jsp:setProperty property="name" name="u" value="<%=name %>"/>  
      
    Record:<br>  
    <jsp:getProperty property="name" name="u"/><br>  
  --%>
  
<%-- reusing bean
--%>

<jsp:useBean id="u" class="bean.User" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
Record:<br>  
<jsp:getProperty property="name" name="u"/><br>  
<jsp:getProperty property="password" name="u"/><br>  
<jsp:getProperty property="email" name="u" /><br>  
  
<a href="second.jsp">Visit Page</a>
