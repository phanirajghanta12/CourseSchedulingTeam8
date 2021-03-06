/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mainframe;

import java.awt.Color;
import org.mainframe.common.model.DBUtil;
import org.mainframe.common.model.UserModel;
import org.mainframe.common.bean.UserBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author V
 */
public class UserFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserJInternalFrame
     */
    public UserFrame() {
        initComponents();
        usersMsgLabel.setVisible(false);
       getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        role = new javax.swing.JComboBox<>();
        userRegister = new javax.swing.JButton();
        userUpdateButton = new javax.swing.JButton();
        userDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userDataTable = new javax.swing.JTable();
        userCancelButton = new javax.swing.JButton();
        usersMsgLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("UsersFrame");

        lblUsername.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblUsername.setText("Username ");

        lblPassword.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblPassword.setText("Password");

        lblRole.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblRole.setText("Role");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Director" }));

        userRegister.setBackground(new java.awt.Color(102, 255, 255));
        userRegister.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        userRegister.setText("Add");
        userRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegisterActionPerformed(evt);
            }
        });

        userUpdateButton.setBackground(new java.awt.Color(102, 255, 255));
        userUpdateButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        userUpdateButton.setText("Update");
        userUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateButtonActionPerformed(evt);
            }
        });

        userDeleteButton.setBackground(new java.awt.Color(102, 255, 255));
        userDeleteButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        userDeleteButton.setText("Delete");
        userDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeleteButtonActionPerformed(evt);
            }
        });

        userDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        userDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userDataTable);

        userCancelButton.setBackground(new java.awt.Color(102, 255, 255));
        userCancelButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        userCancelButton.setText("Reset");
        userCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCancelButtonActionPerformed(evt);
            }
        });

        usersMsgLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usersMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usersMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userRegister)
                            .addComponent(userUpdateButton)
                            .addComponent(userDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegisterActionPerformed
        // TODO add your handling code here:
                     try{
           
           if(username.getText() !=null && !username.getText().trim().equals("") && password.getText()!=null && !password.getText().trim().equals("")){    
                       
               UserModel userModel = new UserModel();
               UserBean userBean = new UserBean();
               userBean.setLoginId(username.getText());
               userBean.setPassword(password.getText());
               userBean.setRole(role.getSelectedItem().toString());
              if(!userModel.getUserByLoginId(username.getText()))
              {
           userModel.registerUser(userBean);               
           usersMsgLabel.setText("Registration is Successfull.");           
           loadDataIntoJTable();                      
            username.setText("");
            password.setText("");
            role.setSelectedItem("Admin");
              }else{
                     usersMsgLabel.setText("UserName is all ready existed. "); 
                      }
            
           }else{
               usersMsgLabel.setText("UserName or Password Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
    }//GEN-LAST:event_userRegisterActionPerformed

    private void userDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userDataTableMouseClicked
        // TODO add your handling code here:
       try{
          int rowIndex = userDataTable.getSelectedRow();
          
           username.setText(userDataTable.getValueAt(rowIndex, 0).toString());
           password.setText(userDataTable.getValueAt(rowIndex, 1).toString());
           role.setSelectedItem(userDataTable.getValueAt(rowIndex, 2).toString());
       }catch(Exception exp){
           //JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_userDataTableMouseClicked

    private void userUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateButtonActionPerformed
          // TODO add your handling code here:
                     try{
           
           if(username.getText() !=null && !username.getText().trim().equals("") && password.getText()!=null && !password.getText().trim().equals("")){    
                       
               UserModel userModel = new UserModel();
               if(userModel.getUserByLoginId(username.getText())){
               UserBean userBean = new UserBean();
               userBean.setLoginId(username.getText());
               userBean.setPassword(password.getText());
               userBean.setRole(role.getSelectedItem().toString());
               userModel.updateUser(userBean);
           usersMsgLabel.setText("Updation is Successfull.");           
           loadDataIntoJTable();                      
            
               }else{
                    usersMsgLabel.setText("UserName or Password is Invalid.");
               }
            
           }else{
               usersMsgLabel.setText("UserName or Password Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
    }//GEN-LAST:event_userUpdateButtonActionPerformed

    private void userDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteButtonActionPerformed
        // TODO add your handling code here:
        
          try{
           
           if(username.getText() !=null && !username.getText().trim().equals("") ){    
                       
               UserModel userModel = new UserModel();
              
              if(userModel.deleteUser(username.getText())){
               
           usersMsgLabel.setText("Deletion is Successfull.");           
           loadDataIntoJTable();                      
            username.setText("");
            password.setText("");
            role.setSelectedItem("Admin");
              }else{
                     
           usersMsgLabel.setText("UserName  does not exist.");  
              }
            
           }else{
               usersMsgLabel.setText("UserName Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
        
    }//GEN-LAST:event_userDeleteButtonActionPerformed

    private void userCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCancelButtonActionPerformed
        // TODO add your handling code here:
            username.setText("");
            password.setText("");
            role.setSelectedItem("Admin");
    }//GEN-LAST:event_userCancelButtonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    public JTable getUserTable(){
        return userDataTable;
    }

    public void loadDataIntoJTable() {
    	try{
    	Connection con = DBUtil.getDataSource().getConnection();	
        String selectSchoolsSql = "Select * From Users";
     	PreparedStatement ps =	con.prepareStatement(selectSchoolsSql);
     	ResultSet rs = ps.executeQuery();		
        userDataTable.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                ps.close();
                con.close();
        }catch(Exception exp){
             JOptionPane.showMessageDialog(null, exp);
        }
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public JLabel getLblRole() {
        return lblRole;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JComboBox<String> getRole() {
        return role;
    }

    public JButton getUserCancelButton() {
        return userCancelButton;
    }

    public JTable getUserDataTable() {
        return userDataTable;
    }

    public JButton getUserDeleteButton() {
        return userDeleteButton;
    }

    public JButton getUserRegister() {
        return userRegister;
    }

    public JButton getUserUpdateButton() {
        return userUpdateButton;
    }

    public JTextField getUsername() {
        return username;
    }

    public JLabel getUsersMsgLabel() {
        return usersMsgLabel;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JButton userCancelButton;
    private javax.swing.JTable userDataTable;
    private javax.swing.JButton userDeleteButton;
    private javax.swing.JButton userRegister;
    private javax.swing.JButton userUpdateButton;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usersMsgLabel;
    // End of variables declaration//GEN-END:variables
}
