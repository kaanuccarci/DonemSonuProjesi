import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class GirisFormu extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisFormu frame = new GirisFormu();
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
	public GirisFormu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 464);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Giriş Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnNewButton.setBounds(261, 276, 111, 30);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(198, 115, 232, 47);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(198, 183, 232, 47);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblNewLabel.setBounds(142, 131, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblifre = new JLabel("Şifre :");
		lblifre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblifre.setBounds(142, 199, 46, 14);
		contentPane.add(lblifre);
		
		JLabel lblNewLabel_1 = new JLabel("Devlet Hastanesine Hoş Geldiniz!");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		lblNewLabel_1.setBounds(161, 11, 327, 62);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Şifremi Unuttum");
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnNewButton_1.setBounds(378, 280, 130, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Henüz Kayıt Olmadınız Mı?");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblNewLabel_2.setBounds(113, 321, 148, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Kayıt Ol");
		btnNewButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(271, 317, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Doktor Girişi");
		btnNewButton_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnNewButton_3.setBounds(518, 391, 117, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sekreter Girişi");
		btnNewButton_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnNewButton_4.setBounds(391, 391, 117, 23);
		contentPane.add(btnNewButton_4);
	}
}
