package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.NhaCungCap;



public class NhaCungCapDAO extends ConnectDatabase {
	public ArrayList<NhaCungCap> docLS(){
		ArrayList<NhaCungCap> arrayList = new ArrayList<NhaCungCap>();
		try {
			String sql = "Select * from NhaCungCap";
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				NhaCungCap ncc= new NhaCungCap();
				ncc.setMaNhaCungCap(set.getInt(1));
				ncc.setTenNhaCungCap(set.getString(2));
				ncc.setDiaChi(set.getString(3));
				ncc.setSoDienThoai(set.getString(4));
				ncc.setEmail(set.getString(5));
				arrayList.add(ncc);
			}
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arrayList;
}
}
