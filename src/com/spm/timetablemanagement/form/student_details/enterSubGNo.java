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
        btn_addSgNo = new javax.swing.JButton();
        btn_editSgn = new javax.swing.JButton();
        btn_deleteSgn = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Sgn = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Enter Sub-Group Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(166, 166, 166))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_sGno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sGnoActionPerformed(evt);
            }
        });

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

        btn_editSgn.setBackground(new java.awt.Color(255, 255, 255));
        btn_editSgn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_editSgn.setText("Update");
        btn_editSgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editSgnActionPerformed(evt);
            }
        });

        btn_deleteSgn.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteSgn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteSgn.setText("Delete");
        btn_deleteSgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSgnActionPerformed(evt);
            }
        });

        txt_id.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txt_sGno, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btn_addSgNo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editSgn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteSgn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sGno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addSgNo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btn_editSgn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_deleteSgn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, -1, 160));

        tbl_Sgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sub-Group"
            }
        ));
        tbl_Sgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SgnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Sgn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 191, 470, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SUB_GROUP_NUMBER_TABLE));
            
            statement.setString(1, txt_sGno.getText());
            
            statement.executeUpdate();
            model.setRowCount(0);
            showGNList();
            txt_sGno.setText("");
            JOptionPane.showMessageDialog(null, "inserting successful");
            
            
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
            smt.execute("DELETE FROM sub_group_number WHERE id = "+id); 
            model.setRowCount(0);
            showGNList();
            txt_sGno.setText("");
            JOptionPane.showMessageDialog(this, "Deleted");
            
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
            smt.execute("UPDATE sub_group_number SET sGno = '"+txt_sGno.getText()+"' WHERE id = "+id); 
            model.setRowCount(0);
            showGNList();
            txt_sGno.setText("");
            JOptionPane.showMessageDialog(this, "Updated");
            
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Sgn;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_sGno;
    // End of variables declaration//GEN-END:variables
}
