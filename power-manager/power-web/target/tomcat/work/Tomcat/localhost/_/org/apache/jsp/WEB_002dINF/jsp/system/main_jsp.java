/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-03 13:08:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>简单后台</title>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
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
      out.write("\r\n");
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
      out.write("    <SCRIPT type=\"text/javascript\">\r\n");
      out.write("        <!--\r\n");
      out.write("        var zTree;\r\n");
      out.write("\r\n");
      out.write("        var setting = {\r\n");
      out.write("            view: {\r\n");
      out.write("                dblClickExpand: false,\r\n");
      out.write("                showLine: true,\r\n");
      out.write("                selectedMulti: false\r\n");
      out.write("            },\r\n");
      out.write("            data: {\r\n");
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
      out.write("       function getNodes(){\r\n");
      out.write("           $.ajax({\r\n");
      out.write("               url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/authfunction/queryAllByUserId.do\",\r\n");
      out.write("               dataType:\"json\",\r\n");
      out.write("               success:function (result) {\r\n");
      out.write("                   var t = $(\"#tree\");\r\n");
      out.write("                   t = $.fn.zTree.init(t, setting, result);\r\n");
      out.write("               }\r\n");
      out.write("           })\r\n");
      out.write("       }\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            getNodes();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function addTab(title, url){\r\n");
      out.write("            if ($('#tt').tabs('exists', title)){\r\n");
      out.write("                $('#tt').tabs('close', title);\r\n");
      out.write("            }\r\n");
      out.write("            var content = '<iframe scrolling=\"auto\" frameborder=\"0\"  src=\"'+url+'\" style=\"width:100%;height:100%;\"></iframe>';\r\n");
      out.write("            $('#tt').tabs('add',{\r\n");
      out.write("                title:title,\r\n");
      out.write("                content:content,\r\n");
      out.write("                closable:true\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        //-->\r\n");
      out.write("    </SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("    <div data-options=\"region:'north',border:false\" style=\"height:60px;background:#B3DFDA;padding:10px\">\r\n");
      out.write("        当前用户：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div data-options=\"region:'west',split:true,title:'菜单导航'\" style=\"width:150px;padding:10px;\">\r\n");
      out.write("        <div class=\"easyui-accordion\" data-options=\"fit:true,border:false\">\r\n");
      out.write("            <div title=\"基本功能\" style=\"padding:10px;\" id=\"tree\" class=\"ztree\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div data-options=\"region:'east',split:true,collapsed:true,title:'East'\" style=\"width:100px;padding:10px;\">east region</div>\r\n");
      out.write("    <div data-options=\"region:'south',border:false\" style=\"height:50px;background:#A9FACD;padding:10px;\">south region</div>\r\n");
      out.write("    <div id=\"tt\" class=\"easyui-tabs\" data-options=\"region:'center'\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
