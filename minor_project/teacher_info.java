package minor_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class teacher_info extends JFrame {

	JPanel contentPane;
	JTextField textField;
	JTextField text_id_get;
	JTextField text_dep_get;
	JTextField text_mail_get;
	JTextField text_mob_get;
	JTextField text_name_get;
	JTextField text_cab_get;
	JTextField text_des_get;
	JTextField text_age_get;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_info frame = new teacher_info();
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
	public teacher_info() {
		setTitle("TEACHER INFO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel NewLabel = new JLabel("Teacher Record");
		NewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setOpaque(true);
		NewLabel.setBounds(0, 0, 784, 42);
		contentPane.add(NewLabel);

		JLabel label_name = new JLabel(" Name:");
		label_name.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_name.setBounds(10, 59, 100, 25);
		contentPane.add(label_name);

		JLabel label_age = new JLabel(" Age:");
		label_age.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_age.setBounds(10, 131, 100, 25);
		contentPane.add(label_age);

		JLabel label_mob = new JLabel(" Mobile No:");
		label_mob.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_mob.setBounds(400, 59, 100, 25);
		contentPane.add(label_mob);

		JLabel label_mail = new JLabel(" Email:");
		label_mail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_mail.setBounds(400, 131, 100, 25);
		contentPane.add(label_mail);

		JLabel lblDepartment = new JLabel(" Department:");
		lblDepartment.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDepartment.setBounds(10, 204, 100, 25);
		contentPane.add(lblDepartment);

		JLabel lblTeacherId = new JLabel(" Teacher ID:");
		lblTeacherId.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTeacherId.setBounds(10, 275, 100, 25);
		contentPane.add(lblTeacherId);

		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDesignation.setBounds(397, 204, 120, 25);
		contentPane.add(lblDesignation);

		JLabel lblCabinNo = new JLabel("Cabin No:");
		lblCabinNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCabinNo.setBounds(400, 275, 120, 25);
		contentPane.add(lblCabinNo);

		text_age_get = new JTextField();
		text_age_get.setBounds(120, 132, 250, 25);
		contentPane.add(text_age_get);
		text_age_get.setColumns(10);

		text_mob_get = new JTextField();
		text_mob_get.setBounds(510, 60, 250, 25);
		contentPane.add(text_mob_get);
		text_mob_get.setColumns(10);

		text_mail_get = new JTextField();
		text_mail_get.setBounds(510, 132, 250, 25);
		contentPane.add(text_mail_get);
		text_mail_get.setColumns(10);

		text_dep_get = new JTextField();
		text_dep_get.setBounds(120, 205, 250, 25);
		contentPane.add(text_dep_get);
		text_dep_get.setColumns(10);

		text_id_get = new JTextField();
		text_id_get.setBounds(120, 276, 250, 25);
		contentPane.add(text_id_get);
		text_id_get.setColumns(10);

		text_des_get = new JTextField();
		text_des_get.setBounds(510, 205, 250, 25);
		contentPane.add(text_des_get);
		text_des_get.setColumns(10);

		text_cab_get = new JTextField();
		text_cab_get.setBounds(510, 276, 250, 25);
		contentPane.add(text_cab_get);
		text_cab_get.setColumns(10);

		text_name_get = new JTextField();
		text_name_get.setBounds(120, 60, 250, 25);
		contentPane.add(text_name_get);
		text_name_get.setColumns(10);

		int i = 0;
		String index = Integer.toString(i);
		text_id_get.setText(index);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage1 a = new mainpage1();
				a.setVisible(true);

				teacher_info b = new teacher_info();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(319, 316, 127, 34);
		contentPane.add(btnNewButton);
	}
}
