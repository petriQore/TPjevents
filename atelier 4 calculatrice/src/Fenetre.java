import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//atelier 3 calculatrice

class Fenetre extends JFrame {
    private JTextField txt;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, beq, bplus, bminus, btimes, bdiv, bclear, broot, bneg;

    public Fenetre() {
        this.setTitle("calculatrice");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenu = this.getContentPane();
        contenu.setLayout(new BorderLayout());

        txt = new JTextField(20);
        txt.setPreferredSize(new Dimension(400, 50));
        contenu.add(txt, BorderLayout.NORTH);

        JPanel btnsPanel = new JPanel();

        GridLayout g = new GridLayout(4, 4,5,5);
        btnsPanel.setLayout(g);

        // boutons:
        b7 = new JButton("7");
        btnsPanel.add(b7);
        b8 = new JButton("8");
        btnsPanel.add(b8);
        b9 = new JButton("9");
        btnsPanel.add(b9);
        bplus = new JButton("+");
        btnsPanel.add(bplus);
        bclear = new JButton("C");
        btnsPanel.add(bclear);

        b4 = new JButton("4");
        btnsPanel.add(b4);
        b5 = new JButton("5");
        btnsPanel.add(b5);
        b6 = new JButton("6");
        btnsPanel.add(b6);
        bminus = new JButton("-");
        btnsPanel.add(bminus);
        broot = new JButton("√");
        btnsPanel.add(broot);

        b1 = new JButton("1");
        btnsPanel.add(b1);
        b2 = new JButton("2");
        btnsPanel.add(b2);
        b3 = new JButton("3");
        btnsPanel.add(b3);
        btimes = new JButton("*");
        btnsPanel.add(btimes);
        bneg = new JButton("+/-");
        btnsPanel.add(bneg);
    //  ma7abetch
        b0 = new JButton("0");
        btnsPanel.add(b0);
        btnsPanel.add(new JLabel()); 
        
        bdot = new JButton(".");
        btnsPanel.add(bdot);
        bdiv = new JButton("/");
        btnsPanel.add(bdiv);
        beq = new JButton("=");
        btnsPanel.add(beq);

        contenu.add(btnsPanel, BorderLayout.CENTER);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // add listeners ommgggg

        b0.addActionListener(new b0Listener());
        b1.addActionListener(new b1Listener());
        b2.addActionListener(new b2Listener());
        b3.addActionListener(new b3Listener());
        b4.addActionListener(new b4Listener());
        b5.addActionListener(new b5Listener());
        b6.addActionListener(new b6Listener());
        b7.addActionListener(new b7Listener());
        b8.addActionListener(new b8Listener());
        b9.addActionListener(new b9Listener());
        bdot.addActionListener(new bdotListener());
        bplus.addActionListener(new bplusListener());
        bminus.addActionListener(new bminusListener());
        btimes.addActionListener(new btimesListener());
        bdiv.addActionListener(new bdivListener());
        bclear.addActionListener(new bclearListener());
        beq.addActionListener(new beqListener());
        broot.addActionListener(new brootListener());
        bneg.addActionListener(new bnegListener());

    }

    class b0Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "0");
        }
    }
    
    class b1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "1");
        }
    }

    class b2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "2");
        }
    }

    class b3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "3");
        }
    }

    class b4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "4");
        }
    }

    class b5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "5");
        }
    }

    class b6Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "6");
        }
    }

    class b7Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "7");
        }
    }

    class b8Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "8");
        }
    }

    class b9Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "9");
        }
    }

    class bdotListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + ".");
        }
    }

    class bplusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "+");
        }
    }

    class bminusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "-");
        }
    }

    class btimesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "*");
        }
    }

    class bdivListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "/");
        }
    }

    class bclearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText("");
        }
    }

    class brootListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            if (s.equals("")) {
                return;
            }
            //negative number check
            if (s.charAt(0) == '-') {
                return;
            }
            double a = Double.parseDouble(s);
            double result = Math.sqrt(a);
            txt.setText(Double.toString(result));
        }
    }

    class bnegListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            if (s.equals("")) {
                return;
            }
            double a = Double.parseDouble(s);
            double result = -a;
            txt.setText(Double.toString(result));
        }
    }

    class beqListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            if (s.equals("")) {
                return;
            }
    
            try {
                double result = eval(s);
                txt.setText(Double.toString(result));
            } catch (RuntimeException ex) {
                txt.setText("Error");
            }
        }
    }
    

    
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

}
   
