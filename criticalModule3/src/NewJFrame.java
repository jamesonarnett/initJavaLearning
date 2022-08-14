
import java.time.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "option 1", "option 2", "option 3", "option 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu Option");

        jTextField1.setText("");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
        );

        pack();
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

        ZoneId CLOCK = ZoneId.systemDefault();

        Clock TIMEZONE = Clock.system(CLOCK);

        Instant instant = TIMEZONE.instant();

        ZonedDateTime timenow = instant.atZone(TIMEZONE.getZone());

        if(jComboBox1.getSelectedItem() == "option 1"){
            jTextField1.setText(timenow.toString());
        }

        if(jComboBox1.getSelectedItem() == "option 2"){

            String FILENAME = "TextFile.txt";
            BufferedWriter bw = null;
            FileWriter fw = null;
            try {

                String content = timenow.toString();
                fw = new FileWriter(FILENAME);
                bw = new BufferedWriter(fw);
                bw.write(content);

                System.out.println("Done");
                jTextField1.setText("text file was written ");
                bw.close();
                fw.close();
            } catch (IOException e) {

                e.printStackTrace();

            }

        }
        if(jComboBox1.getSelectedItem() == "option 3"){
            double a = Math.random();
            if(a > .4) {
                this.getContentPane().setBackground(Color.GREEN);
            } else if (a > .7) {
                this.getContentPane().setBackground(new Color(60,179,113));
            } else {
                this.getContentPane().setBackground(new Color(107,142,35));
            }

        }
        if(jComboBox1.getSelectedItem() == "option 4"){

            System.exit(WIDTH);
        }

    }
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
}




