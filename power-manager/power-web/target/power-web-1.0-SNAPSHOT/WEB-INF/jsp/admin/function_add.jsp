<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/2 0002
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
            <td colspan="2">功能权限信息</td>
        </tr>
        <tr>
            <td>关键字</td>
            <td><input class="easyui-textbox" type="text" name="code" data-options="required:true"></input></td>
        </tr>
        <tr>
            <td>名称</td>
            <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
        </tr>
        <tr>
            <td>访问路径</td>
            <td><input class="easyui-textbox" type="text" name="page" data-options="required:true"></input></td>
        </tr>
        <tr>
            <td>是否生成菜单</td>
            <td>
                <select class="easyui-combobox" name="generatemenu" id="construct_state_id"
                        data-options="editable:false,panelHeight:'auto'" style="width: 80px;">
                    <option value="0">不生成</option>
                    <option value="1">生成</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>优先级</td>
            <td><input class="easyui-textbox" type="text" name="zindex" data-options="required:true"></input></td>
        </tr>
        <tr>
            <td>父功能点</td>
            <td>
                <input class="easyui-combotree" name="pid"
                       data-options="url:'${pageContext.request.contextPath}/authfunction/listAjaxForComboTree.do'"
                       style="width:170px;">
            </td>
        </tr>
        <tr>
            <td>描述</td>
            <td><input class="easyui-textbox" name="description" data-options="multiline:true" style="height:60px"></input></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">添加</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a>
            </td>
        </tr>
    </table>
</form>
<script>
    function submitForm(){
        if ($("#ff").form('enableValidation').form('validate')){
            $.ajax({
                url: "${pageContext.request.contextPath}/authfunction/add.do",
                method:"post",
                dataType:"json",
                data: $("#ff").serialize(),
                success:function (data) {
                    alert("添加成功！");
                    location.href = '${pageContext.request.contextPath}/index/system/function.do';
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
