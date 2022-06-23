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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class getstudentdata extends JFrame {

	JPanel contentPane;
	JTextField textField;
	JTextField text_id_get;
	JTextField text_course_get;
	JTextField text_mail_get;
	JTextField text_mob_get;
	JTextField text_name_get;
	JTextField text_con_get;
	JTextField text_state_get;
	JTextField text_city_get;
	JTextField text_add_get;
	JTextField text_pcon_get;
	JTextField text_mother_get;
	JTextField text_father_get;
	JTextField text_age_get;
	JTextField text_roll_get;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getstudentdata frame = new getstudentdata();
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
	public getstudentdata() {
		setTitle("STUDENT INFO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel NewLabel = new JLabel("Student Record");
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

		text_roll_get = new JTextField();
		text_roll_get.setBounds(120, 96, 250, 25);
		contentPane.add(text_roll_get);
		text_roll_get.setColumns(10);

		text_age_get = new JTextField();
		text_age_get.setBounds(120, 132, 250, 25);
		contentPane.add(text_age_get);
		text_age_get.setColumns(10);

		text_mob_get = new JTextField();
		text_mob_get.setBounds(120, 168, 250, 25);
		contentPane.add(text_mob_get);
		text_mob_get.setColumns(10);

		text_mail_get = new JTextField();
		text_mail_get.setBounds(120, 204, 250, 25);
		contentPane.add(text_mail_get);
		text_mail_get.setColumns(10);

		text_course_get = new JTextField();
		text_course_get.setBounds(120, 240, 250, 25);
		contentPane.add(text_course_get);
		text_course_get.setColumns(10);

		text_id_get = new JTextField();
		text_id_get.setBounds(120, 276, 250, 25);
		contentPane.add(text_id_get);
		text_id_get.setColumns(10);

		text_father_get = new JTextField();
		text_father_get.setBounds(510, 60, 250, 25);
		contentPane.add(text_father_get);
		text_father_get.setColumns(10);

		text_mother_get = new JTextField();
		text_mother_get.setBounds(510, 96, 250, 25);
		contentPane.add(text_mother_get);
		text_mother_get.setColumns(10);

		text_pcon_get = new JTextField();
		text_pcon_get.setBounds(510, 132, 250, 25);
		contentPane.add(text_pcon_get);
		text_pcon_get.setColumns(10);

		text_add_get = new JTextField();
		text_add_get.setBounds(510, 168, 250, 25);
		contentPane.add(text_add_get);
		text_add_get.setColumns(10);

		text_city_get = new JTextField();
		text_city_get.setBounds(510, 204, 250, 25);
		contentPane.add(text_city_get);
		text_city_get.setColumns(10);

		text_state_get = new JTextField();
		text_state_get.setBounds(510, 240, 250, 25);
		contentPane.add(text_state_get);
		text_state_get.setColumns(10);

		text_con_get = new JTextField();
		text_con_get.setBounds(510, 276, 250, 25);
		contentPane.add(text_con_get);
		text_con_get.setColumns(10);

		text_name_get = new JTextField();
		text_name_get.setBounds(120, 60, 250, 25);
		contentPane.add(text_name_get);
		text_name_get.setColumns(10);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage1 a = new mainpage1();
				a.setVisible(true);

				getstudentdata b = new getstudentdata();
				b.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(329, 311, 127, 34);
		contentPane.add(btnNewButton);
	}
}
