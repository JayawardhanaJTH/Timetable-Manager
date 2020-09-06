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
public class enterSubGNo extends javax.swing.JPanel {

    Connection connection;
    /**
     * Creates new form enterSubGNo
     */
    public enterSubGNo() {
        initComponents();
        showGNList();
        txt_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_sGno = new javax.swing.JTextField();
        txt_error = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_addSgNo = new javax.swing.JButton();
        btn_editSgn = new javax.swing.JButton();
        btn_deleteSgn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Sgn = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setAlignmentY(0.0F);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(614, 37));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Sub-Group Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_sGno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_sGno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sGno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sGnoActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(319, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_addSgNo.setBackground(new java.awt.Color(255, 255, 255));
        btn_addSgNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addSgNo.setForeground(new java.awt.Color(51, 51, 51));
        btn_addSgNo.setText("Insert");
        btn_addSgNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addSgNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSgNoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_addSgNo);

        btn_editSgn.setBackground(new java.awt.Color(255, 255, 255));
        btn_editSgn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_editSgn.setText("Update");
        btn_editSgn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editSgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editSgnActionPerformed(evt);
            }
        });
        jPanel4.add(btn_editSgn);

        btn_deleteSgn.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteSgn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteSgn.setText("Delete");
        btn_deleteSgn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteSgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSgnActionPerformed(evt);
            }
        });
        jPanel4.add(btn_deleteSgn);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(txt_sGno, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txt_sGno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 730, 240));

        tbl_Sgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sub-Group"
            }
        ));
        tbl_Sgn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_Sgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SgnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Sgn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 470, 350));

        txt_id.setText("ID");
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 27, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sGnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sGnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_sGnoActionPerformed

    private void btn_addSgNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSgNoActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_Sgn.getModel();
            connection = DBconnection.getConnection();
            
            if(txt_sGno.getText().equals("")){
                txt_error.setText("Enter Sub-Group Number*");
            }
            else{
                txt_error.setText("");
                
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SUB_GROUP_NUMBER_TABLE));
            
            statement.setString(1, txt_sGno.getText());
            
            statement.executeUpdate();
            model.setRowCount(0);
            showGNList();
            txt_sGno.setText("");
            JOptionPane.showMessageDialog(null, "Inserting Successful!");
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_addSgNoActionPerformed

    private void tbl_SgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SgnMouseClicked
        // TODO add your handling code here:
        int i = tbl_Sgn.getSelectedRow();
        TableModel model = tbl_Sgn.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_sGno.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tbl_SgnMouseClicked

    private void btn_deleteSgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSgnActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_Sgn.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_sGno.getText().equals("")){
                txt_error.setText("Select Sub-Group Number*");
            }
            else{
                txt_error.setText("");
                
            smt.execute("DELETE FROM sub_group_number WHERE id = "+id); 
            model.setRowCount(0);
            showGNList();
            txt_sGno.setText("");
            JOptionPane.showMessageDialog(this, "Record Deleted!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteSgnActionPerformed

    private void btn_editSgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editSgnActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_Sgn.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_sGno.getText().equals("")){
                txt_error.setText("Select Sub-Group Number*");
            }
            else{

            smt.execute("UPDATE sub_group_number SET sGno = '"+txt_sGno.getText()+"' WHERE id = "+id); 
            model.setRowCount(0);
            showGNList();
            txt_sGno.setText("");
            JOptionPane.showMessageDialog(this, "Record Updated!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_editSgnActionPerformed

    public ArrayList<SubGroupNo> getSGNList()
    {
        ArrayList<SubGroupNo> list = new ArrayList<SubGroupNo>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from sub_group_number";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        SubGroupNo subGroupN;
        while(rs.next())
        {
            subGroupN = new SubGroupNo(rs.getInt("id"), rs.getString("sGno"));
            list.add(subGroupN);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showGNList()
    {
        ArrayList<SubGroupNo> list = getSGNList();
        DefaultTableModel model = (DefaultTableModel)tbl_Sgn.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSGno();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addSgNo;
    private javax.swing.JButton btn_deleteSgn;
    private javax.swing.JButton btn_editSgn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Sgn;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_sGno;
    // End of variables declaration//GEN-END:variables
}
