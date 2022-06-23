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

public class teacher_set extends JFrame {

	JPanel contentPane;
	JTextField textField;
	JTextField text_id;
	JTextField text_dep;
	JTextField text_mail;
	JTextField text_mob;
	JTextField text_name;
	JTextField text_cab;
	JTextField text_des;
	JTextField text_age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_set frame = new teacher_set();
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
	public teacher_set() {
		setTitle("TEACHER RECORD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel NewLabel = new JLabel(" Enter the Teacher Record");
		NewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setOpaque(true);
		NewLabel.setBounds(0, 0, 784, 39);
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

		text_age = new JTextField();
		text_age.setBounds(120, 132, 250, 25);
		contentPane.add(text_age);
		text_age.setColumns(10);

		text_mob = new JTextField();
		text_mob.setBounds(510, 60, 250, 25);
		contentPane.add(text_mob);
		text_mob.setColumns(10);

		text_mail = new JTextField();
		text_mail.setBounds(510, 132, 250, 25);
		contentPane.add(text_mail);
		text_mail.setColumns(10);

		text_dep = new JTextField();
		text_dep.setBounds(120, 205, 250, 25);
		contentPane.add(text_dep);
		text_dep.setColumns(10);

		text_id = new JTextField();
		text_id.setBounds(120, 276, 250, 25);
		contentPane.add(text_id);
		text_id.setColumns(10);

		text_des = new JTextField();
		text_des.setBounds(510, 205, 250, 25);
		contentPane.add(text_des);
		text_des.setColumns(10);

		text_cab = new JTextField();
		text_cab.setBounds(510, 276, 250, 25);
		contentPane.add(text_cab);
		text_cab.setColumns(10);

		text_name = new JTextField();
		text_name.setBounds(120, 60, 250, 25);
		contentPane.add(text_name);
		text_name.setColumns(10);

		int i = 0;
		String index = Integer.toString(i);
		text_id.setText(index);

		JButton btnNewButton = new JButton(" SUBMIT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage1 a = new mainpage1();
				a.setVisible(true);
				String name = text_name.getText();
				String mob = text_mob.getText();
				String mail = text_mail.getText();
				String department = text_dep.getText();
				String designation = text_des.getText();
				String cabin = text_cab.getText();
				int age = Integer.parseInt(text_age.getText());
				int id = Integer.parseInt(text_id.getText());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection.createStatement();
					String query = "INSERT INTO teacher_record(teacher_id,teacher_name,teacher_department,teacher_mob,teacher_age,teacher_mail,teacher_cabin,teacher_designation) VALUES("
							+ id + ",'" + name + "','" + department + "','" + mob + "'," + age + ",'" + mail + "','"
							+ cabin + "','" + designation + "')";
					statement.executeUpdate(query);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}
				teacher_set b = new teacher_set();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(455, 316, 127, 34);
		contentPane.add(btnNewButton);

		JButton back = new JButton("BACK");
		back.setFont(new Font("Times New Roman", Font.BOLD, 15));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage1 a = new mainpage1();
				a.setVisible(true);

				teacher_set b = new teacher_set();
				b.setVisible(false);
				dispose();
			}
		});
		back.setBounds(163, 316, 110, 34);
		contentPane.add(back);
	}
}
