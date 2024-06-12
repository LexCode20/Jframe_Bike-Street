package windows;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class loginA implements ActionListener {
	JButton btnUsuario;
	JButton btnSenha;
	JButton btnOk;
	JButton btnCancelar;
	JTextField txtUsuario;
	JTextField txtSenha;
	
	public loginA() {
		JFrame frame = new JFrame();
		Container C = frame.getContentPane();
		frame.setSize(350,200);
		frame.setTitle("Login");
		
		
		//Criacao da font
		Font font = new Font("Arial", Font.ITALIC,12);
		Font font2 = new Font("Arial", Font.BOLD,30);
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		C.setLayout(new GridLayout(1,2));
		
		btnUsuario = new JButton("Usuario:");
		btnSenha = new JButton("Senha:");
		btnOk = new JButton("OK");
		btnCancelar = new JButton("Cancelar");
		
		txtUsuario = new JTextField("");
		txtSenha = new JTextField("");
		
		btnUsuario.setBackground(Color.WHITE);
		btnSenha.setBackground(Color.WHITE);
		btnOk.setBackground(Color.WHITE);
		btnCancelar.setBackground(Color.WHITE);
		
		btnUsuario.setMargin(new Insets(0,0,0,110));
		btnSenha.setMargin(new Insets(0,0,0,120));
		
		//pegando a font
		btnUsuario.setFont(font);
		btnSenha.setFont(font);
		btnCancelar.setFont(font2);
		btnOk.setFont(font2);
		
		btnOk.addActionListener(e -> ButtonOK());
		btnCancelar.addActionListener(e -> ButtonCancelar());
		
		C.add(pane1);
		C.add(pane2);
		
		pane1.setLayout(new GridLayout(3,1));
		pane1.add(btnUsuario);
		pane1.add(btnSenha);
		pane1.add(btnOk);
		
		pane2.setLayout(new GridLayout(3,1));
		pane2.add(txtUsuario);
		pane2.add(txtSenha);
		pane2.add(btnCancelar);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	public static void main(String[] args) {
		new loginA();
	}
	public void ButtonOK() {
		String comp1 = txtUsuario.getText();
		String comp2 = txtSenha.getText();
		
		String Usuario = "Alex";
		String Senha = "123";
		
		if(comp1.equals(Usuario) && comp2.equals(Senha)) {
			txtUsuario.setBackground(Color.GREEN);
			txtSenha.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "Login Validado!");
		}else {
			txtUsuario.setBackground(Color.RED);
			txtSenha.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Login Incorreto!");
		}
	}
	public void ButtonCancelar() {
		txtUsuario.setText("");
		txtSenha.setText("");
		txtUsuario.setBackground(Color.WHITE);
		txtSenha.setBackground(Color.WHITE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
