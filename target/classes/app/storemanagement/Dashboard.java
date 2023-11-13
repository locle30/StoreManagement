package app.storemanagement;

import app.storemanagement.utils.Util;
import app.storemanagement.view.Category;
import app.storemanagement.view.Customer;
import app.storemanagement.view.Overview;
import app.storemanagement.view.Product;
import app.storemanagement.view.Employee;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Hung Pham
 */
public class Dashboard extends javax.swing.JFrame {

    Product productPanel = new Product();
    Employee employeePanel = new Employee();
    Customer customerPanel = new Customer();
    Overview overviewPanel = new Overview();
    Category categoryPanel = new Category();

    public Dashboard() {
        initComponents();
        cardLayout = (CardLayout) (jPanel1.getLayout());
        jPanel1.add(productPanel, "product");
        jPanel1.add(employeePanel, "employee");
        jPanel1.add(customerPanel, "customer");
        jPanel1.add(overviewPanel, "overview");
        jPanel1.add(categoryPanel, "category");
        cardLayout.show(jPanel1, "overview");
        overviewLabel.setForeground(Color.YELLOW);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Util.confirmClose();
            }
        });
    }

    CardLayout cardLayout = new CardLayout();

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
        employeeLabel = new javax.swing.JLabel();
        productLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        invoiceLabel = new javax.swing.JLabel();
        overviewLabel = new javax.swing.JLabel();
        refundLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý cửa hàng");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(76, 149, 108));
        jPanel2.setForeground(new java.awt.Color(76, 149, 108));

        employeeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        employeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employees.png"))); // NOI18N
        employeeLabel.setText("   Nhân viên");
        employeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeLabelMouseClicked(evt);
            }
        });

        productLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 255, 255));
        productLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/products.png"))); // NOI18N
        productLabel.setText("   Sản phẩm");
        productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLabelMouseClicked(evt);
            }
        });

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        categoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categories.png"))); // NOI18N
        categoryLabel.setText("   Phân loại");
        categoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryLabelMouseClicked(evt);
            }
        });

        customerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer.png"))); // NOI18N
        customerLabel.setText("   Khách hàng");
        customerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerLabelMouseClicked(evt);
            }
        });

        invoiceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        invoiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        invoiceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/invoice.png"))); // NOI18N
        invoiceLabel.setText("   Hóa đơn");
        invoiceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceLabelMouseClicked(evt);
            }
        });

        overviewLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overviewLabel.setForeground(new java.awt.Color(255, 255, 255));
        overviewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/statistics.png"))); // NOI18N
        overviewLabel.setText("   Tổng quan");
        overviewLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overviewLabelMouseClicked(evt);
            }
        });

        refundLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refundLabel.setForeground(new java.awt.Color(255, 255, 255));
        refundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refund.png"))); // NOI18N
        refundLabel.setText("   Hoàn trả");
        refundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refundLabelMouseClicked(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        infoLabel.setText("Xin chào, username");

        logoutLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logoutLabel.setText("   Đăng xuất");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(invoiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(overviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refundLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(infoLabel)
                            .addComponent(logoutLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(overviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(invoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void overviewLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewLabelMouseClicked
        cardLayout.show(jPanel1, "overview");
        overviewLabel.setForeground(Color.YELLOW);
        categoryLabel.setForeground(Color.WHITE);
        productLabel.setForeground(Color.WHITE);
        employeeLabel.setForeground(Color.WHITE);
        customerLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_overviewLabelMouseClicked

    private void employeeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeLabelMouseClicked
        cardLayout.show(jPanel1, "employee");
        overviewLabel.setForeground(Color.WHITE);
        categoryLabel.setForeground(Color.WHITE);
        productLabel.setForeground(Color.WHITE);
        employeeLabel.setForeground(Color.YELLOW);
        customerLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_employeeLabelMouseClicked

    private void productLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseClicked
        cardLayout.show(jPanel1, "product");
        overviewLabel.setForeground(Color.WHITE);
        categoryLabel.setForeground(Color.WHITE);
        productLabel.setForeground(Color.YELLOW);
        employeeLabel.setForeground(Color.WHITE);
        customerLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_productLabelMouseClicked

    private void categoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryLabelMouseClicked
        cardLayout.show(jPanel1, "category");
        overviewLabel.setForeground(Color.WHITE);
        categoryLabel.setForeground(Color.YELLOW);
        productLabel.setForeground(Color.WHITE);
        employeeLabel.setForeground(Color.WHITE);
        customerLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_categoryLabelMouseClicked

    private void customerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerLabelMouseClicked
        cardLayout.show(jPanel1, "customer");
        overviewLabel.setForeground(Color.WHITE);
        categoryLabel.setForeground(Color.WHITE);
        productLabel.setForeground(Color.WHITE);
        employeeLabel.setForeground(Color.WHITE);
        customerLabel.setForeground(Color.YELLOW);
    }//GEN-LAST:event_customerLabelMouseClicked

    private void invoiceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceLabelMouseClicked

    }//GEN-LAST:event_invoiceLabelMouseClicked

    private void refundLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refundLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refundLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel overviewLabel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel refundLabel;
    // End of variables declaration//GEN-END:variables
}
