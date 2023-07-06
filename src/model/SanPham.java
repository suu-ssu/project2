package model;

public class SanPham {
	int MaSanPham;
	String TenSanPham;
	int MaLoaiSP;
	int MaNSX;
	int GiaNhap;
	int GiaBan;
	int SoLuong;
	int TrangThai;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(int maSanPham, String tenSanPham, int maLoaiSP, int maNSX, int giaNhap, int giaBan, int soLuong,
			int trangThai) {
		super();
		MaSanPham = maSanPham;
		TenSanPham = tenSanPham;
		MaLoaiSP = maLoaiSP;
		MaNSX = maNSX;
		GiaNhap = giaNhap;
		GiaBan = giaBan;
		SoLuong = soLuong;
		TrangThai = trangThai;
	}
	public int getMaSanPham() {
		return MaSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		MaSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}
	public int getMaLoaiSP() {
		return MaLoaiSP;
	}
	public void setMaLoaiSP(int maLoaiSP) {
		MaLoaiSP = maLoaiSP;
	}
	public int getMaNSX() {
		return MaNSX;
	}
	public void setMaNSX(int maNSX) {
		MaNSX = maNSX;
	}
	public int getGiaNhap() {
		return GiaNhap;
	}
	public void setGiaNhap(int giaNhap) {
		GiaNhap = giaNhap;
	}
	public int getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public int getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(int trangThai) {
		TrangThai = trangThai;
	}
	
}
