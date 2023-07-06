package view;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dao.NhaCungCapDAO;
import model.NhaCungCap;

public class NhaCungCapJPanel extends JPanel {
	private static JTable tbNCC;
	private static ArrayList<NhaCungCap> arrayList;
	/**
	 * Create the panel.
	 */
	public NhaCungCapJPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1038, 339);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1018, 317);
		panel.add(scrollPane);
		
		tbNCC = new JTable();
		tbNCC.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 Nh\u00E0 Cung C\u1EA5p", "T\u00EAn Nh\u00E0 Cung C\u1EA5p", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "Email"
			}
		));
		scrollPane.setViewportView(tbNCC);
		hienthi();
	}
	public static void hienthi() {
		NhaCungCapDAO kh = new NhaCungCapDAO();
		arrayList = kh.docLS();
		DefaultTableModel model = (DefaultTableModel)tbNCC.getModel();
		model.setRowCount(0);
		for(int i=0;i<arrayList.size();i++) {
			Vector<Object> vec = new Vector<>();
			  vec.add(arrayList.get(i).getMaNhaCungCap());
		      vec.add(arrayList.get(i).getTenNhaCungCap());
		      vec.add(arrayList.get(i).getDiaChi());
		      vec.add(arrayList.get(i).getSoDienThoai());
		      vec.add(arrayList.get(i).getEmail());
	        model.addRow(vec); 
		}
	}
}
