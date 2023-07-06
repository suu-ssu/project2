package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dao.KhachHangDAO;
import model.KhachHang;

public class KhachHangJPanel extends JPanel {
	private static JTable tbKH;
	private static ArrayList<KhachHang> arrayList;
	/**
	 * Create the panel.
	 */
	public KhachHangJPanel() {
		setForeground(new Color(192, 192, 192));
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1004, 413);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 984, 391);
		panel.add(scrollPane);
		
		tbKH = new JTable();
		tbKH.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, "", null},
			},
			new String[] {
				"M\u00E3 Kh\u00E1ch H\u00E0ng", "T\u00EAn Kh\u00E1ch H\u00E0ng", "Gi\u1EDBi T\u00EDnh", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "Lo\u1EA1i Kh\u00E1ch H\u00E0ng"
			}
		));
		tbKH.getColumnModel().getColumn(0).setPreferredWidth(115);
		tbKH.getColumnModel().getColumn(1).setPreferredWidth(120);
		scrollPane.setViewportView(tbKH);
		hienthi();
	}
	public static void hienthi() {
		KhachHangDAO kh = new KhachHangDAO();
		arrayList = kh.docLS();
		DefaultTableModel model = (DefaultTableModel)tbKH.getModel();
		model.setRowCount(0);
		for(int i=0;i<arrayList.size();i++) {
			Vector<Object> vec = new Vector<>();
			  vec.add(arrayList.get(i).getMaKhachHang());
		      vec.add(arrayList.get(i).getTenKhachHang());
		      vec.add(arrayList.get(i).getGioiTinh());
		      vec.add(arrayList.get(i).getSoDienThoai());
		      vec.add(arrayList.get(i).getMaLoaiKH());
	        model.addRow(vec); 
		}
	}
}
