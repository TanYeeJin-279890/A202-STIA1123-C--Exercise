package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class BeveragesDescription {

	protected JFrame bd;
	private JTextField ID;
	private JTextField NAME;
	private JTextField FLAVOUR;
	private JTextField VOLUME;
	private JTextField PRICE;
	private JTextField QUANTITY;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeveragesDescription window = new BeveragesDescription();
					window.bd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BeveragesDescription() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bd = new JFrame();
		bd.setBounds(100, 100, 1303, 737);
		bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bd.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1263, 678);
		bd.getContentPane().add(panel);
		
		JLabel lblBeveragesDescription = new JLabel("Beverages Description");
		lblBeveragesDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeveragesDescription.setForeground(new Color(148, 0, 211));
		lblBeveragesDescription.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBeveragesDescription.setBounds(481, 14, 532, 54);
		panel.add(lblBeveragesDescription);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(241, 80, 302, 459);
		panel.add(panel_1);
		
		JLabel InfoLabel = new JLabel("Beverages Info");
		InfoLabel.setForeground(new Color(148, 0, 211));
		InfoLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		InfoLabel.setBounds(10, 11, 267, 34);
		panel_1.add(InfoLabel);
		
		JLabel IDLabel = new JLabel("BevID");
		IDLabel.setForeground(new Color(148, 0, 211));
		IDLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		IDLabel.setBounds(10, 60, 56, 24);
		panel_1.add(IDLabel);
		
		JLabel lblBevname = new JLabel("BevName");
		lblBevname.setForeground(new Color(148, 0, 211));
		lblBevname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBevname.setBounds(10, 109, 85, 24);
		panel_1.add(lblBevname);
		
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(new Color(148, 0, 211));
		lblType.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblType.setBounds(10, 162, 85, 24);
		panel_1.add(lblType);
		
		JLabel lblFlavour = new JLabel("Flavour");
		lblFlavour.setForeground(new Color(148, 0, 211));
		lblFlavour.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFlavour.setBounds(10, 221, 85, 24);
		panel_1.add(lblFlavour);
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setForeground(new Color(148, 0, 211));
		lblVolume.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVolume.setBounds(10, 279, 85, 24);
		panel_1.add(lblVolume);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(148, 0, 211));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPrice.setBounds(10, 345, 85, 24);
		panel_1.add(lblPrice);
		
		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setForeground(new Color(148, 0, 211));
		lblQuantity_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblQuantity_1.setBounds(10, 404, 85, 24);
		panel_1.add(lblQuantity_1);
		
		ID = new JTextField();
		ID.setText("Key In ID");
		ID.setHorizontalAlignment(SwingConstants.CENTER);
		ID.setForeground(Color.BLACK);
		ID.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		ID.setColumns(10);
		ID.setBounds(105, 56, 186, 34);
		panel_1.add(ID);
		
		NAME = new JTextField();
		NAME.setText("Key In Name");
		NAME.setHorizontalAlignment(SwingConstants.CENTER);
		NAME.setForeground(Color.BLACK);
		NAME.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		NAME.setColumns(10);
		NAME.setBounds(105, 108, 186, 28);
		panel_1.add(NAME);
		
		FLAVOUR = new JTextField();
		FLAVOUR.setText("Key In Flavour");
		FLAVOUR.setHorizontalAlignment(SwingConstants.CENTER);
		FLAVOUR.setForeground(Color.BLACK);
		FLAVOUR.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		FLAVOUR.setColumns(10);
		FLAVOUR.setBounds(106, 217, 186, 34);
		panel_1.add(FLAVOUR);
		
		VOLUME = new JTextField();
		VOLUME.setText("Key In Vol");
		VOLUME.setHorizontalAlignment(SwingConstants.CENTER);
		VOLUME.setForeground(Color.BLACK);
		VOLUME.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		VOLUME.setColumns(10);
		VOLUME.setBounds(105, 275, 186, 34);
		panel_1.add(VOLUME);
		
		PRICE = new JTextField();
		PRICE.setText("Key In Price");
		PRICE.setHorizontalAlignment(SwingConstants.CENTER);
		PRICE.setForeground(Color.BLACK);
		PRICE.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		PRICE.setColumns(10);
		PRICE.setBounds(105, 339, 186, 37);
		panel_1.add(PRICE);
		
		QUANTITY = new JTextField();
		QUANTITY.setText("Key In Qty");
		QUANTITY.setHorizontalAlignment(SwingConstants.CENTER);
		QUANTITY.setForeground(Color.BLACK);
		QUANTITY.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		QUANTITY.setColumns(10);
		QUANTITY.setBounds(105, 400, 186, 34);
		panel_1.add(QUANTITY);
		
		JComboBox TYPE = new JComboBox();
		TYPE.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Stimulating", "Refreshing", "Nourishing"}));
		TYPE.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		TYPE.setBounds(106, 157, 186, 34);
		panel_1.add(TYPE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(551, 79, 702, 460);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 682, 438);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"BevID", "BevName", "Type", "Flavour", "Volume", "Price", "Qty"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				ID.getText(),
				NAME.getText(),
				VOLUME.getText(),
				PRICE.getText(),
				QUANTITY.getText(),
				TYPE.getSelectedItem(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(new Color(148, 0, 211));
		btnAdd.setBounds(268, 552, 110, 43);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID.setText("");
				NAME.setText("");
				VOLUME.setText("");
				PRICE.setText("");
				QUANTITY.setText("");
				TYPE.setSelectedItem("Select Type");
				
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(148, 0, 211));
		btnReset.setBounds(388, 552, 138, 43);
		panel.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(new Color(148, 0, 211));
		btnPrint.setBounds(805, 550, 129, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Beverages Description", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Beverages Description", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(148, 0, 211));
		btnDelete.setBounds(621, 550, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(148, 0, 211));
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel EmployeeManagementPage = new JLabel("Employee");
		EmployeeManagementPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new EmployeeManagement().em.setVisible(true);
				bd.dispose();
			}
		});
		EmployeeManagementPage.setHorizontalAlignment(SwingConstants.LEFT);
		EmployeeManagementPage.setForeground(new Color(255, 204, 255));
		EmployeeManagementPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		EmployeeManagementPage.setBounds(10, 69, 156, 27);
		panel_4.add(EmployeeManagementPage);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				bd.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(new Color(255, 204, 255));
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 107, 111, 27);
		panel_4.add(lblInventory1_1);
		
		JLabel BeveragesDescriptionPage = new JLabel("Beverages");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				bd.dispose();
			}
		});
		BeveragesDescriptionPage.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage.setBounds(10, 11, 111, 27);
		panel_4.add(BeveragesDescriptionPage);
		
		JLabel BeveragesDescriptionPage_1 = new JLabel("Description");
		BeveragesDescriptionPage_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				bd.dispose();
			}
		});
		BeveragesDescriptionPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage_1.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage_1.setBounds(10, 31, 111, 27);
		panel_4.add(BeveragesDescriptionPage_1);
		
		JLabel FinancialPage = new JLabel("Financial");
		FinancialPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				bd.dispose();
			}
		});
		FinancialPage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancialPage.setForeground(new Color(255, 204, 255));
		FinancialPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancialPage.setBounds(10, 145, 111, 27);
		panel_4.add(FinancialPage);
		
		JLabel AdsAndMarketing = new JLabel("Ads and Marketing");
		AdsAndMarketing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads_and_Marketing().ads.setVisible(true);
				bd.dispose();
			}
		});
		AdsAndMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		AdsAndMarketing.setForeground(new Color(255, 204, 255));
		AdsAndMarketing.setFont(new Font("STXinwei", Font.BOLD, 18));
		AdsAndMarketing.setBounds(10, 183, 156, 27);
		panel_4.add(AdsAndMarketing);
		
		JLabel lblHomepage = new JLabel("HomePage");
		lblHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cover().cover.setVisible(true);
				bd.dispose();
			}
		});
		lblHomepage.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomepage.setForeground(new Color(255, 204, 255));
		lblHomepage.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblHomepage.setBounds(10, 528, 156, 27);
		panel_4.add(lblHomepage);
		
		
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\Beverages Description System.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n\t\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnUpload.setBackground(new Color(148, 0, 211));
		btnUpload.setBounds(958, 550, 164, 43);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bd = new JFrame();
				if (JOptionPane.showConfirmDialog(bd, "Confirm if you want to exit", "Beverages Description", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(1132, 550, 121, 43);
		panel.add(btnExit);
		
		
	}

}
