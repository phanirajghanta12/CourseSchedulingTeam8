/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mainframe;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import org.mainframe.common.model.DBUtil;
import org.mainframe.common.model.StudentModel;
import org.mainframe.common.bean.StudentBean;
import org.mainframe.common.bean.StudentCourseBean;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author V
 */
public class StudentCourseFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserJInternalFrame
     */
    public StudentCourseFrame() {
        initComponents();
        studentMsgLabel.setVisible(false);
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

        lblStudentId = new javax.swing.JLabel();
        lblStudentCourseId = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        addStudentCourseButton = new javax.swing.JButton();
        updateStudentCourseButton = new javax.swing.JButton();
        deleteStudentCourseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentCourseDataTable = new javax.swing.JTable();
        studentMsgLabel = new javax.swing.JLabel();
        courseDesc = new javax.swing.JTextField();
        lblStudentCourseDesc = new javax.swing.JLabel();
        courseId = new javax.swing.JTextField();
        cancelStudentCourseButton = new javax.swing.JButton();
        lblStudentCourseTerm = new javax.swing.JLabel();
        lblStudentCourseGrade = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        term = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("StudentCourseFrame");

        lblStudentId.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblStudentId.setText("Student ID");

        lblStudentCourseId.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblStudentCourseId.setText("Course Id");

        addStudentCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        addStudentCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        addStudentCourseButton.setText("Add");
        addStudentCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentCourseButtonActionPerformed(evt);
            }
        });

        updateStudentCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        updateStudentCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        updateStudentCourseButton.setText("Update");
        updateStudentCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentCourseButtonActionPerformed(evt);
            }
        });

        deleteStudentCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        deleteStudentCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        deleteStudentCourseButton.setText("Delete");
        deleteStudentCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentCourseButtonActionPerformed(evt);
            }
        });

        StudentCourseDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        StudentCourseDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentCourseDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentCourseDataTable);

        studentMsgLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentMsgLabel.setForeground(new java.awt.Color(255, 0, 0));

        lblStudentCourseDesc.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblStudentCourseDesc.setText("Course Desc");

        cancelStudentCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        cancelStudentCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cancelStudentCourseButton.setText("Reset");
        cancelStudentCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelStudentCourseButtonActionPerformed(evt);
            }
        });

        lblStudentCourseTerm.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblStudentCourseTerm.setText("Term");

        lblStudentCourseGrade.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblStudentCourseGrade.setText("Grade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStudentCourseId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStudentCourseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStudentCourseGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStudentCourseTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(studentMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addStudentCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateStudentCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteStudentCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelStudentCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(studentMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentCourseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentCourseGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentCourseTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addStudentCourseButton)
                            .addComponent(updateStudentCourseButton)
                            .addComponent(deleteStudentCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelStudentCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentCourseButtonActionPerformed
        // TODO add your handling code here:
       try{
           
           if(studentId.getText() !=null && !studentId.getText().trim().equals("") ){    
                       
               StudentModel studentModel = new StudentModel();
               StudentCourseBean studentCourseBean = new StudentCourseBean();
               studentCourseBean.setStudentId(studentId.getText());
               studentCourseBean.setCourseId(courseId.getText());
               studentCourseBean.setCourseDesc(courseDesc.getText());
               studentCourseBean.setTerm(term.getText());
               studentCourseBean.setGrade(grade.getText());
               studentModel.addStudentCourse(studentCourseBean);
               
           studentMsgLabel.setText("Registration is Successfull.");           
           loadDataIntoJTable();                      
            studentId.setText("");
            courseId.setText("");
            courseDesc.setText("");
            term.setText("");
            grade.setText("");
            
           }else{
               studentMsgLabel.setText("StudentID Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
        
    }//GEN-LAST:event_addStudentCourseButtonActionPerformed

    private void StudentCourseDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentCourseDataTableMouseClicked
        // TODO add your handling code here:
       try{
          int rowIndex = StudentCourseDataTable.getSelectedRow();
          
           studentId.setText(StudentCourseDataTable.getValueAt(rowIndex, 0).toString());
           courseId.setText(StudentCourseDataTable.getValueAt(rowIndex, 1).toString());          
           courseDesc.setText(StudentCourseDataTable.getValueAt(rowIndex, 2).toString());   
           term.setText(StudentCourseDataTable.getValueAt(rowIndex, 3).toString());    
           grade.setText(StudentCourseDataTable.getValueAt(rowIndex, 4).toString());   
            
                 
       }catch(Exception exp){
          // JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_StudentCourseDataTableMouseClicked

    private void updateStudentCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentCourseButtonActionPerformed
        // TODO add your handling code here:
        try{
           
           if(studentId.getText() !=null && !studentId.getText().trim().equals("") ){    
                       
               StudentModel studentModel = new StudentModel();
               if(studentModel.isStudentCourseExist(studentId.getText())){
               StudentCourseBean studentCourseBean = new StudentCourseBean();
               studentCourseBean.setStudentId(studentId.getText());
               studentCourseBean.setCourseId(courseId.getText());
               studentCourseBean.setCourseDesc(courseDesc.getText());
               studentCourseBean.setTerm(term.getText());
               studentCourseBean.setGrade(grade.getText());
               studentModel.updateStudentCourse(studentCourseBean);
               
           studentMsgLabel.setText("Updation is Successfull.");           
           loadDataIntoJTable();                      
           
               }else{
                    studentMsgLabel.setText("StudentID Does not exist.");
               }
            
           }else{
               studentMsgLabel.setText("StudentID Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
        
    }//GEN-LAST:event_updateStudentCourseButtonActionPerformed

    private void deleteStudentCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentCourseButtonActionPerformed
        // TODO add your handling code here:
        try{
           
           if(studentId.getText() !=null && !studentId.getText().trim().equals("") ){    
                       
           StudentModel studentModel = new StudentModel();
           
         boolean flag =  studentModel.deleteStudentCourse(studentId.getText());
         if(flag){
           studentMsgLabel.setText("deletion is Successfull.");        
         }else{
             studentMsgLabel.setText("Student id does not exist.");
         }
           loadDataIntoJTable();                      
            studentId.setText("");
            courseId.setText("");
            courseDesc.setText("");
            term.setText("");
            grade.setText("");
            
           }else{
               studentMsgLabel.setText("StudentID Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
        
    }//GEN-LAST:event_deleteStudentCourseButtonActionPerformed

    private void cancelStudentCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelStudentCourseButtonActionPerformed
        // TODO add your handling code here:
            studentId.setText("");
            courseId.setText("");
            courseDesc.setText("");
            term.setText("");
            grade.setText("");
          
    }//GEN-LAST:event_cancelStudentCourseButtonActionPerformed

    
    
    public void loadDataIntoJTable() throws Exception{
    	
    	Connection con = DBUtil.getDataSource().getConnection();	
        String selectSchoolsSql = "Select * From StudentCourse";
     	PreparedStatement ps =	con.prepareStatement(selectSchoolsSql);
     	ResultSet rs = ps.executeQuery();		
        StudentCourseDataTable.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                ps.close();
                con.close();
    }

    public JTable getStudentCourseDataTable() {
        return StudentCourseDataTable;
    }

    public JButton getAddStudentCourseButton() {
        return addStudentCourseButton;
    }

    public JButton getCancelStudentCourseButton() {
        return cancelStudentCourseButton;
    }

    public JTextField getCourseDesc() {
        return courseDesc;
    }

    public JTextField getCourseId() {
        return courseId;
    }

    public JButton getDeleteStudentCourseButton() {
        return deleteStudentCourseButton;
    }

    public JTextField getGrade() {
        return grade;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLblStudentCourseDesc() {
        return lblStudentCourseDesc;
    }

    public JLabel getLblStudentCourseGrade() {
        return lblStudentCourseGrade;
    }

    public JLabel getLblStudentCourseId() {
        return lblStudentCourseId;
    }

    public JLabel getLblStudentCourseTerm() {
        return lblStudentCourseTerm;
    }

    public JLabel getLblStudentName() {
        return lblStudentId;
    }

    public JTextField getStudentId() {
        return studentId;
    }

    public JLabel getStudentMsgLabel() {
        return studentMsgLabel;
    }

    public JTextField getTerm() {
        return term;
    }

    public JButton getUpdateStudentCourseButton() {
        return updateStudentCourseButton;
    }

    public JLabel getLblStudentId() {
        return lblStudentId;
    }

    
    
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StudentCourseDataTable;
    private javax.swing.JButton addStudentCourseButton;
    private javax.swing.JButton cancelStudentCourseButton;
    private javax.swing.JTextField courseDesc;
    private javax.swing.JTextField courseId;
    private javax.swing.JButton deleteStudentCourseButton;
    private javax.swing.JTextField grade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStudentCourseDesc;
    private javax.swing.JLabel lblStudentCourseGrade;
    private javax.swing.JLabel lblStudentCourseId;
    private javax.swing.JLabel lblStudentCourseTerm;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JTextField studentId;
    private javax.swing.JLabel studentMsgLabel;
    private javax.swing.JTextField term;
    private javax.swing.JButton updateStudentCourseButton;
    // End of variables declaration//GEN-END:variables
}
