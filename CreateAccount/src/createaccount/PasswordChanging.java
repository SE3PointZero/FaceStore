package createaccount;

public class PasswordChanging extends javax.swing.JFrame {

    public PasswordChanging() {
        initComponents();
        Classes.FullScreen objFull = new Classes.FullScreen();
        objFull.SetResolution();
        this.setSize(objFull.getWidth(),objFull.getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Current Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 260, 210, 29);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 320, 170, 29);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 380, 220, 29);

        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(710, 260, 250, 30);

        jPasswordField2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(710, 320, 250, 30);

        jPasswordField3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(jPasswordField3);
        jPasswordField3.setBounds(710, 380, 250, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("Save");
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 450, 100, 35);

        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setText("Cancel");
        getContentPane().add(jButton2);
        jButton2.setBounds(720, 450, 110, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/createaccount/image/WelcomePage.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PasswordChanging objPassword = new PasswordChanging();
                objPassword.setVisible(true);
                objPassword.setAlwaysOnTop(true);
                objPassword.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
