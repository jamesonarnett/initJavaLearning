import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class BankAccount extends JPanel implements ActionListener {

    JButton debit = new JButton("Debit");
    JButton withdrawal = new JButton("Withdrawal");
    JButton exit = new JButton("Exit");

    TextField text1, text2, output;
    Label debitAccount, withdrawalAccount, balanceAmount;

    DecimalFormat money = new DecimalFormat("$0.00");
    static double accountBalance = 0.0;

    public String formatMoney(double amt) {
        return money.format(amt);
    }

    public BankAccount(JFrame frame) {
        debitAccount = new Label("Debit Amount");
        debitAccount.setBounds(50, 100, 100, 50);
        frame.add(debitAccount);

        text1 = new TextField("");
        text1.setBounds(150, 110, 100, 50);
        frame.add(text1);

        withdrawalAccount = new Label("Withdrawal Amount");
        withdrawalAccount.setBounds(25,180,125,50);
        frame.add(withdrawalAccount);

        text2 = new TextField("");
        text2.setBounds(150, 180, 100, 50);
        frame.add(text2);

        debit.addActionListener(this);
        debit.setBounds(150, 250, 150, 30);
        frame.add(debit);

        withdrawal.addActionListener(this);
        withdrawal.setBounds(300, 250, 150, 30);
        frame.add(withdrawal);

        balanceAmount = new Label("Balance");
        balanceAmount.setBounds(330, 180, 70, 50);
        frame.add(balanceAmount);

        output = new TextField("");
        output.setBounds(400, 180, 100, 50);
        frame.add(output);

        exit.addActionListener(this);
        exit.setBounds(450, 250, 150, 30);
        frame.add(exit);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("Debit")) {
                System.out.println("Debit");
                String balanceAmount = text1.getText();

                double debitAmount = Double.parseDouble(balanceAmount);
                accountBalance = accountBalance + debitAmount;
                output.setText(String.valueOf(formatMoney(accountBalance)));
                text1.setText("");
            } else if (e.getActionCommand().equals("Withdrawal")) {
                System.out.println("Withdrawal");
                String balanceAmount = text2.getText();

                double withdrawalAmount = Double.parseDouble(balanceAmount);
                accountBalance = accountBalance - withdrawalAmount;
                output.setText(String.valueOf(formatMoney(accountBalance)));
                text2.setText("");
            } else if (e.getActionCommand().equals("Exit")) {
                System.out.println("GoodBye");
                System.exit(0);
            }
        } catch (Exception exception) {
            System.out.println("This is a bank, not a library. Numbers only please. " + "\n"
                    + exception);
        }
    }
}
