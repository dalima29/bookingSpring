<!DOCTYPE HTML>
<html>
<head>
<title>Access Denied</title>
</head>
 
<body>
    <!-- Include _menu.html -->
    <%if(request.getAttribute("message")!=null){ %>
    <div>${message}</div>
    <%} %>
    <%if(request.getAttribute("userInfo")!=null) { %>
    <div>${userInfo}</div>
    <%} %>
     
</body>
 
</html>