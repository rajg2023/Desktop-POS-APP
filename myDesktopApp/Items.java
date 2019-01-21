package myDesktopApp;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Items extends JFrame {

	private static final long serialVersionUID = -4242170204312176066L;
	private JPanel frameItems;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Items frame = new Items();
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
	public Items() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Items.class.getResource("/images/icons/shopping-cart.jpg")));

		JTextArea textAreaPrice;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 8, 1080, 696);
		frameItems = new JPanel();
		frameItems.setBackground(Color.DARK_GRAY);
		frameItems.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frameItems);
		frameItems.setLayout(null);

		JPanel main_panel = new JPanel();
		main_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		main_panel.setBounds(170, 0, 695, 484);
		main_panel.setBackground(Color.GRAY);
		frameItems.add(main_panel);
		main_panel.setLayout(null);


		JPanel btn_panel = new JPanel();
		btn_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		btn_panel.setBackground(Color.RED);
		btn_panel.setBounds(0, 0, 171, 484);
		frameItems.add(btn_panel);
		btn_panel.setLayout(null);

		JPanel cart_panel = new JPanel();
		cart_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		cart_panel.setBounds(866, 0, 208, 484);
		frameItems.add(cart_panel);
		cart_panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Shopping Cart ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Items.class.getResource("/images/icons/shopping-cart.jpg")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(0, 0, 202, 57);
		cart_panel.add(lblNewLabel);

		JLabel lblItemsInCart = new JLabel("Lists of Items");
		lblItemsInCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemsInCart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblItemsInCart.setBounds(10, 52, 95, 24);
		cart_panel.add(lblItemsInCart);

		JLabel lblPrice_1 = new JLabel("Price($)");
		lblPrice_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPrice_1.setBounds(140, 52, 58, 24);
		cart_panel.add(lblPrice_1);

		JLabel lblNewLabel_3 = new JLabel("QNTY");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(97, 58, 46, 14);
		cart_panel.add(lblNewLabel_3);

		List list_cart = new List();
		list_cart.setBackground(SystemColor.inactiveCaption);
		list_cart.setBounds(10, 77, 99, 307);
		cart_panel.add(list_cart);

		List list_price = new List();
		//list_price.setMultipleSelections(true);
		list_price.setBackground(SystemColor.inactiveCaption);
		list_price.setBounds(150, 77, 52, 307);
		cart_panel.add(list_price);

		List list_Qnty = new List();
		list_Qnty.setBackground(SystemColor.inactiveCaption);
		list_Qnty.setBounds(107, 77, 44, 307);
		cart_panel.add(list_Qnty);

		JPanel details_panel = new JPanel();
		details_panel.setBackground(Color.PINK);
		details_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		details_panel.setBounds(0, 483, 865, 184);
		frameItems.add(details_panel);
		details_panel.setLayout(null);

		JLabel lblItemDetails = new JLabel("Item Details");
		lblItemDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItemDetails.setBounds(0, 0, 865, 39);
		details_panel.add(lblItemDetails);

		JTextArea textAreaDescription = new JTextArea();
		textAreaDescription.setWrapStyleWord(true);
		textAreaDescription.setLineWrap(true);
		textAreaDescription.setFont(new Font("Monospaced", Font.BOLD, 13));
		textAreaDescription.setRows(2);
		textAreaDescription.setBackground(SystemColor.activeCaption);
		textAreaDescription.setEditable(false);
		textAreaDescription.setBounds(114, 71, 378, 102);
		details_panel.add(textAreaDescription);

		JLabel lblNewLabel_1 = new JLabel("Description :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 85, 94, 72);
		details_panel.add(lblNewLabel_1);

		JLabel lblColor = new JLabel("Color :");
		lblColor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblColor.setBounds(259, 38, 56, 33);
		details_panel.add(lblColor);

		Choice choiceColor = new Choice();
		choiceColor.setFont(new Font("Dialog", Font.BOLD, 12));
		choiceColor.setBackground(SystemColor.activeCaption);
		choiceColor.setBounds(321, 43, 104, 20);
		choiceColor.addItem("Select");
		choiceColor.addItem("White");
		choiceColor.addItem("Brown");
		choiceColor.addItem("Black");
		choiceColor.addItem("Red");
		choiceColor.addItem("Yellow");
		choiceColor.addItem("Purple");
		choiceColor.addItem("Orange");
		details_panel.add(choiceColor);

		JLabel lblSize = new JLabel("Size :");
		lblSize.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSize.setBounds(415, 32, 48, 44);
		details_panel.add(lblSize);

		Choice choice_Size = new Choice();
		choice_Size.setFont(new Font("Dialog", Font.BOLD, 12));
		choice_Size.setBackground(SystemColor.activeCaption);
		choice_Size.setBounds(469, 45, 72, 22);
		choice_Size.addItem("Select");
		choice_Size.addItem("4");
		choice_Size.addItem("5");
		choice_Size.addItem("6");
		choice_Size.addItem("7");
		choice_Size.addItem("8");
		choice_Size.addItem("9");
		choice_Size.addItem("10");
		choice_Size.addItem("S");
		choice_Size.addItem("M");
		choice_Size.addItem("L");
		choice_Size.addItem("XL");
		choice_Size.addItem("XXL");

		details_panel.add(choice_Size);

		JLabel lblPrice = new JLabel("Price : $");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(547, 32, 56, 44);
		details_panel.add(lblPrice);



		textAreaPrice = new JTextArea();
		textAreaPrice.setText("");
		textAreaPrice.setFont(new Font("Monospaced", Font.BOLD, 13));
		textAreaPrice.setBackground(SystemColor.activeCaption);
		textAreaPrice.setEditable(false);
		textAreaPrice.setBounds(605, 44, 64, 22);
		details_panel.add(textAreaPrice);


		Choice choice_Qnty = new Choice();
		choice_Qnty.setFont(new Font("Dialog", Font.BOLD, 12));
		choice_Qnty.setBackground(SystemColor.activeCaption);
		choice_Qnty.setBounds(755, 45, 85, 22);
		choice_Qnty.addItem("1");
		choice_Qnty.addItem("2");
		choice_Qnty.addItem("3");
		choice_Qnty.addItem("4");
		choice_Qnty.addItem("5");
		choice_Qnty.addItem("50");
		details_panel.add(choice_Qnty);


		JLabel lblQnty = new JLabel("QNTY/LBS :");
		lblQnty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQnty.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQnty.setBounds(668, 32, 85, 44);
		details_panel.add(lblQnty);

		JLabel lblItemName = new JLabel("Name :");
		lblItemName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblItemName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblItemName.setBounds(40, 30, 64, 44);
		details_panel.add(lblItemName);


		JTextArea textAreaItemName = new JTextArea();
		textAreaItemName.setFont(new Font("Monospaced", Font.BOLD, 13));
		textAreaItemName.setBackground(SystemColor.activeCaption);
		textAreaItemName.setEditable(false);
		textAreaItemName.setBounds(114, 44, 144, 20);
		details_panel.add(textAreaItemName);

		JPanel checkout_panel = new JPanel();
		checkout_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		checkout_panel.setBackground(Color.GREEN);
		checkout_panel.setBounds(865, 486, 209, 181);
		frameItems.add(checkout_panel);
		checkout_panel.setLayout(null);

		JLabel lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckOut.setBounds(0, 0, 209, 26);
		checkout_panel.add(lblCheckOut);

		JLabel lblTotalItems = new JLabel("Total Items :");
		lblTotalItems.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalItems.setBounds(10, 47, 93, 14);
		checkout_panel.add(lblTotalItems);

		JLabel lblTotalCosts = new JLabel("Total Costs :");
		lblTotalCosts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalCosts.setBounds(10, 78, 93, 14);
		checkout_panel.add(lblTotalCosts);

		JTextArea textArea_totalItems = new JTextArea();
		textArea_totalItems.setEditable(false);
		textArea_totalItems.setBackground(SystemColor.activeCaption);
		textArea_totalItems.setBounds(96, 42, 80, 22);
		checkout_panel.add(textArea_totalItems);

		JTextArea textArea_totalCosts = new JTextArea();
		textArea_totalCosts.setEditable(false);
		textArea_totalCosts.setBackground(SystemColor.activeCaption);
		textArea_totalCosts.setBounds(96, 73, 80, 22);
		checkout_panel.add(textArea_totalCosts);

		//Sale panel starts from here

		JButton btnSale = new JButton("Sale");
		btnSale.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(main_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnSale){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}


			}
		});
		btnSale.setBounds(10, 10, 151, 41);
		btn_panel.add(btnSale);

		JButton button_details_image = new JButton();
		button_details_image.setBackground(SystemColor.inactiveCaption);
		button_details_image.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_details_image.setBounds(569, 69, 112, 104);
		details_panel.add(button_details_image);

		JButton btn_jeans1 = new JButton();
		ImageIcon a = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/blackdiamondearrings.jpeg")));
		btn_jeans1.setIcon(a);
		btn_jeans1.setBounds(10, 28, 112, 104);
		main_panel.add(btn_jeans1);
		btn_jeans1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Black Diamond Ring");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Black Diamond Ring made in France");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55000");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a);


			}
		});

		JButton button_4 = new JButton();
		ImageIcon b = (new ImageIcon(Items.class.getResource("/images/resizeShoes/fashion-high-heel.jpeg")));
		button_4.setIcon(b);
		button_4.setBounds(146, 28, 112, 104);
		main_panel.add(button_4);
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ladis High Heel Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Ladies High heel shoes for sale this month up to 50% off.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("150");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.removeAll();
				button_details_image.setIcon(b);
				button_details_image.removeAll();
			}
		});


		JButton button_5 = new JButton();
		ImageIcon d =(new ImageIcon(Items.class.getResource("/images/resizeWine/bordeaux.png")));
		button_5.setIcon(d);
		button_5.setBounds(282, 28, 112, 104);
		main_panel.add(button_5);
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Bordeaux Red wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Bordeaux Red wine famous in Italy now available");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("4000");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.removeAll();
				button_details_image.setIcon(d);
				button_details_image.removeAll();
			}
		});


		JButton button_6 = new JButton();
		ImageIcon c = (new ImageIcon(Items.class.getResource("/images/resizebeer/vodaka.jpeg")));
		button_6.setIcon(c);
		button_6.setBounds(419, 28, 112, 104);
		main_panel.add(button_6);
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Vodka");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Vodka on sale this week");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("85");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.removeAll();
				button_details_image.setIcon(c);
				button_details_image.removeAll();
			}
		});


		JButton button_7 = new JButton();
		ImageIcon f = new ImageIcon(Items.class.getResource("/images/resizebeer/margarita.jpeg"));
		button_7.setIcon(f);
		button_7.setBounds(555, 28, 112, 104);
		main_panel.add(button_7);
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Margarita");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Margarita 5% off of retail price");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("5");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.removeAll();
				button_details_image.setIcon(f);
				button_details_image.removeAll();
			}
		});


		JButton button_8 = new JButton();
		ImageIcon x =new ImageIcon(Items.class.getResource("/images/resizebeer/peroni.jpeg"));
		button_8.setIcon(x);
		button_8.setBounds(10, 143, 112, 104);
		main_panel.add(button_8);
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Peroni Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Peroni beer 40% off");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("15");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.removeAll();
				button_details_image.setIcon(x);
				button_details_image.removeAll();
			}
		});

		JButton button9 = new JButton();
		ImageIcon s =(new ImageIcon(Items.class.getResource("/images/resizeclothing/female belts.jpeg")));
		button9.setIcon(s);
		button9.setBounds(555, 143, 112, 104);
		main_panel.add(button9);
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ladies belts");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Ladies belts now 10% off");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("40");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();


				button_details_image.setIcon(s);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button10 = new JButton();
		ImageIcon t = (new ImageIcon(Items.class.getResource("/images/resizeclothing/mens tshirt.jpeg")));
		button10.setIcon(t);
		button10.setBounds(419, 143, 112, 104);
		main_panel.add(button10);
		button10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Pexels suite");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Pexels suite on sale this week");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("585");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();


				button_details_image.setIcon(t);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button11 = new JButton();
		ImageIcon v =new ImageIcon(Items.class.getResource("/images/resizeWine/King.jpeg"));
		button11.setIcon(v);
		button11.setBounds(282, 143, 112, 104);
		main_panel.add(button11);
		button11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("King Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("King wine available and on sale for 50%");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("115");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();


				button_details_image.setIcon(v);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button_12 = new JButton();
		Icon i = new ImageIcon(Items.class.getResource("/images/resizeclothing/mens suite.jpeg"));
		button_12.setIcon(i);
		button_12.setBounds(146, 143, 112, 104);
		main_panel.add(button_12);
		button_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textAreaItemName.removeAll();
				textAreaItemName.setText("Mens Suite");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaDescription.removeAll();
				textAreaDescription.setText("This Mens Suite are on sale 50%, $1500 each after discount.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.removeAll();
				textAreaPrice.setText("1500");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();
				button_details_image.removeAll();
				button_details_image.setIcon(i);
				button_details_image.removeAll();
			}
		});

		JButton button13 = new JButton();
		ImageIcon g = (new ImageIcon(Items.class.getResource("/images/resizedrinks/blue sea water.jpeg")));
		button13.setIcon(g);
		button13.setBounds(10, 258, 112, 104);
		main_panel.add(button13);
		button13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Blue Sea Pure Water");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Blue Sea pure water on sale for 50%");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("15");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				//	button_details_image.removeAll();
				button_details_image.setIcon(g);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});


		JButton button14 = new JButton();
		ImageIcon ba = new ImageIcon(Items.class.getResource("/images/resizefruits/lychee.jpg"));
		button14.setIcon(ba);
		button14.setBounds(555, 258, 112, 104);
		main_panel.add(button14);
		button14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Lychee");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Lychee available on stock and is on sale now");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("5");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				//	button_details_image.removeAll();
				button_details_image.setIcon(ba);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button15 = new JButton();
		ImageIcon l = (new ImageIcon(Items.class.getResource("/images/resizefruits/grapes.jpg")));
		button15.setIcon(l);
		button15.setBounds(419, 258, 112, 104);
		main_panel.add(button15);
		button15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Grapes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Grapes $2 per lbps after discount");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("2");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();


				button_details_image.setIcon(l);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button16 = new JButton();
		ImageIcon ca = (new ImageIcon(Items.class.getResource("/images/resizefruits/coconut.jpg")));
		button16.setIcon(ca);
		button16.setBounds(282, 258, 112, 104);
		main_panel.add(button16);
		button16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Coconut");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Florida's Coconut on sale");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("5");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				//button_details_image.removeAll();
				button_details_image.setIcon(ca);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button17 = new JButton();
		ImageIcon y =new ImageIcon(Items.class.getResource("/images/resizedrinks/green-tea.png"));
		button17.setIcon(y);
		button17.setBounds(146, 258, 112, 104);
		main_panel.add(button17);
		button17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Green Tea");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Green tea 5 per pack");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("5");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				//button_details_image.removeAll();
				button_details_image.setIcon(y);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button18 = new JButton();
		Icon ia = new ImageIcon(Items.class.getResource("/images/resizevegitables/asparagus.jpeg"));
		button18.setIcon(ia);
		button18.setBounds(10, 373, 112, 104);
		main_panel.add(button18);
		button18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textAreaItemName.removeAll();
				textAreaItemName.setText("Asparagus");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.removeAll();
				textAreaDescription.setText(" Asparagus on Sale");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.removeAll();
				textAreaPrice.setText("5");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.removeAll();
				button_details_image.setIcon(ia);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button19 = new JButton();
		ImageIcon h = (new ImageIcon(Items.class.getResource("/images/resizeShoes/rubber-boots.png")));
		button19.setIcon(h);
		button19.setBounds(146, 373, 112, 104);
		main_panel.add(button19);
		button19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();
				textAreaItemName.setText("Rubber boots");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();
				textAreaDescription.setText("Rubber boots on sale");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();
				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();
				button_details_image.setIcon(h);
				button_details_image.repaint();
				button_details_image.revalidate();

			}
		});

		JButton button20 = new JButton();
		ImageIcon da =(new ImageIcon(Items.class.getResource("/images/resizeShoes/sandals.jpeg")));
		button20.setIcon(da);
		button20.setBounds(282, 373, 112, 104);
		main_panel.add(button20);
		button20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();
				textAreaItemName.setText("Sandals on sale");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Rubber sandals for sale");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("40");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				//	button_details_image.removeAll();
				button_details_image.setIcon(da);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button22 = new JButton();
		ImageIcon ds =(new ImageIcon(Items.class.getResource("/images/resizeWine/King.jpeg")));
		button22.setIcon(ds);
		button22.setBounds(419, 373, 112, 104);
		main_panel.add(button22);
		button22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("King Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("King wine small for sale on $40");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("40");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();
				//	button_details_image.removeAll();
				button_details_image.setIcon(ds);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});

		JButton button23 = new JButton();
		ImageIcon cd = (new ImageIcon(Items.class.getResource("/images/resizefruits/melon.jpg")));
		button23.setIcon(cd);
		button23.setBounds(555, 373, 112, 104);
		main_panel.add(button23);
		button23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Melon");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Melons on Sale, $5 a piece.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();

				textAreaPrice.removeAll();
				textAreaPrice.setText("5");
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				//button_details_image.removeAll();
				button_details_image.setIcon(cd);
				button_details_image.repaint();
				button_details_image.revalidate();
			}
		});
		JLabel lblNewLabel_2 = new JLabel("Items on Sale ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 3, 685, 25);
		main_panel.add(lblNewLabel_2);

		//End of Item on sale panel

		//Starting Clothing panel


		JPanel clothing_panel = new JPanel();
		clothing_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		clothing_panel.setBounds(170, 0, 695, 484);
		clothing_panel.setLayout(null);
		clothing_panel.setBackground(Color.GREEN);

		JButton btnClothing = new JButton("Clothing");
		frameItems.add(clothing_panel);
		btnClothing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(clothing_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnClothing){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}

			}
		});
		btnClothing.setBounds(10, 55, 151, 41);
		btn_panel.add(btnClothing);



		JButton button = new JButton();
		ImageIcon ab = (new ImageIcon(Items.class.getResource("/images/resizeclothing/bellbutton jeans.jpeg")));
		button.setIcon(ab);
		button.setBounds(10, 28, 112, 104);
		clothing_panel.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Blue Jeans");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Jeans with Bell button");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("20");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ab);


			}
		});

		JButton button1 = new JButton();
		ImageIcon ac = (new ImageIcon(Items.class.getResource("/images/resizeclothing/cowboy hat.png")));
		button1.setIcon(ac);
		button1.setBounds(146, 28, 112, 104);
		clothing_panel.add(button1);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Cow boy hat");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a cow boy hat");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ac);


			}
		});
		JButton button2 = new JButton();
		ImageIcon ad = (new ImageIcon(Items.class.getResource("/images/resizeclothing/fabric cloth.jpeg")));
		button2.setIcon(ad);
		button2.setBounds(282, 28, 112, 104);
		clothing_panel.add(button2);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Fabric clothes from Japan");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is famous Fabric clothes from Japan");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ad);


			}
		});
		JButton button3 = new JButton();
		ImageIcon ae = (new ImageIcon(Items.class.getResource("/images/resizeclothing/fedora hat.png")));
		button3.setIcon(ae);
		button3.setBounds(419, 28, 112, 104);
		clothing_panel.add(button3);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Fedora Hat");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Fedora Hat");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("65");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ae);


			}
		});
		JButton button4 = new JButton();
		ImageIcon af = (new ImageIcon(Items.class.getResource("/images/resizeclothing/female belts.jpeg")));
		button4.setIcon(af);
		button4.setBounds(555, 28, 112, 104);
		clothing_panel.add(button4);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Female Belts");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is female belts, available in different shapes, sizes and colours");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(af);


			}
		});
		JButton button5 = new JButton();
		ImageIcon ag = (new ImageIcon(Items.class.getResource("/images/resizeclothing/female thai dress.jpeg")));
		button5.setIcon(ag);
		button5.setBounds(10, 143, 112, 104);
		clothing_panel.add(button5);
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Female dress");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is female dress from Thailand");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("10");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ag);


			}
		});
		JButton button6 = new JButton();
		ImageIcon ah = (new ImageIcon(Items.class.getResource("/images/resizeclothing/femaledress.jpeg")));
		button6.setIcon(ah);
		button6.setBounds(555, 143, 112, 104);
		clothing_panel.add(button6);
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Female Dress");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Different color female dress from international countries");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ah);


			}
		});
		JButton button7 = new JButton();
		ImageIcon aj = (new ImageIcon(Items.class.getResource("/images/resizeclothing/glasses.png")));
		button7.setIcon(aj);
		button7.setBounds(419, 143, 112, 104);
		clothing_panel.add(button7);
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Glasses");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Male and Female glasses both available.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(aj);


			}
		});
		JButton button8 = new JButton();
		ImageIcon ak = (new ImageIcon(Items.class.getResource("/images/resizeclothing/jeans-pants-blue-jeans-textiles-40801.jpeg")));
		button8.setIcon(ak);
		button8.setBounds(282, 143, 112, 104);
		clothing_panel.add(button8);
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Blue Jeans");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Blue textile jeans from Texas");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ak);


			}
		});
		JButton button_9 = new JButton();
		ImageIcon al = (new ImageIcon(Items.class.getResource("/images/resizeclothing/mens belt.jpeg")));
		button_9.setIcon(al);
		button_9.setBounds(146, 143, 112, 104);
		clothing_panel.add(button_9);
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens Belts");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Mens lather belts available");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(al);


			}
		});
		JButton button_10 = new JButton();
		ImageIcon am = (new ImageIcon(Items.class.getResource("/images/resizeclothing/mens suite.jpeg")));
		button_10.setIcon(am);
		button_10.setBounds(10, 258, 112, 104);
		clothing_panel.add(button_10);
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens Armani Suite");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Mens Armani suite available upon request.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("1055");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(am);


			}
		});
		JButton button_11 = new JButton();
		ImageIcon an = (new ImageIcon(Items.class.getResource("/images/resizeclothing/mens tshirt.jpeg")));
		button_11.setIcon(an);
		button_11.setBounds(555, 258, 112, 104);
		clothing_panel.add(button_11);
		button_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens T-Shrit");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Mens T-Shirt available");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(an);


			}
		});

		JButton button_13 = new JButton();
		ImageIcon ao = (new ImageIcon(Items.class.getResource("/images/resizeclothing/mens wooven tie.jpeg")));
		button_13.setIcon(ao);
		button_13.setBounds(419, 258, 112, 104);
		clothing_panel.add(button_13);
		button_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Wooven Tie");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Mens wooven tie available");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ao);


			}
		});

		JButton button_14 = new JButton();
		ImageIcon ap = (new ImageIcon(Items.class.getResource("/images/resizeclothing/sari.jpeg")));
		button_14.setIcon(ap);
		button_14.setBounds(282, 258, 112, 104);
		clothing_panel.add(button_14);
		button_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Sari");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Womens Sari available from India and Tibet");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ap);


			}
		});
		JButton button_15 = new JButton();
		ImageIcon aq = (new ImageIcon(Items.class.getResource("/images/resizeclothing/shirts.jpeg")));
		button_15.setIcon(aq);
		button_15.setBounds(146, 258, 112, 104);
		clothing_panel.add(button_15);
		button_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Shirts");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Different shape and sizes of Mens Shirts are available");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("45");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(aq);


			}
		});
		JButton button_16 = new JButton();
		ImageIcon ar = (new ImageIcon(Items.class.getResource("/images/resizeclothing/silk ties.jpeg")));
		button_16.setIcon(ar);
		button_16.setBounds(10, 373, 112, 104);
		clothing_panel.add(button_16);
		button_16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Silk Tie");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Silk tie for Men available in different shapes, color and size.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ar);


			}
		});
		JButton button_17 = new JButton();
		ImageIcon as = (new ImageIcon(Items.class.getResource("/images/resizeclothing/sweater dress clothing.jpeg")));
		button_17.setIcon(as);
		button_17.setBounds(146, 373, 112, 104);
		clothing_panel.add(button_17);
		button_17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ladies Sweater");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Ladies Wooven Sweaters available from Bhutan");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("45");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(as);


			}
		});
		JButton button_18 = new JButton();
		ImageIcon at = (new ImageIcon(Items.class.getResource("/images/resizeclothing/sweater.jpeg")));
		button_18.setIcon(at);
		button_18.setBounds(282, 373, 112, 104);
		clothing_panel.add(button_18);
		button_18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens Wooven Sweater");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Mens Wooven sweater available from Bhutan");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(at);


			}
		});
		JButton button_19 = new JButton();
		ImageIcon au = (new ImageIcon(Items.class.getResource("/images/resizeclothing/women hat.jpeg")));
		button_19.setIcon(au);
		button_19.setBounds(419, 373, 112, 104);
		clothing_panel.add(button_19);
		button_19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Women Hats");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("London Women Hats now available");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("50");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(au);


			}
		});
		JButton button_20 = new JButton();
		ImageIcon av = (new ImageIcon(Items.class.getResource("/images/resizeclothing/womens jackets.jpeg")));
		button_20.setIcon(av);
		button_20.setBounds(555, 373, 112, 104);
		clothing_panel.add(button_20);
		button_20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ladies Jackets");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Ladies Jacket available in different colors, shapes and sizes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("65");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(av);


			}
		});

		JLabel lblListsOfClothing = new JLabel("Lists of Clothing Items");
		lblListsOfClothing.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfClothing.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfClothing.setBounds(0, 0, 685, 25);
		clothing_panel.add(lblListsOfClothing);

		//End of clothing lists

		//Start of log out button


		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});
		btnLogOut.setBackground(Color.BLUE);
		btnLogOut.setBounds(10, 423, 151, 50);
		btn_panel.add(btnLogOut);

		//End of log out button

		//Start of shoes panel

		JPanel shoes_panel = new JPanel();
		shoes_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		shoes_panel.setLayout(null);
		shoes_panel.setBackground(Color.BLUE);
		shoes_panel.setBounds(170, 0, 695, 484);
		frameItems.add(shoes_panel);
		JButton btnShoe = new JButton("Shoes");
		btnShoe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(shoes_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnShoe){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}


			}
		});
		btnShoe.setBounds(10, 100, 151, 41);
		btn_panel.add(btnShoe);

		JButton button_39 = new JButton();
		ImageIcon aa = (new ImageIcon(Items.class.getResource("/images/resizeShoes/baby-girl-pink.jpeg")));
		button_39.setIcon(aa);
		button_39.setBounds(10, 28, 112, 104);
		shoes_panel.add(button_39);
		button_39.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Baby Girl Pink Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Baby Girl Pink Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("65");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(aa);


			}
		});
		JButton button_40 = new JButton();
		ImageIcon aaa = (new ImageIcon(Items.class.getResource("/images/resizeShoes/baby-shoes-catarpiller.jpeg")));
		button_40.setIcon(aaa);
		button_40.setBounds(10, 28, 112, 104);
		shoes_panel.add(button_40);
		button_40.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Baby Boy Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Baby Boy Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(aaa);


			}
		});

		JButton button_41 = new JButton();
		ImageIcon bbb = (new ImageIcon(Items.class.getResource("/images/resizeShoes/Converse.png")));
		button_41.setIcon(bbb);
		button_41.setBounds(146, 28, 112, 104);
		shoes_panel.add(button_41);
		button_41.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Converse Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Converse Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("205");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(bbb);


			}
		});
		JButton button_42 = new JButton();
		ImageIcon ccc = (new ImageIcon(Items.class.getResource("/images/resizeShoes/fashion-high-heel.jpeg")));
		button_42.setIcon(ccc);
		button_42.setBounds(282, 28, 112, 104);
		shoes_panel.add(button_42);
		button_42.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("High Heel Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a High Heel Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("305");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ccc);


			}
		});		JButton button_43 = new JButton();
		ImageIcon ddd = (new ImageIcon(Items.class.getResource("/images/resizeShoes/female-nepal-jutthi.jpeg")));
		button_43.setIcon(ddd);
		button_43.setBounds(419, 28, 112, 104);
		shoes_panel.add(button_43);
		button_43.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Womens Jutti");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Womens Jutti from Nepal");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ddd);


			}
		});

		JButton button_44 = new JButton();
		ImageIcon dd = (new ImageIcon(Items.class.getResource("/images/resizeShoes/french-leather-suite-shoes.jpeg")));
		button_44.setIcon(dd);
		button_44.setBounds(555, 28, 112, 104);
		shoes_panel.add(button_44);
		button_44.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Leather Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Leather Shoes, made in French");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("305");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dd);


			}
		});

		JButton button_45 = new JButton();
		ImageIcon ee= (new ImageIcon(Items.class.getResource("/images/resizeShoes/kabut-shoes.jpeg")));
		button_45.setIcon(ee);
		button_45.setBounds(10, 143, 112, 104);
		shoes_panel.add(button_45);
		button_45.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Kabut Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Kabut Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("255");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ee);


			}
		});		JButton button_46 = new JButton();
		ImageIcon ff= (new ImageIcon(Items.class.getResource("/images/resizeShoes/kids-converse.jpeg")));
		button_46.setIcon(aa);
		button_46.setBounds(555, 143, 112, 104);
		shoes_panel.add(button_46);
		button_46.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Kids Converse");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Converse Shoes available in kids size");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ff);


			}
		});

		JButton button_47 = new JButton();
		ImageIcon gg = (new ImageIcon(Items.class.getResource("/images/resizeShoes/kids-winter-shoes.jpeg")));
		button_47.setIcon(gg);
		button_47.setBounds(419, 143, 112, 104);
		shoes_panel.add(button_47);
		button_47.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Kids Winter Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Kids Winter Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("45");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(gg);


			}
		});

		JButton button_48 = new JButton();
		ImageIcon hh = (new ImageIcon(Items.class.getResource("/images/resizeShoes/leather-brown.jpeg")));
		button_48.setIcon(hh);
		button_48.setBounds(282, 143, 112, 104);
		shoes_panel.add(button_48);
		button_48.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Brown Leather Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Brown Leather Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("165");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(hh);


			}
		});
		JButton button_49 = new JButton();
		ImageIcon jj = (new ImageIcon(Items.class.getResource("/images/resizeShoes/pink-shoes.jpeg")));
		button_49.setIcon(jj);
		button_49.setBounds(146, 143, 112, 104);
		shoes_panel.add(button_49);
		button_49.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Womens Pink Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Womens Pink Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(jj);


			}
		});

		JButton button_50 = new JButton();
		ImageIcon kk = (new ImageIcon(Items.class.getResource("/images/resizeShoes/rubber-boots.png")));
		button_50.setIcon(kk);
		button_50.setBounds(10, 258, 112, 104);
		shoes_panel.add(button_50);
		button_50.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Rubber Boots");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a rubber boots");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(kk);


			}
		});

		JButton button_51 = new JButton();
		ImageIcon ll = (new ImageIcon(Items.class.getResource("/images/resizeShoes/pexels-photo-247321.jpeg")));
		button_51.setIcon(ll);
		button_51.setBounds(555, 258, 112, 104);
		shoes_panel.add(button_51);
		button_51.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Brown Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a new Brown Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ll);


			}
		});
		JButton button_52 = new JButton();
		ImageIcon mm = (new ImageIcon(Items.class.getResource("/images/resizeShoes/weeding-dress-shoes.jpeg")));
		button_52.setIcon(mm);
		button_52.setBounds(419, 258, 112, 104);
		shoes_panel.add(button_52);
		button_52.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Womens Widding Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is Womens Widding Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("505");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mm);


			}
		});

		JButton button_53 = new JButton();
		ImageIcon nn = (new ImageIcon(Items.class.getResource("/images/resizeShoes/trekking.jpeg")));
		button_53.setIcon(nn);
		button_53.setBounds(282, 258, 112, 104);
		shoes_panel.add(button_53);
		button_53.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Trekking Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Trekking Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nn);


			}
		});

		JButton button_54 = new JButton();
		ImageIcon oo = (new ImageIcon(Items.class.getResource("/images/resizeShoes/sports-shoes-bc.jpeg")));
		button_54.setIcon(oo);
		button_54.setBounds(146, 258, 112, 104);
		shoes_panel.add(button_54);
		button_54.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("BC Sports Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a BC Sports Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("95");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(oo);


			}
		});

		JButton button_55 = new JButton();
		ImageIcon pp = (new ImageIcon(Items.class.getResource("/images/resizeShoes/sneakers.jpeg")));
		button_55.setIcon(pp);
		button_55.setBounds(10, 373, 112, 104);
		shoes_panel.add(button_55);
		button_55.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Sneaker Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Sneaker Shoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("75");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(pp);


			}
		});

		JButton button_56 = new JButton();
		ImageIcon qq = (new ImageIcon(Items.class.getResource("/images/resizeShoes/shoes-men.png")));
		button_56.setIcon(qq);
		button_56.setBounds(146, 373, 112, 104);
		shoes_panel.add(button_56);
		button_56.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens Shoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Mens shoes available in different shapes and sizes.");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("65");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(qq);


			}
		});

		JButton button_57 = new JButton();
		ImageIcon rr = (new ImageIcon(Items.class.getResource("/images/resizeShoes/sandals-heel.jpeg")));
		button_57.setIcon(rr);
		button_57.setBounds(282, 373, 112, 104);
		shoes_panel.add(button_57);
		button_57.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Womens Ladies Sandles");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Womens Heel Sandle");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(rr);


			}
		});

		JButton button_58 = new JButton();
		ImageIcon ss = (new ImageIcon(Items.class.getResource("/images/resizeShoes/sandals.jpeg")));
		button_58.setIcon(ss);
		button_58.setBounds(419, 373, 112, 104);
		shoes_panel.add(button_58);
		button_58.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Slippers");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Slippers for home or summer outing");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ss);


			}
		});		JButton button_59 = new JButton();
		ImageIcon tt = (new ImageIcon(Items.class.getResource("/images/resizeShoes/shoe-desert.jpeg")));
		button_59.setIcon(tt);
		button_59.setBounds(555, 373, 112, 104);
		shoes_panel.add(button_59);
		button_59.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens Leather boots");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Mens Leather boots");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("735");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(tt);


			}
		});

		JLabel lblListsOfShoes = new JLabel("Lists of Shoes");
		lblListsOfShoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfShoes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfShoes.setBounds(0, 0, 685, 25);
		shoes_panel.add(lblListsOfShoes);

		//Shoes panel ends here
		//Jewellery panel starts here

		JPanel jewellery_panel = new JPanel();
		jewellery_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		jewellery_panel.setLayout(null);
		jewellery_panel.setBackground(new Color(255, 204, 255));
		jewellery_panel.setBounds(170, 0, 695, 484);
		frameItems.add(jewellery_panel);
		JButton btnJewellery = new JButton("Jewellery");
		btnJewellery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(jewellery_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnJewellery){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}

			}
		});
		btnJewellery.setBounds(10, 145, 151, 41);
		btn_panel.add(btnJewellery);

		JButton button_259 = new JButton();
		button_259.setBounds(10, 28, 112, 104);
		jewellery_panel.add(button_259);
		ImageIcon fa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/beads-neckless.jpeg")));
		button_259.setIcon(fa);
		button_259.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Beads Nackless");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Beads Nackless");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("505");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(fa);


			}
		});

		JButton button_60 = new JButton();
		button_60.setBounds(146, 28, 112, 104);
		jewellery_panel.add(button_60);
		ImageIcon ga = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/blackdiamondearrings.jpeg")));
		button_60.setIcon(ga);
		button_60.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Black Diamond Ear rings");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Black Diamond Ear rings");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5555");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ga);


			}
		});

		JButton button_61 = new JButton();
		button_61.setBounds(282, 28, 112, 104);
		jewellery_panel.add(button_61);
		ImageIcon ja = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/bracelet-silver.jpeg")));
		button_61.setIcon(ja);
		button_61.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Silver Bracelet");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Silver Bracelet");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("255");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ja);


			}
		});

		JButton button_62 = new JButton();
		button_62.setBounds(419, 28, 112, 104);
		jewellery_panel.add(button_62);
		ImageIcon ka = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/chineseNeckless.jpeg")));
		button_62.setIcon(ka);
		button_62.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Chinese Neckless");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a home made Chinese Neckless");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("515");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ka);


			}
		});

		JButton button_63 = new JButton();
		button_63.setBounds(555, 28, 112, 104);
		jewellery_panel.add(button_63);
		ImageIcon ha = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/colorfulstones.jpeg")));
		button_63.setIcon(ha);
		button_63.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Colorful Stones");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Colorful Stones for neckless, earrings and rings etc...");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ha);


			}
		});

		JButton button_64 = new JButton();
		button_64.setBounds(10, 143, 112, 104);
		jewellery_panel.add(button_64);
		ImageIcon la = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/diamond-ring.png")));
		button_64.setIcon(la);
		button_64.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Diamond Ring");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Diamond Ring");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("8999");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(la);


			}
		});

		JButton button_65 = new JButton();
		button_65.setBounds(555, 143, 112, 104);
		jewellery_panel.add(button_65);
		ImageIcon ma = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/diamond.jpeg")));
		button_65.setIcon(ma);
		button_65.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Diamond");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a 989ct Diamond");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("10555555");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ma);


			}
		});

		JButton button_66 = new JButton();
		button_66.setBounds(419, 143, 112, 104);
		jewellery_panel.add(button_66);
		ImageIcon na = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/female watch.jpeg")));
		button_66.setIcon(na);
		button_66.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Womens Watch");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Womens Watch");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("855");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(na);


			}
		});

		JButton button_67 = new JButton();
		button_67.setBounds(282, 143, 112, 104);
		jewellery_panel.add(button_67);
		ImageIcon oa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/green diamonds.jpeg")));
		button_67.setIcon(oa);
		button_67.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Green Diamond");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a green Diamond from Greenland");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5500550055");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(oa);


			}
		});


		JButton button_68 = new JButton();
		button_68.setBounds(146, 143, 112, 104);
		jewellery_panel.add(button_68);
		ImageIcon pa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/jewellery-gold.jpeg")));
		button_68.setIcon(pa);
		button_68.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Gold Jewellery");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a machine made gold Jewellery");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("1055");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(pa);


			}
		});

		JButton button_69 = new JButton();
		button_69.setBounds(10, 258, 112, 104);
		jewellery_panel.add(button_69);
		ImageIcon qa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/mens watch.jpeg")));
		button_69.setIcon(qa);
		button_69.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mens Watch");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Mens Watch");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("1055");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(qa);


			}
		});

		JButton button_70 = new JButton();
		button_70.setBounds(555, 258, 112, 104);
		jewellery_panel.add(button_70);
		ImageIcon ra = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/middleearth ring.jpeg")));
		button_70.setIcon(ra);
		button_70.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ring");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a ring from Middle Earth");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("505");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ra);


			}
		});



		JButton button_71 = new JButton();
		button_71.setBounds(419, 258, 112, 104);
		jewellery_panel.add(button_71);
		ImageIcon sa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/mystic-topaz-stone-neckless.jpeg")));
		button_71.setIcon(sa);
		button_71.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mystic Topaz Stone Neckless");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Mystic Topaz Stone Neckless");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("1555");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(sa);


			}
		});


		JButton button_72 = new JButton();
		button_72.setBounds(282, 258, 112, 104);
		jewellery_panel.add(button_72);
		ImageIcon ta = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/polar.jpeg")));
		button_72.setIcon(ta);
		button_72.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Polar Watch");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Polar Watch");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5555");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ta);


			}
		});

		JButton button_73 = new JButton();
		button_73.setBounds(146, 258, 112, 104);
		jewellery_panel.add(button_73);
		ImageIcon ua = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/rider watch.jpeg")));
		button_73.setIcon(ua);
		button_73.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Rider Watch");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Rider Watch");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("7555");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ua);


			}
		});

		JButton button_74 = new JButton();
		button_74.setBounds(10, 373, 112, 104);
		jewellery_panel.add(button_74);
		ImageIcon va = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/rolex.jpeg")));
		button_74.setIcon(va);
		button_74.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Rolex Watch");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Rolex Watch");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55000");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(va);


			}
		});

		JButton button_75 = new JButton();
		button_75.setBounds(146, 373, 112, 104);
		jewellery_panel.add(button_75);
		ImageIcon wa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/silverring.png")));
		button_75.setIcon(wa);
		button_75.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Silver Ring");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Silver Ring");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("550");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(wa);


			}
		});

		JButton button_76 = new JButton();
		button_76.setBounds(282, 373, 112, 104);
		jewellery_panel.add(button_76);
		ImageIcon xa = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/swatch.jpeg")));
		button_76.setIcon(xa);
		button_76.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Swatch Watch");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is Swatch Watch");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("559");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(xa);


			}
		});

		JButton button_77 = new JButton();
		button_77.setBounds(419, 373, 112, 104);
		jewellery_panel.add(button_77);
		ImageIcon ya = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/vintage-gold-earrings-chinese.jpeg")));
		button_77.setIcon(ya);
		button_77.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Vintage Gold Earrings");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Vintage Gold Earrings from China");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("1055");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ya);


			}
		});

		JButton button_78 = new JButton();
		button_78.setBounds(555, 373, 112, 104);
		jewellery_panel.add(button_78);
		ImageIcon za = (new ImageIcon(Items.class.getResource("/images/resizeJewellery/vintage-gold-earrings.jpeg")));
		button_78.setIcon(za);
		button_78.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Vintage Gold Earrings");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Vintage Gold Earrings");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("955");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(za);


			}
		});

		JLabel lblListsOfJewelleries = new JLabel("Lists of Jewelleries");
		lblListsOfJewelleries.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfJewelleries.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfJewelleries.setBounds(0, 0, 685, 25);
		jewellery_panel.add(lblListsOfJewelleries);

		//End of Jewellery panel

		//Start of Vegitable panel

		JPanel vegitable_panel = new JPanel();
		vegitable_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		vegitable_panel.setLayout(null);
		vegitable_panel.setBackground(Color.CYAN);
		vegitable_panel.setBounds(170, 0, 695, 484);
		frameItems.add(vegitable_panel);

		JButton btnVegitables = new JButton("Vegitables/Meats");
		btnVegitables.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(vegitable_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnVegitables){
					choiceColor.setEnabled(false);
					choice_Size.setEnabled(false);
				}
			}
		});
		btnVegitables.setBounds(10, 190, 151, 41);
		btn_panel.add(btnVegitables);

		JButton button_79 = new JButton();
		button_79.setBounds(10, 28, 112, 104);
		vegitable_panel.add(button_79);
		ImageIcon azz = (new ImageIcon(Items.class.getResource("/images/resizevegitables/asparagus.jpeg")));
		button_79.setIcon(azz);
		button_79.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Asparagus");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is an Asparagus");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(azz);


			}
		});

		JButton button_80 = new JButton();
		button_80.setBounds(146, 28, 112, 104);
		vegitable_panel.add(button_80);
		ImageIcon az = (new ImageIcon(Items.class.getResource("/images/resizevegitables/broccoli.jpeg")));
		button_80.setIcon(az);
		button_80.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Broccoli");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Broccoli");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(az);


			}
		});

		JButton button_81 = new JButton();
		button_81.setBounds(282, 28, 112, 104);
		vegitable_panel.add(button_81);

		ImageIcon a1 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/brussels-sprouts.jpeg")));
		button_81.setIcon(a1);
		button_81.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Brussels Sprouts");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Brussels Sprouts");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("10");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a1);


			}
		});

		JButton button_82 = new JButton();
		button_82.setBounds(419, 28, 112, 104);
		vegitable_panel.add(button_82);
		ImageIcon a2 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/carrots.jpeg")));
		button_82.setIcon(a2);
		button_82.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Carrots");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Carrot");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("3");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a2);


			}
		});

		JButton button_83 = new JButton();
		button_83.setBounds(555, 28, 112, 104);
		vegitable_panel.add(button_83);
		ImageIcon a3 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/cauliflower.jpeg")));
		button_83.setIcon(a3);
		button_83.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("CauliFlower");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a CauliFlower");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a3);


			}
		});

		JButton button_84 = new JButton();
		button_84.setBounds(10, 143, 112, 104);
		vegitable_panel.add(button_84);
		ImageIcon a4 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/cilantro.jpeg")));
		button_84.setIcon(a4);
		button_84.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Cliantro");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Cilantro");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("8");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a4);


			}
		});

		JButton button_85 = new JButton();
		button_85.setBounds(555, 143, 112, 104);
		vegitable_panel.add(button_85);
		ImageIcon a5 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/garlic.jpeg")));
		button_85.setIcon(a5);
		button_85.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Garlic");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Garlic");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("3");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a5);


			}
		});

		JButton button_86 = new JButton();
		button_86.setBounds(419, 143, 112, 104);
		vegitable_panel.add(button_86);
		ImageIcon a6 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/ginger.jpeg")));
		button_86.setIcon(a6);
		button_86.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ginger");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Ginger");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a6);


			}
		});

		JButton button_87 = new JButton();
		button_87.setBounds(282, 143, 112, 104);
		vegitable_panel.add(button_87);
		ImageIcon a7 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/lemon.jpeg")));
		button_87.setIcon(a7);
		button_87.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Lemons");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Lemons");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("1.50");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a7);


			}
		});

		JButton button_88 = new JButton();
		button_88.setBounds(146, 143, 112, 104);
		vegitable_panel.add(button_88);
		ImageIcon a8 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/mushroom.jpeg")));
		button_88.setIcon(a8);
		button_88.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Mushroom");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Mushroom");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a8);


			}
		});

		JButton button_89 = new JButton();
		button_89.setBounds(10, 258, 112, 104);
		vegitable_panel.add(button_89);
		ImageIcon a9 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/onion.jpeg")));
		button_89.setIcon(a9);
		button_89.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Onion");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Onion");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("7");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a9);


			}
		});

		JButton button_90 = new JButton();
		button_90.setBounds(555, 258, 112, 104);
		vegitable_panel.add(button_90);
		ImageIcon a10 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/pepper.jpeg")));
		button_90.setIcon(a10);
		button_90.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Pepper");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Pepper");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a10);


			}
		});

		JButton button_91 = new JButton();
		button_91.setBounds(419, 258, 112, 104);
		vegitable_panel.add(button_91);
		ImageIcon a11 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/potatoes.jpeg")));
		button_91.setIcon(a11);
		button_91.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Potatoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Potatoes from Idaho");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a11);


			}
		});

		JButton button_92 = new JButton();
		button_92.setBounds(282, 258, 112, 104);
		vegitable_panel.add(button_92);
		ImageIcon a12 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/pumpkin.jpeg")));
		button_92.setIcon(a12);
		button_92.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Pumpkin");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Pumpkin");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("8");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a12);


			}
		});

		JButton button_93 = new JButton();
		button_93.setBounds(146, 258, 112, 104);
		vegitable_panel.add(button_93);
		ImageIcon a13 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/radish-white.jpeg")));
		button_93.setIcon(a13);
		button_93.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("White Raddish");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a White Raddish");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a13);


			}
		});

		JButton button_94 = new JButton();
		button_94.setBounds(10, 373, 112, 104);
		vegitable_panel.add(button_94);
		ImageIcon a14 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/radish.jpeg")));
		button_94.setIcon(a14);
		button_94.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Radish");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Radish");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("6");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a14);


			}
		});

		JButton button_95 = new JButton();
		button_95.setBounds(146, 373, 112, 104);
		vegitable_panel.add(button_95);
		ImageIcon a15 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/sweet-peppers.jpeg")));
		button_95.setIcon(a15);
		button_95.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Sweet Pepper");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Sweet Pepper");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a15);


			}
		});

		JButton button_96 = new JButton();
		button_96.setBounds(282, 373, 112, 104);
		vegitable_panel.add(button_96);
		ImageIcon a16 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/sweet-potato.jpeg")));
		button_96.setIcon(a16);
		button_96.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Sweet Potatoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Sweet Potatoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a16);


			}
		});

		JButton button_97 = new JButton();
		button_97.setBounds(419, 373, 112, 104);
		vegitable_panel.add(button_97);
		ImageIcon a17 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/tomatoes.jpeg")));
		button_97.setIcon(a17);
		button_97.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Tomatoes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Tomatoes");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("3");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a17);


			}
		});

		JButton button_98 = new JButton();
		button_98.setBounds(555, 373, 112, 104);
		vegitable_panel.add(button_98);
		ImageIcon a18 = (new ImageIcon(Items.class.getResource("/images/resizevegitables/white-cabbage.jpeg")));
		button_98.setIcon(a18);
		button_98.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("White Cabbage");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a White Vabbage");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(a18);


			}
		});

		JLabel lblListsOfVegitables = new JLabel("Lists of Vegitables");
		lblListsOfVegitables.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfVegitables.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfVegitables.setBounds(0, 0, 685, 25);
		vegitable_panel.add(lblListsOfVegitables);
		//End of Vegitable panel

		//Start of Fruits panel
		JPanel fruits_panel = new JPanel();
		fruits_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		fruits_panel.setLayout(null);
		fruits_panel.setBackground(Color.ORANGE);
		fruits_panel.setBounds(170, 0, 695, 484);
		frameItems.add(fruits_panel);

		JButton btnFruits = new JButton("Fruits");
		btnFruits.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnFruits){
					choiceColor.setEnabled(false);
					choice_Size.setEnabled(false);
				}
				frameItems.removeAll();
				frameItems.add(fruits_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();

			}
		});
		btnFruits.setBounds(10, 235, 151, 41);
		btn_panel.add(btnFruits);

		JButton button_99 = new JButton();
		button_99.setBounds(10, 28, 112, 104);
		fruits_panel.add(button_99);
		ImageIcon dddd = (new ImageIcon(Items.class.getResource("/images/resizefruits/apple-1506119_6401.jpg")));
		button_99.setIcon(dddd);
		button_99.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Red Apples");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Fresh and Farm raised red apples");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("2.5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddd);


			}
		});

		JButton button_100 = new JButton();
		button_100.setBounds(146, 28, 112, 104);
		fruits_panel.add(button_100);
		ImageIcon ddda = (new ImageIcon(Items.class.getResource("/images/resizefruits/apricots.jpg")));
		button_100.setIcon(ddda);
		button_100.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Apricots");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("Fresh Apricots from Himalayas");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("3.5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ddda);


			}
		});
		JButton button_101 = new JButton();
		button_101.setBounds(282, 28, 112, 104);
		fruits_panel.add(button_101);
		ImageIcon dddb = (new ImageIcon(Items.class.getResource("/images/resizefruits/bananas.jpg")));
		button_101.setIcon(dddb);
		button_101.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Bananas");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Banana");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddb);


			}
		});

		JButton button_102 = new JButton();
		button_102.setBounds(419, 28, 112, 104);
		fruits_panel.add(button_102);
		ImageIcon dddc = (new ImageIcon(Items.class.getResource("/images/resizefruits/blue-berry.jpg")));
		button_102.setIcon(dddc);
		button_102.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Blue Berry");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Blue Berry");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("10");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddc);


			}
		});

		JButton button_103 = new JButton();
		button_103.setBounds(555, 28, 112, 104);
		fruits_panel.add(button_103);
		ImageIcon ddde = (new ImageIcon(Items.class.getResource("/images/resizefruits/cherries.jpg")));
		button_103.setIcon(ddde);
		button_103.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Cherries");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Cherry");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ddde);


			}
		});

		JButton button_104 = new JButton();
		button_104.setBounds(10, 143, 112, 104);
		fruits_panel.add(button_104);
		ImageIcon dddf = (new ImageIcon(Items.class.getResource("/images/resizefruits/watermelon.jpg")));
		button_104.setIcon(dddf);
		button_104.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Watermelon");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Watermelon");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddf);


			}
		});

		JButton button_105 = new JButton();
		button_105.setBounds(555, 143, 112, 104);
		fruits_panel.add(button_105);
		ImageIcon dddg = (new ImageIcon(Items.class.getResource("/images/resizefruits/coconut.jpg")));
		button_105.setIcon(dddg);
		button_105.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Coconut");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Coconut");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("12");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddg);


			}
		});

		JButton button_106 = new JButton();
		button_106.setBounds(419, 143, 112, 104);
		fruits_panel.add(button_106);
		ImageIcon dddh = (new ImageIcon(Items.class.getResource("/images/resizefruits/fig.jpg")));
		button_106.setIcon(dddh);
		button_106.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Fig Fruit");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Fig");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddh);


			}
		});

		JButton button_107 = new JButton();
		button_107.setBounds(282, 143, 112, 104);
		fruits_panel.add(button_107);
		ImageIcon dddi = (new ImageIcon(Items.class.getResource("/images/resizefruits/grapes.jpg")));
		button_107.setIcon(dddi);
		button_107.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Grapes");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Grape");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("7");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddi);


			}
		});

		JButton button_108 = new JButton();
		button_108.setBounds(146, 143, 112, 104);
		fruits_panel.add(button_108);
		ImageIcon dddj = (new ImageIcon(Items.class.getResource("/images/resizefruits/hazelnut.jpg")));
		button_108.setIcon(dddj);
		button_108.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Hazelnut");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a HazelNut");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddj);


			}
		});

		JButton button_109 = new JButton();
		button_109.setBounds(10, 258, 112, 104);
		fruits_panel.add(button_109);
		ImageIcon dddk = (new ImageIcon(Items.class.getResource("/images/resizefruits/kiwi.jpg")));
		button_109.setIcon(dddk);
		button_109.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Kiwi");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Kiwi");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddk);


			}
		});

		JButton button_110 = new JButton();
		button_110.setBounds(555, 258, 112, 104);
		fruits_panel.add(button_110);
		ImageIcon dddl = (new ImageIcon(Items.class.getResource("/images/resizefruits/lychee.jpg")));
		button_110.setIcon(dddl);
		button_110.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Lychee");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Lychee");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("7");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddl);


			}
		});

		JButton button_111 = new JButton();
		button_111.setBounds(419, 258, 112, 104);
		fruits_panel.add(button_111);
		ImageIcon dddm = (new ImageIcon(Items.class.getResource("/images/resizefruits/melon.jpg")));
		button_111.setIcon(dddm);
		button_111.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Melon");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Melon");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddm);


			}
		});

		JButton button_112 = new JButton();
		button_112.setBounds(282, 258, 112, 104);
		fruits_panel.add(button_112);
		ImageIcon dddn = (new ImageIcon(Items.class.getResource("/images/resizefruits/orange.jpg")));
		button_112.setIcon(dddn);
		button_112.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Orange");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is an Orange");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("6");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddn);


			}
		});

		JButton button_113 = new JButton();
		button_113.setBounds(146, 258, 112, 104);
		fruits_panel.add(button_113);
		ImageIcon dddo = (new ImageIcon(Items.class.getResource("/images/resizefruits/pear.jpg")));
		button_113.setIcon(dddo);
		button_113.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Pear");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Pear");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("4");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddo);


			}
		});

		JButton button_114 = new JButton();
		button_114.setBounds(10, 373, 112, 104);
		fruits_panel.add(button_114);
		ImageIcon dddp = (new ImageIcon(Items.class.getResource("/images/resizefruits/plums.jpg")));
		button_114.setIcon(dddp);
		button_114.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Plums");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Plumns");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddp);


			}
		});

		JButton button_115 = new JButton();
		button_115.setBounds(146, 373, 112, 104);
		fruits_panel.add(button_115);
		ImageIcon dddq = (new ImageIcon(Items.class.getResource("/images/resizefruits/pomegranate.jpg")));
		button_115.setIcon(dddq);
		button_115.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("PomeGranate");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a PomeGranate");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddq);


			}
		});

		JButton button_116 = new JButton();
		button_116.setBounds(282, 373, 112, 104);
		fruits_panel.add(button_116);
		ImageIcon dddr = (new ImageIcon(Items.class.getResource("/images/resizefruits/raspberries.jpg")));
		button_116.setIcon(dddr);
		button_116.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Rasberries");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Rasberries");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddr);


			}
		});

		JButton button_117 = new JButton();
		button_117.setBounds(419, 373, 112, 104);
		fruits_panel.add(button_117);
		ImageIcon ddds = (new ImageIcon(Items.class.getResource("/images/resizefruits/strawberries.jpg")));
		button_117.setIcon(ddds);
		button_117.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Strawberries");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Strawberries");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ddds);


			}
		});

		JButton button_118 = new JButton();
		button_118.setBounds(555, 373, 112, 104);
		fruits_panel.add(button_118);
		ImageIcon dddt = (new ImageIcon(Items.class.getResource("/images/resizefruits/walnut.jpg")));
		button_118.setIcon(dddt);
		button_118.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Walnut");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Walnut");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("6");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(dddt);


			}
		});




		JLabel lblListsOfFruits = new JLabel("Lists of Fruits");
		lblListsOfFruits.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfFruits.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfFruits.setBounds(0, 0, 685, 25);
		fruits_panel.add(lblListsOfFruits);

		//End of fruits panel

		//Start of Drinks panel

		JPanel Drinks_panel = new JPanel();
		Drinks_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		Drinks_panel.setLayout(null);
		Drinks_panel.setBackground(Color.BLUE);
		Drinks_panel.setBounds(170, 0, 695, 484);
		frameItems.add(Drinks_panel);

		JButton btnDrinks = new JButton("Non Alcoholic Drinks");
		btnDrinks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(Drinks_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnDrinks){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}

			}
		});
		btnDrinks.setBounds(10, 280, 151, 41);
		btn_panel.add(btnDrinks);

		JButton button_119 = new JButton();
		button_119.setBounds(10, 28, 112, 104);
		Drinks_panel.add(button_119);
		ImageIcon mma = (new ImageIcon(Items.class.getResource("/images/resizedrinks/blue sea water.jpeg")));
		button_119.setIcon(mma);
		button_119.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Blue Sea Water");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Blue Sea Water");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mma);


			}
		});

		JButton button_120 = new JButton();
		button_120.setBounds(146, 28, 112, 104);
		Drinks_panel.add(button_120);
		ImageIcon mmb = (new ImageIcon(Items.class.getResource("/images/resizedrinks/bottle-honey.jpeg")));
		button_120.setIcon(mmb);
		button_120.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Honey Bottle");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a bottle of Bee Honey");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("35");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmb);


			}
		});

		JButton button_121 = new JButton();
		button_121.setBounds(282, 28, 112, 104);
		Drinks_panel.add(button_121);
		ImageIcon mmc = (new ImageIcon(Items.class.getResource("/images/resizedrinks/coffee-beans.jpeg")));
		button_121.setIcon(mmc);
		button_121.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Coffee Beans");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Ready Made Coffee Beans");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmc);


			}
		});
		JButton button_122 = new JButton();
		button_122.setBounds(419, 28, 112, 104);
		Drinks_panel.add(button_122);
		ImageIcon mmd = (new ImageIcon(Items.class.getResource("/images/resizedrinks/coke-medium.jpeg")));
		button_122.setIcon(mmd);
		button_122.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Coke");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Mid Size Coke");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmd);


			}
		});

		JButton button_123 = new JButton();
		button_123.setBounds(555, 28, 112, 104);
		Drinks_panel.add(button_123);
		ImageIcon mme = (new ImageIcon(Items.class.getResource("/images/resizedrinks/coke.jpeg")));
		button_123.setIcon(mme);
		button_123.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Coke");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Coke");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mme);


			}
		});

		JButton button_124 = new JButton();
		button_124.setBounds(10, 143, 112, 104);
		Drinks_panel.add(button_124);
		ImageIcon mmf = (new ImageIcon(Items.class.getResource("/images/resizedrinks/drPepper.jpeg")));
		button_124.setIcon(mmf);
		button_124.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Dr Pepper");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Dr Pepper can");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmf);


			}
		});
		JButton button_125 = new JButton();
		button_125.setBounds(555, 143, 112, 104);
		Drinks_panel.add(button_125);
		ImageIcon mmg = (new ImageIcon(Items.class.getResource("/images/resizedrinks/fanta.jpeg")));
		button_125.setIcon(mmg);
		button_125.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Fanta");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Fanta can");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("7");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmg);


			}
		});

		JButton button_126 = new JButton();
		button_126.setBounds(419, 143, 112, 104);
		Drinks_panel.add(button_126);
		ImageIcon mmh = (new ImageIcon(Items.class.getResource("/images/resizedrinks/flavoured.jpeg")));
		button_126.setIcon(mmh);
		button_126.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Flavoured Drinks");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Flavoured Drinks");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmh);


			}
		});

		JButton button_127 = new JButton();
		button_127.setBounds(282, 143, 112, 104);
		Drinks_panel.add(button_127);
		ImageIcon mmi = (new ImageIcon(Items.class.getResource("/images/resizedrinks/spezi.jpeg")));
		button_127.setIcon(mmi);
		button_127.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Spezi Drinks");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Spezi Drinks");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmi);


			}
		});

		JButton button_128 = new JButton();
		button_128.setBounds(146, 143, 112, 104);
		Drinks_panel.add(button_128);
		ImageIcon mmj = (new ImageIcon(Items.class.getResource("/images/resizedrinks/lemonade.jpeg")));
		button_128.setIcon(mmj);
		button_128.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Lemondae Drink");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Lemonade Drink Bottle");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("10");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmj);


			}
		});

		JButton button_129 = new JButton();
		button_129.setBounds(10, 258, 112, 104);
		Drinks_panel.add(button_129);
		ImageIcon mmk = (new ImageIcon(Items.class.getResource("/images/resizedrinks/monster.jpeg")));
		button_129.setIcon(mmk);
		button_129.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Monster Energy Drinks");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Monster Energy Drinks");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("8");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmk);


			}
		});
		JButton button_130 = new JButton();
		button_130.setBounds(555, 258, 112, 104);
		Drinks_panel.add(button_130);
		ImageIcon mml = (new ImageIcon(Items.class.getResource("/images/resizedrinks/panchy.jpeg")));
		button_130.setIcon(mml);
		button_130.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Panchy");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Panchy Drinks");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mml);


			}
		});

		JButton button_131 = new JButton();
		button_131.setBounds(419, 258, 112, 104);
		Drinks_panel.add(button_131);
		ImageIcon mmm = (new ImageIcon(Items.class.getResource("/images/resizedrinks/pepsi.jpeg")));
		button_131.setIcon(mmm);
		button_131.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Pepsi");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Pepsi");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("7");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmm);


			}
		});

		JButton button_132 = new JButton();
		button_132.setBounds(282, 258, 112, 104);
		Drinks_panel.add(button_132);
		ImageIcon mmn = (new ImageIcon(Items.class.getResource("/images/resizedrinks/pineapple.jpeg")));
		button_132.setIcon(mmn);
		button_132.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Pineapple Drinks");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Pineapple Drink");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("10");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmn);


			}
		});

		JButton button_133 = new JButton();
		button_133.setBounds(146, 258, 112, 104);
		Drinks_panel.add(button_133);
		ImageIcon mmo = (new ImageIcon(Items.class.getResource("/images/resizedrinks/red-bull.jpeg")));
		button_133.setIcon(mmo);
		button_133.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Red Bull");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Red Bull");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("8");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmo);


			}
		});

		JButton button_134 = new JButton();
		button_134.setBounds(10, 373, 112, 104);
		Drinks_panel.add(button_134);
		ImageIcon mmp = (new ImageIcon(Items.class.getResource("/images/resizedrinks/rentless.jpeg")));
		button_134.setIcon(mmp);
		button_134.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Rentless Drinks");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Rentless Drinks");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmp);


			}
		});

		JButton button_135 = new JButton();
		button_135.setBounds(146, 373, 112, 104);
		Drinks_panel.add(button_135);
		ImageIcon mmq = (new ImageIcon(Items.class.getResource("/images/resizedrinks/soda.jpeg")));
		button_135.setIcon(mmq);
		button_135.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Soda Drinks");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Soda Drinks");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmq);


			}
		});

		JButton button_136 = new JButton();
		button_136.setBounds(282, 373, 112, 104);
		Drinks_panel.add(button_136);
		ImageIcon mmr = (new ImageIcon(Items.class.getResource("/images/resizedrinks/think juice.jpeg")));
		button_136.setIcon(mmr);
		button_136.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Think Juice");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Think Juice");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("9");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmr);


			}
		});

		JButton button_137 = new JButton();
		button_137.setBounds(419, 373, 112, 104);
		Drinks_panel.add(button_137);
		ImageIcon mms = (new ImageIcon(Items.class.getResource("/images/resizedrinks/water.jpeg")));
		button_137.setIcon(mms);
		button_137.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Water Bottle");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Water Bottle");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("5");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mms);


			}
		});

		JButton button_138 = new JButton();
		button_138.setBounds(555, 373, 112, 104);
		Drinks_panel.add(button_138);
		ImageIcon mmt = (new ImageIcon(Items.class.getResource("/images/resizedrinks/green-tea.png")));
		button_138.setIcon(mmt);
		button_138.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Green Tea");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Green Tea");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("8");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(mmt);


			}
		});

		JLabel lblListsOfDrinking = new JLabel("Lists of Drinking Items");
		lblListsOfDrinking.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfDrinking.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfDrinking.setBounds(0, 0, 685, 25);
		Drinks_panel.add(lblListsOfDrinking);

		//End Non Alcoholic drinks panel

		//Start of Wine panel

		JPanel wine_panel = new JPanel();
		wine_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		wine_panel.setLayout(null);
		wine_panel.setBackground(Color.YELLOW);
		wine_panel.setBounds(170, 0, 695, 484);
		frameItems.add(wine_panel);


		JButton btnWine = new JButton("Wine/Champange");
		btnWine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(wine_panel);
				frameItems.add(btn_panel);
				frameItems.add(cart_panel);
				frameItems.add(details_panel);
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();
				if(e.getSource()==btnWine){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}

			}
		});
		btnWine.setBounds(10, 325, 151, 41);
		btn_panel.add(btnWine);
		JButton button_139 = new JButton();
		button_139.setBounds(10, 28, 112, 104);
		wine_panel.add(button_139);
		ImageIcon nna = (new ImageIcon(Items.class.getResource("/images/resizeWine/2CandleWine.jpeg")));
		button_139.setIcon(nna);
		button_139.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Two Candle Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Two Candle Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("75");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nna);


			}
		});

		JButton button_140 = new JButton();
		button_140.setBounds(146, 28, 112, 104);
		wine_panel.add(button_140);
		ImageIcon nnb = (new ImageIcon(Items.class.getResource("/images/resizeWine/asianWine.jpeg")));
		button_140.setIcon(nnb);
		button_140.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Asian Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Asian wine from Nepal");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnb);


			}
		});

		JButton button_141 = new JButton();
		button_141.setBounds(282, 28, 112, 104);
		wine_panel.add(button_141);
		ImageIcon nnc = (new ImageIcon(Items.class.getResource("/images/resizeWine/BigMan.jpeg")));
		button_141.setIcon(nnc);
		button_141.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Big Man Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Big Man Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("65");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnc);


			}
		});

		JButton button_142 = new JButton();
		button_142.setBounds(419, 28, 112, 104);
		wine_panel.add(button_142);
		ImageIcon nnd = (new ImageIcon(Items.class.getResource("/images/resizeWine/bordeaux.png")));
		button_142.setIcon(nnd);
		button_142.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Bordeaux Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Bordeaux wine from Japan");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnd);


			}
		});

		JButton button_143 = new JButton();
		button_143.setBounds(555, 28, 112, 104);
		wine_panel.add(button_143);
		ImageIcon nne = (new ImageIcon(Items.class.getResource("/images/resizeWine/Canadian.jpeg")));
		button_143.setIcon(nne);
		button_143.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Canadian Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a new brand wine from Canada");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nne);


			}
		});

		JButton button_144 = new JButton();
		button_144.setBounds(10, 143, 112, 104);
		wine_panel.add(button_144);
		ImageIcon nnf = (new ImageIcon(Items.class.getResource("/images/resizeWine/CarrotWine.jpeg")));
		button_144.setIcon(nnf);
		button_144.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Carrot Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Carrot Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("505");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnf);


			}
		});

		JButton button_145 = new JButton();
		button_145.setBounds(555, 143, 112, 104);
		wine_panel.add(button_145);
		ImageIcon nng = (new ImageIcon(Items.class.getResource("/images/resizeWine/champagne-Sparkling-Wine.jpeg")));
		button_145.setIcon(nng);
		button_145.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Champange Sparkling Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Champange Sparkling Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nng);


			}
		});

		JButton button_146 = new JButton();
		button_146.setBounds(419, 143, 112, 104);
		wine_panel.add(button_146);
		ImageIcon nnh = (new ImageIcon(Items.class.getResource("/images/resizeWine/delighted.jpeg")));
		button_146.setIcon(nnh);
		button_146.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Delighted Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Delighted Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnh);


			}
		});
		JButton button_147 = new JButton();
		button_147.setBounds(282, 143, 112, 104);
		wine_panel.add(button_147);
		ImageIcon nni = (new ImageIcon(Items.class.getResource("/images/resizeWine/european.jpeg")));
		button_147.setIcon(nni);
		button_147.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("European Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a European Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("505");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nni);


			}
		});

		JButton button_148 = new JButton();
		button_148.setBounds(146, 143, 112, 104);
		wine_panel.add(button_148);
		ImageIcon nnj = (new ImageIcon(Items.class.getResource("/images/resizeWine/flower-candle-wine.jpeg")));
		button_148.setIcon(nnj);
		button_148.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Flower Candle Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Flower Candle Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnj);


			}
		});

		JButton button_149 = new JButton();
		button_149.setBounds(10, 258, 112, 104);
		wine_panel.add(button_149);
		ImageIcon nnk = (new ImageIcon(Items.class.getResource("/images/resizeWine/French-wine.jpeg")));
		button_149.setIcon(nnk);
		button_149.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("French Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a French Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("255");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnk);


			}
		});

		JButton button_150 = new JButton();
		button_150.setBounds(555, 258, 112, 104);
		wine_panel.add(button_150);
		ImageIcon nnl = (new ImageIcon(Items.class.getResource("/images/resizeWine/frogs-wine.jpeg")));
		button_150.setIcon(nnl);
		button_150.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Frogs Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Frog brand of wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnl);


			}
		});

		JButton button_151 = new JButton();
		button_151.setBounds(419, 258, 112, 104);
		wine_panel.add(button_151);
		ImageIcon nnm = (new ImageIcon(Items.class.getResource("/images/resizeWine/King.jpeg")));
		button_151.setIcon(nnm);
		button_151.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("King Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a King Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("75");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnm);


			}
		});

		JButton button_152 = new JButton();
		button_152.setBounds(282, 258, 112, 104);
		wine_panel.add(button_152);
		ImageIcon nnn = (new ImageIcon(Items.class.getResource("/images/resizeWine/Martini.jpeg")));
		button_152.setIcon(nnn);
		button_152.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Martini");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is Martini");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnn);


			}
		});

		JButton button_153 = new JButton();
		button_153.setBounds(146, 258, 112, 104);
		wine_panel.add(button_153);
		ImageIcon nno = (new ImageIcon(Items.class.getResource("/images/resizeWine/Moet & Chandon.jpeg")));
		button_153.setIcon(nno);
		button_153.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Moet & Chandon");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Moet & Chandon wine from Japan");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nno);


			}
		});

		JButton button_154 = new JButton();
		button_154.setBounds(10, 373, 112, 104);
		wine_panel.add(button_154);
		ImageIcon nnp = (new ImageIcon(Items.class.getResource("/images/resizeWine/Quencher.jpeg")));
		button_154.setIcon(nnp);
		button_154.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Quencher wWine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Quencher");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnp);


			}
		});

		JButton button_155 = new JButton();
		button_155.setBounds(146, 373, 112, 104);
		wine_panel.add(button_155);
		ImageIcon nnq = (new ImageIcon(Items.class.getResource("/images/resizeWine/Ranger.jpeg")));
		button_155.setIcon(nnq);
		button_155.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Ranger Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Ranger wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("125");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnq);


			}
		});

		JButton button_156 = new JButton();
		button_156.setBounds(282, 373, 112, 104);
		wine_panel.add(button_156);
		ImageIcon nnr = (new ImageIcon(Items.class.getResource("/images/resizeWine/red-wine.png")));
		button_156.setIcon(nnr);
		button_156.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Red Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Famous Red wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("155");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnr);


			}
		});

		JButton button_157 = new JButton();
		button_157.setBounds(419, 373, 112, 104);
		wine_panel.add(button_157);
		ImageIcon nns = (new ImageIcon(Items.class.getResource("/images/resizeWine/RemyMartin.jpeg")));
		button_157.setIcon(nns);
		button_157.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Remy Martin Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Remy Martin's new Brand");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("175");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nns);


			}
		});

		JButton button_158 = new JButton();
		button_158.setBounds(555, 373, 112, 104);
		wine_panel.add(button_158);
		ImageIcon nnt = (new ImageIcon(Items.class.getResource("/images/resizeWine/Rokepalla.jpeg")));
		button_158.setIcon(nnt);
		button_158.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Rokepalla Wine");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Rokepalla Wine");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("95");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(nnt);


			}
		});

		JLabel lblListsOfWines = new JLabel("Lists of Wines");
		lblListsOfWines.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfWines.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfWines.setBounds(0, 0, 685, 25);
		wine_panel.add(lblListsOfWines);

		//End of Wines panel

		//Start of Beer Panel

		JPanel beer_panel = new JPanel();
		beer_panel.setForeground(Color.WHITE);
		beer_panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		beer_panel.setLayout(null);
		beer_panel.setBackground(Color.BLACK);
		beer_panel.setBounds(170, 0, 695, 484);
		frameItems.add(beer_panel);


		JButton btnBeer = new JButton("Beer/Rum");
		btnBeer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameItems.removeAll();
				frameItems.add(beer_panel);
				frameItems.repaint();
				frameItems.revalidate();
				frameItems.add(btn_panel);
				frameItems.repaint();
				frameItems.revalidate();
				frameItems.add(cart_panel);
				frameItems.repaint();
				frameItems.revalidate();
				frameItems.add(details_panel);
				frameItems.repaint();
				frameItems.revalidate();
				frameItems.add(checkout_panel);
				frameItems.repaint();
				frameItems.revalidate();

				if(e.getSource()==btnBeer){
					choiceColor.setEnabled(true);
					choice_Size.setEnabled(true);
				}
			}
		});
		btnBeer.setBounds(10, 371, 151, 41);
		btn_panel.add(btnBeer);

		JButton button_159 = new JButton();
		button_159.setBounds(10, 28, 112, 104);
		beer_panel.add(button_159);
		ImageIcon gga = (new ImageIcon(Items.class.getResource("/images/resizebeer/becks.jpeg")));
		button_159.setIcon(gga);
		button_159.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Becks Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Becks Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(gga);


			}
		});

		JButton button_160 = new JButton();
		button_160.setBounds(146, 28, 112, 104);
		beer_panel.add(button_160);
		ImageIcon ggb = (new ImageIcon(Items.class.getResource("/images/resizebeer/captianJack.jpeg")));
		button_160.setIcon(ggb);
		button_160.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Captian Jack Whiskey");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Captian Jack Whiskey");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("75");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggb);


			}
		});

		JButton button_161 = new JButton();
		button_161.setBounds(282, 28, 112, 104);
		beer_panel.add(button_161);
		ImageIcon ggc = (new ImageIcon(Items.class.getResource("/images/resizebeer/corona.jpeg")));
		button_161.setIcon(ggc);
		button_161.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Corona Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Corona Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("22");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggc);


			}
		});

		JButton button_162 = new JButton();
		button_162.setBounds(419, 28, 112, 104);
		beer_panel.add(button_162);
		ImageIcon ggd = (new ImageIcon(Items.class.getResource("/images/resizebeer/craft-beer-2.jpeg")));
		button_162.setIcon(ggd);
		button_162.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Home Made Craft Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Home Made Craft Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggd);


			}
		});

		JButton button_163 = new JButton();
		button_163.setBounds(555, 28, 112, 104);
		beer_panel.add(button_163);
		ImageIcon gge = (new ImageIcon(Items.class.getResource("/images/resizebeer/craft-beer.jpeg")));
		button_163.setIcon(gge);
		button_163.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Craft Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Craft Beer from Cincinnati");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("24");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(gge);


			}
		});

		JButton button_164 = new JButton();
		button_164.setBounds(10, 143, 112, 104);
		beer_panel.add(button_164);
		ImageIcon ggf = (new ImageIcon(Items.class.getResource("/images/resizebeer/cuban rum.jpeg")));
		button_164.setIcon(ggf);
		button_164.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Cuban Rum");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Cuban Rum");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggf);


			}
		});

		JButton button_165 = new JButton();
		button_165.setBounds(555, 143, 112, 104);
		beer_panel.add(button_165);
		ImageIcon ggg = (new ImageIcon(Items.class.getResource("/images/resizebeer/dark rum.jpeg")));
		button_165.setIcon(ggg);
		button_165.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Dark Rum");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Dark Rum");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("59");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggg);


			}
		});

		JButton button_166 = new JButton();
		button_166.setBounds(419, 143, 112, 104);
		beer_panel.add(button_166);
		ImageIcon ggh = (new ImageIcon(Items.class.getResource("/images/resizebeer/duff.jpeg")));
		button_166.setIcon(ggh);
		button_166.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Duff Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Duff Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("65");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggh);


			}
		});

		JButton button_167 = new JButton();
		button_167.setBounds(282, 143, 112, 104);
		beer_panel.add(button_167);
		ImageIcon ggi = (new ImageIcon(Items.class.getResource("/images/resizebeer/gin.jpeg")));
		button_167.setIcon(ggi);
		button_167.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Gin");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Gin");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggi);


			}
		});

		JButton button_168 = new JButton();
		button_168.setBounds(146, 143, 112, 104);
		beer_panel.add(button_168);
		ImageIcon ggj = (new ImageIcon(Items.class.getResource("/images/resizebeer/glacier.jpeg")));
		button_168.setIcon(ggj);
		button_168.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Glacier Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Glacier Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("45");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggj);


			}
		});

		JButton button_169 = new JButton();
		button_169.setBounds(10, 258, 112, 104);
		beer_panel.add(button_169);
		ImageIcon ggk = (new ImageIcon(Items.class.getResource("/images/resizebeer/heinekin.jpeg")));
		button_169.setIcon(ggk);
		button_169.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Henekin Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Henekin Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggk);


			}
		});

		JButton button_170 = new JButton();
		button_170.setBounds(555, 258, 112, 104);
		beer_panel.add(button_170);
		ImageIcon ggl = (new ImageIcon(Items.class.getResource("/images/resizebeer/margarita.jpeg")));
		button_170.setIcon(ggl);
		button_170.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Margarita");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Margarita");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("35");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggl);


			}
		});

		JButton button_171 = new JButton();
		button_171.setBounds(419, 258, 112, 104);
		beer_panel.add(button_171);
		ImageIcon ggm = (new ImageIcon(Items.class.getResource("/images/resizebeer/martini.jpeg")));
		button_171.setIcon(ggm);
		button_171.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Martini");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Martini");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggm);


			}
		});

		JButton button_172 = new JButton();
		button_172.setBounds(282, 258, 112, 104);
		beer_panel.add(button_172);
		ImageIcon ggn = (new ImageIcon(Items.class.getResource("/images/resizebeer/miller.jpeg")));
		button_172.setIcon(ggn);
		button_172.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Miller Beer");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Miller Beer");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("15");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggn);


			}
		});

		JButton button_173 = new JButton();
		button_173.setBounds(146, 258, 112, 104);
		beer_panel.add(button_173);
		ImageIcon ggo = (new ImageIcon(Items.class.getResource("/images/resizebeer/peroni.jpeg")));
		button_173.setIcon(ggo);
		button_173.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Peroni");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Peroni");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("35");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggo);


			}
		});

		JButton button_174 = new JButton();
		button_174.setBounds(10, 373, 112, 104);
		beer_panel.add(button_174);
		ImageIcon ggp = (new ImageIcon(Items.class.getResource("/images/resizebeer/red-label.jpeg")));
		button_174.setIcon(ggp);
		button_174.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Johny Walker Red Label whiskey");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Johny Walker Red Label whiskey");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("55");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggp);


			}
		});

		JButton button_175 = new JButton();
		button_175.setBounds(146, 373, 112, 104);
		beer_panel.add(button_175);
		ImageIcon ggq = (new ImageIcon(Items.class.getResource("/images/resizebeer/regal.jpeg")));
		button_175.setIcon(ggq);
		button_175.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Regal");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Regal");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("35");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggq);


			}
		});

		JButton button_176 = new JButton();
		button_176.setBounds(282, 373, 112, 104);
		beer_panel.add(button_176);
		ImageIcon ggr = (new ImageIcon(Items.class.getResource("/images/resizebeer/rhum JM.jpeg")));
		button_176.setIcon(ggr);
		button_176.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("RHUM JM");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a RHUM JM");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("85");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggr);


			}
		});

		JButton button_177 = new JButton();
		button_177.setBounds(419, 373, 112, 104);
		beer_panel.add(button_177);
		ImageIcon ggs = (new ImageIcon(Items.class.getResource("/images/resizebeer/tullamore.jpeg")));
		button_177.setIcon(ggs);
		button_177.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Tullamore");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Tullamore");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("34");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggs);


			}
		});

		JButton button_178 = new JButton();
		button_178.setBounds(555, 373, 112, 104);
		beer_panel.add(button_178);
		ImageIcon ggt = (new ImageIcon(Items.class.getResource("/images/resizebeer/vodaka.jpeg")));
		button_178.setIcon(ggt);
		button_178.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textAreaDescription.removeAll();

				textAreaItemName.setText("Vodka");
				textAreaItemName.repaint();
				textAreaItemName.revalidate();

				textAreaDescription.setText("This is a Vodka");
				textAreaDescription.repaint();
				textAreaDescription.revalidate();


				textAreaPrice.setText("25");
				textAreaPrice.removeAll();
				textAreaPrice.repaint();
				textAreaPrice.revalidate();

				button_details_image.setIcon(ggt);


			}
		});


		JLabel lblListsOfBeers = new JLabel("Lists of Beers");
		lblListsOfBeers.setForeground(Color.WHITE);
		lblListsOfBeers.setBackground(Color.WHITE);
		lblListsOfBeers.setHorizontalAlignment(SwingConstants.CENTER);
		lblListsOfBeers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblListsOfBeers.setBounds(0, 0, 685, 25);
		beer_panel.add(lblListsOfBeers);
		//End of Beer panel

		JLabel lblImage = new JLabel("Image :");
		lblImage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImage.setBounds(481, 87, 74, 72);
		details_panel.add(lblImage);

		JButton btnNewButton_5 = new JButton("Add Items to Cart");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=textAreaItemName.getText();
				String str2=textAreaPrice.getText();
				String str3=choice_Qnty.getSelectedItem();
				double price=Double.parseDouble(str2);
				double qnty=Double.parseDouble(str3);
				//	int cartList = list_cart.getItemCount();
				//	int priceList = list_price.getItemCount();
				double qnty2= price*qnty;
				list_cart.add(str);
				String listprice = Double.toString(qnty2);
				list_price.add(listprice);
				list_Qnty.add(str3);
				ArrayList<String> myList = new ArrayList<String>();
				myList.add(listprice);
				String sum = "";
				for(int i = 0; i < myList.size(); i++){

					sum += myList.get(i);


				}

				textArea_totalCosts.setText(sum);

				textArea_totalItems.setText("" + list_cart.getItemCount());

				//Setup later

				/*	if(choiceColor.getSelectedItem().equals("Select")|| choice_Size.getSelectedItem().equals("Select")){

					list_cart.removeAll();
					list_price.removeAll();
					list_Qnty.removeAll();
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Please Select Color, Size or Qnty");
					return;

				}*/


			}
		});
		btnNewButton_5.setBackground(Color.BLUE);
		btnNewButton_5.setBounds(689, 87, 151, 72);
		details_panel.add(btnNewButton_5);

		TextArea textArea = new TextArea();
		textArea.setBounds(924, 49, 135, 27);
		details_panel.add(textArea);

		JButton btnRemoveFromCart = new JButton("Remove Items");
		btnRemoveFromCart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=textAreaItemName.getText();
				String str2=textAreaPrice.getText();
				String str3=choice_Qnty.getSelectedItem();
				double price=Double.parseDouble(str2);
				double qnty=Double.parseDouble(str3);
				//	int cartList = list_cart.getItemCount();
				//	int priceList = list_price.getItemCount();
				double qnty2= price*qnty;
				list_cart.remove(str);
				list_price.remove("" +qnty2);
				list_Qnty.remove(str3);
				textArea_totalItems.setText("" + list_cart.getItemCount());
				double total = list_cart.getItemCount()*qnty2;
				textArea_totalCosts.setText(""  + total);


			}
		});
		btnRemoveFromCart.setBackground(Color.RED);
		btnRemoveFromCart.setBounds(20, 390, 166, 36);
		cart_panel.add(btnRemoveFromCart);

		JButton btnTotal = new JButton("Clear All");
		btnTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				list_cart.removeAll();
				list_price.removeAll();
				list_Qnty.removeAll();
				textArea_totalItems.setText(null);
				textArea_totalCosts.setText(null);

			}
		});
		btnTotal.setBackground(Color.GREEN);
		btnTotal.setBounds(20, 437, 166, 36);
		cart_panel.add(btnTotal);

		JButton btnCheckOut = new JButton("CHECK OUT");
		btnCheckOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				//	String str=textAreaItemName.getText();
				String str2=textAreaPrice.getText();
				int price=Integer.parseInt(str2);
				//	int cartList = list_cart.getItemCount();
				int total =  list_cart.getItemCount()*price;
				JFrame f = new JFrame("Message");
				f.getContentPane().setBackground(Color.RED);
				JOptionPane.showMessageDialog(f, "Thank You for Shopping with us..Please follow the pin pad.."+"Your total for " +list_cart.getItemCount()+ " items is: " +total);
				//ArrayList<String> receipt = new ArrayList<>();

			}


		});
		btnCheckOut.setBackground(Color.BLUE);
		btnCheckOut.setBounds(40, 116, 159, 36);
		checkout_panel.add(btnCheckOut);


	}
}
