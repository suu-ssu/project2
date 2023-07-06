package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.NhanVien;
import model.SanPham;

public class SanPhamDao extends ConnectDatabase{
	public ArrayList<SanPham> docLS(){
		ArrayList<SanPham> arrayList = new ArrayList<SanPham>();
		try {
			String sql = "Select * from SanPham";
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				SanPham sp = new SanPham();
				sp.setMaSanPham(set.getInt(1));
				sp.setTenSanPham(set.getString(2));
				arrayList.add(sp);
			}
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arrayList;
}
}
