import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fenetre extends JFrame {
    JPanel cards = new JPanel(new CardLayout());
    JPanel container = new JPanel();
    //cards
    JPanel card1 = new JPanel();
    JPanel card2 = new JPanel();
    JPanel card3 = new JPanel();
    public Fenetre() {

        this.setTitle("CARDS"); this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        card1.setBackground(Color.ORANGE);
        card2.setBackground(Color.BLUE);
        card3.setBackground(Color.YELLOW);

        JPanel north =new JPanel();
        JButton b1 = new JButton("ORANGE");
        JButton b2 = new JButton("BLUE");
        JButton b3 = new JButton("YELLOW");
        north.add(b1); north.add(b2);north.add(b3);

        container.setLayout(new BorderLayout());
        container.add(north, BorderLayout.NORTH);
        cards.add(card1, "c1"); cards.add(card2, "c2"); cards.add(card3, "c3");
        container.add(cards, BorderLayout.CENTER);

        b1.addActionListener(new Card1Action());
        b2.addActionListener(new Card2Action());
        b3.addActionListener(new Card3Action());
        this.setContentPane(container); this.setVisible(true); 
    }
public class Card1Action implements ActionListener
{
public void actionPerformed(ActionEvent e) {
CardLayout CL = (CardLayout)(cards.getLayout());
CL.show(cards, "c1");
}
}
public class Card2Action implements ActionListener
{
public void actionPerformed(ActionEvent e) {
CardLayout CL = (CardLayout)(cards.getLayout());
CL.show(cards, "c2");
} } 
public class Card3Action implements ActionListener
{
public void actionPerformed(ActionEvent e) {
CardLayout CL = (CardLayout)(cards.getLayout());
CL.show(cards, "c3");
}
}   
}
