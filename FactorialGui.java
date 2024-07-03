import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialGui extends JFrame implements ActionListener {

    JFrame jf;
    JTextField tf;
    JButton b;
    JLabel lb;
    JLabel resultLabel;

    FactorialGui() {
        jf = new JFrame("Factorial Calculator");

        tf = new JTextField();
        jf.add(tf);
        tf.setBounds(80, 60, 200, 30);

        b = new JButton("find");
        jf.add(b);
        b.addActionListener(this);
        b.setBounds(80, 150, 200, 30);

        resultLabel = new JLabel();
        jf.add(resultLabel);
        resultLabel.setBounds(80, 100, 200, 30);

        jf.setSize(380, 300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        lb = new JLabel("Enter a number to find factorial");
        jf.add(lb);
        lb.setBounds(90, 30, 200, 30);
    }

    public void actionPerformed(ActionEvent e) {
        int f = 1;
        if (e.getActionCommand().equals("find")) {
            int n = Integer.parseInt(tf.getText());
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            resultLabel.setText("Factorial: " + f);
        }
    }

    public static void main(String[] args) {
        new FactorialGui();
    }
}
