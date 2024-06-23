package BikeStreet;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Home extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private static String enteredName;
    private static char[] enteredPassword;
    private JTextField txtEmail;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home("", new char[0]);
                    frame.setVisible(true);
                    frame.setTitle("Home");
                    ImageIcon icon = new ImageIcon(Main.class.getResource("favicon.png"));
                    Image image = icon.getImage();
                    frame.setIconImage(image);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Home(String enteredName, char[] enteredPassword) {
        this.enteredName = enteredName;
        this.enteredPassword = enteredPassword;

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

        ImageIcon imagem = new ImageIcon(getClass().getResource("background.jpg"));
        panel.setLayout(null);
        JLabel imagemLabel = new JLabel(imagem);
        imagemLabel.setBounds(0, 0, 500, 333);
        panel.add(imagemLabel);

        JPanel panelHeader = new JPanel();
        panelHeader.setBorder(null);
        panelHeader.setBackground(new Color(255, 128, 192));
        panelHeader.setBounds(0, 0, 886, 75);
        contentPane.add(panelHeader);
        panelHeader.setLayout(null);

        JButton btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.setOpaque(false);
        btnLogin.setBounds(495, 26, 85, 21);
        panelHeader.add(btnLogin);
        btnLogin.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnLogin.setBorder(null);
        btnLogin.setBackground(new Color(255, 255, 255));

        JButton btnBicicletas = new JButton("Bicicletas");
        btnBicicletas.setForeground(new Color(255, 255, 255));
        btnBicicletas.setOpaque(false);
        btnBicicletas.setBounds(578, 26, 95, 21);
        panelHeader.add(btnBicicletas);
        btnBicicletas.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnBicicletas.setBorder(null);
        btnBicicletas.setBackground(new Color(255, 255, 255));

        JButton btnSobre = new JButton("Sobre Nos");
        btnSobre.setForeground(new Color(255, 255, 255));
        btnSobre.setOpaque(false);
        btnSobre.setBounds(683, 26, 85, 21);
        panelHeader.add(btnSobre);
        btnSobre.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnSobre.setBorder(null);
        btnSobre.setBackground(new Color(255, 255, 255));

        JButton btnContato = new JButton("Contato");
        btnContato.setForeground(new Color(255, 255, 255));
        btnContato.setOpaque(false);
        btnContato.setBounds(778, 26, 85, 21);
        panelHeader.add(btnContato);
        btnContato.setFont(new Font("Verdana", Font.PLAIN, 15));
        btnContato.setBorder(null);
        btnContato.setBackground(new Color(255, 255, 255));

        JPanel panelLogo = new JPanel();
        panelLogo.setBackground(new Color(255, 128, 192));
        panelLogo.setBounds(10, 10, 50, 50);
        panelHeader.add(panelLogo);

        ImageIcon imagem2 = new ImageIcon(getClass().getResource("logo.png"));
        Image img2 = imagem2.getImage();
        Image newimg2 = img2.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionada2 = new ImageIcon(newimg2);
        panelLogo.setLayout(null);
        JLabel imagemLabel2 = new JLabel(imagemRedimensionada2);
        imagemLabel2.setBounds(0, 0, 50, 50);
        panelLogo.add(imagemLabel2);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 128, 192));
        panel_2.setBounds(0, 638, 886, 75);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Todos os direitos reservados - Bike Street 2024");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(0, 38, 886, 14);
        lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        panel_2.add(lblNewLabel_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 128, 192));
        panel_1.setBounds(374, 10, 130, 25);
        panel_2.add(panel_1);
        panel_1.setLayout(null);
        
        ImageIcon imagemFb = new ImageIcon(getClass().getResource("facebook.png"));
        Image imgfb = imagemFb.getImage();
        Image newimgfb = imgfb.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaFb = new ImageIcon(newimgfb);
        
        ImageIcon imagemIn = new ImageIcon(getClass().getResource("instagram.png"));
        Image imgIn = imagemIn.getImage();
        Image newimgIn = imgIn.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaIn = new ImageIcon(newimgIn);
        
        ImageIcon imagemGi = new ImageIcon(getClass().getResource("github.png"));
        Image imgGi = imagemGi.getImage();
        Image newimgGi = imgGi.getScaledInstance(27, 27, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGi = new ImageIcon(newimgGi);
        
        ImageIcon imagemTi = new ImageIcon(getClass().getResource("tiktok.png"));
        Image imgTi = imagemTi.getImage();
        Image newimgTi = imgTi.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaTi = new ImageIcon(newimgTi);
        
        JLabel lblfacebook = new JLabel(imagemRedimensionadaFb);
        lblfacebook.setBounds(0, 0, 25, 25);
        panel_1.add(lblfacebook);
        
        JLabel lblInstagram = new JLabel(imagemRedimensionadaIn);
        lblInstagram.setBounds(35, 0, 25, 25);
        panel_1.add(lblInstagram);
        
        JLabel lblTiktok = new JLabel(imagemRedimensionadaTi);
        lblTiktok.setBounds(70, 0, 25, 25);
        panel_1.add(lblTiktok);
        
        JLabel lblGithub = new JLabel(imagemRedimensionadaGi);
        lblGithub.setBounds(105, 0, 25, 25);
        panel_1.add(lblGithub);

        JLabel lblAssine = new JLabel("Assine");
        lblAssine.setForeground(new Color(255, 128, 192));
        lblAssine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblAssine.setHorizontalAlignment(SwingConstants.CENTER);
        lblAssine.setBounds(409, 520, 69, 13);
        contentPane.add(lblAssine);

        txtEmail = new JTextField();
        txtEmail.setToolTipText("email");
        txtEmail.setFont(new Font("Verdana", Font.PLAIN, 10));
        txtEmail.setText("EMAIL");
        txtEmail.setForeground(new Color(255, 128, 192));
        txtEmail.setBounds(296, 600, 159, 21);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);

        JButton btnCadastro = new JButton("CADASTRAR");
        btnCadastro.setBorder(null);
        btnCadastro.setFont(new Font("Verdana", Font.PLAIN, 10));
        btnCadastro.setForeground(new Color(255, 255, 255));
        btnCadastro.setBackground(new Color(255, 128, 192));
        btnCadastro.setBounds(465, 600, 100, 21);
        contentPane.add(btnCadastro);


        addHoverEffect(btnLogin, new Color(220, 220, 220));
        addHoverEffect(btnBicicletas, new Color(220, 220, 220));
        addHoverEffect(btnSobre, new Color(220, 220, 220));
        addHoverEffect(btnContato, new Color(220, 220, 220));
        addHoverEffect(btnCadastro, new Color(255, 179, 217));
        

        JLabel lbl_ = new JLabel("___________________");
        lbl_.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_.setForeground(new Color(255, 128, 192));
        lbl_.setBackground(new Color(255, 128, 192));
        lbl_.setBounds(383, 570, 127, 13);
        contentPane.add(lbl_);

        JLabel lblNewLabel = new JLabel("Cadastre-se na nossa página para ter benefícios exclusivos");
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
        lblNewLabel.setForeground(new Color(255, 128, 192));
        lblNewLabel.setBackground(new Color(255, 128, 192));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(261, 550, 371, 13);
        contentPane.add(lblNewLabel);

        btnLogin.addActionListener(e -> Login());
        btnBicicletas.addActionListener(e -> Bicicletas());
        btnCadastro.addActionListener(e -> Cadastro());
        btnContato.addActionListener(e -> Contato());
        btnSobre.addActionListener(e -> Sobre());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 750);
    }

    private void addHoverEffect(JButton button, Color hoverColor) {
        Color originalColor = button.getForeground();
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(originalColor);
            }
        });
    }

    public void Login() {
        Login loginFrame = new Login(enteredName, enteredPassword);
        loginFrame.setVisible(true);
        loginFrame.setTitle("Login");
        ImageIcon icon = new ImageIcon(Main.class.getResource("favicon.png"));
        Image image = icon.getImage();
        loginFrame.setIconImage(image);
        dispose();
    }

    public void Cadastro() {
        Cadastro frameCadastro = new Cadastro();
        frameCadastro.setVisible(true);
        frameCadastro.setTitle("Cadastro");
        ImageIcon icon = new ImageIcon(Main.class.getResource("favicon.png"));
        Image image = icon.getImage();
        frameCadastro.setIconImage(image);
        dispose();
    }

    public void Bicicletas() {
        // Implementação do método Bicicletas
    }

    public void Contato() {
        // Implementação do método Contato
    }

    public void Sobre() {
        // Implementação do método Sobre
    }
}
