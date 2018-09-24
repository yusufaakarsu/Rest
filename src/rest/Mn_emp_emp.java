package rest;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Mn_emp_emp extends javax.swing.JInternalFrame {
    
    Add_emp add = new Add_emp();
    Def_add_emp_password pass = new Def_add_emp_password();
    Def_add_emp_to_date to = new Def_add_emp_to_date();
    
    public Mn_emp_emp() {
        initComponents();
        try {
            _db.comboBoxFill(jComboBox2, "select * from hr_emp_dep", "emp_dep_name");
        } catch (SQLException ex) {
            Logger.getLogger(Mn_emp_emp.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableFill();
    }
    
    public static void tableFill(){
        if(jComboBox1.getSelectedItem() == "Tüm Personeller"){
            if(jComboBox2.getSelectedItem() == "Tüm Departmanlar"){
                _db.tableFill(jTable1, "select * from vw_hr_emp");
            }else if(jComboBox2.getSelectedItem() != "Tüm Departmanlar"){
                _db.tableFill(jTable1, "select * from vw_hr_emp where \"Departman\" = '"+jComboBox2.getSelectedItem()+"'");
            }
        }else if(jComboBox1.getSelectedItem() == "Kullanıcılar"){
            if(jComboBox2.getSelectedItem() == "Tüm Departmanlar"){
                _db.tableFill(jTable1, "select * from vw_hr_emp where \"Kullanıcı\" = 'Evet'");
            }else if(jComboBox2.getSelectedItem() != "Tüm Departmanlar"){
                _db.tableFill(jTable1, "select * from vw_hr_emp where \"Departman\" = '"+jComboBox2.getSelectedItem()+"' and \"Kullanıcı\" = 'Evet'");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Personeller");
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setText("Personel Ekle");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 10, 110, 90);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tüm Personeller", "Kullanıcılar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 10, 160, 27);

        jButton2.setText("<html><center>Personel<br>Yetkileri</html>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 10, 110, 90);

        jButton3.setText("Personel Sil");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 10, 110, 90);

        jComboBox2.setMaximumRowCount(20);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tüm Departmanlar" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(10, 40, 160, 27);

        jButton4.setText("<html><center>Kullanıcı<br>Yap</html>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(500, 10, 110, 90);

        jButton5.setText("<html><center>Şİfre<br>Belirle/Değiştir</html>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(610, 10, 150, 90);

        jButton6.setText("İş Sonu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(760, 10, 110, 90);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        tableFill();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        tableFill();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Seçtiğiniz Personel Kullanıcı Olacaktır Onaylıyor musunuz?", "Kulanıcı",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                _db.update("update hr_emp set emp_is_user ='Evet' where emp_id ="+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"");
                tableFill();
            } catch (SQLException ex) {
                Logger.getLogger(Mn_emp_emp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Seçtiğiniz Personel Silinecektir Onaylıyor musunuz?", "Sil",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                _db.update("update hr_emp set emp_is_active ='Hayır' where emp_id ="+jTable1.getValueAt(jTable1.getSelectedRow(), 0)+"");
                tableFill();
            } catch (SQLException ex) {
                Logger.getLogger(Mn_emp_emp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pass.setVisible(true);
        Def_add_emp_password.jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        to.setVisible(true);
        Def_add_emp_to_date.jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private static javax.swing.JComboBox<String> jComboBox1;
    private static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
