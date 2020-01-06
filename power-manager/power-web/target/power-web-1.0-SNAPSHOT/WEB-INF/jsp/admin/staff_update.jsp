<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/2 0002
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <!--easyui-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/demo.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
<form id="ff" class="easyui-form" method="post"  data-options="novalidate:true">
    <table cellpadding="5">
        <tr>
            <td colspan="4">基本信息</td>
            <input type="hidden" name="user_id" value="${entity.user_id}" />
        </tr>
        <tr>
            <td>用户名</td>
            <td><input class="easyui-textbox" type="text" name="username" data-options="required:true" value="${entity.username}"></input></td>
            <td>口令</td>
            <td><input class="easyui-passwordbox" prompt="Password" name="password" iconWidth="28" style="width:100%;height:34px;padding:10px" value="${entity.password}"></td>
        </tr>
        <tr>
            <td colspan="4">其他信息</td>
        </tr>
        <tr>
            <td>工资</td>
            <td><input class="easyui-textbox" type="text" name="salary" data-options="required:true" value="${entity.salary}"></input></td>
            <td>生日</td>
            <td><input class="easyui-datebox" name="birthday" value="${entity.birthday}"></input></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <select class="easyui-combobox" name="gender"
                        data-options="editable:false,panelHeight:'auto'" style="width: 80px;">
                    <option value="男" ${entity.gender == "男"?"selected":""}>男</option>
                    <option value="女" ${entity.gender == "女"?"selected":""}>女</option>
                </select>
            </td>
            <td>单位</td>
            <td><input class="easyui-textbox" type="text" name="station" data-options="required:true" value="${entity.station}"></input></td>
        </tr>
        <tr>
            <td>联系电话</td>
            <td><input class="easyui-textbox" type="text" name="telephone" data-options="required:true" value="${entity.telephone}"></input></td>
        </tr>
        <tr>
            <td>备注</td>
            <td colspan="3"><input class="easyui-textbox" name="remark" data-options="multiline:true" style="height:60px" value="${entity.remark}"></input></td>
        </tr>
        <tr>
            <td>选择角色</td>
            <td colspan="3">
                <c:forEach items="${roleList}" var="role">
                    <input type="checkbox" name="roleIds" value="${role.role_id}" ${roleIds.contains(role.role_id.toString())?"checked":""}>${role.name}
                </c:forEach>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">修改</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a>
            </td>
        </tr>
    </table>
</form>
<script>
    function submitForm(){
        if ($("#ff").form('enableValidation').form('validate')){
            $.ajax({
                url: "${pageContext.request.contextPath}/user/update.do",
                method:"post",
                dataType:"json",
                data: $("#ff").serialize(),
                success:function (data) {
                    alert("修改成功！");
                    location.href = '${pageContext.request.contextPath}/index/system/staff.do';
                },
                error:function () {
                    alert("请求失败！");
                }
            })
        }else {
            return false;
        }
    }
    function clearForm(){
        $('#ff').form('clear');
    }
</script>
</body>
</html>
