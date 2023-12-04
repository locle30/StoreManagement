package app.storemanagement.view;

import app.storemanagement.controller.ProductCtrl;
import app.storemanagement.middleware.VerifyAccess;
import app.storemanagement.model.CategoryModel;
import app.storemanagement.model.Connection.DBConnection;
import app.storemanagement.model.ProductModel;
import app.storemanagement.utils.Util;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author Hung Pham
 */
public class ProductDetail extends javax.swing.JFrame {

    private int id;
    private String userRole;
    private boolean dataChanged = false;

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public boolean isDataChanged() {
        return dataChanged;
    }
    
    
    /**
     * Creates new form ProductDetail
     *
     * @param id
     */
    public ProductDetail(int id) {
        this.id = id;
        initComponents();
        getCategories();
        productID.setText(String.valueOf(id));
        initPage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        hsd = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        qtyInStock = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        unitPrice = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        entryDate = new com.toedter.calendar.JDateChooser();
        nsx = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        productID = new javax.swing.JTextField();
        cateCb = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        topLabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productCondition = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin sản phẩm");
        setResizable(false);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(76, 149, 108));
        jLabel41.setText("Miêu tả");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(76, 149, 108));
        jLabel46.setText("Số lượng trong kho");

        hsd.setEnabled(false);
        JTextFieldDateEditor _hsd = ((JTextFieldDateEditor) hsd.getDateEditor());
        _hsd.setEnabled(true);
        _hsd.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume(); // Chặn sự kiện phím
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
                    e.consume(); // Chặn sự kiện phím
                }
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(76, 149, 108));
        jLabel40.setText("Tên SP");

        qtyInStock.setEditable(false);
        qtyInStock.setBackground(new java.awt.Color(255, 255, 255));

        des.setEditable(false);
        des.setBackground(new java.awt.Color(255, 255, 255));

        unitPrice.setEditable(false);
        unitPrice.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(76, 149, 108));
        jLabel47.setText("ID");

        entryDate.setEnabled(false);
        JTextFieldDateEditor _entry = ((JTextFieldDateEditor) entryDate.getDateEditor());
        _entry.setEnabled(true);
        _entry.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume(); // Chặn sự kiện phím
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
                    e.consume(); // Chặn sự kiện phím
                }
            }
        });

        nsx.setEnabled(false);
        JTextFieldDateEditor _nsx = ((JTextFieldDateEditor) nsx.getDateEditor());
        _nsx.setEnabled(true);
        _nsx.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume(); // Chặn sự kiện phím
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
                    e.consume(); // Chặn sự kiện phím
                }
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(76, 149, 108));
        jLabel49.setText("HSD");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(76, 149, 108));
        jLabel43.setText("Ngày nhập");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(76, 149, 108));
        jLabel42.setText("Phân loại");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(76, 149, 108));
        jLabel44.setText("NSX");

        productID.setEditable(false);
        productID.setBackground(new java.awt.Color(255, 255, 255));
        productID.setFocusable(false);

        cateCb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cateCb.setEnabled(false);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(76, 149, 108));
        jLabel45.setText("Đơn giá (VND)");

        topLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel.setForeground(new java.awt.Color(76, 149, 108));
        topLabel.setText("Chi tiết sản phẩm");

        editBtn.setBackground(new java.awt.Color(76, 149, 108));
        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Sửa");
        editBtn.setBorder(null);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(242, 242, 242));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Lưu");
        saveBtn.setBorder(null);
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Thời gian tạo: ");

        jLabel2.setText("Cập nhật lần cuối: ");

        productCondition.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        productCondition.setText("Tình trạng sản phẩm: ");

        productName.setMaximumSize(new java.awt.Dimension(200, 35));

        cancelBtn.setBackground(new java.awt.Color(242, 242, 242));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Hủy");
        cancelBtn.setBorder(null);
        cancelBtn.setEnabled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productCondition))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45))
                                .addGap(56, 56, 56)
                                .addComponent(jLabel44)
                                .addGap(247, 247, 247)
                                .addComponent(jLabel49))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cateCb, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel41)
                                            .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nsx, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel42)
                                            .addComponent(qtyInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hsd, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel46)
                                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(topLabel)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productCondition)
                .addGap(20, 20, 20)
                .addComponent(topLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productID, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cateCb, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nsx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel41)
                    .addComponent(jLabel43))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtyInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        ((AbstractDocument) qtyInStock.getDocument()).setDocumentFilter(new LimitDocumentFilter(10));
        ((AbstractDocument) des.getDocument()).setDocumentFilter(new LimitDocumentFilter(200));
        ((AbstractDocument) unitPrice.getDocument()).setDocumentFilter(new LimitDocumentFilter(10));
        ((AbstractDocument) productName.getDocument()).setDocumentFilter(new LimitDocumentFilter(100));
        productName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
            }
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
                    e.consume(); // Chặn sự kiện phím
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void initPage() {
        String query = """
                   SELECT Product_ID, Product_Name, Category.Category_ID, Category_Name, Unit_Price,
                   Quantity_In_Stock, Description, Manufacture_Date, Expiry_Date, Entry_Date, 
                   FORMAT(Created_At, 'HH:mm dd/MM/yyyy') as Created_Time,
                   FORMAT(Updated_At, 'HH:mm dd/MM/yyyy') as Updated_Time 
                   FROM Product inner join Category ON Category.Category_ID = Product.Category_ID
                   WHERE Product_ID = ?
                   """;
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    updateUI(rs);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateUI(ResultSet rs) throws SQLException {
        int categoryId = rs.getInt("Category_ID");
        double unitP = rs.getDouble("Unit_Price");
        int quantityInStock = rs.getInt("Quantity_In_Stock");
        String description = rs.getString("Description");
        Date manufactureDate = rs.getDate("Manufacture_Date");
        Date expiryDate = rs.getDate("Expiry_Date");
        Date entry = rs.getDate("Entry_Date");
        String name = rs.getString("Product_Name");
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cateCb.getModel();
        String cateName = rs.getString("Category_Name");

        jLabel1.setText("Thời gian tạo: " + rs.getString("Created_Time"));
        productName.setText(name);
        unitPrice.setText(Util.convertToVND(unitP));
        cateCb.setSelectedIndex(comboBoxModel.getIndexOf(new CategoryModel(categoryId, cateName)));
        qtyInStock.setText(String.valueOf(quantityInStock));
        des.setText(description);
        nsx.setDate(manufactureDate);
        hsd.setDate(expiryDate);
        entryDate.setDate(entry);
        checkHSD(expiryDate, quantityInStock);
        jLabel2.setText(rs.getString("Updated_Time") == null ? "" : "Cập nhật lần cuối: " + rs.getString("Updated_Time"));
    }

    private void preventChange() {
        productName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
                    e.consume(); // Chặn sự kiện phím
                }
            }
        });
    }

    private void checkHSD(Date hsd, int qty) {
        Date today = new Date();
        if (hsd.before(today)) {
            productCondition.setText("Tình trạng: Hết HSD");
            productCondition.setForeground(Color.red);
        } else {
            if (qty > 0) {
                productCondition.setText("Tình trạng: Còn hàng");
                productCondition.setForeground(Color.decode("#4C956C"));
            } else {
                productCondition.setText("Tình trạng: Hết hàng");
                productCondition.setForeground(Color.red);
            }
        }
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        VerifyAccess verifyAccess = new VerifyAccess();
        if (verifyAccess.authorizationNVBH(userRole)) {
            for (KeyListener keyListener : productName.getKeyListeners()) {
                productName.removeKeyListener(keyListener);
            }
            String unitP = unitPrice.getText();
            setProperties("Cập nhật thông tin", true, "#4C956C");
            try {
                unitPrice.setText(Util.vndConvertToNumber(unitP));
            } catch (ParseException ex) {
                Logger.getLogger(ProductDetail.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Bạn muốn hủy thao tác này?", "Alert",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            initPage();
            setProperties("Thông tin sản phẩm", false, "#F2F2F2");
            preventChange();
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        id = Integer.parseInt(productID.getText());
        String name = productName.getText().trim();
        CategoryModel categoryItem = (CategoryModel) cateCb.getSelectedItem();
        int categoryId = categoryItem.getId();
        Date manufactureDate = nsx.getDate();
        Date expiryDate = hsd.getDate();
        Date entry = entryDate.getDate();
        try {
            double unitP = Double.parseDouble(unitPrice.getText().trim());
            int quantityInStock = Integer.parseInt(qtyInStock.getText().trim());
            String description = des.getText().trim();

            if (Util.validateProductInput(name, manufactureDate, expiryDate, entry, unitP, quantityInStock)) {
                ProductModel product = new ProductModel(id, name, categoryId, unitP, quantityInStock, description, manufactureDate, expiryDate, entry);
                ProductCtrl tmp = new ProductCtrl(DBConnection.getConnection());
                int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn cập nhật sản phẩm này?", "Alert",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    boolean success = tmp.update(product);
                    if (success) {
                        JOptionPane.showMessageDialog(null, "Đã cập nhật sản phẩm");
                        setProperties("Thông tin sản phẩm", false, "#F2F2F2");
                        checkHSD(expiryDate, quantityInStock);
                        jLabel2.setText("Cập nhật lần cuối: " + Util.getCurrentDateTime());
                        double unit_Tmp = Double.parseDouble(unitPrice.getText());
                        unitPrice.setText(Util.convertToVND(unit_Tmp));
                        preventChange();
                        dataChanged = true;
                    }
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Đầu vào không hợp lệ", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void setProperties(String topLbText, boolean b, String colorCode) {
        topLabel.setText(topLbText);
        unitPrice.setEditable(b);
        des.setEditable(b);
        qtyInStock.setEditable(b);
        nsx.getCalendarButton().setEnabled(b);
        hsd.getCalendarButton().setEnabled(b);
        entryDate.getCalendarButton().setEnabled(b);
        cateCb.setEnabled(b);
        saveBtn.setEnabled(b);
        cancelBtn.setEnabled(b);
        saveBtn.setBackground(Color.decode(colorCode));
        cancelBtn.setBackground(Color.decode(colorCode));
    }

    private void getCategories() {
        try (Connection conn = DBConnection.getConnection(); Statement St = conn.createStatement(); ResultSet Rs = St.executeQuery("SELECT * FROM Category")) {

            // Tạo một DefaultComboBoxModel để lưu trữ các mục category
            DefaultComboBoxModel<CategoryModel> model = new DefaultComboBoxModel<>();

            while (Rs.next()) {
                int cateId = Rs.getInt("Category_ID");
                String name = Rs.getString("Category_Name");
                // Tạo một đối tượng CategoryItem và thêm nó vào model
                model.addElement(new CategoryModel(cateId, name));
            }

            // Đặt model cho ComboBox
            cateCb.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<CategoryModel> cateCb;
    private javax.swing.JTextField des;
    private javax.swing.JButton editBtn;
    private com.toedter.calendar.JDateChooser entryDate;
    private com.toedter.calendar.JDateChooser hsd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private com.toedter.calendar.JDateChooser nsx;
    private javax.swing.JLabel productCondition;
    private javax.swing.JTextField productID;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField qtyInStock;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel topLabel;
    private javax.swing.JTextField unitPrice;
    // End of variables declaration//GEN-END:variables
}
