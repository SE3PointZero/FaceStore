package createaccount;

import javax.swing.JOptionPane;
import org.opencv.core.Core;

public class customer_form extends javax.swing.JFrame  {
    
    public static int captureCount = 0;
    String[] pathArray = new String[5]; 
    
    VisualBox.SnapShot objSnapShot = new VisualBox.SnapShot();
    
    public customer_form() {
        initComponents();
        
        VisualBox.Camera cameraObj = new VisualBox.Camera();
        
        cameraObj.setPanel(jPanel1);
        cameraObj.cameraOn();
        
//        Classes.FullScreen objFull = new Classes.FullScreen();
//        objFull.SetResolution();
//        this.setSize(objFull.getWidth(),objFull.getHeight());
        
        btnSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        countSnap = new javax.swing.JLabel();
        LblCname = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnCapture = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 740));
        jPanel2.setPreferredSize(new java.awt.Dimension(1098, 737));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLEASE TAKE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SNAP SHOTS");

        countSnap.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        countSnap.setForeground(new java.awt.Color(255, 255, 255));
        countSnap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(161, 161, 161)
                        .addComponent(countSnap, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countSnap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 740, 690));

        LblCname.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        LblCname.setText("WELCOME TO TOPAZ BEACH HOTEL");
        LblCname.setName("Restaurant_Name"); // NOI18N
        jPanel2.add(LblCname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 1050, 40));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.setName("Cancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 840, 180, 50));

        btnCapture.setBackground(new java.awt.Color(255, 255, 255));
        btnCapture.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCapture.setText("CAPTURE");
        btnCapture.setName("Capture"); // NOI18N
        btnCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptureActionPerformed(evt);
            }
        });
        jPanel2.add(btnCapture, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 840, 180, 50));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setName("btnSave"); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 840, 180, 50));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setMaximumSize(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setText("FILL THE FORM");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Full Name");

        fullName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullName.setName("fname"); // NOI18N
        fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("National ID");

        NIC.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NIC.setName("N_Id"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fullName))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NIC)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 650, 400));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/createaccount/image/Form.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 650, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        JOptionPane.showMessageDialog(null, "Wait for a while.....................");
        
        String name = fullName.getText();
        String nic = NIC.getText();

        Connection.DBConnection conn = new Connection.DBConnection();

        conn.setArray(pathArray);
        conn.insertVip(name, nic);
        
        Classes.DeleteCapturedImages del = new Classes.DeleteCapturedImages();
        del.deletePicOnProject();

        JOptionPane.showMessageDialog(null, "Your informations stored successfully");
        captureCount = 0; 
        
        this.setVisible(false);
        createaccount.FaceRecognition face = new createaccount.FaceRecognition();
        face.setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptureActionPerformed
        
        if((fullName.getText().trim().length() == 0 || fullName.getText().equals(null)) || (NIC.getText().trim().length() == 0 || NIC.getText().equals(null))){
            JOptionPane.showMessageDialog(null, "Please fill the required fields on the left side to capture your image", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{            
            if(captureCount == 5){
                countSnap.setText("0");
                btnSave.setEnabled(true);
                btnCapture.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Your Details succesfully stored", "Success", JOptionPane.INFORMATION_MESSAGE);
            }else{ 
                countSnap.setText("" + (5-captureCount));
                objSnapShot.SentCount((captureCount + 1));
                objSnapShot.TakeSnapShot();
                savePathArray(objSnapShot.getImageLocation());
                captureCount++;  
            }           
        }     
    }//GEN-LAST:event_btnCaptureActionPerformed

    public void savePathArray(String location){
        try{
            pathArray[captureCount] = location;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       int decision = JOptionPane.showConfirmDialog(null,"Do you want to back to home screen?", "Confirmation",JOptionPane.YES_NO_OPTION);
       if(decision == 0){
            this.setVisible(false);
            Welcome objWelcome = new Welcome();
            objWelcome.setVisible(true);
       }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameActionPerformed

    public static void main(String args[]) {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                customer_form objForm = new customer_form();
                objForm.setVisible(true);
////                objForm.setAlwaysOnTop(true);
//                objForm.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCname;
    private javax.swing.JTextField NIC;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCapture;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel countSnap;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
