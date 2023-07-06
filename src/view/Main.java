package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DanhMucMain;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;

public class Main extends JFrame {

	private JPanel contentPane;
	public Main frame;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main frame = new Main();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1917, 990);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBounds(0, 0, 310, 979);
		panel.add(pnMenu);
		pnMenu.setLayout(null);
		
		JPanel pnCuaHang = new JPanel();
		pnCuaHang.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCuaHang.setBackground(new Color(255, 0, 0));
		pnCuaHang.setBounds(0, 0, 300, 85);
		pnMenu.add(pnCuaHang);
		pnCuaHang.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cửa Hàng Phước Long");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 290, 63);
		pnCuaHang.add(lblNewLabel);
		
		JPanel jpnKhachHang = new JPanel();
		jpnKhachHang.setBackground(new Color(128, 255, 0));
		jpnKhachHang.setBounds(10, 240, 290, 61);
		pnMenu.add(jpnKhachHang);
		jpnKhachHang.setLayout(null);
		
		JLabel jbKhachHang = new JLabel("Khách Hàng");
		jbKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		jbKhachHang.setBackground(new Color(0, 255, 0));
		jbKhachHang.setFont(new Font("Arial", Font.BOLD, 18));
		jbKhachHang.setBounds(10, 11, 270, 39);
		jpnKhachHang.add(jbKhachHang);
		
		JPanel jpnSanPham = new JPanel();
		jpnSanPham.setLayout(null);
		jpnSanPham.setBackground(new Color(128, 255, 0));
		jpnSanPham.setBounds(10, 168, 290, 61);
		pnMenu.add(jpnSanPham);
		
		JLabel jbSanPham = new JLabel("Sản Phẩm");
		jbSanPham.setHorizontalAlignment(SwingConstants.CENTER);
		jbSanPham.setFont(new Font("Arial", Font.BOLD, 18));
		jbSanPham.setBackground(Color.GREEN);
		jbSanPham.setBounds(10, 11, 270, 39);
		jpnSanPham.add(jbSanPham);
		
		JPanel jpnHoaDon = new JPanel();
		jpnHoaDon.setLayout(null);
		jpnHoaDon.setBackground(new Color(128, 255, 0));
		jpnHoaDon.setBounds(10, 96, 290, 61);
		pnMenu.add(jpnHoaDon);
		
		JLabel jbHoaDon = new JLabel("Hóa Đơn");
		jbHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		jbHoaDon.setFont(new Font("Arial", Font.BOLD, 18));
		jbHoaDon.setBackground(Color.GREEN);
		jbHoaDon.setBounds(10, 11, 270, 39);
		jpnHoaDon.add(jbHoaDon);
		
		JPanel jpnThongKe = new JPanel();
		jpnThongKe.setLayout(null);
		jpnThongKe.setBackground(new Color(128, 255, 0));
		jpnThongKe.setBounds(10, 456, 290, 61);
		pnMenu.add(jpnThongKe);
		
		JLabel jbThongKe = new JLabel("Thống Kê Doanh Thu");
		jbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		jbThongKe.setFont(new Font("Arial", Font.BOLD, 18));
		jbThongKe.setBackground(Color.GREEN);
		jbThongKe.setBounds(10, 11, 270, 39);
		jpnThongKe.add(jbThongKe);
		
		JPanel pnView = new JPanel();
		pnView.setBounds(304, 0, 1587, 979);
		panel.add(pnView);
		pnView.setLayout(null);
		ChuyenTable controller = new ChuyenTable(pnView);
		controller.setView(jpnThongKe,jbThongKe);
		
		JPanel jpnNhaCungCap = new JPanel();
		jpnNhaCungCap.setLayout(null);
		jpnNhaCungCap.setBackground(new Color(128, 255, 0));
		jpnNhaCungCap.setBounds(10, 312, 290, 61);
		pnMenu.add(jpnNhaCungCap);
		
		JLabel jbNhaCungCap = new JLabel("Nhà Cung Cấp");
		jbNhaCungCap.setHorizontalAlignment(SwingConstants.CENTER);
		jbNhaCungCap.setFont(new Font("Arial", Font.BOLD, 18));
		jbNhaCungCap.setBackground(Color.GREEN);
		jbNhaCungCap.setBounds(10, 11, 270, 39);
		jpnNhaCungCap.add(jbNhaCungCap);
		
		JPanel jpnNhanVien = new JPanel();
		jpnNhanVien.setLayout(null);
		jpnNhanVien.setBackground(new Color(128, 255, 0));
		jpnNhanVien.setBounds(10, 384, 290, 61);
		pnMenu.add(jpnNhanVien);
		
		JLabel jbNhanVien = new JLabel("Nhân Viên");
		jbNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		jbNhanVien.setFont(new Font("Arial", Font.BOLD, 18));
		jbNhanVien.setBackground(Color.GREEN);
		jbNhanVien.setBounds(10, 11, 270, 39);
		jpnNhanVien.add(jbNhanVien);
		
		JPanel jpnDangXuat = new JPanel();
		jpnDangXuat.setLayout(null);
		jpnDangXuat.setBackground(new Color(128, 255, 0));
		jpnDangXuat.setBounds(10, 528, 290, 61);
		pnMenu.add(jpnDangXuat);
		
		JLabel jbDangXuat = new JLabel("Đăng Xuất");
		jbDangXuat.setHorizontalAlignment(SwingConstants.CENTER);
		jbDangXuat.setFont(new Font("Arial", Font.BOLD, 18));
		jbDangXuat.setBackground(Color.GREEN);
		jbDangXuat.setBounds(10, 11, 270, 39);
		jpnDangXuat.add(jbDangXuat);
		
		JPanel jpnThongTin = new JPanel();
		jpnThongTin.setLayout(null);
		jpnThongTin.setBackground(new Color(128, 255, 0));
		jpnThongTin.setBounds(10, 600, 290, 61);
		pnMenu.add(jpnThongTin);
		
		JLabel jbThongTin = new JLabel("Thông tin");
		jbThongTin.setHorizontalAlignment(SwingConstants.CENTER);
		jbThongTin.setFont(new Font("Arial", Font.BOLD, 18));
		jbThongTin.setBackground(Color.GREEN);
		jbThongTin.setBounds(10, 11, 270, 39);
		jpnThongTin.add(jbThongTin);
		
		ArrayList<DanhMucMain> listItem = new ArrayList<>();
		listItem.add(new DanhMucMain("HoaDon",jpnHoaDon,jbHoaDon)); 	
		listItem.add(new DanhMucMain("ThongKe",jpnThongKe,jbThongKe));
		listItem.add(new DanhMucMain("KhachHang",jpnKhachHang,jbKhachHang));
		listItem.add(new DanhMucMain("SanPham",jpnSanPham,jbSanPham));
		listItem.add(new DanhMucMain("NhanVien",jpnNhanVien,jbNhanVien));
		listItem.add(new DanhMucMain("NhaCungCap",jpnNhaCungCap,jbNhaCungCap));
		
		controller.setEvant(listItem);
	}
}
