/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mainframe;

import java.awt.Color;
import org.mainframe.common.model.CourseModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import org.mainframe.common.model.DBUtil;
import org.mainframe.common.bean.CourseBean;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author V
 */
public class CourseFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserJInternalFrame
     */
    public CourseFrame() {
        initComponents();
         getContentPane().setBackground(Color.WHITE);
         courseMsgLabel.setVisible(false);
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCourseCode = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        courseCode = new javax.swing.JTextField();
        addCourseButton = new javax.swing.JButton();
        updateCourseButton = new javax.swing.JButton();
        deleteCourseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseDataTable = new javax.swing.JTable();
        courseMsgLabel = new javax.swing.JLabel();
        lblCourseHours = new javax.swing.JLabel();
        lblCourseDesc = new javax.swing.JLabel();
        lblCourseCap = new javax.swing.JLabel();
        lblOfferedFall = new javax.swing.JLabel();
        lblOfferedSpring = new javax.swing.JLabel();
        lblOfferedSummer = new javax.swing.JLabel();
        lblCoursePreReqs = new javax.swing.JLabel();
        courseName = new javax.swing.JTextField();
        courseHours = new javax.swing.JTextField();
        courseCap = new javax.swing.JTextField();
        offeredFall = new javax.swing.JTextField();
        offeredSpring = new javax.swing.JTextField();
        offeredSummer = new javax.swing.JTextField();
        coursePreReqs = new javax.swing.JTextField();
        lblCourseTeachers = new javax.swing.JLabel();
        courseTeachers = new javax.swing.JTextField();
        cancelCourseButton = new javax.swing.JButton();
        courseDesc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CourseFrame");

        lblCourseCode.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCourseCode.setText("Course Code");

        lblCourseName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCourseName.setText("Course Name");

        courseCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodeActionPerformed(evt);
            }
        });

        addCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        addCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        addCourseButton.setText("Add");
        addCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButtonActionPerformed(evt);
            }
        });

        updateCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        updateCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        updateCourseButton.setText("Update");
        updateCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCourseButtonActionPerformed(evt);
            }
        });

        deleteCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        deleteCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        deleteCourseButton.setText("Delete");
        deleteCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseButtonActionPerformed(evt);
            }
        });

        courseDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        courseDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(courseDataTable);

        courseMsgLabel.setBackground(new java.awt.Color(255, 255, 255));
        courseMsgLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        courseMsgLabel.setForeground(new java.awt.Color(255, 0, 0));

        lblCourseHours.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCourseHours.setText("Course Hours");

        lblCourseDesc.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCourseDesc.setText("Course Desc");

        lblCourseCap.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCourseCap.setText("Course Capacity");

        lblOfferedFall.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblOfferedFall.setText("Offered Fall");

        lblOfferedSpring.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblOfferedSpring.setText("Offered Spring");

        lblOfferedSummer.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblOfferedSummer.setText("Offered Summer");

        lblCoursePreReqs.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCoursePreReqs.setText("CoursePreReqs");

        courseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNameActionPerformed(evt);
            }
        });

        offeredSpring.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        coursePreReqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePreReqsActionPerformed(evt);
            }
        });

        lblCourseTeachers.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCourseTeachers.setText("Teachers");

        cancelCourseButton.setBackground(new java.awt.Color(102, 255, 255));
        cancelCourseButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cancelCourseButton.setText("Reset");
        cancelCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCourseButtonActionPerformed(evt);
            }
        });

        courseDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourseTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCoursePreReqs, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(coursePreReqs, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOfferedSummer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(offeredSummer, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCourseDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOfferedSpring, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOfferedFall, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblCourseCap, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblCourseHours, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(offeredFall, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(offeredSpring, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(courseCap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseHours)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(courseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(courseMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(courseMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lblCourseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(courseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseHours, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseCap, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(offeredFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(offeredSpring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOfferedSpring, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(offeredSummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(coursePreReqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(courseTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCourseTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblCoursePreReqs, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblOfferedSummer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCourseButton)
                            .addComponent(updateCourseButton)
                            .addComponent(deleteCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelCourseButton))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOfferedFall, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        // TODO add your handling code here:
       try{
           
           if(courseCode.getText() !=null && !courseCode.getText().trim().equals("") ){    
                       CourseModel courseModel = new CourseModel();
               if(!courseModel.isCourseExist(courseCode.getText())){
                CourseBean courseBean = new CourseBean();
                courseBean.setCourseCode(courseCode.getText());
                courseBean.setCourseName(courseName.getText()); 
                courseBean.setCourseDesc(courseDesc.getText());
                courseBean.setOfferedFall(offeredFall.getText());
                courseBean.setCourseCap(Double.valueOf(courseCap.getText()));
                courseBean.setCourseHours(Double.valueOf(courseHours.getText()));
                courseBean.setOfferedSpring(offeredSpring.getText()); 
                courseBean.setOfferedSummer(offeredSummer.getText());
                courseBean.setCoursePreReq(coursePreReqs.getText());  
                courseBean.setTeacher(courseTeachers.getText());
                courseModel.addCourse(courseBean);
           
           courseMsgLabel.setText("Registration is Successfull.");           
           loadDataIntoJTable();                      
            courseCode.setText("");
            courseName.setText("");
            courseDesc.setText("");
            courseHours.setText("");           
            courseCap.setText("");
            offeredFall.setText("");
            offeredSpring.setText("");
            offeredSummer.setText("");
            coursePreReqs.setText("");
            courseTeachers.setText("");
               }else{
                   courseMsgLabel.setText("Course Code is already exist in the System.");
               }
           }else{
               courseMsgLabel.setText("Course Code Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
        
    }//GEN-LAST:event_addCourseButtonActionPerformed

    private void courseDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseDataTableMouseClicked
        // TODO add your handling code here:
       try{
          int rowIndex = courseDataTable.getSelectedRow();
          
           courseCode.setText(courseDataTable.getValueAt(rowIndex, 0).toString());
           courseName.setText(courseDataTable.getValueAt(rowIndex, 1).toString());          
           courseDesc.setText(courseDataTable.getValueAt(rowIndex, 2).toString());          
           courseHours.setText(courseDataTable.getValueAt(rowIndex, 3).toString());          
           courseCap.setText(courseDataTable.getValueAt(rowIndex, 4).toString());          
           offeredFall.setText(courseDataTable.getValueAt(rowIndex, 5).toString());          
           offeredSpring.setText(courseDataTable.getValueAt(rowIndex, 6).toString());          
           offeredSummer.setText(courseDataTable.getValueAt(rowIndex, 7).toString());          
           coursePreReqs.setText(courseDataTable.getValueAt(rowIndex, 8).toString());  
           courseTeachers.setText(courseDataTable.getValueAt(rowIndex, 9).toString());
       }catch(Exception exp){
         //  JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_courseDataTableMouseClicked

    private void updateCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCourseButtonActionPerformed
        // TODO add your handling code here:
         try{
             CourseModel courseModel = new CourseModel();
           if(courseModel.isCourseExist(courseCode.getText())){                     
               CourseBean courseBean = new CourseBean();
                courseBean.setCourseCode(courseCode.getText());
                courseBean.setCourseName(courseName.getText()); 
                courseBean.setCourseDesc(courseDesc.getText());
                courseBean.setOfferedFall(offeredFall.getText());
                courseBean.setCourseCap(Double.valueOf(courseCap.getText()));
                courseBean.setCourseHours(Double.valueOf(courseHours.getText()));
                courseBean.setOfferedSpring(offeredSpring.getText()); 
                courseBean.setOfferedSummer(offeredSummer.getText());
                courseBean.setCoursePreReq(coursePreReqs.getText());  
                courseBean.setTeacher(courseTeachers.getText());
                courseModel.updateCourseBean(courseBean);
                
          loadDataIntoJTable();          
           
           courseMsgLabel.setText("Updation is Successfull.");
         }else{
                 courseMsgLabel.setText("Please enter valid Course Code ");
              }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
    }//GEN-LAST:event_updateCourseButtonActionPerformed

    private void deleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseButtonActionPerformed
        // TODO add your handling code here:
          try{
             CourseModel courseModel = new CourseModel();
         boolean flag = courseModel.isCourseExist(courseCode.getText());
           if(flag){
             courseModel.deleteCourse(courseCode.getText());               
               loadDataIntoJTable();
                
            courseMsgLabel.setText("Deletion is Successfull.");
            courseCode.setText("");
            courseName.setText("");
            courseDesc.setText("");
            courseHours.setText("");           
            courseCap.setText("");
            offeredFall.setText("");
            offeredSpring.setText("");
            offeredSummer.setText("");
            coursePreReqs.setText("");
            courseTeachers.setText("");
           }else{
           courseMsgLabel.setText(" Please enter valid course code .");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
    }//GEN-LAST:event_deleteCourseButtonActionPerformed

    private void courseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNameActionPerformed

    private void coursePreReqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePreReqsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursePreReqsActionPerformed

    private void courseCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCodeActionPerformed

    private void cancelCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCourseButtonActionPerformed
        // TODO add your handling code here:
         courseCode.setText("");
            courseName.setText("");
            courseDesc.setText("");
            courseHours.setText("");           
            courseCap.setText("");
            offeredFall.setText("");
            offeredSpring.setText("");
            offeredSummer.setText("");
            coursePreReqs.setText("");
            courseTeachers.setText("");
    }//GEN-LAST:event_cancelCourseButtonActionPerformed

    private void courseDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseDescActionPerformed

    public JTable getSchoolDataTable(){
        return courseDataTable;
    }
    
    public JLabel getSchoolMsgLabel(){
        return courseMsgLabel;
    }
    
    public void loadDataIntoJTable() throws Exception{
    	
    	Connection con = DBUtil.getDataSource().getConnection();	
        String selectSchoolsSql = "Select * From Course";
     	PreparedStatement ps =	con.prepareStatement(selectSchoolsSql);
     	ResultSet rs = ps.executeQuery();		
        courseDataTable.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                ps.close();
                con.close();
    }

    public JButton getAddCourseButton() {
        return addCourseButton;
    }

    public JTextField getCourseCap() {
        return courseCap;
    }

    public JTextField getCourseCode() {
        return courseCode;
    }

    public JTable getCourseDataTable() {
        return courseDataTable;
    }

   

   

    public JTextField getCourseHours() {
        return courseHours;
    }

    public JLabel getCourseMsgLabel() {
        return courseMsgLabel;
    }

    public JTextField getCourseName() {
        return courseName;
    }

    public JTextField getCoursePreReqs() {
        return coursePreReqs;
    }

    public JTextField getCourseTeachers() {
        return courseTeachers;
    }

    public JButton getDeleteCourseButton() {
        return deleteCourseButton;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLblCourseCap() {
        return lblCourseCap;
    }

    public JLabel getLblCourseCode() {
        return lblCourseCode;
    }

    public JLabel getLblCourseDesc() {
        return lblCourseDesc;
    }

    public JLabel getLblCourseHours() {
        return lblCourseHours;
    }

    public JLabel getLblCourseName() {
        return lblCourseName;
    }

    public JLabel getLblCoursePreReqs() {
        return lblCoursePreReqs;
    }

    public JLabel getLblCourseTeachers() {
        return lblCourseTeachers;
    }

    public JLabel getLblOfferedFall() {
        return lblOfferedFall;
    }

    public JLabel getLblOfferedSpring() {
        return lblOfferedSpring;
    }

    public JLabel getLblOfferedSummer() {
        return lblOfferedSummer;
    }

    public JTextField getOfferedFall() {
        return offeredFall;
    }

    public JTextField getOfferedSpring() {
        return offeredSpring;
    }

    public JTextField getOfferedSummer() {
        return offeredSummer;
    }

    public JButton getUpdateCourseButton() {
        return updateCourseButton;
    }

   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JButton cancelCourseButton;
    private javax.swing.JTextField courseCap;
    private javax.swing.JTextField courseCode;
    private javax.swing.JTable courseDataTable;
    private javax.swing.JTextField courseDesc;
    private javax.swing.JTextField courseHours;
    private javax.swing.JLabel courseMsgLabel;
    private javax.swing.JTextField courseName;
    private javax.swing.JTextField coursePreReqs;
    private javax.swing.JTextField courseTeachers;
    private javax.swing.JButton deleteCourseButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseCap;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseDesc;
    private javax.swing.JLabel lblCourseHours;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCoursePreReqs;
    private javax.swing.JLabel lblCourseTeachers;
    private javax.swing.JLabel lblOfferedFall;
    private javax.swing.JLabel lblOfferedSpring;
    private javax.swing.JLabel lblOfferedSummer;
    private javax.swing.JTextField offeredFall;
    private javax.swing.JTextField offeredSpring;
    private javax.swing.JTextField offeredSummer;
    private javax.swing.JButton updateCourseButton;
    // End of variables declaration//GEN-END:variables
}
