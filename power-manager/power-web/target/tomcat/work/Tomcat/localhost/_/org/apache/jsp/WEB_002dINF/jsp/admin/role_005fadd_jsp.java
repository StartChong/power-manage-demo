/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-03 13:22:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class role_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <!--easyui-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/demo.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("    <!--zTree-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/zTree/css/demo.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/zTree/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/zTree/js/jquery.ztree.core.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/zTree/js/jquery.ztree.excheck.js\"></script>\r\n");
      out.write("    <SCRIPT type=\"text/javascript\">\r\n");
      out.write("        <!--\r\n");
      out.write("        var zTree;\r\n");
      out.write("\r\n");
      out.write("        var setting = {\r\n");
      out.write("            view: {\r\n");
      out.write("                dblClickExpand: true,\r\n");
      out.write("                showLine: true,\r\n");
      out.write("                selectedMulti: true\r\n");
      out.write("            },\r\n");
      out.write("            check: {\r\n");
      out.write("                enable: true ,//显示复选框\r\n");
      out.write("                chkStyle : \"checkbox\"\r\n");
      out.write("            },\r\n");
      out.write("            data: {\r\n");
      out.write("                key: {\r\n");
      out.write("                    title:\"t\"\r\n");
      out.write("                },\r\n");
      out.write("                simpleData: {\r\n");
      out.write("                    enable: true,\r\n");
      out.write("                    idKey: \"auth_fuction_id\",\r\n");
      out.write("                    pIdKey: \"pid\",\r\n");
      out.write("                    rootPId: \"\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            callback: {\r\n");
      out.write("                beforeClick: function (treeId, treeNode) {\r\n");
      out.write("                    var zTree = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("                    if (treeNode.isParent) {\r\n");
      out.write("                        zTree.expandNode(treeNode);\r\n");
      out.write("                        return false;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        addTab(treeNode.name,\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\" + treeNode.page + \".do\");\r\n");
      out.write("                        return true;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        function getNodes(){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/authfunction/queryall.do\",\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                success:function (result) {\r\n");
      out.write("                    var t = $(\"#tree\");\r\n");
      out.write("                    t = $.fn.zTree.init(t, setting, result);\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            getNodes();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //-->\r\n");
      out.write("    </SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"ff\" class=\"easyui-form\" method=\"post\" data-options=\"novalidate:true\">\r\n");
      out.write("    <table cellpadding=\"5\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"2\">角色信息</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>关键字</td>\r\n");
      out.write("            <td><input class=\"easyui-textbox\" type=\"text\" name=\"code\" data-options=\"required:true\"></input></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>名称</td>\r\n");
      out.write("            <td><input class=\"easyui-textbox\" type=\"text\" name=\"name\" data-options=\"required:true\"></input></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>描述</td>\r\n");
      out.write("            <td><input class=\"easyui-textbox\" name=\"description\" data-options=\"multiline:true\" style=\"height:60px\"></input></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>授权</td>\r\n");
      out.write("            <td id=\"tree\" class=\"ztree\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitForm()\">添加</a>\r\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearForm()\">清空</a>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("    function submitForm(){\r\n");
      out.write("        if ($(\"#ff\").form('enableValidation').form('validate')){\r\n");
      out.write("            var treeObj = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("            var nodes = treeObj.getCheckedNodes(true);\r\n");
      out.write("            if (nodes.length < 1){\r\n");
      out.write("                alert(\"请给角色授权！\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            var ids = [];\r\n");
      out.write("            for (var i = 0; i < nodes.length; i ++){\r\n");
      out.write("                ids.push(nodes[i].auth_fuction_id);\r\n");
      out.write("            }\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/authRole/add/\"+ ids +\".do\",\r\n");
      out.write("                method:\"post\",\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                data: $(\"#ff\").serialize(),\r\n");
      out.write("                success:function (data) {\r\n");
      out.write("                    alert(\"添加成功！\");\r\n");
      out.write("                    location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index/system/role.do';\r\n");
      out.write("                },\r\n");
      out.write("                error:function () {\r\n");
      out.write("                    alert(\"请求失败！\");\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("        }else {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function clearForm(){\r\n");
      out.write("        $('#ff').form('clear');\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}