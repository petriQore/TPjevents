import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fenetre extends JFrame{
    private JButton bouton1 = new JButton("bouton 1");
    private JButton bouton2 = new JButton("bouton 2");
    private JPanel container = new JPanel();
    private JLabel label = new JLabel("Aucun Click !!");

    public fenetre(){
        this.setTitle("Animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        bouton1.addActionListener(new Bouton1Listener());
        bouton2.addActionListener(new Bouton2Listener());
        JPanel south = new JPanel();
        south.add(bouton1); south.add(bouton2);
        container.add(south, BorderLayout.SOUTH);
        Font police = new Font("Tahoma", Font.BOLD, 16);
        label.setFont(police);label.setForeground(Color.blue);
        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(label, BorderLayout.NORTH);
        this.setContentPane(container);
        this.setVisible(true);
    }

    class Bouton1Listener implements ActionListener {
        //Redéfinition de la méthode actionPerformed()
        public void actionPerformed(ActionEvent arg0) {
            label.setText("Vous avez cliqué sur le bouton 1");
        }
    }

    //Classe écoutant le second bouton
    class Bouton2Listener implements ActionListener {
        //Redéfinition de la méthode actionPerformed()
        public void actionPerformed(ActionEvent e) {
            label.setText("Vous avez cliqué sur le bouton 2");
        }
    }
}
