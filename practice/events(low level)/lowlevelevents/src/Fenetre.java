import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {

    private JLabel statusLabel1 = new JLabel();
    private JLabel statusLabel2 = new JLabel();
    private TextField textField = new TextField(10);
    Font police = new Font("Tahoma", Font.BOLD, 15);

    public Fenetre(){
        
        this.setTitle("Button animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3, 1));
        statusLabel1.setFont(police);
        statusLabel1.setForeground(Color.RED);
        statusLabel1.setText("Le statut : ");
        textField.addKeyListener(new CustomKeyListener());
        this.getContentPane().add(textField); this.getContentPane().add(statusLabel1);
        this.getContentPane().add(statusLabel2); this.setVisible(true); 
    }

    class CustomKeyListener implements KeyListener
    {

        public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
        statusLabel1.setText("Entered text: " + textField.getText());
        } }
        public void keyReleased(KeyEvent e) {
        String text = textField.getText();
        String words[] = text.split("\\s");
        statusLabel2.setText("Words: " + words.length+" Characters:" + text.length());
        }
        public void keyTyped(KeyEvent e) { }
}
}