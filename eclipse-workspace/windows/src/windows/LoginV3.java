package windows;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginV3 implements ActionListener {
	JLabel lblNomeu;
	JLabel lblSenhau;

	JTextField txtNomeu;
	
	JPasswordField passSenhau;	
	
	JButton btnLogin;
	JButton btnLimpar;
	JButton btnCadastro;
	
	JFrame frame;
	JFrame frame2;
	//----TELA CADASTRO!!!!!
	
	JLabel lblsenhaC;
	JLabel lblnomeUsuarioC;
	JLabel lblperfilC;
	
	JTextField txtNomeC;
	
	JPasswordField passSenhaC;
	
	JButton btnLoginC;
	JButton btnLimparC;
	JButton btnCadastroC;
	
	String[] Perfis = {"Administrador", "Tecnico", "Comun"};
	JComboBox cb = new JComboBox(Perfis);
	//Armazenando login
	private String registeredName = "ADM";
	private String registeredPass = "";
	
	//private armazenando cadastro
	private String registeredNameC = "";
	private String registeredPassC = "";
	
	private String storageName = "";
	private String storagePass = "";
	private String storageProfile = "";
	
	int Tentativa = 4;
	int Tentativa2 = 2;
	
	public LoginV3() {
		//Frame login
		frame = new JFrame();
		frame.setSize(300,200);
		frame.setTitle("Login");
		Container C = frame.getContentPane();
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		//frame Cadastro
		frame2 = new JFrame();
		frame2 = new JFrame();
		frame2.setSize(300,200);
		frame2.setTitle("Cadastro");
		Container C2 = frame2.getContentPane();
		JPanel pane3 = new JPanel();
		JPanel pane4 = new JPanel();
		
		//Cadastro perfis with combobox
		cb.setBounds(50,50,90,20);
		
		//Label login
		lblNomeu = new JLabel("Nome:");
		lblSenhau = new JLabel("Senha:");
		
		//Label Cadastro
		lblnomeUsuarioC = new JLabel("Nome usuario");
		lblsenhaC = new JLabel("Senha");
		lblperfilC = new JLabel("Perfil");
		
		//Textfield nome Login
		txtNomeu = new JTextField("");
		//Passwordfield
		passSenhau = new JPasswordField("");
		
		//Textfield nome Cadastro
		txtNomeC = new JTextField(null);
		
		//Password Cadastro
		passSenhaC = new JPasswordField();
		
		//Buttons login
		btnLogin = new JButton("Login");
		btnLimpar = new JButton("Limpar");
		btnCadastro = new JButton("Cadastro");
		
		//Buttons cadastro
		btnCadastroC = new JButton("Cadastrar");
		btnLimparC = new JButton("Limpar");
		btnLoginC = new JButton("Login");
		
		//Perfis = new JComboBox();
		
		//Action buttons login
		btnCadastro.addActionListener(e -> ButtonCadastro());
		btnLimpar.addActionListener(e -> ButtonLimpar());
		btnLogin.addActionListener(e -> ButtonLogar());
		
		btnLogin.setEnabled(!registeredPass.equals(""));
		
		//Action buttons Cadastro
		btnCadastroC.addActionListener(e -> ButtonCadastrarC());
		btnLimparC.addActionListener(e -> ButtonLimparC());
		btnLoginC.addActionListener(e -> ButtonLoginC());
		
		//pane login
		pane1.setLayout(new GridLayout(2,2));
		pane1.add(lblNomeu);
		pane1.add(txtNomeu);
		pane1.add(lblSenhau);
		pane1.add(passSenhau);
		
		//pane 2 login
		pane2.setLayout(new GridLayout(1,3));
		pane2.add(btnLogin);
		pane2.add(btnLimpar);
		pane2.add(btnCadastro);
		
		//Container tela login
		C.setLayout(new GridLayout(2,1));
		C.add(pane1);
		C.add(pane2);
		
		//pane3 Cadastrar
		pane3.setLayout(new GridLayout(3,3));
		pane3.add(lblnomeUsuarioC);
		pane3.add(txtNomeC);
		pane3.add(lblperfilC);
		pane3.add(cb);		
		pane3.add(lblsenhaC);
		pane3.add(passSenhaC);
		passSenhaC.setEnabled(false);
		
		//pane4 Cadastrar
		pane4.setLayout(new GridLayout(1,3));
		pane4.add(btnCadastroC);
		pane4.add(btnLimparC);
		pane4.add(btnLoginC);
		
		//Container tela Cadastro
		C2.setLayout(new GridLayout(2,1));
		C2.add(pane3);
		C2.add(pane4);
		
		//activate logins frames
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JOptionPane.showMessageDialog(null,"Cadastre o perfil: ADM");
	}
	public static void main(String[] args) {
		new LoginV3();
	}
	public void ButtonCadastro() {	
		
		String nomeuText = txtNomeu.getText();
		String senhaText = new String(passSenhau.getPassword());
		if(nomeuText.equals("")&& senhaText.equals("")) {
			txtNomeu.setBackground(Color.YELLOW);
			passSenhau.setBackground(Color.YELLOW);
			JOptionPane.showMessageDialog(null,"Voce esta tentando cadastrar com campos vazio\nTente novamente");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			return ;
		}else if(nomeuText.equals(registeredName) && senhaText.equals("")){
			txtNomeu.setBackground(Color.GREEN);
			passSenhau.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "O campo senha nao pode ser vazio.");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			return;
		}
		else if(nomeuText.equals(registeredName)) {
			registeredPass = senhaText;
			txtNomeu.setBackground(Color.GREEN);
			passSenhau.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null,"Cadastro relizado com sucesso!");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			txtNomeu.setText("");
			passSenhau.setText("");
			btnLogin.setEnabled(true);
			return;
		}else {
			txtNomeu.setBackground(Color.RED);
			passSenhau.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null,"Algo de errado com o seu cadastro\nTente novamente");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			txtNomeu.setText("");
			passSenhau.setText("");		
		}
		if(nomeuText != registeredName) {
			txtNomeu.setBackground(Color.RED);
			passSenhau.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nao existe o usuario cadastrado!");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			return;
		}
	}
	public void ButtonLogar() {
		String nomeuText = txtNomeu.getText();
		String senhaText = new String(passSenhau.getPassword());
		if(nomeuText.equals("")&& senhaText.equals("")) {
			txtNomeu.setBackground(Color.YELLOW);
			passSenhau.setBackground(Color.YELLOW);
			JOptionPane.showMessageDialog(null, "Campos vazios\nPor favor insira o nome e a senha do usuario");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			return;
		}
		if(registeredPass.equals("") && registeredName.equals("")) {
			JOptionPane.showMessageDialog(null, "Faca o cadastro antes");
			return ;
		}
		do {
		if(nomeuText.equals(registeredName) && senhaText.equals(registeredPass)) {
			txtNomeu.setBackground(Color.GREEN);
			passSenhau.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null,"Login foi validado!");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			txtNomeu.setText("");
			passSenhau.setText("");
			frame.dispose();
			frame2.setVisible(true);
			frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			return;
		}else {
			Tentativa--;
			txtNomeu.setBackground(Color.RED);
			passSenhau.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null,"Algo de errado com o seu Login\nVoce tem mais "+Tentativa+" tentativas!");
			txtNomeu.setBackground(Color.WHITE);
			passSenhau.setBackground(Color.WHITE);
			txtNomeu.setText("");
			passSenhau.setText("");
			if(Tentativa==0) {
				JOptionPane.showMessageDialog(null,"Limite de tentativas excedido\nAcesso bloqueado!");
				frame.dispose();
				return ;
			}
			}
		}while(Tentativa==0);
	}
	public void ButtonLimpar() {
		txtNomeu.setText("");
		passSenhau.setText("");
	}
	public void ButtonCadastrarC() {
		String nomecText = txtNomeC.getText();
		String senhacText = new String (passSenhaC.getPassword());
		String perfilText = (String) cb.getSelectedItem();

		if(registeredNameC.equals("")) {
			registeredNameC = nomecText;
			JOptionPane.showMessageDialog(null,"Digite novamente o nome");
			txtNomeC.setText("");
			}else if(nomecText.equals(registeredNameC)) {
				storageName = registeredNameC;
				passSenhaC.setEnabled(true);
				txtNomeC.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(null,"Nome confirmado");
				txtNomeC.setBackground(Color.WHITE);
				lblnomeUsuarioC.setText(nomecText);
				JOptionPane.showMessageDialog(null, "Agora informe a senha");
				txtNomeC.setEnabled(false);
				txtNomeC.setText("");
				return;
			}else if(registeredPassC.equals("")) {
				registeredPassC = senhacText;
				JOptionPane.showMessageDialog(null, "Digite novamente a senha");
				passSenhaC.setText("");
			}else if(!senhacText.equals(registeredPassC)) {
				passSenhaC.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "Senha divergente da primeira");
				passSenhaC.setBackground(Color.WHITE);
				passSenhaC.setText("");
			}else if(senhacText.equals(registeredPassC)) {
				storagePass = registeredPassC;
				storageProfile = perfilText;
				passSenhaC.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!");
				JOptionPane.showMessageDialog(null, "Seu Nome: "+storageName+"\nSua Senha: "+storagePass+ "\nSeu Perfil: "+storageProfile);
				passSenhaC.setBackground(Color.WHITE);
				passSenhaC.setText("");
				txtNomeC.setEnabled(true);
				passSenhaC.setEnabled(false);
				return;
			}
		}
	public void ButtonLoginC() {
		if(storageName == registeredNameC && storagePass == registeredPassC){
				frame2.dispose();
				frame.setVisible(true);
			}
	}
	public void ButtonLimparC() {
		txtNomeC.setText("");
		passSenhaC.setText("");
		cb.setSelectedIndex(0);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	}
}