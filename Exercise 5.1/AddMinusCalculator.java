import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AddMinusCalculator {

	private JFrame frame;
	private JLabel AnsLabel;
	private JButton ADDButton;
	private JButton MinusButton;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinusCalculator window = new AddMinusCalculator();
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
	public AddMinusCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Scanner scan = new Scanner(System.in);
		frame = new JFrame();
		frame.setBounds(100, 100, 797, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ADDButton = new JButton("ADD");
		ADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int n1,n2,ans;
				try {
					n1 = Integer.parseInt(textFieldNum1.getText());
					n2 = Integer.parseInt(textFieldNum2.getText());
					ans = n1+n2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter valid number.");
				}
			}
			}

		);
		ADDButton.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		ADDButton.setFont(new Font("Rockwell", Font.BOLD, 24));
		ADDButton.setBounds(163, 187, 89, 39);
		frame.getContentPane().add(ADDButton);

		MinusButton = new JButton("MINUS");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,ans;
				try {
					n1 = Integer.parseInt(textFieldNum1.getText());
					n2 = Integer.parseInt(textFieldNum2.getText());
					ans = n1-n2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter valid number.");
				}
			}
		});
		MinusButton.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		MinusButton.setFont(new Font("Rockwell", Font.BOLD, 25));
		MinusButton.setBounds(485, 187, 147, 39);
		frame.getContentPane().add(MinusButton);

		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Rockwell", Font.BOLD, 25));
		textFieldNum1.setBounds(131, 101, 147, 39);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);

		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Rockwell", Font.BOLD, 25));
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(485, 102, 147, 36);
		frame.getContentPane().add(textFieldNum2);

		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Rockwell", Font.BOLD, 25));
		textFieldAns.setColumns(10);
		textFieldAns.setBounds(260, 304, 261, 39);
		frame.getContentPane().add(textFieldAns);

		AnsLabel = new JLabel("The Answer is : ");
		AnsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AnsLabel.setFont(new Font("Rockwell", Font.BOLD, 21));
		AnsLabel.setBounds(43, 305, 195, 39);
		frame.getContentPane().add(AnsLabel);
	}
}
