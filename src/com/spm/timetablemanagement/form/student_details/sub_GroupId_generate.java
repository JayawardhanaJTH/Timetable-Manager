/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.student_details;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hvdil
 */
public class sub_GroupId_generate extends javax.swing.JPanel {

    Connection connection;
    PreparedStatement pst, pstg;
    ResultSet rs;
    /**
     * Creates new form sub_GroupId_generate
     */
    public sub_GroupId_generate() {
        initComponents();
        gIdSelection();
        sGnoSelection();
        showGeneratedSubIdList();
        txt_id.setVisible(false);
        sgid.setVisible(false);
        gId_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_generate_sGid = new javax.swing.JButton();
        btn_edit_sGid = new javax.swing.JButton();
        btn_delete_sGid = new javax.swing.JButton();
        select_sGno = new javax.swing.JComboBox<>();
        select_gId = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_error = new javax.swing.JLabel();
        sgid = new javax.swing.JTextField();
        gId_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sGid = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_generate_sGid.setBackground(new java.awt.Color(255, 255, 255));
        btn_generate_sGid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_generate_sGid.setForeground(new java.awt.Color(51, 51, 51));
        btn_generate_sGid.setText("Generate");
        btn_generate_sGid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generate_sGid.setMaximumSize(new java.awt.Dimension(97, 31));
        btn_generate_sGid.setMinimumSize(new java.awt.Dimension(97, 31));
        btn_generate_sGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_sGidActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generate_sGid);

        btn_edit_sGid.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit_sGid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_edit_sGid.setText("Update");
        btn_edit_sGid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit_sGid.setPreferredSize(new java.awt.Dimension(117, 31));
        btn_edit_sGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_sGidActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit_sGid);

        btn_delete_sGid.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete_sGid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete_sGid.setText("Delete");
        btn_delete_sGid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete_sGid.setMaximumSize(new java.awt.Dimension(97, 31));
        btn_delete_sGid.setMinimumSize(new java.awt.Dimension(97, 31));
        btn_delete_sGid.setPreferredSize(new java.awt.Dimension(117, 31));
        btn_delete_sGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_sGidActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete_sGid);

        select_sGno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        select_sGno.setToolTipText("");
        select_sGno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_sGnoActionPerformed(evt);
            }
        });

        select_gId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        select_gId.setToolTipText("");
        select_gId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_gIdActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(456, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Group ID");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_id.setText("ID");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(456, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sub-Group Number");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        sgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sgid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(select_gId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select_sGno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(gId_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_gId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_sGno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sgid, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(gId_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        tbl_sGid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_sGid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sub-Group ID"
            }
        ));
        tbl_sGid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_sGid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sGidMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sGid);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(359, 359, 359))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 813, 715));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generate_sGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_sGidActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_sGid.getModel();
            Connection connection = DBconnection.getConnection();

            if(select_gId.getSelectedItem().equals("Select")&&select_sGno.getSelectedItem().equals("Select")){
                txt_error.setText("Select Items*");
            }
            else{
                txt_error.setText("");
                String selectedGid = select_gId.getSelectedItem().toString();
                
                String getGIdQuery = "select id from generated_group_id where gId =  '"+selectedGid+"'";
                pstg = connection.prepareStatement(getGIdQuery);
                rs = pstg.executeQuery();
                while(rs.next())
                {        
                  gId_id.setText(rs.getString("id"));
                }
            
            
            model.addRow(new Object[]{select_gId.getSelectedItem().toString()+"."+select_sGno.getSelectedItem().toString()});
            
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SUB_GROUP_ID_TABLE));
            
            String generateSID = (select_gId.getSelectedItem().toString()+"."+select_sGno.getSelectedItem().toString());
            statement.setString(1, generateSID);
            statement.setString(2, select_sGno.getSelectedItem().toString());
            statement.setString(3, gId_id.getText());
            statement.executeUpdate();
            model.setRowCount(0);
            statement.close();
            
            Statement smt = connection.createStatement();
            ResultSet rs = smt.executeQuery("select sGid from all_details where gId = '"+select_gId.getSelectedItem().toString()+"'");
            String ck_sGid="";
            while(rs.next()){
                            ck_sGid = rs.getString("sGid");
                            
                        }
            if (ck_sGid.equals("-")){
           
            smt.execute("UPDATE all_details SET sGid = '"+generateSID+"' WHERE gId = '"+selectedGid+"'");
            
            } else{
                String q1 = "select yNsId from generated_group_id where gId='"+selectedGid+"'";
                String rs_q1="";
                
                ResultSet rs1  = smt.executeQuery(q1);
                while (rs1.next()){
                    rs_q1 = rs1.getString("yNsId");
                }
                String q2 = "select yNs from academic_year_and_semester where id ='"+rs_q1+"'";
                String yNs="";
                ResultSet rs2  = smt.executeQuery(q2);
                while (rs2.next()){
                    yNs = rs2.getString("yNs");
                           
                }
                
                String q3 = "select dpId from generated_group_id where gId='"+selectedGid+"'";
                String rs_q3="";
                
                ResultSet rs3  = smt.executeQuery(q3);
                while (rs3.next()){
                    rs_q3 = rs3.getString("dpId");
                }
                String q4 = "select dp from degree_program where id ='"+rs_q3+"'";
                String dp="";
                ResultSet rs4  = smt.executeQuery(q4);
                while (rs4.next()){
                    dp = rs4.getString("dp");
                }  
                
                String q5 = "select gnoId from generated_group_id where gId='"+selectedGid+"'";
                String rs_q5="";
                
                ResultSet rs5  = smt.executeQuery(q5);
                while (rs5.next()){
                    rs_q5 = rs5.getString("gnoId");
                }
                String q6 = "select gNo from group_number where id ='"+rs_q5+"'";
                String gNo="";
                ResultSet rs6  = smt.executeQuery(q6);
                while (rs6.next()){
                    gNo = rs6.getString("gNo");
                }
                
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_ALL_DETAILS_TABLE));
            statement.setString(1, yNs);
            statement.setString(2, dp);
            statement.setString(3, gNo);
            statement.setString(4, selectedGid);
            statement.setString(5, generateSID);
            statement.executeUpdate();
            model.setRowCount(0);
            statement.close();
            }
            
            
            showGeneratedSubIdList();
            
            select_gId.setSelectedIndex(0);
            select_sGno.setSelectedIndex(0);
            
            JOptionPane.showMessageDialog(null, "Inserting Successful!");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_generate_sGidActionPerformed

    private void select_gIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_gIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_gIdActionPerformed

    private void select_sGnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_sGnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_sGnoActionPerformed

    private void tbl_sGidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sGidMouseClicked
        // TODO add your handling code here:
        int i = tbl_sGid.getSelectedRow();
        TableModel model = tbl_sGid.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_sGidMouseClicked

    private void btn_delete_sGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_sGidActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_sGid.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_id.getText().equals("ID")){
                txt_error.setText("Select Sub-Group ID*");
            }
            else{
                txt_error.setText("");
                
            int i = tbl_sGid.getSelectedRow();
            TableModel mt = tbl_sGid.getModel();
            sgid.setText(mt.getValueAt(i, 1).toString());
   
            smt.execute("DELETE FROM generated_sub_group_id WHERE id = "+id);
            smt.execute("DELETE FROM all_details WHERE sGid = '"+sgid.getText().toString()+"'");
            model.setRowCount(0);
            showGeneratedSubIdList();
            JOptionPane.showMessageDialog(this, "Record Deleted!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_delete_sGidActionPerformed

    private void btn_edit_sGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_sGidActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        String newGenerateID = (select_gId.getSelectedItem().toString()+"."+select_sGno.getSelectedItem().toString());

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_sGid.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_id.getText().equals("ID")){
                txt_error.setText("Select Sub-Group ID*");
            }
            else{
                txt_error.setText("");
                
            int i = tbl_sGid.getSelectedRow();
            TableModel mt = tbl_sGid.getModel();
            sgid.setText(mt.getValueAt(i, 1).toString());
            
            smt.execute("UPDATE generated_sub_group_id SET sGid = '"+newGenerateID+"' WHERE id = "+id); 
            smt.execute("UPDATE all_details SET sGid = '"+newGenerateID+"' WHERE sGid = '"+sgid.getText().toString()+"'");
            model.setRowCount(0);
            showGeneratedSubIdList();
            
            select_gId.setSelectedIndex(0);
            select_sGno.setSelectedIndex(0);
            
            JOptionPane.showMessageDialog(this, "Record Updated!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_edit_sGidActionPerformed

    private void sgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgidActionPerformed

    public  void gIdSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from generated_group_id";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String gId = rs.getString("gId");
            select_gId.addItem(gId);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public  void sGnoSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from sub_group_number";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String sGno = rs.getString("sGno");
            select_sGno.addItem(sGno);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public ArrayList<GeneratedSubId> GetGeneratedSubIdList()
    {
        ArrayList<GeneratedSubId> list = new ArrayList<GeneratedSubId>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from generated_sub_group_id";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        GeneratedSubId SGID;
        while(rs.next())
        {
            SGID = new GeneratedSubId(rs.getInt("id"), rs.getString("sGid"));
            list.add(SGID);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showGeneratedSubIdList()
    {
        ArrayList<GeneratedSubId> list = GetGeneratedSubIdList();
        DefaultTableModel model = (DefaultTableModel)tbl_sGid.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSgId();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete_sGid;
    private javax.swing.JButton btn_edit_sGid;
    private javax.swing.JButton btn_generate_sGid;
    private javax.swing.JTextField gId_id;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> select_gId;
    private javax.swing.JComboBox<String> select_sGno;
    private javax.swing.JTextField sgid;
    private javax.swing.JTable tbl_sGid;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
