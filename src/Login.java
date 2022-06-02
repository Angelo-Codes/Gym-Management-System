import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

/**
 *
 * @author Group5
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        log.setVisible(true);
        inc2.setVisible(false);     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        log = new javax.swing.JPanel();
        Blogin = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cBox1 = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        inc2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gym icon2.png"))); // NOI18N
        jLabel1.setText("Muscle Factory Fitness Gym");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/halk2.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Marcos District, Talavera, Nueva Ecija");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(161, 161, 161)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jPanel3.setBackground(new java.awt.Color(166, 166, 166));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log.setBackground(new java.awt.Color(153, 153, 153));
        log.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOG-IN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        log.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Blogin.setBackground(new java.awt.Color(255, 255, 255));
        Blogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Blogin.setForeground(new java.awt.Color(102, 102, 255));
        Blogin.setText("Log-in");
        Blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloginActionPerformed(evt);
            }
        });
        log.add(Blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Username");
        username.setToolTipText("");
        username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        log.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        log.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N
        log.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 30));

        cBox1.setBackground(new java.awt.Color(153, 153, 153));
        cBox1.setText("show password");
        cBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox1ActionPerformed(evt);
            }
        });
        log.add(cBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Password");
        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        log.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 240, 30));

        inc2.setText("Incorrect  Username or Password");
        log.add(inc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 230, -1));

        jLayeredPane1.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 400));

        jPanel3.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 25, 400, 470));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("MUSCLE FACTORY FITNESS GYM");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 290, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mus.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 370, 290));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("WELCOME TO");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 610));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 675, 821, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Select",JOptionPane.YES_NO_OPTION);
 
    if (a==0){
    System.exit(0);  
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloginActionPerformed
      
    String type=username.getText();
       try
       {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from account where USER_NAME='"+type+"'");     
            while(rs.next())
            {                
                if("STAFF".equals(rs.getString(4))){
                    try{
                        PreparedStatement ps=con.prepareStatement("select * from account where USER_NAME=? and PASSWORD=?");
                        ps.setString(1, username.getText());
                        ps.setString(2, password.getText());
                        ResultSet r = ps.executeQuery();        

                        if(r.next()){
                            setVisible(false);
                            new monitoring().setVisible(true);                 
                        }else{            
                            inc2.setVisible(true);
                        }
                    }catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                }else{
                    try{
                        PreparedStatement ps=con.prepareStatement("select * from account where USER_NAME=? and PASSWORD=?");
                        ps.setString(1, username.getText());
                        ps.setString(2, password.getText());
                        ResultSet r = ps.executeQuery();        

                        if(r.next()){
                            setVisible(false);
                            new Home().setVisible(true);                 
                        }else{            
                            inc2.setVisible(true);                      
                        }
                    }catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                }                    
            }
            inc2.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_BloginActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        inc2.setVisible(false);
        if(username.getText().equals("Username")){
           username.setText("");
           username.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        inc2.setVisible(false);
        if(username.getText().equals("")){
           username.setText("Username");
           username.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        inc2.setVisible(false);
        if(password.getText().equals("Password")){
           password.setText(""); 
           password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        inc2.setVisible(false);
        if(password.getText().equals("")){
           password.setText("Password");
           password.setForeground(new Color(0,0,0));            
        }
    }//GEN-LAST:event_passwordFocusLost

    private void cBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBox1ActionPerformed
    if(cBox1.isSelected()){
       password.setEchoChar((char)0);
    }
    else{
       password.setEchoChar('*');
    }
    }//GEN-LAST:event_cBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blogin;
    private javax.swing.JCheckBox cBox1;
    private javax.swing.JLabel inc2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel log;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
