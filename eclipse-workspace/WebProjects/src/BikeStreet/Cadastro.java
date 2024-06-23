package BikeStreet;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTell;
	private JPasswordField passwordC;

	private String registeredName = "";
	private char[] registeredPassword;
	private String registeredEmail = "";
	private String registeredTell = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frameCadastro = new Cadastro();
					frameCadastro.setVisible(true);
					frameCadastro.setTitle("Cadastro");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		panel.setBounds(0, 0, 436, 499);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(136, 163, 252));
		panel_1.setBounds(68, 62, 298, 381);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(new Color(255, 255, 255));
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 28));
		lblCadastro.setBounds(10, 10, 278, 43);
		panel_1.add(lblCadastro);
		
		JLabel lblName = new JLabel("Nome de Usuário");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblName.setBounds(44, 79, 147, 13);
		panel_1.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblEmail.setBounds(44, 139, 147, 13);
		panel_1.add(lblEmail);
		
		JLabel lblTell = new JLabel("Telefone");
		lblTell.setForeground(new Color(255, 255, 255));
		lblTell.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblTell.setBounds(44, 199, 147, 13);
		panel_1.add(lblTell);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblSenha.setBounds(44, 259, 147, 13);
		panel_1.add(lblSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(44, 102, 219, 27);
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(44, 162, 219, 27);
		panel_1.add(txtEmail);
		
		txtTell = new JTextField();
		txtTell.setColumns(10);
		txtTell.setBounds(44, 222, 219, 27);
		panel_1.add(txtTell);
		
		passwordC = new JPasswordField();
		passwordC.setBounds(44, 282, 219, 27);
		panel_1.add(passwordC);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBorder(null);
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnCadastrar.setBounds(90, 325, 128, 35);
		panel_1.add(btnCadastrar);
		
		btnCadastrar.addActionListener(e -> Cadastrar());
		
		addHoverEffect(btnCadastrar, new Color(220, 220, 220));
	}
	public void Cadastrar() {
		registeredName = txtNome.getText();
		registeredPassword = passwordC.getPassword();
		registeredEmail = txtEmail.getText();
		registeredTell = txtTell.getText();
		
		if(registeredName.isEmpty() || registeredPassword.length == 0 || registeredEmail.isEmpty() || registeredTell.isEmpty()) {
			txtNome.setBackground(Color.YELLOW);
			passwordC.setBackground(Color.YELLOW);
			txtEmail.setBackground(Color.YELLOW);
			txtTell.setBackground(Color.YELLOW);
			JOptionPane.showMessageDialog(null, "preencha todos os campos");
			txtNome.setBackground(Color.WHITE);
			passwordC.setBackground(Color.WHITE);
			txtEmail.setBackground(Color.WHITE);
			txtTell.setBackground(Color.WHITE);
			return;
		}else {
			txtNome.setBackground(Color.GREEN);
			passwordC.setBackground(Color.GREEN);
			txtEmail.setBackground(Color.GREEN);
			txtTell.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso");
			txtNome.setBackground(Color.WHITE);
			passwordC.setBackground(Color.WHITE);
			txtEmail.setBackground(Color.WHITE);
			txtTell.setBackground(Color.WHITE);
			Login loginFrame = new Login(registeredName, registeredPassword);
			loginFrame.setVisible(true);
			loginFrame.setTitle("Login");
			dispose();
		}
	}

	private void addHoverEffect(JButton button, Color hoverColor) {
		Color originalColor = button.getBackground();
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(hoverColor);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(originalColor);
			}
		});
	}
}
