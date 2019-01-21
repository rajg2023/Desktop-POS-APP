package myDesktopApp;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 3568655112128342109L;
	private JPanel frameLogin;
	public JPanel getFrameLogin() {
		return frameLogin;
	}

	public void setFrameLogin(JPanel frameLogin) {
		this.frameLogin = frameLogin;
	}

	public JTextField getTxtUN() {
		return txtUN;
	}

	public void setTxtUN(JTextField txtUN) {
		this.txtUN = txtUN;
	}

	public JLabel getLblPassword() {
		return lblPassword;
	}

	public void setLblPassword(JLabel lblPassword) {
		this.lblPassword = lblPassword;
	}

	public JLabel getLblUserName() {
		return lblUserName;
	}

	public void setLblUserName(JLabel lblUserName) {
		this.lblUserName = lblUserName;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public JPasswordField getTxtPASS() {
		return txtPASS;
	}

	public void setTxtPASS(JPasswordField txtPASS) {
		this.txtPASS = txtPASS;
	}

	public JLabel getLblApplicationDetails() {
		return lblApplicationDetails;
	}

	public void setLblApplicationDetails(JLabel lblApplicationDetails) {
		this.lblApplicationDetails = lblApplicationDetails;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private JTextField textField;
	private JTextField txtUN;
	private JLabel lblPassword;
	private JLabel lblUserName;
	private JButton btnNewButton_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPasswordField txtPASS;
	private JLabel lblApplicationDetails;
	private JPanel panel_3;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/icons/shopping-cart.jpg")));
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 8, 1080, 696);
		frameLogin = new JPanel();
		frameLogin.setBackground(Color.WHITE);
		frameLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frameLogin);
		frameLogin.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(641, 0, 433, 484);
		frameLogin.add(panel);
		panel.setLayout(null);

		lblUserName = new JLabel("USER ID :");
		lblUserName.setBounds(51, 215, 66, 39);
		panel.add(lblUserName);
		lblUserName.setBackground(Color.RED);

		txtUN = new JTextField();
		txtUN.setBounds(51, 252, 343, 39);
		panel.add(txtUN);
		txtUN.setColumns(10);


		lblPassword = new JLabel("PIN :");
		lblPassword.setBounds(51, 288, 39, 39);
		panel.add(lblPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(51, 375, 99, 39);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {


				try{
					String url = "your db url";
					String username = "your user name";
					String pwd = "your password";
					Class.forName("org.postgresql.Driver");
					Connection connection=DriverManager.getConnection(url, username, pwd);

					//	JOptionPane.showMessageDialog(null, "connection Successful");
					username=txtUN.getText();
					String pass=txtPASS.getText();

					String query="select * from users where username=? and password=?";
					PreparedStatement ps = connection.prepareStatement(query);
					ps.setString(1, username);
					ps.setString(2, pass);
					ResultSet rs=ps.executeQuery();
					if(txtUN.getText().isEmpty() || txtPASS.getText().isEmpty() ){

						JOptionPane.showMessageDialog(null, "Please enter username and password and try again.");
					}
					else if(rs.next()){

						dispose();
						Items i = new Items();
						i.setVisible(true);
						JOptionPane.showMessageDialog(null, "Please begin your transaction.");

					}
					else {

						JOptionPane.showMessageDialog(null, "Invalid Username or Password, Please try again.");

					}



				}catch(Exception ex){
					System.out.println(e);
				}


			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.RED);

		btnNewButton_1 = new JButton("New User, Click here to Register..");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(160, 375, 234, 39);
		panel.add(btnNewButton_1);

		txtPASS = new JPasswordField();
		txtPASS.setBounds(51, 325, 343, 39);
		panel.add(txtPASS);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/images/icons/icon-login-24.jpg")));
		lblNewLabel_2.setBounds(0, 0, 433, 209);
		panel.add(lblNewLabel_2);

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		//System.out.println(dateFormat.format(date));


		JLabel lblNewLabel_getDate = new JLabel("Date : " +dateFormat.format(date));
		lblNewLabel_getDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_getDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_getDate.setBounds(10, 432, 413, 28);
		panel.add(lblNewLabel_getDate);

		lblNewLabel_3 = new JLabel("<html><h1>H! TH3R3</h1></html>");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 203, 433, 45);
		panel.add(lblNewLabel_3);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(0, 0, 642, 484);
		frameLogin.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 640, 480);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/icons/retail3.jpg")));

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 204));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(0, 484, 1074, 183);
		frameLogin.add(panel_2);
		panel_2.setLayout(null);

		lblApplicationDetails = new JLabel("Application Details");
		lblApplicationDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationDetails.setBounds(10, 10, 1054, 22);
		lblApplicationDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblApplicationDetails);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(14, 43, 1043, 118);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		table = new JTable();
		table.setEnabled(false);
		table.setBorder(new LineBorder(Color.GREEN, 3));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setBounds(10, 11, 1023, 96);
		table.setRowHeight(45);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Language", "JDK", "IDE", "Database", "Server", "Panel W", "Panel H", "Panel X", "Panel Y", "OS Build"},
					{"Java 1.8", "1.7", "Eclipse Neon", "None", "None", "1080", "696", "150", "8", "WIN 10"},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
				));
		panel_3.add(table);


		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Registration r = new Registration();
				r.setVisible(true);

			}
		});
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
}
