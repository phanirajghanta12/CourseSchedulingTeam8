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
import org.mainframe.common.model.DegreePlanModel;
import org.mainframe.common.bean.CourseBean;
import org.mainframe.common.bean.DegreePlanBean;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author V
 */
public class DegreeFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserJInternalFrame
     */
    public DegreeFrame() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        lblType.setVisible(false);
        type.setVisible(false);
        try{
            String sql = " Select CourseCode From Course";
            Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
                DefaultListModel DLM = new DefaultListModel();
                while(rs.next()){
                    DLM.addElement(rs.getString(1));
                }
                coursesList.setModel(DLM);
                rs.close();
                ps.close();
                con.close();
        }catch(Exception exp){
            JOptionPane.showMessageDialog(this, "exception raised"+exp);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDegreeCode = new javax.swing.JLabel();
        lblDeptTrack = new javax.swing.JLabel();
        degreeCode = new javax.swing.JTextField();
        addDegreeButton = new javax.swing.JButton();
        updateDegreeButton = new javax.swing.JButton();
        deleteDegreeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        degreeDataTable = new javax.swing.JTable();
        description = new javax.swing.JTextField();
        lblHoursReq = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblCoursesList = new javax.swing.JLabel();
        lblGrandSchool = new javax.swing.JLabel();
        lblForecast = new javax.swing.JLabel();
        deptTrack = new javax.swing.JTextField();
        hoursReq = new javax.swing.JTextField();
        grandSchool = new javax.swing.JTextField();
        forecast = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursesList = new javax.swing.JList<>();
        cancelDegreeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DegreePlanFrame");

        lblDegreeCode.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblDegreeCode.setText("Degree Code");

        lblDeptTrack.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblDeptTrack.setText("Dept/Track");

        degreeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeCodeActionPerformed(evt);
            }
        });

        addDegreeButton.setBackground(new java.awt.Color(102, 255, 255));
        addDegreeButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        addDegreeButton.setText("Add");
        addDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDegreeButtonActionPerformed(evt);
            }
        });

        updateDegreeButton.setBackground(new java.awt.Color(102, 255, 255));
        updateDegreeButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        updateDegreeButton.setText("Update");
        updateDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDegreeButtonActionPerformed(evt);
            }
        });

        deleteDegreeButton.setBackground(new java.awt.Color(102, 255, 255));
        deleteDegreeButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        deleteDegreeButton.setText("Delete");
        deleteDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDegreeButtonActionPerformed(evt);
            }
        });

        degreeDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        degreeDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                degreeDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(degreeDataTable);

        lblHoursReq.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblHoursReq.setText("Hours Required");

        lblDescription.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblDescription.setText("Description");

        lblType.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblType.setText("Type");

        lblCoursesList.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCoursesList.setText("Courses");

        lblGrandSchool.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblGrandSchool.setText("GradSchool");

        lblForecast.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblForecast.setText("Forecast");

        deptTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptTrackActionPerformed(evt);
            }
        });

        hoursReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursReqActionPerformed(evt);
            }
        });

        grandSchool.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        forecast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forecastActionPerformed(evt);
            }
        });

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Required", "Elective" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        coursesList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(coursesList);

        cancelDegreeButton.setBackground(new java.awt.Color(102, 255, 255));
        cancelDegreeButton.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cancelDegreeButton.setText("Reset");
        cancelDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDegreeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDegreeCode, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblDeptTrack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deptTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(degreeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCoursesList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHoursReq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addComponent(lblForecast, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hoursReq, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(forecast, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrandSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDegreeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(grandSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(933, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDegreeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degreeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDeptTrack, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(deptTrack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoursReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoursReq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoursesList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grandSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrandSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(forecast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblForecast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addDegreeButton)
                            .addComponent(updateDegreeButton)
                            .addComponent(deleteDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDegreeButtonActionPerformed
        // TODO add your handling code here:
       try{
           
           if(degreeCode.getText() !=null && !degreeCode.getText().trim().equals("") ){    
                       DegreePlanModel degreePlanModel = new DegreePlanModel();
               if(!degreePlanModel.isDegreeExist(degreeCode.getText())){
                   
               List<String> selectedCourses =   coursesList.getSelectedValuesList();
               String sb = "";
               for(String courseIn : selectedCourses){
                   if(sb.equals("")){
                       sb = sb + "'"+courseIn+"'";
                   }else{
                       sb = sb+",'"+courseIn+"'";
                   }                   
               }
               
               if(type.getSelectedItem().equals("Required") && 
                       CourseModel.getSelectedCourseHoursCount(sb) > Integer.valueOf(hoursReq.getText()))
               {
             //        degreeMsgLabel.setText("The selected Courses Hours are more than  Hours Required."); 
               }else{
               
                   DegreePlanBean degreePlanBean = new DegreePlanBean();
                degreePlanBean.setDegreeCode(degreeCode.getText());
                degreePlanBean.setDeptTrack(deptTrack.getText()); 
                degreePlanBean.setDescription(description.getText());
                degreePlanBean.setHoursReq(Double.valueOf(hoursReq.getText()));
                degreePlanBean.setGradSchool(grandSchool.getText()); 
                degreePlanBean.setForecast(Double.valueOf(forecast.getText()));
                degreePlanBean.setType(type.getSelectedItem().toString());  
                degreePlanBean.setCourses(sb.replace("'", ""));
               
                degreePlanModel.addDegree(degreePlanBean);
           
     //      degreeMsgLabel.setText("Registration is Successfull.");           
           loadDataIntoJTable();                      
            degreeCode.setText("");
            deptTrack.setText("");
            description.setText("");
            hoursReq.setText("");           
            type.setSelectedItem("");
            grandSchool.setText("");
            forecast.setText("");
            
               }
               }else{
//                   degreeMsgLabel.setText("Degree Code is already exist in the System.");
               }
           }else{
  //             degreeMsgLabel.setText("Degree Code Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
        
    }//GEN-LAST:event_addDegreeButtonActionPerformed

    private void degreeDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degreeDataTableMouseClicked
        // TODO add your handling code here:
       try{
          int rowIndex = degreeDataTable.getSelectedRow();
          
           degreeCode.setText(degreeDataTable.getValueAt(rowIndex, 0).toString());
           deptTrack.setText(degreeDataTable.getValueAt(rowIndex, 1).toString());          
           description.setText(degreeDataTable.getValueAt(rowIndex, 2).toString());          
           hoursReq.setText(degreeDataTable.getValueAt(rowIndex, 3).toString());          
           type.setSelectedItem(degreeDataTable.getValueAt(rowIndex, 4).toString());    
           coursesList.setSelectedValue(degreeDataTable.getValueAt(rowIndex, 5).toString(),true);
           grandSchool.setText(degreeDataTable.getValueAt(rowIndex, 6).toString());          
           forecast.setText(degreeDataTable.getValueAt(rowIndex, 7).toString());          
           
       }catch(Exception exp){
           //JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_degreeDataTableMouseClicked

    private void updateDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDegreeButtonActionPerformed
        // TODO add your handling code here:
        try{
           
           if(degreeCode.getText() !=null && !degreeCode.getText().trim().equals("") ){    
                       DegreePlanModel degreePlanModel = new DegreePlanModel();
               if(degreePlanModel.isDegreeExist(degreeCode.getText())){
                   
               List<String> selectedCourses =   coursesList.getSelectedValuesList();
               String sb = "";
               for(String courseIn : selectedCourses){
                   if(sb.equals("")){
                       sb = sb + "'"+courseIn+"'";
                   }else{
                       sb = sb+",'"+courseIn+"'";
                   }                   
               }
               
               if(type.getSelectedItem().equals("Required") && 
                       CourseModel.getSelectedCourseHoursCount(sb) > Integer.valueOf(hoursReq.getText()))
               {
//                     degreeMsgLabel.setText("The selected Courses Hours are more than  Hours Required."); 
               }else{
               
                DegreePlanBean degreePlanBean = new DegreePlanBean();
                degreePlanBean.setDegreeCode(degreeCode.getText());
                degreePlanBean.setDeptTrack(deptTrack.getText()); 
                degreePlanBean.setDescription(description.getText());
                degreePlanBean.setHoursReq(Double.valueOf(hoursReq.getText()));
                degreePlanBean.setGradSchool(grandSchool.getText()); 
                degreePlanBean.setForecast(Double.valueOf(forecast.getText()));
                degreePlanBean.setType(type.getSelectedItem().toString());  
                degreePlanBean.setCourses(sb.replace("'", ""));
               
           degreePlanModel.updateDegreePlanBean(degreePlanBean);
           
//           degreeMsgLabel.setText("Updation is Successfull.");           
           loadDataIntoJTable();                      
                       
               }
               }else{
//                   degreeMsgLabel.setText("Degree Code is invalid.");
               }
           }else{
//               degreeMsgLabel.setText("Degree Code Should not be Empty.");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
    }//GEN-LAST:event_updateDegreeButtonActionPerformed

    private void deleteDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDegreeButtonActionPerformed
        // TODO add your handling code here:
          try{
            DegreePlanModel planModel = new DegreePlanModel();
         boolean flag = planModel.isDegreeExist(degreeCode.getText());
           if(flag){
             planModel.deleteDegreePlan(degreeCode.getText());               
               loadDataIntoJTable();
                
//            degreeMsgLabel.setText("Deletion is Successfull.");
            degreeCode.setText("");
            deptTrack.setText("");
            description.setText("");
            hoursReq.setText("");           
            type.setSelectedItem("");
            grandSchool.setText("");
            forecast.setText("");
            
           }else{
//           degreeMsgLabel.setText(" Please enter valid Degree code .");
           }
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       } 
    }//GEN-LAST:event_deleteDegreeButtonActionPerformed

    private void deptTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptTrackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptTrackActionPerformed

    private void degreeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeCodeActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void forecastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forecastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forecastActionPerformed

    private void hoursReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursReqActionPerformed

    private void cancelDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDegreeButtonActionPerformed
        // TODO add your handling code here:
            degreeCode.setText("");
            deptTrack.setText("");
            description.setText("");
            hoursReq.setText("");           
            type.setSelectedItem("");
            grandSchool.setText("");
            forecast.setText("");
    }//GEN-LAST:event_cancelDegreeButtonActionPerformed

    public JTable getSchoolDataTable(){
        return degreeDataTable;
    }
    
  
    public void loadDataIntoJTable() throws Exception{
    	
    	Connection con = DBUtil.getDataSource().getConnection();	
        String selectSchoolsSql = "Select * From DegreePlan";
     	PreparedStatement ps =	con.prepareStatement(selectSchoolsSql);
     	ResultSet rs = ps.executeQuery();		
        degreeDataTable.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                ps.close();
                con.close();
    }

    public JButton getAddDegreeButton() {
        return addDegreeButton;
    }

    public JList<String> getCoursesList() {
        return coursesList;
    }

    public JTextField getDegreeCode() {
        return degreeCode;
    }

    public JTable getDegreeDataTable() {
        return degreeDataTable;
    }

   

    public JButton getDeleteDegreeButton() {
        return deleteDegreeButton;
    }

    public JTextField getDeptTrack() {
        return deptTrack;
    }

    public JTextField getDescription() {
        return description;
    }

    public JTextField getForecast() {
        return forecast;
    }

    public JTextField getGrandSchool() {
        return grandSchool;
    }

    public JTextField getHoursReq() {
        return hoursReq;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JLabel getLblCoursesList() {
        return lblCoursesList;
    }

    public JLabel getLblDegreeCode() {
        return lblDegreeCode;
    }

    public JLabel getLblDeptTrack() {
        return lblDeptTrack;
    }

    public JLabel getLblDescription() {
        return lblDescription;
    }

    public JLabel getLblForecast() {
        return lblForecast;
    }

    public JLabel getLblGrandSchool() {
        return lblGrandSchool;
    }

    public JLabel getLblHoursReq() {
        return lblHoursReq;
    }

    public JLabel getLblType() {
        return lblType;
    }

    public JComboBox<String> getType() {
        return type;
    }

    public JButton getUpdateDegreeButton() {
        return updateDegreeButton;
    }

   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDegreeButton;
    private javax.swing.JButton cancelDegreeButton;
    private javax.swing.JList<String> coursesList;
    private javax.swing.JTextField degreeCode;
    private javax.swing.JTable degreeDataTable;
    private javax.swing.JButton deleteDegreeButton;
    private javax.swing.JTextField deptTrack;
    private javax.swing.JTextField description;
    private javax.swing.JTextField forecast;
    private javax.swing.JTextField grandSchool;
    private javax.swing.JTextField hoursReq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCoursesList;
    private javax.swing.JLabel lblDegreeCode;
    private javax.swing.JLabel lblDeptTrack;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblForecast;
    private javax.swing.JLabel lblGrandSchool;
    private javax.swing.JLabel lblHoursReq;
    private javax.swing.JLabel lblType;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton updateDegreeButton;
    // End of variables declaration//GEN-END:variables
}