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

public class setstudentdata extends JFrame {

	JPanel contentPane;
	JTextField textField;
	JTextField text_id;
	JTextField text_course;
	JTextField text_mail;
	JTextField text_mob;
	JTextField text_name;
	JTextField text_con;
	JTextField text_state;
	JTextField text_city;
	JTextField text_add;
	JTextField text_pcon;
	JTextField text_mother;
	JTextField text_father;
	JTextField text_age;
	JTextField text_roll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setstudentdata frame = new setstudentdata();
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
	public setstudentdata() {
		setTitle("STUDENT RECORD ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel NewLabel = new JLabel(" Enter the Student Record");
		NewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setOpaque(true);
		NewLabel.setBounds(0, 0, 784, 34);
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
		label_mob.setBounds(10, 167, 100, 25);
		contentPane.add(label_mob);

		JLabel label_mail = new JLabel(" Email:");
		label_mail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_mail.setBounds(10, 203, 100, 25);
		contentPane.add(label_mail);

		JLabel label_roll = new JLabel(" Roll No:");
		label_roll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_roll.setBounds(10, 95, 100, 25);
		contentPane.add(label_roll);

		JLabel label_course = new JLabel(" Course:");
		label_course.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_course.setBounds(10, 239, 100, 25);
		contentPane.add(label_course);

		JLabel label_id = new JLabel(" Student ID:");
		label_id.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_id.setBounds(10, 275, 100, 25);
		contentPane.add(label_id);

		JLabel label_father = new JLabel("Father's Name:");
		label_father.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_father.setBounds(380, 59, 120, 25);
		contentPane.add(label_father);

		JLabel label_mother = new JLabel("Mother's Name:");
		label_mother.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_mother.setBounds(380, 95, 120, 25);
		contentPane.add(label_mother);

		JLabel label_add = new JLabel("Address:");
		label_add.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_add.setBounds(380, 167, 120, 25);
		contentPane.add(label_add);

		JLabel label_city = new JLabel("City :");
		label_city.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_city.setBounds(380, 203, 120, 25);
		contentPane.add(label_city);

		JLabel label_state = new JLabel("State:");
		label_state.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_state.setBounds(380, 239, 120, 25);
		contentPane.add(label_state);

		JLabel label_con = new JLabel("Country:");
		label_con.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_con.setBounds(380, 275, 120, 25);
		contentPane.add(label_con);

		JLabel label_pcon = new JLabel("Parent's Contact:");
		label_pcon.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_pcon.setBounds(380, 131, 120, 25);
		contentPane.add(label_pcon);

		text_roll = new JTextField();
		text_roll.setBounds(120, 96, 250, 25);
		contentPane.add(text_roll);
		text_roll.setColumns(10);

		text_age = new JTextField();
		text_age.setBounds(120, 132, 250, 25);
		contentPane.add(text_age);
		text_age.setColumns(10);

		text_mob = new JTextField();
		text_mob.setBounds(120, 168, 250, 25);
		contentPane.add(text_mob);
		text_mob.setColumns(10);

		text_mail = new JTextField();
		text_mail.setBounds(120, 204, 250, 25);
		contentPane.add(text_mail);
		text_mail.setColumns(10);

		text_course = new JTextField();
		text_course.setBounds(120, 240, 250, 25);
		contentPane.add(text_course);
		text_course.setColumns(10);

		text_id = new JTextField();
		text_id.setBounds(120, 276, 250, 25);
		contentPane.add(text_id);
		text_id.setColumns(10);

		text_father = new JTextField();
		text_father.setBounds(510, 60, 250, 25);
		contentPane.add(text_father);
		text_father.setColumns(10);

		text_mother = new JTextField();
		text_mother.setBounds(510, 96, 250, 25);
		contentPane.add(text_mother);
		text_mother.setColumns(10);

		text_pcon = new JTextField();
		text_pcon.setBounds(510, 132, 250, 25);
		contentPane.add(text_pcon);
		text_pcon.setColumns(10);

		text_add = new JTextField();
		text_add.setBounds(510, 168, 250, 25);
		contentPane.add(text_add);
		text_add.setColumns(10);

		text_city = new JTextField();
		text_city.setBounds(510, 204, 250, 25);
		contentPane.add(text_city);
		text_city.setColumns(10);

		text_state = new JTextField();
		text_state.setBounds(510, 240, 250, 25);
		contentPane.add(text_state);
		text_state.setColumns(10);

		text_con = new JTextField();
		text_con.setBounds(510, 276, 250, 25);
		contentPane.add(text_con);
		text_con.setColumns(10);

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
				String roll = text_roll.getText();
				String mob = text_mob.getText();
				String mail = text_mail.getText();
				String course = text_course.getText();
				String father = text_father.getText();
				String mother = text_mother.getText();
				String pcon = text_pcon.getText();
				String add = text_add.getText();
				String city = text_city.getText();
				String state = text_state.getText();
				String con = text_con.getText();
				int age = Integer.parseInt(text_age.getText());
				int id = Integer.parseInt(text_id.getText());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root",
							"navin");
					Statement statement = connection.createStatement();
					String query = "INSERT INTO student_record(student_id,student_name,student_fname,student_mname,student_add,student_roll,student_course,student_mob,student_con,student_state,student_city,student_age,student_email,student_pcon) VALUES("
							+ id + ",'" + name + "','" + father + "','" + mother + "','" + add + "','" + roll + "','"
							+ course + "','" + mob + "','" + con + "','" + state + "','" + city + "'," + age + ",'"
							+ mail + "','" + pcon + "')";
					statement.executeUpdate(query);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
				}
				setstudentdata b = new setstudentdata();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(468, 316, 127, 34);
		contentPane.add(btnNewButton);

		JButton back = new JButton("BACK");
		back.setFont(new Font("Times New Roman", Font.BOLD, 15));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage1 a = new mainpage1();
				a.setVisible(true);

				setstudentdata b = new setstudentdata();
				b.setVisible(false);
				dispose();
			}
		});
		back.setBounds(201, 316, 112, 34);
		contentPane.add(back);
	}
}
