import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fenetre {
    private JPanel panel;
    private char lastPressedKey;

    public fenetre() {
        JFrame frame = new JFrame("Fenetre");
        panel = new JPanel(null); 
        panel.setFocusable(true);
        panel.addKeyListener(new XListener());
        panel.addMouseListener(new MouseListener());
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class XListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            lastPressedKey = e.getKeyChar();
        }
    }

    class MouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            float x = e.getX();
            float y = e.getY();
            JLabel label = new JLabel();
            label.setBounds((int) x, (int) y,10,10);
            label.setText(String.valueOf(lastPressedKey));
            panel.add(label);
            panel.repaint(); 
        }
    }

    public static void main(String[] args) {
        new fenetre();
    }
}
