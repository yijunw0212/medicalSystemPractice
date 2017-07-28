package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONTokener;

import com.amaker.dao.CheckTableDao;
import com.amaker.dao.impl.CheckTableDaoImpl;
import com.amaker.entity.CheckTable;
/**
 *
 * ʵ�ֲ�̨����
 */
public class CheckTableServlet extends HttpServlet {
	// ���췽��
	public CheckTableServlet() {
		super();
	}
	// ���ٷ���
	public void destroy() {
		super.destroy(); 
	}
	// ��ӦGet����
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
		// ʵ����CheckTableDao
		CheckTableDao dao = new CheckTableDaoImpl();
		// ��ò�����Ϣ�б�
		List list = dao.getTableList();
		// ת��Ϊ�ַ���
		String msg = buildJson(list);
		// ���ظ��ͻ���
		out.print(msg);
		out.flush();
		out.close();
	}
	
	private String buildJson(List list)
	{
		JSONArray array = new JSONArray();
		for(Object o :list)
		{
			array.add(JSONObject.fromObject(o));
		}
		return array.toString();
	}
	
	// ��List�б�ת��Ϊ�ַ���
	private String build(List list){
		String msg = "";
		for (int i = 0; i < list.size(); i++) {
//			CheckTable ct = (CheckTable) list.get(i);
//			int num = ct.getNum();
//			int flag = ct.getFlag();
//			msg+=num+","+flag;
//			if(i<(list.size()-1))msg+=";";
		}
		return msg;
	}
	// ��ӦPost����
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	// ��ʼ��
	public void init() throws ServletException {
	}

}
