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
    <!--zTree-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/zTree/css/demo.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/zTree/js/jquery.ztree.core.js"></script>
    <script src="${pageContext.request.contextPath}/zTree/js/jquery.ztree.excheck.js"></script>
    <SCRIPT type="text/javascript">
        <!--
        var zTree;

        var setting = {
            view: {
                dblClickExpand: true,
                showLine: true,
                selectedMulti: true
            },
            check: {
                enable: true ,//显示复选框
                chkStyle : "checkbox"
            },
            data: {
                key: {
                    title:"t"
                },
                simpleData: {
                    enable: true,
                    idKey: "auth_fuction_id",
                    pIdKey: "pid",
                    rootPId: ""
                }
            },
            callback: {
                beforeClick: function (treeId, treeNode) {
                    var zTree = $.fn.zTree.getZTreeObj("tree");
                    if (treeNode.isParent) {
                        zTree.expandNode(treeNode);
                        return false;
                    } else {
                        addTab(treeNode.name,"${pageContext.request.contextPath}/" + treeNode.page + ".do");
                        return true;
                    }
                }
            }
        };
        function getNodes(){
            $.ajax({
                url:"${pageContext.request.contextPath}/authfunction/queryall.do",
                dataType:"json",
                success:function (result) {
                    var t = $("#tree");
                    t = $.fn.zTree.init(t, setting, result);
                }
            })
        }

        $(document).ready(function () {
            getNodes();
        });

        //-->
    </SCRIPT>
</head>
<body>
<form id="ff" class="easyui-form" method="post" data-options="novalidate:true">
    <table cellpadding="5">
        <tr>
            <td colspan="2">角色信息</td>
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
            <td>描述</td>
            <td><input class="easyui-textbox" name="description" data-options="multiline:true" style="height:60px"></input></td>
        </tr>
        <tr>
            <td>授权</td>
            <td id="tree" class="ztree"></td>
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
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.getCheckedNodes(true);
            if (nodes.length < 1){
                alert("请给角色授权！");
                return false;
            }
            var ids = [];
            for (var i = 0; i < nodes.length; i ++){
                ids.push(nodes[i].auth_fuction_id);
            }
            $.ajax({
                url: "${pageContext.request.contextPath}/authRole/add/"+ ids +".do",
                method:"post",
                dataType:"json",
                data: $("#ff").serialize(),
                success:function (data) {
                    alert("添加成功！");
                    location.href = '${pageContext.request.contextPath}/index/system/role.do';
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
