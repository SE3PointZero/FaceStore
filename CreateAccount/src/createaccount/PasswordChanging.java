package createaccount;

import javax.swing.JOptionPane;

public class PasswordChanging extends javax.swing.JFrame {

    public PasswordChanging() {
        initComponents();
//        Classes.FullScreen objFull = new Classes.FullScreen();
//        objFull.SetResolution();
//        this.setSize(objFull.getWidth(),objFull.getHeight());
    }
    
    public void home(){
        this.setVisible(false);
        Welcome objWelcome = new Welcome();
        objWelcome.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newUserName = new javax.swing.JTextField();
        newPassword = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1480, 920));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(630, 430, 310, 43);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 510, 270, 43);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 590, 330, 43);

        newUserName.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        getContentPane().add(newUserName);
        newUserName.setBounds(990, 430, 440, 50);

        newPassword.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(newPassword);
        newPassword.setBounds(990, 510, 440, 50);

        confirmPassword.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(confirmPassword);
        confirmPassword.setBounds(990, 590, 440, 50);

        jButton1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1050, 710, 140, 60);

        jButton2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(820, 710, 140, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/createaccount/image/Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1480, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int decision = JOptionPane.showConfirmDialog(null,"Do you want to back to home screen?", "Confirmation",JOptionPane.YES_NO_OPTION);
        if(decision == 0){
            home();
        }
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String username = newUserName.getText();
        String newPass = newPassword.getText();
        String conPass = confirmPassword.getText();
        
        if(newPass.equals(conPass)){
            int decision = JOptionPane.showConfirmDialog(null, "Are you sure do you wants to change it anyway?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(decision == 0){
                Connection.DBConnection conn = new Connection.DBConnection();
                conn.updateLoginInfo(username, newPass);
                JOptionPane.showMessageDialog(null, "User name and Password updated succesfully!");
                home();
            }else{
                newUserName.setText("");
                newPassword.setText("");
                confirmPassword.setText("");
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Passwords are not matching. Please make sure that both of the password fields are entered correctly");
            newPassword.setText("");
            confirmPassword.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PasswordChanging objPassword = new PasswordChanging();
                objPassword.setVisible(true);
//                objPassword.setAlwaysOnTop(true);
//                objPassword.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField newUserName;
    // End of variables declaration//GEN-END:variables
}
