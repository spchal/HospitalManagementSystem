/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Patient_Page.java
 *
 * Created on 25 Nov, 2012, 11:59:02 AM
 */

package project;

/**
 *
 * @author sanjana
 */
public class Patient_Login_Page extends javax.swing.JFrame {

    /** Creates new form Patient_Page */
    public Patient_Login_Page() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Patient_label = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        Username_label = new javax.swing.JLabel();
        Pass_text = new javax.swing.JPasswordField();
        Password_label = new javax.swing.JLabel();
        Login_but = new javax.swing.JButton();
        Sign_up_but = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Patient_label.setText("               PATIENT'S LOGIN");

        Username_text.setText("Enter your Username");

        Username_label.setText("Username  ");

        Pass_text.setText("jPasswordField1");

        Password_label.setText("Password  ");

        Login_but.setText("LOGIN");
        Login_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_butActionPerformed(evt);
            }
        });

        Sign_up_but.setText("SIGN UP");
        Sign_up_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_up_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addComponent(Patient_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Username_label)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Login_but, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Sign_up_but, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addComponent(Pass_text, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(Username_text, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Patient_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_label)
                    .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_label))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_but)
                    .addComponent(Sign_up_but))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_butActionPerformed
        // TODO add your handling code here:
        Patient_Page p_p=new Patient_Page();
        p_p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Login_butActionPerformed

    private void Sign_up_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_up_butActionPerformed
        // TODO add your handling code here:
        Patient_Signup_Page psp=new Patient_Signup_Page();
        psp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Sign_up_butActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_but;
    private javax.swing.JPasswordField Pass_text;
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel Patient_label;
    private javax.swing.JButton Sign_up_but;
    private javax.swing.JLabel Username_label;
    private javax.swing.JTextField Username_text;
    // End of variables declaration//GEN-END:variables

}