<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <style type="text/css">
        .body{
            background-size:cover;
            background: url(background/background2.jpg) no-repeat fixed center;

        }
        .regist{
            margin-left:7%;
            margin-top:4%;
            width:80%;
            height:45vw;
            border:none;
            background-color:white;
            border-radius: 5px;
            box-shadow: 3px 3px 2px #888888;
            border:none;
            filter:alpha(Opacity=80);
            -moz-opacity:0.8;
            opacity: 0.8;
        }
        .form{
            font-size:25px;
            width:60%;
            padding-left:10%;
            padding-top:5%;
        }
        .button{
            width: 72px;
            height: 38px;
            font-size: 20px;
            border-radius: 6px;
            background-color:deepskyblue;
            border:none;
            cursor: pointer;
        }
        .textarea{
            float: left;
        }
        .select{
            width		:100px;
            font-size	:20px;
            align		:center;
            margin-top	:5%;
            margin-left: 100px;
        }
        .input1{
            width		:500px;
            font-size	:20px;
            height		:30px;

        }
    </style>
</head>
<%!
    String blanknull(String s)
    {
        return (s == null) ?"" : s;
    }
%>
<body class="body">
<div class="regist">
    <select name="choose" class="select" onchange="window.location=this.value">
        <option value="get.jsp">GET</option>
        <option value="post.jsp">POST</option>
    </select>

    <form action="MyServlet" method="get" class="form" name="Api" >
        <jsp:useBean id="Api" class="com.ck.Servlet.Url" scope="session"  ></jsp:useBean>
        网址：<br><input type="text" name="web" class="input1" value="<%=blanknull(Api.getURL()) %>">
        <input type="submit" name = "submit" value="提交" class="button"/><br><br>
        <div class="textarea">
            post：<br><textarea name="post"  style="height: 300px;width: 250px"><%=blanknull(Api.getPost01())%></textarea>
        </div>
        <div class="textarea" style="padding-left: 20px">
            get ：<br><textarea name="get" style="height: 300px;width: 250px"><%=blanknull(Api.getGet01()) %></textarea>
        </div>
    </form>
</div>
</body>
</html>