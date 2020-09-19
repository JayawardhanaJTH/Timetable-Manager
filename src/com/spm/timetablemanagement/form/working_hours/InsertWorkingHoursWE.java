/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.working_hours;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class InsertWorkingHoursWE extends javax.swing.JPanel {

    private int hcount = 0;
     private int mcount = 0;
     private int numOfdays = 0; 
     private static int chk_days = 0; 
     private static boolean error = false;
     private static ArrayList<String> daysNum = new ArrayList();
     private static ArrayList<String> days = new ArrayList();
     
    /**
     * Creates new form InsertWorkingHours
     */
    public InsertWorkingHoursWE() {
        initComponents();   
        
        rbGroup = new ButtonGroup();
        rbGroup.add(rdb_1hour);
        rbGroup.add(rdb_30min);
        
        txt_hour.setText("0");
        txt_min.setText("0");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_hour = new javax.swing.JTextField();
        cmb_num_of_days = new javax.swing.JComboBox<>();
        chk_sat = new javax.swing.JCheckBox();
        chk_sun = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txt_min = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdb_1hour = new javax.swing.JRadioButton();
        rdb_30min = new javax.swing.JRadioButton();
        btn_reset = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        txt_error = new javax.swing.JLabel();
        txt_days_error = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Number of working days");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Working days");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Working hours per day");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Time slot");

        txt_hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hour.setToolTipText("Number of hours");
        txt_hour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_hourMousePressed(evt);
            }
        });
        txt_hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_hourKeyPressed(evt);
            }
        });

        cmb_num_of_days.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_num_of_days.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        cmb_num_of_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_num_of_daysActionPerformed(evt);
            }
        });

        chk_sat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_sat.setText("Saturday");
        chk_sat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_satMousePressed(evt);
            }
        });

        chk_sun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_sun.setText("Sunday");
        chk_sun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_sunMousePressed(evt);
            }
        });

        jLabel5.setText("H");

        txt_min.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_min.setToolTipText("Number of minitues");
        txt_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_minMousePressed(evt);
            }
        });
        txt_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_minKeyPressed(evt);
            }
        });

        jLabel6.setText("M");

        rdb_1hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdb_1hour.setText("1 hour");

        rdb_30min.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdb_30min.setText("30 mins");

        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_resetMousePressed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_saveMousePressed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 0, 102));

        txt_days_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_days_error.setForeground(new java.awt.Color(255, 0, 51));

        jPanel2.setBackground(new java.awt.Color(90, 30, 172));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insert Weekend Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(337, 337, 337))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdb_1hour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdb_30min))
                            .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_num_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chk_sat)
                                .addGap(20, 20, 20)
                                .addComponent(chk_sun))
                            .addComponent(txt_days_error, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_reset)
                        .addGap(33, 33, 33)
                        .addComponent(btn_save)
                        .addGap(302, 302, 302)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_num_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(chk_sat)
                    .addComponent(chk_sun))
                .addGap(18, 18, 18)
                .addComponent(txt_days_error, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdb_1hour)
                    .addComponent(rdb_30min))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_save))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_hourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hourMousePressed
        txt_hour.setText("");
    }//GEN-LAST:event_txt_hourMousePressed

    private void txt_hourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hourKeyPressed
        Validator.filterInt(evt, "hour", txt_error, txt_hour, txt_min);
        Validator.validateLenght("hour", txt_hour, txt_min);
    }//GEN-LAST:event_txt_hourKeyPressed

    private void cmb_num_of_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_num_of_daysActionPerformed

        numOfdays = cmb_num_of_days.getSelectedIndex();
        checkDays(chk_days);
    }//GEN-LAST:event_cmb_num_of_daysActionPerformed

    private void chk_satMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_satMousePressed
        if(chk_sat.isSelected()){
            chk_days--;
            daysNum.remove("6");
        }
        else{
            chk_days++;
            daysNum.add("6");
        }

        checkDays(chk_days);
    }//GEN-LAST:event_chk_satMousePressed

    private void chk_sunMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_sunMousePressed
        if(chk_sun.isSelected()){
            chk_days--;
            daysNum.remove("7");
        }
        else{
            chk_days++;
            daysNum.add("7");
        }

        checkDays(chk_days);
    }//GEN-LAST:event_chk_sunMousePressed

    private void txt_minMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_minMousePressed
        txt_min.setText("");
    }//GEN-LAST:event_txt_minMousePressed

    private void txt_minKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_minKeyPressed
        Validator.filterInt(evt, "min", txt_error, txt_hour, txt_min);
        Validator.validateLenght("min", txt_hour, txt_min);
    }//GEN-LAST:event_txt_minKeyPressed

    private void btn_resetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMousePressed

        cmb_num_of_days.setSelectedIndex(0);
        uncheckAll();
        txt_hour.setText("0");
        txt_min.setText("0");
        rbGroup.clearSelection();
        chk_days = 0;
        numOfdays = 0;
        txt_days_error.setText("");
        daysNum.clear();
        days.clear();
    }//GEN-LAST:event_btn_resetMousePressed

    private void checkDays(int value){
        if(value > numOfdays)
            txt_days_error.setText("Days cannot exceed number of days : " + numOfdays);
        else
            txt_days_error.setText("");
    }
    
    private boolean checkTime(){
        if(Integer.parseInt(txt_min.getText()) > 59)
            return true;
        if(Integer.parseInt(txt_hour.getText()) > 12 || Integer.parseInt(txt_hour.getText()) == 0)
            return true;
        
        return false;
    }
    private void btn_saveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMousePressed

        int temp = 0;
        
        if(numOfdays == 0){
            JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Select number of working days!",
                "Data missing",JOptionPane.ERROR_MESSAGE);
            error = true;
        }else
            error = false;

        if(chk_days > numOfdays){
            JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Days cannot exceed number of days : " + numOfdays,
                "Data missing",JOptionPane.ERROR_MESSAGE);
            error = true;
        }else if(chk_days < numOfdays){
            JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Select " + (numOfdays - chk_days) + " more day(s) according to number of days" ,
                "Data missing",JOptionPane.ERROR_MESSAGE);
            error = true;
        }else
            error = false;

        if(rbGroup.getSelection()== null){
            JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Select time slot",
                "Data missing",JOptionPane.ERROR_MESSAGE);
            error = true;
        }else
            error = false;

        if(checkTime()){
            JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Invalide time",
                "Data missing",JOptionPane.ERROR_MESSAGE);
            error = true;
        }else
            error = false;

        if(!error){
            try {
                Connection connection = DBconnection.getConnection();

                PreparedStatement statement1 = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_WORKING_HOUR_TABLE));
                PreparedStatement statement2 = connection.prepareStatement(CreateQuery.getQuery(Constant.REMOVE_WORKING_HOUR_TABLE));
                PreparedStatement statement3 = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_WE_WORKING_HOUR_DAYS_TABLE));
                PreparedStatement statement4 = connection.prepareStatement(CreateQuery.getQuery(Constant.REMOVE_WORKING_HOUR_DAYS_TABLE));

                statement2.setInt(1, 2);
                statement4.setInt(1, 2);
                
                statement4.execute();
                if(!statement2.execute()){
                    
                    ArrayList<Integer> numbs = new ArrayList<>();
                    
                    for(String day : daysNum){
                        
                        numbs.add(Integer.parseInt(day));
                    }
                    String dayList = "";
                    numbs.sort(null);
          
                    for (Integer day : numbs) {
                        
                        if(day == 6){
                            dayList = dayList.concat("Saturday,");
                            days.add("Saturday");
                        }
                        if(day == 7){
                            dayList = dayList.concat("Sunday,");
                            days.add("Sunday");
                        }
                    }
                    int lenght = dayList.length();
                    
                    statement1.setInt(1, 2);
                    statement1.setInt(2, numOfdays);
                    statement1.setString(3, dayList.substring(0, lenght-1));
                    statement1.setInt(4, Integer.parseInt(txt_hour.getText()));
                    statement1.setInt(5, Integer.parseInt(txt_min.getText()));

                    
                    if(rdb_1hour.isSelected()){
                        statement1.setInt(6, 1);

                    }else{
                        statement1.setInt(6, 2);
                    }
                       
                    statement1.execute();
                    
                    for(int x = 0; x < days.size(); x++){
                        statement3.setInt(1, x+1);
                        statement3.setString(2, days.get(x));
                        
                        statement3.execute();
                    }
                }
            } catch (SQLException | IOException | ParserConfigurationException | SAXException ex) {
                Logger.getLogger(InsertWorkingHoursWD.class.getName()).log(Level.SEVERE, null, ex);
                temp = 1;
                JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Error on data input",
                "Data missing",JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InsertWorkingHoursWE.class.getName()).log(Level.SEVERE, null, ex);
                temp = 1;
                JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Error on data input",
                "Data missing",JOptionPane.ERROR_MESSAGE);
            }
            
            if(temp == 0){
                btn_resetMousePressed(null);
                JOptionPane.showMessageDialog(InsertWorkingHoursWE.this, "Data insert success");
            }
        }
            
    }//GEN-LAST:event_btn_saveMousePressed

    private void uncheckAll(){
        
        chk_sat.setSelected(false);
        chk_sun.setSelected(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JCheckBox chk_sat;
    private javax.swing.JCheckBox chk_sun;
    private javax.swing.JComboBox<String> cmb_num_of_days;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_1hour;
    private javax.swing.JRadioButton rdb_30min;
    private javax.swing.JLabel txt_days_error;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_hour;
    private javax.swing.JTextField txt_min;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup rbGroup;
}
