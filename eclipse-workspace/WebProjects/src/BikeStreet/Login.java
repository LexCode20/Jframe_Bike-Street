package BikeStreet;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUser;
    private JPasswordField passwordL;
    
	private String registeredName;
	private char[] registeredPassword;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login("", new char[0]);
                    frame.setVisible(true);
                    frame.setTitle("Login");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Login(String registeredName, char[] registeredPassword) {
    	this.registeredName = registeredName;
    	this.registeredPassword = registeredPassword;
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 416);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Use absolute positioning

        setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 192));
        panel.setBounds(0, 0, 436, 379);
        contentPane.add(panel);
        panel.setLayout(null); // Use absolute positioning

        JPanel panel_1 = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 30, 30));
                g2.dispose();
            }
        };
        panel_1.setBackground(new Color(136, 163, 252)); // Set background color of the rounded panel
        panel_1.setBounds(96, 50, 253, 280); // Set position and size
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblLogin = new JLabel("LOGIN");
        lblLogin.setForeground(new Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setBounds(0, 20, 253, 35);
        lblLogin.setBackground(new Color(240, 240, 240));
        lblLogin.setFont(new Font("Verdana", Font.BOLD, 28));
        panel_1.add(lblLogin);

        JLabel lblNewLabel = new JLabel("Usuario");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        lblNewLabel.setBounds(40, 75, 58, 13);
        panel_1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Senha");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(40, 132, 58, 13);
        panel_1.add(lblNewLabel_1);

        txtUser = new JTextField();
        txtUser.setBounds(40, 93, 178, 27);
        panel_1.add(txtUser);
        txtUser.setColumns(10);

        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBackground(new Color(255, 255, 255));
        btnEntrar.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica de login
            }
        });
        btnEntrar.setBounds(75, 198, 103, 35);
        panel_1.add(btnEntrar);

        JLabel lblRealizar = new JLabel("Realizar");
        lblRealizar.setForeground(new Color(255, 255, 255));
        lblRealizar.setBackground(new Color(136, 163, 252));
        lblRealizar.setFont(new Font("Verdana", Font.PLAIN, 15));
        lblRealizar.setBounds(49, 248, 80, 31);
        panel_1.add(lblRealizar);

        JButton btnCadastro = new JButton("Cadastro");
        btnCadastro.setForeground(new Color(255, 255, 255));
        btnCadastro.setBackground(new Color(136, 163, 252));
        btnCadastro.setFont(new Font("Verdana", Font.BOLD, 15));
        btnCadastro.setBounds(108, 253, 124, 21);
        btnCadastro.setBorder(null);
        panel_1.add(btnCadastro);

        passwordL = new JPasswordField();
        passwordL.setBounds(40, 150, 178, 27);
        panel_1.add(passwordL);

        // Add hover effect to buttons
        addHoverEffect(btnEntrar, new Color(220, 220, 220));
        addHoverEffect(btnCadastro, new Color(160, 190, 255));
        
        btnCadastro.addActionListener(e -> Cadastro());
        btnEntrar.addActionListener(e -> Entrar());
    }
    public void Cadastro() {
    	Cadastro frameCadastro = new Cadastro();
    	frameCadastro.setVisible(true);
    	frameCadastro.setTitle("Cadastro");
    	dispose();
    }
    public void Entrar() {
    	
    	String enteredName = txtUser.getText();
    	char [] enteredPassword = passwordL.getPassword();
    	
    	if(enteredName.isEmpty() || enteredPassword.length == 0) {
    		txtUser.setBackground(Color.YELLOW);
    		passwordL.setBackground(Color.YELLOW);
    		JOptionPane.showMessageDialog(null, "Preencha todos os campos");
    		txtUser.setBackground(Color.WHITE);
    		passwordL.setBackground(Color.WHITE);
    		txtUser.setText("");
    		passwordL.setText("");
    		return;
    	}else if(!registeredName.equals(enteredName)&& !java.util.Arrays.equals(registeredPassword, enteredPassword)) {
    		txtUser.setBackground(Color.RED);
    		passwordL.setBackground(Color.RED);
    		JOptionPane.showMessageDialog(null, "Nome e senha incorretos");
    		txtUser.setBackground(Color.WHITE);
    		passwordL.setBackground(Color.WHITE);
    		txtUser.setText("");
    		passwordL.setText("");
    		return;
    	}else if(!java.util.Arrays.equals(registeredPassword, enteredPassword)) {
    		txtUser.setBackground(Color.GREEN);
    		passwordL.setBackground(Color.RED);
    		JOptionPane.showMessageDialog(null, "Senha incorreta");
    		txtUser.setBackground(Color.WHITE);
    		passwordL.setBackground(Color.WHITE);
    		passwordL.setText("");
    		return;
    	}else if(!registeredName.equals(enteredName)) {
    		txtUser.setBackground(Color.RED);
    		passwordL.setBackground(Color.GREEN);
    		JOptionPane.showMessageDialog(null, "Nome incorreto");
    		txtUser.setBackground(Color.WHITE);
    		passwordL.setBackground(Color.WHITE);
    		txtUser.setText("");
    		return;
    	}else if(registeredName.equals(enteredName)&& java.util.Arrays.equals(registeredPassword, enteredPassword)) {
    		txtUser.setBackground(Color.GREEN);
    		passwordL.setBackground(Color.GREEN);
    		JOptionPane.showMessageDialog(null, "Login Realizado com sucesso");
    		txtUser.setBackground(Color.WHITE);
    		passwordL.setBackground(Color.WHITE);
    		Home homeFrame = new Home(enteredName, enteredPassword);
    		homeFrame.setVisible(true);
    		homeFrame.setTitle("Home");
    		
    	}
    	//JOptionPane.showMessageDialog(null, "Realize o Cadastro antes");
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
