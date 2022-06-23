package minor_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

public class mainpage1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeAdmin;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage1 frame = new mainpage1();
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
	public mainpage1() {
		setTitle("MAIN PORTAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtWelcomeAdmin = new JTextField();
		txtWelcomeAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeAdmin.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		txtWelcomeAdmin.setBackground(new Color(255, 255, 102));
		txtWelcomeAdmin.setForeground(new Color(0, 0, 0));
		txtWelcomeAdmin.setText("WELCOME ADMIN");
		txtWelcomeAdmin.setBounds(0, 0, 784, 31);
		contentPane.add(txtWelcomeAdmin);
		txtWelcomeAdmin.setColumns(10);
		JButton btnNewButton = new JButton("SET STUDENT DATA");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setstudentdata a = new setstudentdata();
				a.setVisible(true);
				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(41, 129, 159, 31);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("STUDENT INFO");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getstudentdata a = new getstudentdata();
				a.setVisible(true);

				int key = Integer.parseInt(textField.getText());
				int id = 0, age = 0;
				String name = "", fname = "", mname = "", add = "", roll = "", course = "", mob = "", con = "",
						state = "", city = "", email = "", pcon = "";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection.createStatement();
					String data = "select * from student_record where student_id =" + key + "";
					ResultSet rs = statement.executeQuery(data);
					while (rs.next()) {
						id = rs.getInt("student_id");
						name = rs.getString("student_name");
						fname = rs.getString("student_fname");
						mname = rs.getString("student_mname");
						add = rs.getString("student_add");
						roll = rs.getString("student_roll");
						course = rs.getString("student_course");
						mob = rs.getString("student_mob");
						con = rs.getString("student_con");
						state = rs.getString("student_state");
						city = rs.getString("student_city");
						age = rs.getInt("student_age");
						email = rs.getString("student_email");
						pcon = rs.getString("student_pcon");
						a.text_name_get.setText(name);
						a.text_add_get.setText(add);
						a.text_age_get.setText(Integer.toString(age));
						a.text_city_get.setText(city);
						a.text_course_get.setText(course);
						a.text_con_get.setText(con);
						a.text_father_get.setText(fname);
						a.text_id_get.setText(Integer.toString(id));
						a.text_mail_get.setText(email);
						a.text_mob_get.setText(mob);
						a.text_mother_get.setText(mname);
						a.text_pcon_get.setText(pcon);
						a.text_roll_get.setText(roll);
						a.text_state_get.setText(state);

					}

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}
				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(570, 129, 159, 31);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minor_project a = new minor_project();
				a.setVisible(true);
				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBounds(318, 312, 128, 38);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("ENTER THE ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(585, 45, 128, 31);
		contentPane.add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(570, 87, 159, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_2 = new JButton("SET TEACHER DATA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				teacher_set a = new teacher_set();
				a.setVisible(true);
				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(41, 171, 159, 31);
		contentPane.add(btnNewButton_2);
		String info_record = "";
		JButton btnNewButton_5 = new JButton("ALL TEACHERS");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info a = new info();
				a.setVisible(true);
				int id = 0, age = 0;
				String name = "", mob = "", email = "", dep = "", deg = "", cabin = "";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection.createStatement();
					String data = "select * from student.teacher_record";
					ResultSet rs = statement.executeQuery(data);
					String record = "";
					while (rs.next()) {
						id = rs.getInt("teacher_id");
						name = rs.getString("teacher_name");
						age = rs.getInt("teacher_age");
						mob = rs.getString("teacher_mob");
						email = rs.getString("teacher_mail");
						dep = rs.getString("teacher_department");
						deg = rs.getString("teacher_designation");
						cabin = rs.getString("teacher_cabin");
						record += ("\n" + "TEACHER'S ID:" + Integer.toString(id) + "\t" + "TEACHER'S NAME: " + name
								+ "\t" + "TEACHER'S AGE:" + Integer.toString(age) + "\t" + "TEACHER'S MOBILE NO: " + mob
								+ "\t" + "TEACHER'S EMAIL: " + email + "\t" + "TEACHER'S DEEPARMENT" + dep + "\t"
								+ "TEACHER'S DESIGNATION" + deg + "\t" + "TEACHER'S CABIN NO: " + cabin);

					}
					a.data.setText(record);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}

				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();

			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_5.setBounds(41, 255, 159, 31);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("ALL STUDENT");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info a = new info();
				a.setVisible(true);
				int id = 0, age = 0;
				String name = "", fname = "", mname = "", add = "", roll = "", course = "", mob = "", con = "",
						state = "", city = "", email = "", pcon = "";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection.createStatement();
					String data = "select * from student.student_record";
					ResultSet rs = statement.executeQuery(data);
					String record = "";
					while (rs.next()) {
						id = rs.getInt("student_id");
						name = rs.getString("student_name");
						fname = rs.getString("student_fname");
						mname = rs.getString("student_mname");
						add = rs.getString("student_add");
						roll = rs.getString("student_roll");
						course = rs.getString("student_course");
						mob = rs.getString("student_mob");
						con = rs.getString("student_con");
						state = rs.getString("student_state");
						city = rs.getString("student_city");
						age = rs.getInt("student_age");
						email = rs.getString("student_email");
						pcon = rs.getString("student_pcon");
						record += ("\n" + "STUDENT'S ID: " + Integer.toString(id) + "\t" + "STUDENT'S NAME: " + name
								+ "\t" + "STUDENT'S FATHER NAME: " + fname + "\t" + "STUDENT'S MOTHER NAME:" + mname
								+ "\t" + "STUDNET'S ADDRESS: " + add + "\t" + "STUDENT'S ROLL NO :" + roll + "\t"
								+ "STUDNET'S COURSE : " + course + "\t" + "STUDENT'S MOBILE NO : " + mob + "\t"
								+ "STUDENT'S COUNTRY: " + con + "\t" + "STUDENT'S STATE: " + state + "\t"
								+ "STUDENT'S CITY: " + city + "\t" + "STUDENT'S AGE: " + Integer.toString(age) + "\t"
								+ "STUDENT'S EMAIL: " + email + "\t" + "STUDENT'S PARENTS NO: " + pcon);

					}
					a.data.setText(record);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}

				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_6.setBounds(41, 213, 159, 31);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_4 = new JButton("TEACHER INFO");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_info a = new teacher_info();
				a.setVisible(true);

				int key = Integer.parseInt(textField.getText());
				int id = 0, age = 0;
				String name = "", mob = "", email = "", department = "", designation = "", cabin = "";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection.createStatement();
					String data = "select * from teacher_record where teacher_id =" + key + "";
					ResultSet rs = statement.executeQuery(data);
					while (rs.next()) {
						id = rs.getInt("teacher_id");
						name = rs.getString("teacher_name");
						age = rs.getInt("teacher_age");
						mob = rs.getString("teacher_mob");
						email = rs.getString("teacher_mail");
						department = rs.getString("teacher_department");
						designation = rs.getString("teacher_designation");
						cabin = rs.getString("teacher_cabin");
						a.text_name_get.setText(name);
						a.text_age_get.setText(Integer.toString(age));
						a.text_id_get.setText(Integer.toString(id));
						a.text_mail_get.setText(email);
						a.text_mob_get.setText(mob);
						a.text_des_get.setText(designation);
						a.text_dep_get.setText(department);
						a.text_cab_get.setText(cabin);

					}

				} catch (Exception ex) {
					System.out.println("error");
				}
				mainpage1 b = new mainpage1();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_4.setBounds(570, 174, 159, 31);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_7 = new JButton("DELETE STUDENT");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int key = Integer.parseInt(textField.getText());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection
							.prepareStatement("delete from student.student_record where student_id =" + key + "");
					statement.executeUpdate("delete from student.student_record where student_id =" + key + "");
					JOptionPane.showMessageDialog(new JFrame(), "DATA DELETED SUCCESSFULLY", "Dialog",
							JOptionPane.ERROR_MESSAGE);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_7.setBounds(570, 217, 159, 27);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("DELETE TEACHER");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int key = Integer.parseInt(textField.getText());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection
							.prepareStatement("delete from student.teacher_record where teacher_id =" + key + "");
					statement.executeUpdate("delete from student.teacher_record where teacher_id =" + key + "");
					JOptionPane.showMessageDialog(new JFrame(), "DATA DELETED SUCCESSFULLY", "Dialog",
							JOptionPane.ERROR_MESSAGE);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_8.setBounds(570, 259, 159, 27);
		contentPane.add(btnNewButton_8);

	}
}
