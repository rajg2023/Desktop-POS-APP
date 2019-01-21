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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Registration extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = -1063497167120523913L;
	public JPanel getFrameRegistration() {
		return frameRegistration;
	}

	public void setFrameRegistration(JPanel frameRegistration) {
		this.frameRegistration = frameRegistration;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getTxtUN() {
		return txtUN;
	}

	public void setTxtUN(JTextField txtUN) {
		this.txtUN = txtUN;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblUserName() {
		return lblUserName;
	}

	public void setLblUserName(JLabel lblUserName) {
		this.lblUserName = lblUserName;
	}

	public JLabel getLblTelephoneoptional() {
		return lblTelephoneoptional;
	}

	public void setLblTelephoneoptional(JLabel lblTelephoneoptional) {
		this.lblTelephoneoptional = lblTelephoneoptional;
	}

	public JTextField getPhone() {
		return phone;
	}

	public void setPhone(JTextField phone) {
		this.phone = phone;
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

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
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

	public JTextField getLastname() {
		return lastname;
	}

	public void setLastname(JTextField lastname) {
		this.lastname = lastname;
	}

	public JTextField getFirstname() {
		return firstname;
	}

	public void setFirstname(JTextField firstname) {
		this.firstname = firstname;
	}

	public JPasswordField getTxtPASS() {
		return txtPASS;
	}

	public void setTxtPASS(JPasswordField txtPASS) {
		this.txtPASS = txtPASS;
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private JPanel frameRegistration;
	private JTextField email;
	private JTextField txtUN;
	private JLabel lblNewLabel_1;
	private JLabel lblUserName;
	private JLabel lblTelephoneoptional;
	private JTextField phone;
	private JButton btnNewButton_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel label;
	private JPanel panel_3;
	private JTable table;
	private JTextField lastname;
	private JTextField firstname;
	private JPasswordField txtPASS;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration.class.getResource("/images/icons/shopping-cart-big.jpg")));
		//setUndecorated(true);
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 8, 1080, 696);
		frameRegistration = new JPanel();
		frameRegistration.setBackground(Color.RED);
		//frameRegistration.setBackground(Color.WHITE);
		frameRegistration.setBorder(null);
		setContentPane(frameRegistration);
		frameRegistration.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBackground(new Color(102, 102, 255));
		panel.setBounds(644, 0, 430, 485);
		frameRegistration.add(panel);
		panel.setLayout(null);

		btnNewButton_1 = new JButton("Already Registered - LOGIN");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(10, 432, 190, 44);
		panel.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBounds(210, 432, 96, 44);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				try{
					String url = "jdbc:postgresql://ec2-54-227-237-223.compute-1.amazonaws.com:5432/dde5nv2s4avttf?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
					String username = "mdoxaevgiwnvmd";
					String pwd = "2a871683b1140322e3311f9367702629f7ec7646c0c4f5025698c71090825cff";
					Class.forName("org.postgresql.Driver");
					Connection connection=DriverManager.getConnection(url, username, pwd);

					String query="insert into users (username, password, firstname, lastname, phone, email) values(?,?,?,?,?,?)";
					PreparedStatement ps = connection.prepareStatement(query);
					ps.setString(1, txtUN.getText());
					ps.setString(2, txtPASS.getText());
					ps.setString(3, firstname.getText());
					ps.setString(4, lastname.getText());
					ps.setString(5, phone.getText());
					ps.setString(6, email.getText());

					if(txtUN.getText().isEmpty() || txtPASS.getText().isEmpty() ||firstname.getText().isEmpty() || lastname.getText().isEmpty()|| phone.getText().isEmpty()||email.getText().isEmpty()){

						JOptionPane.showMessageDialog(null, "Please enter all the fields and try again.");
					}else{

						ps.execute();
						JOptionPane.showMessageDialog(null, "Registration Successful, please login...");
						dispose();
						Login l = new Login();
						l.setVisible(true);

					}

				}catch(Exception ex){
					System.out.println(e);
				}


			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);

		phone = new JTextField();
		phone.setBounds(111, 340, 268, 39);
		panel.add(phone);
		phone.setColumns(10);

		lblTelephoneoptional = new JLabel("TELEPHONE :");
		lblTelephoneoptional.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelephoneoptional.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblTelephoneoptional.setBounds(10, 340, 96, 39);
		panel.add(lblTelephoneoptional);

		email = new JTextField();
		email.setBounds(111, 382, 268, 39);
		panel.add(email);
		email.setColumns(10);

		lblNewLabel_1 = new JLabel("EMAIL :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 382, 96, 39);
		panel.add(lblNewLabel_1);

		txtUN = new JTextField();
		txtUN.setBounds(111, 210, 116, 39);
		panel.add(txtUN);
		txtUN.setColumns(10);

		lblUserName = new JLabel("USER ID :");
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblUserName.setBounds(10, 209, 96, 39);
		panel.add(lblUserName);
		lblUserName.setBackground(Color.GRAY);

		JLabel lblLastName = new JLabel("LAST NAME :");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblLastName.setBounds(10, 297, 96, 39);
		panel.add(lblLastName);

		lastname = new JTextField();
		lastname.setColumns(10);
		lastname.setBounds(111, 297, 268, 39);
		panel.add(lastname);

		JLabel lblFirstName = new JLabel("FIRST NAME :");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblFirstName.setBounds(10, 259, 96, 39);
		panel.add(lblFirstName);

		firstname = new JTextField();
		firstname.setColumns(10);
		firstname.setBounds(111, 255, 268, 39);
		panel.add(firstname);

		txtPASS = new JPasswordField();
		txtPASS.setBounds(263, 209, 116, 39);
		panel.add(txtPASS);

		JLabel lblPin = new JLabel("PIN :");
		lblPin.setHorizontalAlignment(SwingConstants.LEFT);
		lblPin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPin.setBounds(228, 209, 35, 39);
		panel.add(lblPin);

		JButton button = new JButton("Clear All");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				txtUN.setText(null);
				txtPASS.setText(null);
				firstname.setText(null);
				lastname.setText(null);
				phone.setText(null);
				email.setText(null);

			}
		});
		button.setBackground(Color.GREEN);
		button.setBounds(316, 432, 104, 44);
		panel.add(button);

		label_2 = new JLabel("");
		label_2.setForeground(Color.RED);
		label_2.setBackground(Color.WHITE);
		label_2.setIcon(new ImageIcon(Registration.class.getResource("/images/icons/icon-login-24.jpg")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 430, 222);
		panel.add(label_2);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 0, 646, 485);
		frameRegistration.add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Registration.class.getResource("/images/icons/retail3.jpg")));
		lblNewLabel.setBounds(0, 0, 642, 484);
		panel_1.add(lblNewLabel);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 204));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(0, 484, 1074, 183);
		frameRegistration.add(panel_2);
		panel_2.setLayout(null);
		label = new JLabel("Application Details");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 11, 1054, 22);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(label);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(10, 37, 1043, 118);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setLayout(null);

		table = new JTable();
		table.setEnabled(false);
		table.setBounds(10, 11, 1023, 96);
		table.setRowHeight(45);
		table.setBorder(new LineBorder(Color.GREEN, 3));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Language", "JDK", "IDE", "Database", "Server", "Panel W", "Panel H", "Panel X", "Panel Y", "Build OS"},
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
				Login l = new Login();
				l.setVisible(true);

			}
		});
	}
}
