package br.com.rcc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tx1;
	private JPasswordField tx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setTitle("LOGIN");
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(380, 24, 255, 154);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tx1 = new JTextField();
		tx1.setBounds(32, 34, 191, 20);
		panel.add(tx1);
		tx1.setColumns(10);
		
		JLabel lblLogin = new JLabel("User");
		lblLogin.setBounds(109, 11, 36, 14);
		panel.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(104, 65, 46, 14);
		panel.add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			if(tx1.getText().equals("rafael") && tx2.getText().equals("rafael")){
				JOptionPane.showMessageDialog(null, "Logado");
			}else{
				JOptionPane.showMessageDialog(null, "USUÁRIO ERRADO");
			}
				
				
				
			}
		});
		btnEntrar.setBounds(87, 116, 89, 23);
		panel.add(btnEntrar);
		
		tx2 = new JPasswordField();
		tx2.setBounds(32, 85, 191, 20);
		panel.add(tx2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/001.png")));
		lblNewLabel.setBounds(10, 11, 625, 450);
		contentPane.add(lblNewLabel);
	}
}
