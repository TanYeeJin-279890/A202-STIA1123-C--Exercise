package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CompanyBackground extends JFrame{

	protected JFrame frame;
	private JTextField txtKeyInStoreName;
	private JTextField txtKeyInLocation;
	private JTextField txtKeyInPoskod;
	private JTextField txtKeyInPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground window = new CompanyBackground();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CompanyBackground() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1085, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(148, 0, 211));
		panel_1.setBounds(0, 0, 435, 678);
		panel.add(panel_1);
		
		JLabel Address1 = new JLabel("NO50,Jln LP1,\r\nTaman Limbongan Permai,");
		Address1.setForeground(new Color(255, 204, 255));
		Address1.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address1.setBounds(10, 356, 354, 30);
		panel_1.add(Address1);
		
		JLabel Poskod = new JLabel("75200 ");
		Poskod.setForeground(new Color(255, 204, 255));
		Poskod.setFont(new Font("STXinwei", Font.BOLD, 18));
		Poskod.setBounds(10, 380, 65, 30);
		panel_1.add(Poskod);
		
		JLabel Tel = new JLabel("03-2888588");
		Tel.setForeground(new Color(255, 204, 255));
		Tel.setFont(new Font("STXinwei", Font.BOLD, 18));
		Tel.setBounds(10, 438, 120, 30);
		panel_1.add(Tel);
		
		JLabel lblBeveragesStore = new JLabel("Beverages Store");
		lblBeveragesStore.setBounds(22, 11, 384, 61);
		panel_1.add(lblBeveragesStore);
		lblBeveragesStore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeveragesStore.setForeground(new Color(255, 204, 255));
		lblBeveragesStore.setFont(new Font("Rockwell", Font.BOLD, 40));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Asg3-P2\\cart-icon.png"));
		lblNewLabel.setBounds(89, 75, 262, 270);
		panel_1.add(lblNewLabel);
		
		JLabel States = new JLabel("Melaka");
		States.setForeground(new Color(255, 204, 255));
		States.setFont(new Font("STXinwei", Font.BOLD, 18));
		States.setBounds(74, 380, 65, 30);
		panel_1.add(States);
		
		txtKeyInStoreName = new JTextField();
		txtKeyInStoreName.setBackground(new Color(255, 255, 255));
		txtKeyInStoreName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtKeyInStoreName.getText().equals("------- key in store name -------")){
					txtKeyInStoreName.setText("");
					txtKeyInStoreName.setForeground(new Color(153,153,153));
			}
				}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtKeyInStoreName.getText().equals("------- key in store name -------")){
					txtKeyInStoreName.setText("");
					txtKeyInStoreName.setForeground(new Color(153,153,153));
			}
			}
		});
		txtKeyInStoreName.setText("------- key in store name -------");
		txtKeyInStoreName.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInStoreName.setForeground(new Color(169, 169, 169));
		txtKeyInStoreName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInStoreName.setColumns(10);
		txtKeyInStoreName.setBounds(616, 100, 417, 38);
		panel.add(txtKeyInStoreName);
		
		JLabel StoreName = new JLabel("Store Name");
		StoreName.setForeground(new Color(148, 0, 211));
		StoreName.setFont(new Font("Times New Roman", Font.BOLD, 29));
		StoreName.setBounds(445, 106, 161, 28);
		panel.add(StoreName);
		
		JComboBox State = new JComboBox();
		State.setModel(new DefaultComboBoxModel(new String[] {"Select State", "Johor", "Kedah", "Kelantan", "Melaka", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu"}));
		State.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		State.setBounds(616, 253, 313, 35);
		panel.add(State);
		
		JButton SaveButton = new JButton("Save");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object a = e.getSource();
				if(a == SaveButton) {
					BeveragesCover bc = new BeveragesCover();
					AdminPage ap = new AdminPage();
					
					String bevName = txtKeyInStoreName.getText();
					lblBeveragesStore.setText(bevName);
					bc.lblshopName.setText(bevName);
					ap.lblBeveragesStore.setText(bevName);
					txtKeyInStoreName.setText("");
					String loc = txtKeyInLocation.getText();
					Address1.setText(loc);
					bc.Address1.setText(loc);
					ap.Address1.setText(loc);
					txtKeyInLocation.setText("");
					String poskod = txtKeyInPoskod.getText();
					Poskod.setText(poskod);
					bc.Address2.setText(poskod);
					ap.Address2.setText(poskod);
					txtKeyInPoskod.setText("");
					String state = (String) State.getSelectedItem();
					States.setText(state);
					bc.Address3.setText(state);
					ap.Address3.setText(state);
					State.setSelectedItem("Select State");
					String phone = txtKeyInPhone.getText();
					Tel.setText(phone);
					bc.telph.setText(phone);
					ap.telph.setText(phone);
					txtKeyInPhone.setText("");
					
				}
				JOptionPane.showMessageDialog(null, "The record has been saved successfully");
			}
		});
		SaveButton.setForeground(Color.WHITE);
		SaveButton.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		SaveButton.setBackground(new Color(148, 0, 211));
		SaveButton.setBounds(445, 454, 147, 45);
		panel.add(SaveButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInStoreName.setText("");
				txtKeyInLocation.setText("");
				txtKeyInPoskod.setText("");
				State.setSelectedItem("Select State");
				txtKeyInPhone.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		btnReset.setBackground(new Color(148, 0, 211));
		btnReset.setBounds(629, 454, 147, 45);
		panel.add(btnReset);
		
		JLabel lblCompanybackground = new JLabel("CompanyBackground");
		lblCompanybackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanybackground.setForeground(new Color(148, 0, 211));
		lblCompanybackground.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblCompanybackground.setBounds(562, 11, 511, 54);
		panel.add(lblCompanybackground);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setForeground(new Color(148, 0, 211));
		lblLocation.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblLocation.setBounds(445, 149, 161, 34);
		panel.add(lblLocation);
		
		JLabel lblPoskodNo = new JLabel("Poskod No");
		lblPoskodNo.setForeground(new Color(148, 0, 211));
		lblPoskodNo.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblPoskodNo.setBounds(445, 204, 161, 34);
		panel.add(lblPoskodNo);
		
		JLabel lblState = new JLabel("State");
		lblState.setForeground(new Color(148, 0, 211));
		lblState.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblState.setBounds(445, 253, 161, 38);
		panel.add(lblState);
		
		txtKeyInLocation = new JTextField();
		txtKeyInLocation.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtKeyInLocation.getText().equals("------- key in location -------")){
					txtKeyInLocation.setText("");
					txtKeyInLocation.setForeground(new Color(153,153,153));
			}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtKeyInLocation.getText().equals("------- key in location -------")){
					txtKeyInLocation.setText("");
					txtKeyInLocation.setForeground(new Color(153,153,153));
			}
			}
		});
		txtKeyInLocation.setText("------- key in location -------");
		txtKeyInLocation.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInLocation.setForeground(new Color(169, 169, 169));
		txtKeyInLocation.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInLocation.setColumns(10);
		txtKeyInLocation.setBounds(616, 151, 417, 38);
		panel.add(txtKeyInLocation);
		
		txtKeyInPoskod = new JTextField();
		txtKeyInPoskod.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtKeyInPoskod.getText().equals("------- key in poskod no -------")){
					txtKeyInPoskod.setText("");
					txtKeyInPoskod.setForeground(new Color(153,153,153));
			}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtKeyInPoskod.getText().equals("------- key in poskod no -------")){
				txtKeyInPoskod.setText("");
				txtKeyInPoskod.setForeground(new Color(153,153,153));
			}
			}
		});
		txtKeyInPoskod.setText("------- key in poskod no -------");
		txtKeyInPoskod.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPoskod.setForeground(new Color(169, 169, 169));
		txtKeyInPoskod.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPoskod.setColumns(10);
		txtKeyInPoskod.setBounds(616, 200, 417, 38);
		panel.add(txtKeyInPoskod);
		
		txtKeyInPhone = new JTextField();
		txtKeyInPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtKeyInPhone.getText().equals("------- key in phone -------")){
					txtKeyInPhone.setText("");
					txtKeyInPhone.setForeground(new Color(153,153,153));
			}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtKeyInPhone.getText().equals("------- key in phone -------")){
				txtKeyInPhone.setText("");
				txtKeyInPhone.setForeground(new Color(153,153,153));
			}
			}
		});
		txtKeyInPhone.setText("------- key in phone -------");
		txtKeyInPhone.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPhone.setForeground(new Color(169, 169, 169));
		txtKeyInPhone.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPhone.setColumns(10);
		txtKeyInPhone.setBounds(616, 305, 417, 38);
		panel.add(txtKeyInPhone);
		
		JLabel lblTelphone = new JLabel("Tel-phone");
		lblTelphone.setForeground(new Color(148, 0, 211));
		lblTelphone.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblTelphone.setBounds(445, 302, 161, 38);
		panel.add(lblTelphone);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				frame.dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(813, 454, 147, 45);
		panel.add(btnExit);
		
		
	}
}
