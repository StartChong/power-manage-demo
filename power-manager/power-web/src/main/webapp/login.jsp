<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/31 0031
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/demo.css" />
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/component.css" />
    <script src="${pageContext.request.contextPath}/client/js/html5.js"></script>
    <script src="${pageContext.request.contextPath}/client/js/jquery-1.8.3.min.js"></script>
    <!--[if IE]>
    <![endif]-->
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>easyui后台登录页面</h3>
                    <span style="color: red">${msg}</span>
                <form id="myform" action="${pageContext.request.contextPath}/user/login.do" name="f" method="post">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入用户名">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input id="checkcode" name="checkcode" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入验证码">
                    </div>
                    <div class="icon-man">
                        <img id="loginform-vCode" class="show-hide-column-image" src="${pageContext.request.contextPath}/client/verificationCode.jsp"
                             onclick="javascript:document.getElementById('loginform-vCode').src='${pageContext.request.contextPath}/client/verificationCode.jsp?'+Math.random();">
                    </div>
                    <div class="mb2"><a class="act-but submit" href="javascript:toSubmit();" style="color: #FFFFFF">登录</a></div>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="${pageContext.request.contextPath}/client/js/TweenLite.min.js"></script>
<script src="${pageContext.request.contextPath}/client/js/EasePack.min.js"></script>
<script src="${pageContext.request.contextPath}/client/js/rAF.js"></script>
<script src="${pageContext.request.contextPath}/client/js/demo-1.js"></script>
<script>
    function toSubmit() {
        if ($("#checkcode").val() == ""){
            alert("请输入验证码！");
            return;
        }
       $("#myform").submit();
    }
</script>
</body>
</html>
