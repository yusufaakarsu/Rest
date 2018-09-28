package rest;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Add_stc_buy extends javax.swing.JFrame {

    public Add_stc_buy() {
        initComponents();
        comboFillVen();
        comboFillPrd();
    }
    public static void comboFillVen(){
        try {
            _db.comboBoxFill(jcb_ven, "select pur_ven_name from pu_pur_ven", "pur_ven_name");
        } catch (SQLException e) {
        }
    }
    
    public static void comboFillPrd(){
        try {
            _db.comboBoxFill(jcb_prd, "select pur_prd_name from pu_pur_prd", "pur_prd_name");
        } catch (SQLException e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jcb_prd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_qty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcb_ven = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_invoice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jdp = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jcb_prd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seç" }));
        jPanel4.add(jcb_prd);
        jcb_prd.setBounds(10, 110, 150, 30);

        jLabel1.setText("Adet");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(200, 90, 29, 16);

        jLabel2.setText("Ürün");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(40, 90, 30, 16);
        jPanel4.add(jtf_price);
        jtf_price.setBounds(290, 110, 90, 26);

        jLabel3.setText("Miktar");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(320, 90, 40, 16);
        jPanel4.add(jtf_qty);
        jtf_qty.setBounds(180, 110, 90, 26);

        jLabel4.setText("Satıcı");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(40, 6, 34, 16);

        jcb_ven.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seç" }));
        jPanel4.add(jcb_ven);
        jcb_ven.setBounds(10, 30, 150, 27);

        jLabel5.setText("Fatura No");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(183, 6, 61, 16);

        jLabel6.setText("Tarih");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(317, 6, 32, 16);
        jPanel4.add(jtf_invoice);
        jtf_invoice.setBounds(180, 30, 90, 26);

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(400, 80, 149, 60);

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(400, 10, 149, 60);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(20, 70, 370, 12);
        jPanel4.add(jdp);
        jdp.setBounds(290, 30, 99, 26);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün", "Miktar", "Fiyat"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String pur_ven = jcb_ven.getSelectedItem().toString();
            String pur_date  = sdf.format(jdp.getDate());
            String pur_invoice = jtf_invoice.getText();
            String sqlPur = "SELECT public.insert_into_pu_pur('"+pur_ven+"','"+pur_date+"',"+pur_invoice+")";
            _db.insertWithfunc(sqlPur);
            int rows = table.getRowCount();
            for(int row = 0; row <rows; row++){
                String pur_prd = (String) table.getValueAt(row, 0);
                String pur_qty = (String) table.getValueAt(row, 1);
                String pur_price = (String) table.getValueAt(row, 2);
                int str_id = 1;
                String sql = "SELECT public.insert_into_pu_pur_dtl('"+pur_prd+"',"+pur_qty+","+pur_price+","+str_id+")";
                _db.insertWithfunc(sql);
            }
            Mn_stc_buy.tableFill();
            JOptionPane.showMessageDialog(rootPane, "Kayıt Yapıldı");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Kayıt Yapılamadı !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String data1 = jcb_prd.getSelectedItem().toString();
        String data2 = jtf_qty.getText();
        String data3 = jtf_price.getText();
        Object[] row = {data1,data2,data3};
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JComboBox<String> jcb_prd;
    private static javax.swing.JComboBox<String> jcb_ven;
    private org.jdesktop.swingx.JXDatePicker jdp;
    private javax.swing.JTextField jtf_invoice;
    private javax.swing.JTextField jtf_price;
    private javax.swing.JTextField jtf_qty;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
