package rest;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class _Main extends javax.swing.JFrame {
    
    private Dimension d = null;
    Mn_emp_emp emp_emp = new Mn_emp_emp();
    Mn_emp_acc emp_acc = new Mn_emp_acc();
    Mn_acc_acc acc_acc = new Mn_acc_acc();
    Mn_stc_stc stc_stc = new Mn_stc_stc();
    Mn_stc_buy stc_buy = new Mn_stc_buy();
    Mn_stc_return stc_return = new Mn_stc_return();
    Mn_stc_transfer stc_transfer = new Mn_stc_transfer();
    Mn_stc_consumption stc_consumption = new Mn_stc_consumption();
    Mn_stc_lost stc_lost = new Mn_stc_lost();
    Mn_stc_all stc_all = new Mn_stc_all();
    Mn_prd_prd prd_prd = new Mn_prd_prd();
    Def_emp_department def_emp_dep = new Def_emp_department();
    Def_emp_permision def_emp_permision = new Def_emp_permision();
    Def_emp_title def_emp_title = new  Def_emp_title();
    Def_prd_grp_sub def_prd_grp_sub = new Def_prd_grp_sub();
    Def_prd_grp_up def_prd_grp_up = new Def_prd_grp_up();
    Def_sale_cashier def_sale_cashier = new Def_sale_cashier();
    Def_sale_customer def_sale_customer = new Def_sale_customer();
    Def_sale_pay_method def_sale_pay_method = new Def_sale_pay_method();
    Def_stc_prd_grp_sub def_stc_prd_grp_sub = new Def_stc_prd_grp_sub();
    Def_stc_prd_grp_up def_stc_prd_grp_up = new Def_stc_prd_grp_up();
    Def_stc_products def_stc_products = new Def_stc_products();
    Def_stc_ven_groups def_stc_ven_groups = new Def_stc_ven_groups();
    Def_stc_vendors def_stc_vendors = new Def_stc_vendors();

    public _Main() {
        initComponents();
        jPane2.removeAll();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_acc_acc = new javax.swing.JButton();
        btn_stc_buy = new javax.swing.JButton();
        btn_stc_transfer = new javax.swing.JButton();
        btn_stc_consumtion = new javax.swing.JButton();
        btn_stc_lost = new javax.swing.JButton();
        btn_stc_return = new javax.swing.JButton();
        btn_stc_all = new javax.swing.JButton();
        btn_stc = new javax.swing.JButton();
        btn_prd = new javax.swing.JButton();
        btn_rpr_sale = new javax.swing.JButton();
        btn_rpr_prd = new javax.swing.JButton();
        btn_rpr_emp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_main_emp = new javax.swing.JButton();
        btn_main_acc = new javax.swing.JButton();
        btn_main_stc = new javax.swing.JButton();
        btn_main_prd = new javax.swing.JButton();
        btn_main_rpr = new javax.swing.JButton();
        jPane2 = new javax.swing.JPanel();
        btn_emp = new javax.swing.JButton();
        btn_emp_acc = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_file = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mn_definations = new javax.swing.JMenu();
        mn_emp = new javax.swing.JMenu();
        mni_def_emp_title = new javax.swing.JMenuItem();
        mni_def_emp_dep = new javax.swing.JMenuItem();
        mni_def_emp_perm = new javax.swing.JMenuItem();
        mni_def_emp_emp = new javax.swing.JMenuItem();
        mn_stc = new javax.swing.JMenu();
        mni_stc_grp_up = new javax.swing.JMenuItem();
        mni_stc_grp_sub = new javax.swing.JMenuItem();
        mni_stc_prd = new javax.swing.JMenuItem();
        mni_stc_ven_grp = new javax.swing.JMenuItem();
        mni_stc_ven = new javax.swing.JMenuItem();
        mn_prd = new javax.swing.JMenu();
        mni_prd_grp_up = new javax.swing.JMenuItem();
        mni_prd_grp_sub = new javax.swing.JMenuItem();
        mn_sale = new javax.swing.JMenu();
        mni_sale_cahs = new javax.swing.JMenuItem();
        mni_sale_cust = new javax.swing.JMenuItem();
        mni_sale_pay_mtd = new javax.swing.JMenuItem();

        btn_acc_acc.setText("Hesaplar");
        btn_acc_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acc_accActionPerformed(evt);
            }
        });

        btn_stc_buy.setText("Mal Alış Fişi");
        btn_stc_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stc_buyActionPerformed(evt);
            }
        });

        btn_stc_transfer.setText("Transfer Fişi");
        btn_stc_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stc_transferActionPerformed(evt);
            }
        });

        btn_stc_consumtion.setText("Tüketim Fişi");
        btn_stc_consumtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stc_consumtionActionPerformed(evt);
            }
        });

        btn_stc_lost.setText("Zayi Fişi");
        btn_stc_lost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stc_lostActionPerformed(evt);
            }
        });

        btn_stc_return.setText("Mal İade Fişi");
        btn_stc_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stc_returnActionPerformed(evt);
            }
        });

        btn_stc_all.setText("Tüm Fişler");
        btn_stc_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stc_allActionPerformed(evt);
            }
        });

        btn_stc.setText("Stok");
        btn_stc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stcActionPerformed(evt);
            }
        });

        btn_prd.setText("Ürünler");
        btn_prd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prdActionPerformed(evt);
            }
        });

        btn_rpr_sale.setText("<html><center>Satış<br>Raporları</html>");

        btn_rpr_prd.setText("<html><center>Ürün<br>Raporları</html>");

        btn_rpr_emp.setText("<html><center>Garson<br>Raporları</html>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btn_main_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuButtonIcons/50_employee.png"))); // NOI18N
        btn_main_emp.setText("Personel");
        btn_main_emp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_main_emp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_main_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_empActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main_emp);
        btn_main_emp.setBounds(10, 0, 110, 90);

        btn_main_acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuButtonIcons/50_account.png"))); // NOI18N
        btn_main_acc.setText("Muhasebe");
        btn_main_acc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_main_acc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_main_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_accActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main_acc);
        btn_main_acc.setBounds(120, 0, 110, 90);

        btn_main_stc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuButtonIcons/50_stock.png"))); // NOI18N
        btn_main_stc.setText("Stok");
        btn_main_stc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_main_stc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_main_stc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_stcActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main_stc);
        btn_main_stc.setBounds(230, 0, 110, 90);

        btn_main_prd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuButtonIcons/50_products.png"))); // NOI18N
        btn_main_prd.setText("Ürünler");
        btn_main_prd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_main_prd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_main_prd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_prdActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main_prd);
        btn_main_prd.setBounds(340, 0, 110, 90);

        btn_main_rpr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuButtonIcons/50_reports.png"))); // NOI18N
        btn_main_rpr.setText("Raporlar");
        btn_main_rpr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_main_rpr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_main_rpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_rprActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main_rpr);
        btn_main_rpr.setBounds(450, 0, 110, 90);

        jPane2.setBackground(new java.awt.Color(255, 255, 255));
        jPane2.setLayout(null);

        btn_emp.setText("Personeller");
        btn_emp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_emp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empActionPerformed(evt);
            }
        });
        jPane2.add(btn_emp);
        btn_emp.setBounds(10, 10, 100, 90);

        btn_emp_acc.setText("<html><center>Personel<br>Hesapları</html>");
        btn_emp_acc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_emp_acc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_emp_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emp_accActionPerformed(evt);
            }
        });
        jPane2.add(btn_emp_acc);
        btn_emp_acc.setBounds(10, 100, 100, 90);

        desktopPane.setSize(new java.awt.Dimension(400, 600));
        desktopPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desktopPaneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mn_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_file.png"))); // NOI18N
        mn_file.setText("Dosya");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_about.png"))); // NOI18N
        jMenuItem1.setText("Hakkında");
        mn_file.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_database.png"))); // NOI18N
        jMenuItem2.setText("Veri Tabanı");
        mn_file.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_log.png"))); // NOI18N
        jMenuItem3.setText("Log");
        mn_file.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_exit.png"))); // NOI18N
        jMenuItem4.setText("Çıkış");
        mn_file.add(jMenuItem4);

        jMenuBar1.add(mn_file);

        mn_definations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_def.png"))); // NOI18N
        mn_definations.setText("Tanımlar");

        mn_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_person.png"))); // NOI18N
        mn_emp.setText("Personel Tanımları");

        mni_def_emp_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_def_emp_title.setText("Ünvan Tanımları");
        mni_def_emp_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_def_emp_titleActionPerformed(evt);
            }
        });
        mn_emp.add(mni_def_emp_title);

        mni_def_emp_dep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_def_emp_dep.setText("Departman Tanımları");
        mni_def_emp_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_def_emp_depActionPerformed(evt);
            }
        });
        mn_emp.add(mni_def_emp_dep);

        mni_def_emp_perm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_def_emp_perm.setText("Yetki Tanımları");
        mni_def_emp_perm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_def_emp_permActionPerformed(evt);
            }
        });
        mn_emp.add(mni_def_emp_perm);

        mni_def_emp_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_def_emp_emp.setText("Personel Tanımları");
        mni_def_emp_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_def_emp_empActionPerformed(evt);
            }
        });
        mn_emp.add(mni_def_emp_emp);

        mn_definations.add(mn_emp);

        mn_stc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_stock.png"))); // NOI18N
        mn_stc.setText("Stok Tanımları");

        mni_stc_grp_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_stc_grp_up.setText("Stok Ürün Üst Gurup Tanımlar");
        mni_stc_grp_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_stc_grp_upActionPerformed(evt);
            }
        });
        mn_stc.add(mni_stc_grp_up);

        mni_stc_grp_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_stc_grp_sub.setText("Stok Ürün Alt Gurup Tanımlar");
        mni_stc_grp_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_stc_grp_subActionPerformed(evt);
            }
        });
        mn_stc.add(mni_stc_grp_sub);

        mni_stc_prd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_stc_prd.setText("Stok Ürünleri Tanımları");
        mni_stc_prd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_stc_prdActionPerformed(evt);
            }
        });
        mn_stc.add(mni_stc_prd);

        mni_stc_ven_grp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_stc_ven_grp.setText("Satıcı Gurup Tanımları");
        mni_stc_ven_grp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_stc_ven_grpActionPerformed(evt);
            }
        });
        mn_stc.add(mni_stc_ven_grp);

        mni_stc_ven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_stc_ven.setText("Satıcı Tanımları");
        mni_stc_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_stc_venActionPerformed(evt);
            }
        });
        mn_stc.add(mni_stc_ven);

        mn_definations.add(mn_stc);

        mn_prd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_food1.png"))); // NOI18N
        mn_prd.setText("Ürün Tanımları");

        mni_prd_grp_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_prd_grp_up.setText("Ürün Üst Gurup Tanımları");
        mni_prd_grp_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_prd_grp_upActionPerformed(evt);
            }
        });
        mn_prd.add(mni_prd_grp_up);

        mni_prd_grp_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_prd_grp_sub.setText("Ürün Alt gurup Tanımları");
        mni_prd_grp_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_prd_grp_subActionPerformed(evt);
            }
        });
        mn_prd.add(mni_prd_grp_sub);

        mn_definations.add(mn_prd);

        mn_sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_sale.png"))); // NOI18N
        mn_sale.setText("Satış Tanımları");

        mni_sale_cahs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_sale_cahs.setText("Kasier Tanımları");
        mni_sale_cahs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_sale_cahsActionPerformed(evt);
            }
        });
        mn_sale.add(mni_sale_cahs);

        mni_sale_cust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_sale_cust.setText("Müşteri Tanımları");
        mni_sale_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_sale_custActionPerformed(evt);
            }
        });
        mn_sale.add(mni_sale_cust);

        mni_sale_pay_mtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MenuIcons/25_add.png"))); // NOI18N
        mni_sale_pay_mtd.setText("Ödeme Metod Tanımları");
        mni_sale_pay_mtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_sale_pay_mtdActionPerformed(evt);
            }
        });
        mn_sale.add(mni_sale_pay_mtd);

        mn_definations.add(mn_sale);

        jMenuBar1.add(mn_definations);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktopPane)
                    .addComponent(jPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Menu Buttons">
    private void btn_main_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_empActionPerformed
        jPane2.removeAll();
        jPane2.add(btn_emp);
        jPane2.add(btn_emp_acc);
        jPane2.repaint();
    }//GEN-LAST:event_btn_main_empActionPerformed

    private void btn_main_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_accActionPerformed
        jPane2.removeAll();
        jPane2.add(btn_acc_acc);
        btn_acc_acc.setBounds(10, 10, 100, 90);
        jPane2.repaint();
    }//GEN-LAST:event_btn_main_accActionPerformed

    private void btn_main_stcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_stcActionPerformed
        jPane2.removeAll();
        jPane2.add(btn_stc);
        btn_stc.setBounds(10, 10, 100, 90);
        jPane2.add(btn_stc_buy);
        btn_stc_buy.setBounds(10, 100, 100, 90);
        jPane2.add(btn_stc_return);
        btn_stc_return.setBounds(10, 190, 100, 90);
        jPane2.add(btn_stc_transfer);
        btn_stc_transfer.setBounds(10, 280, 100, 90);
        jPane2.add(btn_stc_consumtion);
        btn_stc_consumtion.setBounds(10, 370, 100, 90);
        jPane2.add(btn_stc_lost);
        btn_stc_lost.setBounds(10, 460, 100, 90);
        jPane2.add(btn_stc_all);
        btn_stc_all.setBounds(10, 550, 100, 90);
        jPane2.repaint();
    }//GEN-LAST:event_btn_main_stcActionPerformed

    private void btn_main_prdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_prdActionPerformed
        jPane2.removeAll();
        jPane2.add(btn_prd);
        btn_prd.setBounds(10, 10, 100, 90);
        jPane2.repaint();
    }//GEN-LAST:event_btn_main_prdActionPerformed

    private void btn_main_rprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_rprActionPerformed
        jPane2.removeAll();
        jPane2.add(btn_rpr_sale);
        btn_rpr_sale.setBounds(10, 10, 100, 90);
        jPane2.add(btn_rpr_prd);
        btn_rpr_prd.setBounds(10, 100, 100, 90);
        jPane2.add(btn_rpr_emp);
        btn_rpr_emp.setBounds(10, 190, 100, 90);
        jPane2.repaint();
    }//GEN-LAST:event_btn_main_rprActionPerformed
    // </editor-fold>
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="MenuItem Buttons">
    private void btn_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empActionPerformed
        try {
            emp_emp.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!emp_emp.isVisible()){
            desktopPane.add(emp_emp);
            d = desktopPane.getSize();
            emp_emp.setSize(d);
            emp_emp.setVisible(true);
        }
    }//GEN-LAST:event_btn_empActionPerformed

    private void btn_emp_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emp_accActionPerformed
        try {
            emp_acc.setSelected(rootPaneCheckingEnabled);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!emp_acc.isVisible()){
            desktopPane.add(emp_acc);
            d = desktopPane.getSize();
            emp_acc.setSize(d);
            emp_acc.setVisible(true);
        }
    }//GEN-LAST:event_btn_emp_accActionPerformed

    private void btn_acc_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acc_accActionPerformed
        try {
            acc_acc.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!acc_acc.isVisible()){
            desktopPane.add(acc_acc);
            d = desktopPane.getSize();
            acc_acc.setSize(d);
            acc_acc.setVisible(true);
        }
    }//GEN-LAST:event_btn_acc_accActionPerformed

    private void btn_stcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stcActionPerformed
        try {
            stc_stc.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_stc.isVisible()){
            desktopPane.add(stc_stc);
            d = desktopPane.getSize();
            stc_stc.setSize(d);
            stc_stc.setVisible(true);
        }
    }//GEN-LAST:event_btn_stcActionPerformed

    private void btn_stc_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stc_buyActionPerformed
        try {
            stc_buy.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_buy.isVisible()){
            desktopPane.add(stc_buy);
            d = desktopPane.getSize();
            stc_buy.setSize(d);
            stc_buy.setVisible(true);
        }
    }//GEN-LAST:event_btn_stc_buyActionPerformed

    private void btn_stc_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stc_returnActionPerformed
        try {
            stc_return.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_return.isVisible()){
            desktopPane.add(stc_return);
            d = desktopPane.getSize();
            stc_return.setSize(d);
            stc_return.setVisible(true);
        }
    }//GEN-LAST:event_btn_stc_returnActionPerformed

    private void btn_stc_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stc_transferActionPerformed
        try {
            stc_transfer.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_transfer.isVisible()){
            desktopPane.add(stc_transfer);
            d = desktopPane.getSize();
            stc_transfer.setSize(d);
            stc_transfer.setVisible(true);
        }
    }//GEN-LAST:event_btn_stc_transferActionPerformed
    
    private void btn_stc_consumtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stc_consumtionActionPerformed
        try {
            stc_consumption.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_consumption.isVisible()){
            desktopPane.add(stc_consumption);
            d = desktopPane.getSize();
            stc_consumption.setSize(d);
            stc_consumption.setVisible(true);
        }
    }//GEN-LAST:event_btn_stc_consumtionActionPerformed

    private void btn_stc_lostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stc_lostActionPerformed
        try {
            stc_lost.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_lost.isVisible()){
            desktopPane.add(stc_lost);
            d = desktopPane.getSize();
            stc_lost.setSize(d);
            stc_lost.setVisible(true);
        }
    }//GEN-LAST:event_btn_stc_lostActionPerformed

    private void btn_stc_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stc_allActionPerformed
        try {
            stc_all.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!stc_all.isVisible()){
            desktopPane.add(stc_all);
            d = desktopPane.getSize();
            stc_all.setSize(d);
            stc_all.setVisible(true);
        }
    }//GEN-LAST:event_btn_stc_allActionPerformed

    private void btn_prdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prdActionPerformed
        try {
            prd_prd.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!prd_prd.isVisible()){
            desktopPane.add(prd_prd);
            d = desktopPane.getSize();
            prd_prd.setSize(d);
            prd_prd.setVisible(true);
        }
    }//GEN-LAST:event_btn_prdActionPerformed

    private void mni_def_emp_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_def_emp_titleActionPerformed
        try {
            def_emp_title.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_emp_title.isVisible()){
            desktopPane.add(def_emp_title);
            d = desktopPane.getSize();
            def_emp_title.setSize(d);
            def_emp_title.setVisible(true);
        }
    }//GEN-LAST:event_mni_def_emp_titleActionPerformed

    private void mni_def_emp_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_def_emp_depActionPerformed
        try {
            def_emp_dep.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_emp_dep.isVisible()){
            desktopPane.add(def_emp_dep);
            d = desktopPane.getSize();
            def_emp_dep.setSize(d);
            def_emp_dep.setVisible(true);
        }
    }//GEN-LAST:event_mni_def_emp_depActionPerformed

    private void mni_def_emp_permActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_def_emp_permActionPerformed
        try {
            def_emp_permision.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_emp_permision.isVisible()){
            desktopPane.add(def_emp_permision);
            d = desktopPane.getSize();
            def_emp_permision.setSize(d);
            def_emp_permision.setVisible(true);
        }
    }//GEN-LAST:event_mni_def_emp_permActionPerformed

    private void mni_def_emp_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_def_emp_empActionPerformed
        try {
            emp_emp.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!emp_emp.isVisible()){
            desktopPane.add(emp_emp);
            d = desktopPane.getSize();
            emp_emp.setSize(d);
            emp_emp.setVisible(true);
        }
    }//GEN-LAST:event_mni_def_emp_empActionPerformed

    private void mni_stc_grp_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_stc_grp_upActionPerformed
        try {
            def_stc_prd_grp_up.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_stc_prd_grp_up.isVisible()){
            desktopPane.add(def_stc_prd_grp_up);
            d = desktopPane.getSize();
            def_stc_prd_grp_up.setSize(d);
            def_stc_prd_grp_up.setVisible(true);
        }
    }//GEN-LAST:event_mni_stc_grp_upActionPerformed

    private void mni_stc_grp_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_stc_grp_subActionPerformed
        try {
            def_stc_prd_grp_sub.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_stc_prd_grp_sub.isVisible()){
            desktopPane.add(def_stc_prd_grp_sub);
            d = desktopPane.getSize();
            def_stc_prd_grp_sub.setSize(d);
            def_stc_prd_grp_sub.setVisible(true);
        }
    }//GEN-LAST:event_mni_stc_grp_subActionPerformed

    private void mni_stc_prdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_stc_prdActionPerformed
        try {
            def_stc_products.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_stc_products.isVisible()){
            desktopPane.add(def_stc_products);
            d = desktopPane.getSize();
            def_stc_products.setSize(d);
            def_stc_products.setVisible(true);
        }
    }//GEN-LAST:event_mni_stc_prdActionPerformed

    private void mni_stc_ven_grpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_stc_ven_grpActionPerformed
        try {
            def_stc_ven_groups.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_stc_ven_groups.isVisible()){
            desktopPane.add(def_stc_ven_groups);
            d = desktopPane.getSize();
            def_stc_ven_groups.setSize(d);
            def_stc_ven_groups.setVisible(true);
        }
    }//GEN-LAST:event_mni_stc_ven_grpActionPerformed

    private void mni_stc_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_stc_venActionPerformed
        try {
            def_stc_vendors.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_stc_vendors.isVisible()){
            desktopPane.add(def_stc_vendors);
            d = desktopPane.getSize();
            def_stc_vendors.setSize(d);
            def_stc_vendors.setVisible(true);
        }
    }//GEN-LAST:event_mni_stc_venActionPerformed

    private void mni_prd_grp_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_prd_grp_upActionPerformed
        try {
            def_prd_grp_up.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_prd_grp_up.isVisible()){
            desktopPane.add(def_prd_grp_up);
            d = desktopPane.getSize();
            def_prd_grp_up.setSize(d);
            def_prd_grp_up.setVisible(true);
        }
    }//GEN-LAST:event_mni_prd_grp_upActionPerformed

    private void mni_prd_grp_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_prd_grp_subActionPerformed
        try {
            def_prd_grp_sub.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_prd_grp_sub.isVisible()){
            desktopPane.add(def_prd_grp_sub);
            d = desktopPane.getSize();
            def_prd_grp_sub.setSize(d);
            def_prd_grp_sub.setVisible(true);
        }
    }//GEN-LAST:event_mni_prd_grp_subActionPerformed

    private void mni_sale_cahsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_sale_cahsActionPerformed
        try {
            def_sale_cashier.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_sale_cashier.isVisible()){
            desktopPane.add(def_sale_cashier);
            d = desktopPane.getSize();
            def_sale_cashier.setSize(d);
            def_sale_cashier.setVisible(true);
        }
    }//GEN-LAST:event_mni_sale_cahsActionPerformed

    private void mni_sale_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_sale_custActionPerformed
        try {
            def_sale_customer.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_sale_customer.isVisible()){
            desktopPane.add(def_sale_customer);
            d = desktopPane.getSize();
            def_sale_customer.setSize(d);
            def_sale_customer.setVisible(true);
        }
    }//GEN-LAST:event_mni_sale_custActionPerformed

    private void mni_sale_pay_mtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_sale_pay_mtdActionPerformed
        try {
            def_sale_pay_method.setSelected(true);
        } catch (PropertyVetoException e) {
            Logger.getLogger(_Main.class.getName()).log(Level.SEVERE, null, e);
        }
        if(!def_sale_pay_method.isVisible()){
            desktopPane.add(def_sale_pay_method);
            d = desktopPane.getSize();
            def_sale_pay_method.setSize(d);
            def_sale_pay_method.setVisible(true);
        }
    }//GEN-LAST:event_mni_sale_pay_mtdActionPerformed

    private void desktopPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopPaneMouseClicked
        jPane2.removeAll();
        jPane2.repaint();
    }//GEN-LAST:event_desktopPaneMouseClicked
    
    // </editor-fold>
    
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        code for aple menu bar :)
//        System.setProperty("apple.laf.useScreenMenuBar", "true");
//        code for aple menu bar :)
//        System.setProperty("apple.laf.useScreenMenuBar", "true");
        
        java.awt.EventQueue.invokeLater(() -> {
            new _Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acc_acc;
    private javax.swing.JButton btn_emp;
    private javax.swing.JButton btn_emp_acc;
    private javax.swing.JButton btn_main_acc;
    private javax.swing.JButton btn_main_emp;
    private javax.swing.JButton btn_main_prd;
    private javax.swing.JButton btn_main_rpr;
    private javax.swing.JButton btn_main_stc;
    private javax.swing.JButton btn_prd;
    private javax.swing.JButton btn_rpr_emp;
    private javax.swing.JButton btn_rpr_prd;
    private javax.swing.JButton btn_rpr_sale;
    private javax.swing.JButton btn_stc;
    private javax.swing.JButton btn_stc_all;
    private javax.swing.JButton btn_stc_buy;
    private javax.swing.JButton btn_stc_consumtion;
    private javax.swing.JButton btn_stc_lost;
    private javax.swing.JButton btn_stc_return;
    private javax.swing.JButton btn_stc_transfer;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mn_definations;
    private javax.swing.JMenu mn_emp;
    private javax.swing.JMenu mn_file;
    private javax.swing.JMenu mn_prd;
    private javax.swing.JMenu mn_sale;
    private javax.swing.JMenu mn_stc;
    private javax.swing.JMenuItem mni_def_emp_dep;
    private javax.swing.JMenuItem mni_def_emp_emp;
    private javax.swing.JMenuItem mni_def_emp_perm;
    private javax.swing.JMenuItem mni_def_emp_title;
    private javax.swing.JMenuItem mni_prd_grp_sub;
    private javax.swing.JMenuItem mni_prd_grp_up;
    private javax.swing.JMenuItem mni_sale_cahs;
    private javax.swing.JMenuItem mni_sale_cust;
    private javax.swing.JMenuItem mni_sale_pay_mtd;
    private javax.swing.JMenuItem mni_stc_grp_sub;
    private javax.swing.JMenuItem mni_stc_grp_up;
    private javax.swing.JMenuItem mni_stc_prd;
    private javax.swing.JMenuItem mni_stc_ven;
    private javax.swing.JMenuItem mni_stc_ven_grp;
    // End of variables declaration//GEN-END:variables
}
