import javax.swing.*;
import java.awt.*;

public class Main {

    public static void popUp(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JButton button = new JButton("Starting Balance");
        final JLabel label = new JLabel();
        button.addActionListener(e -> {
            String result = (String)JOptionPane.showInputDialog(
                    frame,
                    "Enter Your Starting Balance",
                    "100% a real bank",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    "1000"
            );
            if(result != null && result.length() > 0){
                label.setText("Initial Balance:" + result);
                double accountBalance = Double.parseDouble(result);
            }
        });

        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new BankAccount(frame));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setVisible(true);
        popUp(frame);
    }
}
