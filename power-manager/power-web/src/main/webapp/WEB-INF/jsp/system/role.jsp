<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
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
    <script type="text/javascript">
        $(function(){
            $("#grid").datagrid({
                toolbar : [
                    <shiro:hasPermission name="role:add">
                    {
                        id : 'add',
                        text : '添加角色',
                        iconCls : 'icon-add',
                        handler : function(){
                            location.href='${pageContext.request.contextPath}/index/admin/role_add.do';
                        }
                    },
                    </shiro:hasPermission>
                    {
                        id : 'delete',
                        text : '删除角色',
                        iconCls : 'icon-remove',
                        handler : function(){
                            var items = $('#grid').datagrid('getSelections');
                            var ids = [];
                            $(items).each(function(){
                                ids.push(this.role_id);
                            });
                            if (ids.length < 1){
                                alert("请选择要删除的信息！")
                                return;
                            }
                            if (ids.length >= 1){
                                if (confirm("是否删除所选择的信息！")){
                                    location.href='${pageContext.request.contextPath}/authRole/delete/'+ ids +'.do';
                                } else {
                                    return;
                                }
                            }

                        }
                    },
                    {
                        id : 'update',
                        text : '修改角色',
                        iconCls : 'icon-edit',
                        handler : function(){
                            var items = $('#grid').datagrid('getSelections');
                            var ids = [];
                            $(items).each(function(){
                                ids.push(this.role_id);
                            });
                            if (ids.length > 1){
                                alert("一次只能选择一条信息进行修改！")
                                return;
                            }
                            if (ids.length < 1){
                                alert("请至少选择一条信息进行修改！")
                                return;
                            }
                            location.href='${pageContext.request.contextPath}/authRole/toupdate/'+ ids[0] +'.do';
                        }
                    }
                ],
                url :
                    '${pageContext.request.contextPath}/authRole/queryByPager.do',
                pagination : true,
                fit:true,
                pageSize:2,
                pageList:[2,5,10,15],
                columns : [[
                    {
                        field : 'role_id',
                        title : '编号',
                        width : 200
                    },
                    {
                        field : 'name',
                        title : '名称',
                        width : 200
                    },
                    {
                        field : 'description',
                        title : '描述',
                        width : 200
                    }
                ]]
            });
        });
    </script>
</head>
<body class="easyui-layout">
<table id="grid"></table>
</body>
</html>
