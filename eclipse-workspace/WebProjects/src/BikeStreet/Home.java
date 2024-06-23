package BikeStreet;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Home extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private static String enteredName;
    private static char[] enteredPassword;
    private JTextField txtEmail;
    //aramazenando o nome e senha de login para que quando o usuario for voltar para a tela de login ainda consiga fazer o login com a mesma senha
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home("", new char[0]);
                    frame.setVisible(true);
                    frame.setTitle("Home");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Home(String enteredName, char[] enteredPassword) {
    	this.enteredName = enteredName;
    	this.enteredPassword = enteredPassword;
        // Initialize contentPane
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(255, 128, 192)));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(null);
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(200, 127, 500, 333);
        contentPane.add(panel);
        
      //carregando e pegando a imagem no label
        ImageIcon imagem = new ImageIcon(getClass().getResource("background.jpg"));
        JLabel imagemLabel = new JLabel(imagem);
        imagemLabel.setBounds(0, 0, 886, 75); // Ajuste as dimensões conforme necessário
        panel.add(imagemLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(null);
        panel_1.setBackground(new Color(255, 128, 192));
        panel_1.setBounds(0, 0, 886, 75);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.setOpaque(false);
        btnLogin.setBounds(495, 26, 85, 21);
        panel_1.add(btnLogin);
        btnLogin.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnLogin.setBorder(null);
        btnLogin.setBackground(new Color(255, 255, 255));
        
        JButton btnBicicletas = new JButton("Bicicletas");
        btnBicicletas.setForeground(new Color(255, 255, 255));
        btnBicicletas.setOpaque(false);
        btnBicicletas.setBounds(591, 26, 95, 21);
        panel_1.add(btnBicicletas);
        btnBicicletas.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnBicicletas.setBorder(null);
        btnBicicletas.setBackground(new Color(255, 255, 255));
        
        JButton btnSobre = new JButton("Sobre Nos");
        btnSobre.setForeground(new Color(255, 255, 255));
        btnSobre.setOpaque(false);
        btnSobre.setBounds(696, 26, 85, 21);
        panel_1.add(btnSobre);
        btnSobre.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnSobre.setBorder(null);
        btnSobre.setBackground(new Color(255, 255, 255));
        
        JButton btnContato = new JButton("Contato");
        btnContato.setForeground(new Color(255, 255, 255));
        btnContato.setOpaque(false);
        btnContato.setBounds(791, 26, 85, 21);
        panel_1.add(btnContato);
        btnContato.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnContato.setBorder(null);
        btnContato.setBackground(new Color(255, 255, 255));
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 557, 886, 156);
        contentPane.add(panel_2);
        
        JLabel lblAssine = new JLabel("Assine");
        lblAssine.setForeground(new Color(255, 128, 192));
        lblAssine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblAssine.setHorizontalAlignment(SwingConstants.CENTER);
        lblAssine.setBounds(409, 470, 69, 13);
        contentPane.add(lblAssine);
        
        txtEmail = new JTextField();
        txtEmail.setToolTipText("email");
        txtEmail.setFont(new Font("Verdana", Font.PLAIN, 10));
        txtEmail.setText("EMAIL");
        txtEmail.setForeground(new Color(255, 128, 192));
        txtEmail.setBounds(296, 526, 159, 21);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);
        
        JButton btnCadastro = new JButton("CADASTRAR");
        btnCadastro.setBorder(null);
        btnCadastro.setFont(new Font("Verdana", Font.PLAIN, 10));
        btnCadastro.setForeground(new Color(255, 255, 255));
        btnCadastro.setBackground(new Color(255, 128, 192));
        btnCadastro.setBounds(465, 526, 100, 21);
        contentPane.add(btnCadastro);
        
        JLabel lbl_ = new JLabel("___________________");
        lbl_.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_.setForeground(new Color(255, 128, 192));
        lbl_.setBackground(new Color(255, 128, 192));
        lbl_.setBounds(383, 503, 127, 13);
        contentPane.add(lbl_);
        
        JLabel lblNewLabel = new JLabel("Cadastre-se na nossa página para ter benefícios exclusivos");
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
        lblNewLabel.setForeground(new Color(255, 128, 192));
        lblNewLabel.setBackground(new Color(255, 128, 192));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(261, 493, 371, 13);
        contentPane.add(lblNewLabel);
        btnContato.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        btnLogin.addActionListener(e -> Login());
        btnCadastro.addActionListener(e -> Cadastro());
        // Load and set background image
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 750);
    }
    public void Login() {
    	Login loginFrame = new Login(enteredName, enteredPassword);
    	loginFrame.setVisible(true);
    	loginFrame.setTitle("Login");
    	
    	dispose();
    }
    public void Cadastro() {
    	Cadastro frameCadastro = new Cadastro();
    	frameCadastro.setVisible(true);
    	frameCadastro.setTitle("Cadastro");
    	dispose();
    }
}
