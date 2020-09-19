/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.subject;

import com.spm.timetablemanagement.models.Subject;
import com.spm.timetablemanagement.models.YnS;
import com.spm.timetablemanagement.util.CharecterSizeFilter;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class AddSubject extends javax.swing.JPanel {

    PreparedStatement statement;
    Connection connection;
    ResultSet resultSet;
    
    YnS ynS = new YnS();
    List<String> yNsList = new ArrayList<>();
    String [] yearList;
    String [] semList;
    
    boolean lock1 = false;
    boolean lock2 = false;
    /**
     * Creates new form AddStudent
     */
    public AddSubject() {
        initComponents();
        execute();
        txt_sub_lec_hr.setDocument(new CharecterSizeFilter(2));
        txt_sub_tute_hr.setDocument(new CharecterSizeFilter(2));
        txt_sub_lab_hr.setDocument(new CharecterSizeFilter(2));
        txt_sub_eva_hr.setDocument(new CharecterSizeFilter(2));
    }

    private void execute(){
       
        int c1 = 0;
        int c2 = 0;
        try {
            connection = DBconnection.getConnection(); 
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_YEAR_AND_SEMESTER_TABLE));
            
            resultSet = statement.executeQuery();
            
            
            while(resultSet.next()){
                yNsList.add(resultSet.getString("yNs"));
            }
            connection.close();
            statement.close();
            
            yNsList.sort(null);
            yearList = new String[]{"","","",""};
            semList = new String[]{"", ""};
            
            for(int i = 0; i < yNsList.size();i++){
                
                for(int j = 0; j < 4;j++){
                    
                    if(yearList[j].contentEquals(yNsList.get(i).substring(0, 2)))
                        lock1 = true;
                }
                
                for(int j = 0; j< 2;j++){
                    
                    if(semList[j].contentEquals(yNsList.get(i).substring(2)))
                        lock2 = true;
                }
                
                if(!lock1){
                    yearList[c1] = yNsList.get(i).substring(0, 2);
                    c1++;
                }
                if(!lock2){
                    semList[c2] = yNsList.get(i).substring(2);
                    c2++;
                }
                
                lock1 = false;
                lock2 = false;
            }
            
            cmb_sub_year.setModel(new DefaultComboBoxModel<>(yearList));
            cmb_sub_sem.setModel(new DefaultComboBoxModel<>(semList));
            
        } catch (SQLException | ClassNotFoundException | IOException | ParserConfigurationException | 
                SAXException ex) {
            Logger.getLogger(AddSubject.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_sub_year = new javax.swing.JComboBox<>();
        cmb_sub_sem = new javax.swing.JComboBox<>();
        txt_sub_name = new javax.swing.JTextField();
        txt_sub_code = new javax.swing.JTextField();
        txt_sub_lec_hr = new javax.swing.JTextField();
        txt_sub_tute_hr = new javax.swing.JTextField();
        txt_sub_lab_hr = new javax.swing.JTextField();
        txt_sub_eva_hr = new javax.swing.JTextField();
        sub_reset = new javax.swing.JButton();
        sub_save = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(90, 30, 172));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Subject");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(337, 337, 337))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel1.setText("Offered year");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel2.setText("Offered semester");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel3.setText("Subject Name");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel4.setText("Subject Code");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel5.setText("Number of lecture hours");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel6.setText("Number of tutorial hours");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel8.setText("Number of lab hours");
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel9.setText("Number of evaluation hours");
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 30));

        cmb_sub_year.setPreferredSize(new java.awt.Dimension(0, 30));

        cmb_sub_sem.setPreferredSize(new java.awt.Dimension(0, 30));

        txt_sub_name.setPreferredSize(new java.awt.Dimension(135, 30));

        txt_sub_code.setPreferredSize(new java.awt.Dimension(135, 30));

        txt_sub_lec_hr.setPreferredSize(new java.awt.Dimension(50, 30));

        txt_sub_tute_hr.setPreferredSize(new java.awt.Dimension(50, 30));

        txt_sub_lab_hr.setPreferredSize(new java.awt.Dimension(50, 30));

        txt_sub_eva_hr.setPreferredSize(new java.awt.Dimension(50, 30));

        sub_reset.setText("Reset");
        sub_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sub_resetMouseClicked(evt);
            }
        });

        sub_save.setText("Save");
        sub_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sub_saveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sub_reset)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_sub_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_sub_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_sub_year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_sub_sem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_sub_lec_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sub_tute_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sub_lab_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sub_eva_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sub_save)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_sub_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_sub_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sub_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sub_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sub_lec_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sub_tute_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sub_lab_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sub_eva_hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_reset)
                    .addComponent(sub_save))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sub_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub_resetMouseClicked
        resetFields();
    }//GEN-LAST:event_sub_resetMouseClicked

    private void sub_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub_saveMouseClicked
        lock1 = false;
        
        if(txt_sub_name.getText().contentEquals("")){
            JOptionPane.showMessageDialog(this, "Subject name cannot be empty", "Data error", JOptionPane.ERROR_MESSAGE);
            lock1 = true;
        }
        if(txt_sub_code.getText().contentEquals("")){
            JOptionPane.showMessageDialog(this, "Subject code cannot be empty", "Data error", JOptionPane.ERROR_MESSAGE);
            lock1 = true;
        }
        
        if(!lock1){
            
            Subject subject = new Subject();
            try {
                connection = DBconnection.getConnection();
                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SUBJECT));
                
                subject.setSub_name(txt_sub_name.getText());
                subject.setSub_code(txt_sub_code.getText());
                subject.setSub_lab_hr(txt_sub_lab_hr.getText());
                subject.setSub_lec_hr(txt_sub_lec_hr.getText());
                subject.setSub_tute_hr(txt_sub_tute_hr.getText());
                subject.setSub_eva_hr(txt_sub_eva_hr.getText());
                subject.setSub_year(cmb_sub_year.getSelectedItem().toString());
                subject.setSub_sem(cmb_sub_sem.getSelectedItem().toString());
                
                statement.setString(1, subject.getSub_year());
                statement.setString(2, subject.getSub_sem());
                statement.setString(3, subject.getSub_name());
                statement.setString(4, subject.getSub_code());
                statement.setString(5, subject.getSub_lec_hr());
                statement.setString(6, subject.getSub_tute_hr());
                statement.setString(7, subject.getSub_lab_hr());
                statement.setString(8, subject.getSub_eva_hr());
                
                statement.execute();
            } catch (SQLException | ClassNotFoundException | IOException | 
                    ParserConfigurationException | SAXException ex) {
                Logger.getLogger(AddSubject.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error on data save", "Data error", JOptionPane.ERROR_MESSAGE);
                lock1 = true;
            }
            
            if(!lock1){
                JOptionPane.showMessageDialog(this, "Subject Added", "Add Subject", JOptionPane.DEFAULT_OPTION);
            }
            
        }
    }//GEN-LAST:event_sub_saveMouseClicked

    private void resetFields(){
        txt_sub_name.setText("");
        txt_sub_code.setText("");
        txt_sub_lec_hr.setText("");
        txt_sub_tute_hr.setText("");
        txt_sub_lab_hr.setText("");
        txt_sub_eva_hr.setText("");
        
        cmb_sub_sem.setSelectedIndex(0);
        cmb_sub_year.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_sub_sem;
    private javax.swing.JComboBox<String> cmb_sub_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sub_reset;
    private javax.swing.JButton sub_save;
    private javax.swing.JTextField txt_sub_code;
    private javax.swing.JTextField txt_sub_eva_hr;
    private javax.swing.JTextField txt_sub_lab_hr;
    private javax.swing.JTextField txt_sub_lec_hr;
    private javax.swing.JTextField txt_sub_name;
    private javax.swing.JTextField txt_sub_tute_hr;
    // End of variables declaration//GEN-END:variables
}
