package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.KhachHang;
import model.NhanVien;

public class NhanVienDao extends ConnectDatabase {
	public ArrayList<NhanVien> docLS() {
		ArrayList<NhanVien> arrayList = new ArrayList<NhanVien>();
		try {
			String sql = "Select * from NhanVien";
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				NhanVien nv = new NhanVien();
				nv.setMaNhanVien(set.getInt(1));
				nv.setTenNhanVien(set.getString(2));
				nv.setGioiTinh(set.getString(3));
				nv.setNgayVaoLam(set.getString(4));
				nv.setSoDienThoai(set.getString(5));
				arrayList.add(nv);
			}
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arrayList;
	}
}
