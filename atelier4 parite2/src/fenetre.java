import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class fenetre {
    private JPanel panel;

    public fenetre() {
        JFrame frame = new JFrame("Fenetre");
        panel = new JPanel();
        panel.setFocusable(true); 
        panel.addKeyListener(new XListener()); 
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class XListener implements KeyListener { 

        private boolean altPressed = false;
        private boolean ctrlPressed = false;
        private boolean rPressed = false;
        private boolean bPressed = false;
        private boolean yPressed = false;
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ALT)
                altPressed = true;
            else if (e.getKeyCode() == KeyEvent.VK_CONTROL)
                ctrlPressed = true;
            else if (e.getKeyCode() == KeyEvent.VK_R)
                rPressed = true;
            else if (e.getKeyCode() == KeyEvent.VK_B)
                bPressed = true;
            else if (e.getKeyCode() == KeyEvent.VK_Y)
                yPressed = true;

            if (altPressed && ctrlPressed && rPressed) {
                panel.setBackground(Color.RED);
            }
            if (altPressed && ctrlPressed && bPressed) {
                panel.setBackground(Color.BLUE);
            }
            if (altPressed && ctrlPressed && yPressed) {
                panel.setBackground(Color.YELLOW);
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ALT)
                altPressed = false;
            else if (e.getKeyCode() == KeyEvent.VK_CONTROL)
                ctrlPressed = false;
            else if (e.getKeyCode() == KeyEvent.VK_R)
                rPressed = false;
            else if (e.getKeyCode() == KeyEvent.VK_B)
                bPressed = false;
            else if (e.getKeyCode() == KeyEvent.VK_Y)
                yPressed = false;
            }
        }
    }