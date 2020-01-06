<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/31 0031
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>简单后台</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
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
    <SCRIPT type="text/javascript">
        <!--
        var zTree;

        var setting = {
            view: {
                dblClickExpand: false,
                showLine: true,
                selectedMulti: false
            },
            data: {
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
               url:"${pageContext.request.contextPath}/authfunction/queryAllByUserId.do",
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

        function addTab(title, url){
            if ($('#tt').tabs('exists', title)){
                $('#tt').tabs('close', title);
            }
            var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
            $('#tt').tabs('add',{
                title:title,
                content:content,
                closable:true
            });
        }
        //-->
    </SCRIPT>
</head>
<body class="easyui-layout">
    <div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">
        当前用户：${LOGIN_USER.username}
        <a href="${pageContext.request.contextPath}/user/loginOut.do">退出</a>
    </div>
    <div data-options="region:'west',split:true,title:'菜单导航'" style="width:150px;padding:10px;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="基本功能" style="padding:10px;" id="tree" class="ztree"></div>
        </div>
    </div>
    <div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
    <div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
    <div id="tt" class="easyui-tabs" data-options="region:'center'"></div>
</body>
</html>


