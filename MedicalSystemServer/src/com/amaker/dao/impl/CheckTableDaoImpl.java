package com.amaker.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amaker.dao.CheckTableDao;
import com.amaker.entity.CheckTable;
import com.amaker.util.DBUtil;
public class CheckTableDaoImpl implements CheckTableDao {

	public List getTableList() {
		String sql =" select id,num,flag,personNum,type from tableTbl";
		//String sql="select a.*,b.* from tabletbl a left join ordertbl b on a.id=b.tableId and b.isPay = 0";
		DBUtil util = new DBUtil();
		Connection conn = util.openConnection();
		try {
			Statement pstmt = conn.createStatement();
			ResultSet rs = pstmt.executeQuery(sql);
			List list = new ArrayList();
			while (rs.next()) {
				String num = rs.getString(2);
				String flag = rs.getString(3);
				String personNum = rs.getString(4);
				String type = rs.getString(5);
				CheckTable ct = new CheckTable();
				ct.setId(rs.getInt(1));
				ct.setFlag(flag);
				ct.setNum(num);
				ct.setPresionName(personNum);
				ct.setType(type);
				list.add(ct);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.closeConn(conn);
		}
		return null;
	}
}
