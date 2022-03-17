<%-- 
    Document   : listSearch
    Created on : Mar 17, 2022, 11:32:57 AM
    Author     : DUNG
--%>

<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background: #ffeaa785;
            }
        table{
                border-collapse: collapse;
                margin:auto;
                margin-top:100px;
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
                
            }
        th,td{
                padding: 10px 35px;
                border:1px solid gray;
                font-size:16px;
            }
        .content{
                width:100%;
                height:auto;
                
        }
        .result{
            display:flex;
            justify-content: center;
            color:red;
            margin-top:50px;
        }
        #search-form{
                position:absolute;
                top:5%;
                right:5%;
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
            }
        #search-form input{
                font-size: 18px;
                padding:4px;
                border-radius: 5px;
                font-family:"Helvetica Neue",Helvetica,Arial,sans-serif;
            }
    </style>
    </head>
    <body>
        <form action="search" id="search-form">
                <input type="text" name="name" placeholder="Search student's Name"/>
                <input type="Submit" value="Search"/>
        </form>
        <h2> Search result for "<%=request.getParameter("name")%>"</h2>
        
        <%  List<Student>list = (List<Student>)request.getAttribute("listsearch"); 
            if (list.size()>0){
        %>
        <div class="content">
            <table>
                <tr>
                    <th>STT </th>               
                    <th>Student ID</th>
                    <th>Name</th>
                    <th>Room</th>
                    <th>Check in</th>
                    <th>Check out</th>
                    <th>Electricity</th>
                    <th>Water</th>
                    
                    <% int i=1;%>
                    <c:forEach items="${requestScope.listsearch}" var="p">
                        <tr>
                            <td><%=i++%></td>
                            <td>${p.studentId}</td>
                            <td>${p.name}</td>
                            <td>${p.roomId}</td>
                            <td>${p.checkin}</td>
                            <td>${p.checkout}</td>
                            <td>${p.electricity}</td>
                            <td>${p.water}</td>
                           
                        </tr>
                    </c:forEach>
                </tr>
            </table>
        </div>
        <% }
            else
            {   
        %>
        <h2 class="result">No result</h2>
        <%} %>
    </body>
</html>