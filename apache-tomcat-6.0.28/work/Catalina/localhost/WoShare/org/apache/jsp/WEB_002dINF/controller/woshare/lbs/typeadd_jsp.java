package org.apache.jsp.WEB_002dINF.controller.woshare.lbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class typeadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t\t<title>修改处理人员信息</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction tijiao(){\r\n");
      out.write("\t\tvar  email= document.getElementById(\"chargeManager.manageremail\");\r\n");
      out.write("\t\tvar list = null;\r\n");
      out.write("\t\tlist = new Array(\r\n");
      out.write("\t\t\t\tnew ValidateEntity(\"chargeManager.typename\", \"类型名称不能为空！\",\"typenameLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\")\r\n");
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
      out.write("\t\t//\temail.value =\"\";\r\n");
      out.write("\t\t//\temail.appendChild(oDiv);\r\n");
      out.write("\t\t\tif(iserror==1){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"manageremailLayer\").innerHTML = \"<font color='#FF0000'>E-mail格式不正确！</font>\";\r\n");
      out.write("\t\t\t\treturn ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar pid=document.getElementById(\"chargeManager.parentid\").value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(pid==-1){\r\n");
      out.write("\t\t\t\t//if (!(checkImage('iconImageUrl', 'iconImageUrlLayer', false, 1))) {\r\n");
      out.write("\t\t\t\t// return;\r\n");
      out.write("\t\t     \t//}\r\n");
      out.write("\t\t     \tvar imageV=document.getElementById(\"iconImageUrl\").value;\r\n");
      out.write("\t\t     \tvar imageS=document.getElementById(\"iconImageUrlLayer\");\r\n");
      out.write("\t\t     \t\r\n");
      out.write("\t\t     \tif(imageV==null || imageV.trim()==\"\" || imageV.lastIndexOf(\".\")==-1)\r\n");
      out.write("\t\t     \t{\r\n");
      out.write("\t\t     \t  imageS.innerHTML=\"<font color='#FF0000'>请上传图片！</font>\";\r\n");
      out.write("\t\t     \t  return ;\r\n");
      out.write("\t\t     \t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        var ge=imageV.substring(imageV.lastIndexOf(\".\") + 1);\r\n");
      out.write("\r\n");
      out.write("                if(\"jpg\"!=ge && \"png\"!=ge){\r\n");
      out.write("                    imageS.innerHTML=\"<font color='#FF0000'>上传图片格式不正确！</font>\";\r\n");
      out.write("                    return; \r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                imageS.innerHTML=\"<font color='#FF0000'>*</font>支持jpg，png格式，建议图片小于200K，android大小72*72，iPhone大小57*57\";\r\n");
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
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form name=\"typeForm\" action=\"user/ChargeManagerAction_addType.action\"\r\n");
      out.write("\t\t\tmethod=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" class=\"thead\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tit_box\">\r\n");
      out.write("\t\t\t\t\t\t\t类型添加\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t上级节点:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"chargeManager.parentid\" id=\"chargeManager.parentid\" value=\"-1\" readonly/>\r\n");
      out.write("\t\t\t\t\t<span id=\"parentname\"></span>\r\n");
      out.write("\t\t           \t<!-- &returnId=chargeManager.parentid&returnValue=parentName&hiddenid=trid -->\r\n");
      out.write("        \t\t  \t<a href=\"javascript:openPage('选择产品类型','user/ChargeManagerAction_typeList.action?chargeManager.parentid=-1&returnUrl=selectType')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t类型名称:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"chargeManager.levelNumber\" id=\"chargeManager.levelNumber\" value=\"1\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeManager.typename\" name=\"chargeManager.typename\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"typenameLayer\"><font color=\"#FF0000\">*</font>不超过50个汉字</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"manageremail\" style=\"display:\">\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t管理员E-mail:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<textarea id=\"chargeManager.manageremail\" name=\"chargeManager.manageremail\" ></textarea><br/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"manageremailLayer\"><font color=\"#FF0000\">\r\n");
      out.write("\t\t\t\t\t\t</font>请填写正确的E-mail，多个E-mail以分号(;)分隔(例：abcdef@163.com;qwert@sohu.com) <br/>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;如果不填，则不发，如果该类型有子节点，则默认以子节点E-mail为准\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t处理类型:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"chargeManager.sendtype\" name=\"chargeManager.sendtype\" onchange=\"checkishave(this)\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\" selected>其他</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">故障</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">建议咨询</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"sendtypeLayer\"><font color=\"#FF0000\">*</font>默认选择其他类型</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"iconImageUrltr\" style=\"display:\">\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t处理人员头像:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" id=\"iconImageUrl\" name=\"iconImageUrl\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"iconImageUrlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K，android大小72*72，iPhone大小57*57</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"descriptiontr\" style=\"display:\">\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t描述:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<textarea rows=\"5\" cols=\"60\" id=\"chargeManager.description\" name=\"chargeManager.description\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"descriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" name=\"tianjia\" value=\"添加\" onClick=\"tijiao()\" />\r\n");
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
}
