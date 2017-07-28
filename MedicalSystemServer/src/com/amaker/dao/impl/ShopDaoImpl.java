package com.amaker.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amaker.dao.ShopDao;
import com.amaker.dao.UserDao;
import com.amaker.entity.CheckTable;
import com.amaker.entity.Shop;
import com.amaker.entity.User;
import com.amaker.util.DBUtil;
public class ShopDaoImpl implements ShopDao {
	
	@Override
	public List getShop() {
		// ��ѯSQL���
				String sql = " select id,name,type,money,zhicheng"+
								" from shop ";
				// ���ݿ����ӹ�����
				DBUtil util = new DBUtil();
				// �������
				Connection conn = util.openConnection();
				try {
					// ���Ԥ�������
					Statement pstmt = conn.createStatement();
					ResultSet rs = pstmt.executeQuery(sql);
					List list = new ArrayList();
					// �ж��û��Ƿ����
					while (rs.next()) {
						Shop ct = new Shop();
						ct.setName(rs.getString(2));
						ct.setType(rs.getString(3));
						ct.setMoney(rs.getString(4));
						ct.setZhicheng(rs.getString(5));
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
