package windows;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginV1 implements ActionListener {
	JButton btnName1;
	JButton btnName2;
	JButton btnPass1;
	JButton btnPass2;
	JButton btnSubmit;
	JButton btnClean;
	JButton btnLogin;
	JButton btnCancel;
	
	JLabel lblName;
	JLabel lblPass;
	
	JTextField txtName1;
	JTextField txtName2;
	JTextField txtUsername;
	
	JPasswordField Pass1;
	JPasswordField Pass2;
	JPasswordField password;
	
	JFrame frame;
	JFrame frame2;
	
	int Tentativa = 4;
	
	public LoginV1() {	
		frame = new JFrame();
		frame2 = new JFrame();
		frame.setSize(260,200);
		frame.setTitle("Autentication");
		frame2.setSize(260,200);
		frame2.setTitle("Validação");
		Container C = frame.getContentPane();
		Container C2 = frame2.getContentPane();
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		JPanel pane3 = new JPanel();
		JPanel pane4 = new JPanel();
		
		Font font = new Font("Arial", Font.ITALIC,12);
		C.setLayout(new GridLayout(1,2));
		C2.setLayout(new GridLayout(1,2));
		
		btnName1 = new JButton("Nome:");
		btnName2 = new JButton("<html>Confirmação<br>nome:</html>");
		btnPass1 = new JButton("Senha:");
		btnPass2 = new JButton("<html>Confirmação<br>nome:</html>");
		btnSubmit = new JButton("Enviar");
		btnClean = new JButton("Limpar");
		
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancelar");
		
		btnName1.setBackground(Color.WHITE);
		btnName2.setBackground(Color.WHITE);
		btnPass1.setBackground(Color.WHITE);
		btnPass2.setBackground(Color.WHITE);
		btnSubmit.setBackground(Color.YELLOW);
		btnClean.setBackground(Color.BLUE);
		
		btnLogin.setBackground(Color.BLUE);
		btnCancel.setBackground(Color.MAGENTA);
		
		btnName1.setMargin(new Insets(0,0,0,80));
		btnName2.setMargin(new Insets(0,0,0,110));
		btnPass1.setMargin(new Insets(0,0,0,80));
		btnPass2.setMargin(new Insets(0,0,0,110));
		
		btnName1.setFont(font);
		btnName2.setFont(font);
		btnPass1.setFont(font);
		btnPass2.setFont(font);
		btnSubmit.setFont(font);
		btnClean.setFont(font);
		
		btnLogin.setFont(font);
		btnCancel.setFont(font);
		
		lblName = new JLabel("User name");
		lblPass = new JLabel("Password");
		
		txtName1 = new JTextField("");
		txtName2 = new JTextField("");
		
		txtUsername = new JTextField("");
		
		btnSubmit.addActionListener(e -> ButtonEnviar());
		btnClean.addActionListener(e -> ButtonLimpar());
		
		btnLogin.addActionListener(e -> ButtonLogin());
		btnCancel.addActionListener(e -> ButtonCancel());
		
		Pass1 = new JPasswordField("");
		Pass2 = new JPasswordField("");
		
		password = new JPasswordField();
		
		C.add(pane1);
		C.add(pane2);
		
		C2.add(pane3);
		C2.add(pane4);
		
		pane1.setLayout(new GridLayout(5,1));
		pane1.add(btnName1);
		pane1.add(btnName2);
		pane1.add(btnPass1);
		pane1.add(btnPass2);
		pane1.add(btnSubmit);
		
		pane2.setLayout(new GridLayout(5,1));
		pane2.add(txtName1);
		pane2.add(txtName2);
		pane2.add(Pass1);
		pane2.add(Pass2);
		pane2.add(btnClean);
		
		pane3.setLayout(new GridLayout(3,1));
		pane3.add(lblName);
		pane3.add(lblPass);
		pane3.add(btnLogin);
		
		pane4.setLayout(new GridLayout(3,1));
		pane4.add(txtUsername);
		pane4.add(password);
		pane4.add(btnCancel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
	}
	public static void main(String[] args) {
		new LoginV1();
	}
	public void ButtonEnviar() {
		
		String comp1 = txtName1.getText();
		String comp2 = txtName2.getText();
		String comp3 = new String(Pass1.getPassword());
		String comp4 = new String(Pass2.getPassword());
		
		String Name = "alex";
		String Senha = "123";
		if(comp1.equals(Name) && comp2.equals(Name)  && comp3.equals(Senha) && comp4.equals(Senha)) {
			txtName1.setBackground(Color.GREEN);
			txtName2.setBackground(Color.GREEN);
			Pass1.setBackground(Color.GREEN);
			Pass2.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "Parametros corretos");
			
			frame.dispose();
			
			frame2.setVisible(true);
		}else {
			txtName1.setBackground(Color.RED);
			txtName2.setBackground(Color.RED);
			Pass1.setBackground(Color.RED);
			Pass2.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Parametros incorretos");
			txtName1.setBackground(Color.WHITE);
			txtName2.setBackground(Color.WHITE);
			Pass1.setBackground(Color.WHITE);
			Pass2.setBackground(Color.WHITE);
		}
	}
	public void ButtonLimpar() {
		txtName1.setText("");
		txtName2.setText("");
		Pass1.setText("");
		Pass2.setText("");
		txtName1.setBackground(Color.WHITE);
		txtName2.setBackground(Color.WHITE);
		Pass1.setBackground(Color.WHITE);
		Pass2.setBackground(Color.WHITE);
	}
	public void ButtonLogin() {
	
		String comp5 = txtUsername.getText();
		String comp6 = new String(password.getPassword());
		
		String UserName = "Admin";
		String Password = "321";
		do {
		
		if(comp5.equals(UserName) && comp6.equals(Password)) {
			txtUsername.setBackground(Color.GREEN);
			password.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "Login correto");
			frame2.dispose();
		}else {
				
			Tentativa--;
			
			txtUsername.setBackground(Color.RED);
			password.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Login Incorreto\nVoce tem mais "+Tentativa+" tentativas");
			txtUsername.setBackground(Color.WHITE);
			password.setBackground(Color.WHITE);
			txtUsername.setText("");
			password.setText("");
			if(Tentativa==0) {
				JOptionPane.showMessageDialog(null, "Limite de tentativas excedido\nAcesso bloqueado");
				frame2.dispose();
			}
		} 
		}while (Tentativa==0);
	}
	public void ButtonCancel() {
		txtUsername.setText("");
		password.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
