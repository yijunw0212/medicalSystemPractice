package org.apache.jsp.WEB_002dINF.controller.woshare.lbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class typeupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
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
      response.setContentType("text/html;charset=utf-8");
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
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t\t<title>add.jsp</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction tijiao(){\r\n");
      out.write("\t\tvar  email= document.getElementById(\"chargeManager.manageremail\");\r\n");
      out.write("\t\tvar list = null;\r\n");
      out.write("\t\tlist = new Array(\r\n");
      out.write("\t\t\t\tnew ValidateEntity(\"chargeManager.typename\", \"类型名称不能为空！\",\"typenameLayer\",\"8\",\"字符超过限制，不能超过8个字节，一个汉字为2个字节！\")\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\tif (validate(list)) {\r\n");
      out.write("\t\t\tvar strs = email.value.split(\";\");\r\n");
      out.write("\t\t\tvar newcontent = \"\";\r\n");
      out.write("\t\t\tvar iserror = 0;\r\n");
      out.write("\t\t\tfor(var j=0;j<strs.length;j++){\r\n");
      out.write("\t\t\t\tif(strs[j]==\"\" || strs[j].length<=0){continue;}\r\n");
      out.write("\t\t\t\tif(CheckEmail(strs[j])){//Email格式合法\r\n");
      out.write("\t\t\t\t\tif(j==0){\r\n");
      out.write("\t\t\t\t\t\tnewcontent = newcontent + strs[j];\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tnewcontent = newcontent +\";\"+ strs[j];\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{//Email格式不合法\r\n");
      out.write("\t\t\t\t\tiserror=1;\r\n");
      out.write("\t\t\t\t\tif(j==0){\r\n");
      out.write("\t\t\t\t\t\tnewcontent = newcontent +\"<font color=red>\"+ strs[j]+\"</font>\";\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tnewcontent = newcontent +\";\"+\"<font color=red>\"+ strs[j]+\"</font>\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar oDiv = document.createElement('DIV');\r\n");
      out.write("\t\t\toDiv.innerHTML = newcontent;\r\n");
      out.write("\t\t\t//email.value =\"\";\r\n");
      out.write("\t\t\t//email.appendChild(oDiv);\r\n");
      out.write("\t\t\tif(iserror==1){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"manageremailLayer\").innerHTML = \"<font color='#FF0000'>E-mail格式不正确！</font>\";\r\n");
      out.write("\t\t\t\treturn ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("           \r\n");
      out.write("           var pid=document.getElementById(\"parentid\").value;\r\n");
      out.write("           \r\n");
      out.write("           if(pid==-1){\r\n");
      out.write("           \tvar imageV=document.getElementById(\"iconImageUrl\").value;\r\n");
      out.write("\t\t    var imageS=document.getElementById(\"iconImageUrlLayer\");\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t   if(imageV!=null && imageV.trim()!=\"\" )\r\n");
      out.write("\t\t    { \r\n");
      out.write("\t\t     if(imageV.lastIndexOf(\".\")!=-1){\r\n");
      out.write("\t\t        var ge=imageV.substring(imageV.lastIndexOf(\".\") + 1);\r\n");
      out.write("                 if(\"jpg\"!=ge && \"png\"!=ge){\r\n");
      out.write("                    imageS.innerHTML=\"<font color='#FF0000'>上传图片格式不正确！</font>\";\r\n");
      out.write("                    return; \r\n");
      out.write("                 }\r\n");
      out.write("\t\t      }else{\r\n");
      out.write("\t\t            imageS.innerHTML=\"<font color='#FF0000'>上传图片格式不正确！</font>\";\r\n");
      out.write("                    return; \r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    imageS.innerHTML=\"<font color='#FF0000'></font>支持jpg，png格式，建议图片小于200K，android大小72*72，iPhone大小57*57\";\r\n");
      out.write("                \r\n");
      out.write("                var description=document.getElementById(\"chargeManager.description\").value;\r\n");
      out.write("                var deSp=document.getElementById(\"descriptionLayer\");\r\n");
      out.write("                \r\n");
      out.write("                if(description==null  || description.trim()==\"\" ){\r\n");
      out.write("                  deSp.innerHTML=\"<font color='#FF0000'>描述不能为空！</font>\";\r\n");
      out.write("                  return ;\r\n");
      out.write("                }else if(description.length>=1000){\r\n");
      out.write("                  deSp.innerHTML=\"<font color='#FF0000'>超过1000个字节，一个汉字为2个字节;(汉字，数字，字母和下划线)一个字节</font>\";\r\n");
      out.write("                  return ;\r\n");
      out.write("                }\r\n");
      out.write("               deSp.innerHTML=\"<font color='#FF0000'>*</font> 不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)\";\r\n");
      out.write("           }\r\n");
      out.write("\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form name=\"typeForm\"\r\n");
      out.write("\t\t\taction=\"user/ChargeManagerAction_typeUpdate.action\" method=\"post\"   enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"parentid\" name=\"parentid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" class=\"thead\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tit_box\">\r\n");
      out.write("\t\t\t\t\t\t\t类型修改\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t类型名称:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"chargeManager.id\" name=\"chargeManager.id\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chargeManager.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeManager.typename\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"chargeManager.typename\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chargeManager.typename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"typenameLayer\"><font color=\"#FF0000\">*</font>不超过4个汉字</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t管理员E-mail:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<textarea id=\"chargeManager.manageremail\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"chargeManager.manageremail\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chargeManager.manageremail }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"manageremailLayer\"><font color=\"#FF0000\"></font>请填写正确的E-mail，多个E-mail以分号(;)分隔(例：abcdef@163.com;qwert@sohu.com)<br />&nbsp;&nbsp;如果不填，则不发，如果该类型有子节点，则默认以子节点E-mail为准</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t处理类型:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"chargeManager.sendtype\" name=\"chargeManager.sendtype\"\r\n");
      out.write("\t\t\t\t\t\t\tonchange=\"checkishave()\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t其他\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t故障\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t建议咨询\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"sendtypeLayer\"><font color=\"#FF0000\">*</font>默认选择其他类型</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" name=\"tianjia\" value=\"提交\" onClick=\"tijiao()\" />\r\n");
      out.write("\t\t\t\t\t\t<div id=\"info\" style=\"display: none\"></div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/controller/woshare/lbs/typeupdate.jsp(145,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#request.chargeManager.sendtype==0");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent(null);
    // /WEB-INF/controller/woshare/lbs/typeupdate.jsp(149,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("#request.chargeManager.sendtype==1");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent(null);
    // /WEB-INF/controller/woshare/lbs/typeupdate.jsp(153,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("#request.chargeManager.sendtype==2");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent(null);
    // /WEB-INF/controller/woshare/lbs/typeupdate.jsp(160,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("#request.parentid==-1");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<tr id=\"iconImageUrltr\" style=\"display: \">\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t处理人员头像:\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"file\" id=\"iconImageUrl\" name=\"iconImageUrl\"\r\n");
        out.write("\t\t\t\t\t\t\t\tsize=\"60\" onkeydown='return   false' onpaste='return   false'\r\n");
        out.write("\t\t\t\t\t\t\t\tondragenter='return   false' />\r\n");
        out.write("\t\t\t\t\t\t\t<span id=\"iconImageUrlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K，android大小72*72，iPhone大小57*57</span>\r\n");
        out.write("\t\t\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t\t\t<img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chargeManager.icon}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" width=\"100\" height=\"100\" />\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<tr id=\"descriptiontr\" style=\"display: \">\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t描述:\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t<textarea rows=\"5\" cols=\"60\" id=\"chargeManager.description\"\r\n");
        out.write("\t\t\t\t\t\t\t\tname=\"chargeManager.description\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chargeManager.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\r\n");
        out.write("\t\t\t\t\t\t\t<span id=\"descriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }
}
