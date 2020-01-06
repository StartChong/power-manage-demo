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
                    //初始化已经被选中的节点
                    checkMaterial();
                }
            })
        }
        function checkMaterial(){
            var classCodes = $("#mytreevalue").val();//节点编码
            var datalist = classCodes.split(",");//将节点编码打散成数组
            //获取所有树节点
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            if(datalist!='' && datalist.length > 0){
                for(var i= 0;i < datalist.length; i++){
                    //通过id查找节点
                    var node = treeObj.getNodeByParam("auth_fuction_id",datalist[i],null);
                    //选中该节点
                    if(node != null){//先判断节点是否为空
                        //选中该节点
                        if (node.pid != ""){
                            treeObj.checkNode(node,true,true);
                        }
                    }
                }
            }
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
            <input type="hidden" name="role_id" value="${entity.role_id}" />
        </tr>
        <tr>
            <td>关键字</td>
            <td><input class="easyui-textbox" type="text" name="code" data-options="required:true" value="${entity.code}"></input></td>
        </tr>
        <tr>
            <td>名称</td>
            <td><input class="easyui-textbox" type="text" name="name" data-options="required:true" value="${entity.name}"></input></td>
        </tr>
        <tr>
            <td>描述</td>
            <td><input class="easyui-textbox" name="description" data-options="multiline:true" style="height:60px" value="${entity.description}"></input></td>
        </tr>
        <tr>
            <td>授权</td>
            <td id="tree" class="ztree"></td>
            <input type="hidden" id="mytreevalue" value="${authIds}">
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
                url: "${pageContext.request.contextPath}/authRole/update/"+ ids +".do",
                method:"post",
                dataType:"json",
                data: $("#ff").serialize(),
                success:function (data) {
                    alert("修改成功！");
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
