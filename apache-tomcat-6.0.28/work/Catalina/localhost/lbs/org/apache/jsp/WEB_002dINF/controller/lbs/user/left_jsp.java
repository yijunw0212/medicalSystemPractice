package org.apache.jsp.WEB_002dINF.controller.lbs.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>后台操作首页</title>\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("    body{  overflow-x : hidden ;font-size:12px; font-family:\"宋体\";  margin:0; padding:0}\r\n");
      out.write("    \r\n");
      out.write("\timg{border:0}\r\n");
      out.write("\t\r\n");
      out.write("\tul,li{margin:0; padding:0; float:left; list-style:none; list-style-type:none}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_box{padding:10px; width:186px; clear:both}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_box .left_bg{width:184px; background-color:#E6E6E6; padding:0 3px 3px 0}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_box .left_box{width:182px; background-color:#F0F2F3; border:1px solid #D6D6D6}\r\n");
      out.write("\r\n");
      out.write("\t.one_m_over{background:url(images/one_m_over.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#004D91; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.one_m_over:hover{background:url(images/one_m_bg.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#004D91; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.one_m_out{background:url(images/one_m_bg.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#454545; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.one_m_out:hover{background:url(images/one_m_over.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#004D91; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t#content_box .left_box ul{width:202px}\r\n");
      out.write("\t#content_box .left_box li{width:202px; height:28px; padding:1px 0; clear:both}\r\n");
      out.write("\t.tow_m_over{background:url(images/two_m_over.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#069DBF; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.tow_m_over:hover{background:url(images/two_m_over.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#069DBF; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.tow_m_out{background:url(images/two_m_bg.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#454545; clear:both; text-decoration:none}\r\n");
      out.write("\t.tow_m_out:hover{background:url(images/two_m_over.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#069DBF; clear:both; text-decoration:none}\r\n");
      out.write("   </style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction viewChild(str){\r\n");
      out.write("\t\tvar styleValue=document.getElementById(str).style.display;\r\n");
      out.write("\t\tif(styleValue==\"\"){\r\n");
      out.write("\t\t\tdocument.getElementById(str).style.display=\"none\";\r\n");
      out.write("\t\t}else if (styleValue==\"none\"){\r\n");
      out.write("\t\t\tdocument.getElementById(str).style.display=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("<div id=\"content_box\">\r\n");
      out.write("  <div class=\"left_bg\">\r\n");
      out.write("    <div class=\"left_box\">\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_1')\" class=\"one_m_out\">省份信息管理</a>\r\n");
      out.write("      <ul id=\"child_1\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"province/ProvinceAction_returnUrl.action?returnUrl=addUrl\" class=\"tow_m_out\" target=\"main\">省份信息添加</a></li>\r\n");
      out.write("        <li><a href=\"province/ProvinceAction_searchList.action\" class=\"tow_m_out\" target=\"main\">省份信息列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_2')\" class=\"one_m_out\">城市信息管理</a>\r\n");
      out.write("      <ul id=\"child_2\" style=\"display:none\">\r\n");
      out.write("     \t<li><a href=\"city/CityinfoAction_returnUrl.action?returnUrl=addUrl\" class=\"tow_m_out\" target=\"main\">城市信息添加</a></li>\r\n");
      out.write("        <li><a href=\"province/ProvinceAction_searchList.action?returnUrl=selectCity&type=1\" class=\"tow_m_out\" target=\"main\">城市信息列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_3')\" class=\"one_m_out\">区域信息管理</a>\r\n");
      out.write("      <ul id=\"child_3\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"city/CitychildinfoAction_returnUrl.action?returnUrl=addUrl\" class=\"tow_m_out\" target=\"main\">区域信息添加</a></li>\r\n");
      out.write("        <li><a href=\"province/ProvinceAction_searchList.action?returnUrl=selectCity&type=2\" class=\"tow_m_out\" target=\"main\">区域信息列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_4')\" class=\"one_m_out\">商圈信息管理</a>\r\n");
      out.write("      <ul id=\"child_4\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"area/BusiaeraAction_returnUrl.action?returnUrl=addUrl\" class=\"tow_m_out\" target=\"main\">商圈信息添加</a></li>\r\n");
      out.write("        <li><a href=\"area/BusiaeraAction_returnUrl.action?returnUrl=searchUrl\" class=\"tow_m_out\" target=\"main\">商圈信息查询</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_5')\" class=\"one_m_out\">商家信息管理</a>\r\n");
      out.write("      <ul id=\"child_5\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"business/BusinessinfoAction_returnUrl.action?returnUrl=addUrl\" class=\"tow_m_out\" target=\"main\">商家信息添加</a></li>\r\n");
      out.write("        <li><a href=\"business/BusinessinfoAction_returnUrl.action?returnUrl=searchUrl\" class=\"tow_m_out\" target=\"main\">商家信息列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_10')\" class=\"one_m_out\">用户管理</a>\r\n");
      out.write("      <ul id=\"child_10\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"user/UserinfoAction_userList.action\" class=\"tow_m_out\" target=\"main\">用户列表</a></li>\r\n");
      out.write("        <li><a href=\"user/UserinfoAction_showUserInfo.action\" class=\"tow_m_out\" target=\"main\">查看本用户信息</a></li>\r\n");
      out.write("        <li><a href=\"user/UserinfoAction_updateUrl.action\" class=\"tow_m_out\" target=\"main\">修改密码</a></li>\r\n");
      out.write("        <li><a href=\"user/UserinfoAction_loginOut.action\" class=\"tow_m_out\" target=\"_top\">重新登录</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
