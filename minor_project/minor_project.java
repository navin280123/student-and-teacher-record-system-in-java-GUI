package minor_project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class minor_project extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					minor_project frame = new minor_project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public minor_project() {
		setTitle("WELCOME PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(304, 87, 164, 30);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(304, 140, 164, 30);
		contentPane.add(password);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(334, 276, 119, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(164, 92, 132, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lblNewLabel_1.setBounds(164, 145, 108, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME TO LOGIN PAGE");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblNewLabel_2.setBounds(154, 11, 440, 42);
		contentPane.add(lblNewLabel_2);
		mainpage1 a= new mainpage1();

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=username.getText();
				String pass = new String(password.getPassword());
				String message = "invalid input";
				 if (user.equals("ADMIN") && pass.equals("ADMIN")) {	
					
					 a.setVisible(true);
					 minor_project b = new minor_project();
					 b.setVisible(false);
					 dispose();
				 	}
				 else {

						JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
						        JOptionPane.ERROR_MESSAGE);
				 }
				}
			
		});
	}
}
