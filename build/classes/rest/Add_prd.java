package rest;

public class Add_prd extends javax.swing.JFrame {

    public Add_prd() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ürün Ekle");

        jPanel1.setLayout(null);

        jLabel1.setText("Ürün Adı");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 150, 30);

        jLabel2.setText("Ürün Açıklaması");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 150, 30);

        jLabel3.setText("Ürün Gurubu");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 150, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 10, 150, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 40, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 70, 150, 30);

        jButton1.setText("Özellikleri");
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 10, 100, 50);

        jButton2.setText("Ekle");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 60, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
