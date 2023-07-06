package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.KhachHang;

public class KhachHangDAO extends ConnectDatabase{
	public ArrayList<KhachHang> docLS(){
		ArrayList<KhachHang> arrayList = new ArrayList<KhachHang>();
		try {
			String sql = "Select MaKhachHang,TenKhachHang,GioiTinh,SoDienThoai,LoaiKhachHang.TenLoaiKH from KhachHang,LoaiKhachHang where KhachHang.MaLoaiKH = LoaiKhachHang.MaLoaiKH";
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				KhachHang kh = new KhachHang();
				kh.setMaKhachHang(set.getInt(1));
				kh.setTenKhachHang(set.getString(2));
				kh.setGioiTinh(set.getString(3));
				kh.setSoDienThoai(set.getString(4));
				kh.setMaLoaiKH(set.getString(5));
				arrayList.add(kh);
			}
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arrayList;
}
}
