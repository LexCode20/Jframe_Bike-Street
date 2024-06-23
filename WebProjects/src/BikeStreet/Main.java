package BikeStreet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;

public class Main {
    public static void main(String[] args) {
        // Cria o JFrame
        JFrame frame = new JFrame("Exemplo de Favicon");
        
        // Carrega o ícone
        ImageIcon icon = new ImageIcon(Main.class.getResource("favicon.png"));
        Image image = icon.getImage();
        
        // Define o ícone do JFrame
        frame.setIconImage(image);
        
        // Configurações adicionais do JFrame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
