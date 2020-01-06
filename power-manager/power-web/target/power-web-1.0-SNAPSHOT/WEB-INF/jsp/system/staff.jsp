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
                    {
                        id : 'add',
                        text : '添加用户',
                        iconCls : 'icon-add',
                        handler : function(){
                            location.href='${pageContext.request.contextPath}/user/toadd.do';
                        }
                    },
                    {
                        id : 'delete',
                        text : '删除用户',
                        iconCls : 'icon-remove',
                        handler : function(){
                            var items = $('#grid').datagrid('getSelections');
                            var ids = [];
                            $(items).each(function(){
                                ids.push(this.user_id);
                            });
                            if (ids.length < 1){
                                alert("请选择要删除的信息！")
                                return;
                            }
                            if (ids.length >= 1){
                                if (confirm("是否删除所选择的信息！")){
                                    location.href='${pageContext.request.contextPath}/user/delete/'+ ids +'.do';
                                } else {
                                    return;
                                }
                            }

                        }
                    },
                    {
                        id : 'update',
                        text : '修改用户',
                        iconCls : 'icon-edit',
                        handler : function(){
                            var items = $('#grid').datagrid('getSelections');
                            var ids = [];
                            $(items).each(function(){
                                ids.push(this.user_id);
                            });
                            if (ids.length > 1){
                                alert("一次只能选择一条信息进行修改！")
                                return;
                            }
                            if (ids.length < 1){
                                alert("请至少选择一条信息进行修改！")
                                return;
                            }
                            location.href='${pageContext.request.contextPath}/user/toupdate/'+ ids[0] +'.do';
                        }
                    }
                ],
                url :
                    '${pageContext.request.contextPath}/user/queryByPager.do',
                pagination : true,
                fit:true,
                pageSize:2,
                pageList:[2,5,10,15],
                columns : [[
                    {
                        field : 'user_id',
                        title : '编号',
                        width : 100,
                        checkbox:true
                    },
                    {
                        field : 'username',
                        title : '名称',
                        width : 200
                    },
                    {
                        field : 'gender',
                        title : '性别',
                        width : 200
                    },
                    {
                        field : 'birthday',
                        title : '生日',
                        width : 200,
                        formatter: function(value,row,index){
                            var date = new Date(value);
                            return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();
                        }
                    },
                    {
                        field : 'station',
                        title : '单位',
                        width : 200

                    },
                    {
                        field : 'salary',
                        title : '工资',
                        width : 200
                    },
                    {
                        field : 'userRole',
                        title : '对应角色',
                        width : 200,
                        formatter : function(data,row, index){
                            var role = "";
                            $(data).each(function (i,e) {
                                if (role != ""){
                                    role += ","
                                }
                                role += e.authRole.name;
                            })
                            return role;
                        }
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
