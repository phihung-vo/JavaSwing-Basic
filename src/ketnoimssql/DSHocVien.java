package ketnoimssql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class DSHocVien extends javax.swing.JFrame {

    static DefaultTableModel dtm;
    public DSHocVien() {
        initComponents();
        loadComboBox();
        layDSHocVien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel_DSSach = new javax.swing.JLabel();
        jLabel_ThongTin = new javax.swing.JLabel();
        jLabel_MaHV = new javax.swing.JLabel();
        txt_MaHV = new javax.swing.JTextField();
        jLabel_HoTen = new javax.swing.JLabel();
        txt_HoTen = new javax.swing.JTextField();
        jLabel_TuaSach = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel_Tinh = new javax.swing.JLabel();
        jLabel_ChucNang = new javax.swing.JLabel();
        btn_Xoa = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();
        jLabel_DanhSach = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Hocvien = new javax.swing.JTable();
        jLabel_TuaSach1 = new javax.swing.JLabel();
        btn_Nam = new javax.swing.JRadioButton();
        btn_Nu = new javax.swing.JRadioButton();
        cbx_Tinh = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_DSSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DSSach.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_DSSach.setText("DANH SÁCH HỌC VIÊN");

        jLabel_ThongTin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ThongTin.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_ThongTin.setText("Thông tin");

        jLabel_MaHV.setText("Mã HV");

        jLabel_HoTen.setText("Họ tên");

        jLabel_TuaSach.setText("Email");

        jLabel_Tinh.setText("Tỉnh");

        jLabel_ChucNang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ChucNang.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_ChucNang.setText("Chức năng");

        btn_Xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(0, 51, 153));
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Thoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(0, 51, 153));
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_Luu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Luu.setForeground(new java.awt.Color(0, 51, 153));
        btn_Luu.setText("Lưu");
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        jLabel_DanhSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_DanhSach.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_DanhSach.setText("Danh sách");

        jTable_Hocvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ HỌC VIÊN", "HỌ TÊN", "GIỚI TÍNH", "TỈNH", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Hocvien);

        jLabel_TuaSach1.setText("Giới tính");

        buttonGroup1.add(btn_Nam);
        btn_Nam.setText("Nam");

        buttonGroup1.add(btn_Nu);
        btn_Nu.setText("Nữ");

        cbx_Tinh.setEditable(true);
        cbx_Tinh.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ThongTin)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_DanhSach)
                    .addComponent(jLabel_ChucNang)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btn_Luu)
                        .addGap(54, 54, 54)
                        .addComponent(btn_Xoa)
                        .addGap(58, 58, 58)
                        .addComponent(btn_Thoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_TuaSach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_MaHV)
                                .addGap(18, 18, 18)
                                .addComponent(txt_MaHV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_HoTen)
                                .addGap(0, 54, Short.MAX_VALUE))
                            .addComponent(jLabel_Tinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_TuaSach1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btn_Nam)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Nu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel_DSSach)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_DSSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ThongTin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_MaHV)
                            .addComponent(txt_MaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TuaSach)
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_HoTen)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Tinh)
                            .addComponent(cbx_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TuaSach1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Nam)
                        .addComponent(btn_Nu)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_ChucNang)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Thoat)
                    .addComponent(btn_Luu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DanhSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void layDSHocVien(){
        try{
            dtm = (DefaultTableModel) jTable_Hocvien.getModel();
            dtm.setNumRows(0);
            String query = "SELECT hv.mahv, hv.hoten, hv.phai, t.tentinh, hv.email FROM hocvien as hv, tinh as t WHERE hv.matinh = t.matinh";
            
            Connection ketNoi = KetNoiMSSQL.layKetNoi();
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            
            while(ketQua.next()){
                Vector<Object> data = new Vector<>();
                data.add(ketQua.getString(1));
                data.add(ketQua.getString(2));
                data.add(ketQua.getString(3));
                data.add(ketQua.getString(4));
                data.add(ketQua.getString(5));
                dtm.addRow(data);
            }
        }
        catch(SQLException ex){
                JOptionPane.showConfirmDialog(null, ex, "Khong the them vao table!", WIDTH);
        }
    }
    
    private void themHocVien(String maHV, String hoTen, String gioiTinh, String email, int tinh) {
        Connection ketNoi = KetNoiMSSQL.layKetNoi();
        String sql = "insert into dbo.HOCVIEN values (?,?,?,?,?)";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maHV);
            ps.setString(2, hoTen);
            ps.setString(3, gioiTinh);
            ps.setInt(4, tinh);
            ps.setString(5, email);
            ps.executeUpdate();
        }
        catch(SQLException ex){
               JOptionPane.showConfirmDialog(null, ex, "Khong tim thay table nay trong DB!", WIDTH);     
        }
    }
    
    public void loadComboBox(){
        Connection ketNoi = KetNoiMSSQL.layKetNoi();
        String query = "SELECT TENTINH FROM dbo.TINH";
        try{
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next()){
                cbx_Tinh.addItem(ketQua.getString("TENTINH"));
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex, "Loi roi cha oi!", 1);
        }
    }
    
    private boolean kiemTraHV(String maHV){
        Connection ketNoi = KetNoiMSSQL.layKetNoi();
        boolean tonTai = false;
        String sql = "select * from HOCVIEN where MAHV = '" +maHV+ "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) tonTai = true;
            rs.close();
            ps.close();
            ketNoi.close();
        }catch(SQLException e){
            Logger.getLogger(DSHocVien.class.getName()).log(Level.SEVERE, null, e);
        }
        return tonTai;
    }
    
    private void xoaHocVien(String maHV){        
        String sql = "delete from HOCVIEN where MAHV = '" + maHV + "'";
        try{
            Connection ketNoi = KetNoiMSSQL.layKetNoi();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        }catch(SQLException e){
            Logger.getLogger(DSHocVien.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int i = jTable_Hocvien.getSelectedRow();
        if(i<0){
            JOptionPane.showConfirmDialog(this, "Vui long chon hoc vien can xoa!");
        }else{
            dtm = (DefaultTableModel) jTable_Hocvien.getModel();
            String maHV = dtm.getValueAt(i,0).toString().trim();
            boolean check = kiemTraHV(maHV);
            if(check == true){
                int ret=JOptionPane.showConfirmDialog(this, "Ban chac chan muon xoa?", "Xac nhan", 0);
                if(ret==JOptionPane.OK_OPTION){
                    xoaHocVien(maHV);
                    JOptionPane.showMessageDialog(this, "Xoa Hoc Vien thanh cong.");
                    this.layDSHocVien();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Khong the xoa! Chua co thong tin hoc vien nay trong he thong.");
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        this.dispose();
        new QuanLyThuVien().setVisible(true);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        if(txt_MaHV.getText().length() > 0 && txt_HoTen.getText().length() > 0 && txt_Email.getText().length() > 0 && !cbx_Tinh.getSelectedItem().toString().equals("")
                && (btn_Nam.isSelected() || btn_Nu.isSelected())){
            
            String sql = "SELECT matinh FROM tinh WHERE tentinh = '" + cbx_Tinh.getSelectedItem().toString() + "'";
            int tinh = 0;
            try {
                Connection cn = KetNoiMSSQL.layKetNoi();                        
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {tinh = rs.getInt("matinh");}

                String maHV = txt_MaHV.getText().trim().toUpperCase();
                String hoTen = txt_HoTen.getText().trim().toUpperCase();
                String gioiTinh = btn_Nam.isSelected() == true ? "Nam" : "Nữ";
                String email = txt_Email.getText();

    //==================== Lưu ko kiểm tra ====================
                themHocVien(maHV, hoTen, gioiTinh, email,tinh);
                JOptionPane.showMessageDialog(this, "Thêm học viên thành công");
                this.layDSHocVien();
                txt_MaHV.setText("");
                txt_HoTen.setText("");
                txt_Email.setText("");
    //=========================================================
                ps.close();
                rs.close();
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DSHocVien.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }else JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");        
    }//GEN-LAST:event_btn_LuuActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DSHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DSHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DSHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DSHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DSHocVien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Luu;
    private javax.swing.JRadioButton btn_Nam;
    private javax.swing.JRadioButton btn_Nu;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_Tinh;
    private javax.swing.JLabel jLabel_ChucNang;
    private javax.swing.JLabel jLabel_DSSach;
    private javax.swing.JLabel jLabel_DanhSach;
    private javax.swing.JLabel jLabel_HoTen;
    private javax.swing.JLabel jLabel_MaHV;
    private javax.swing.JLabel jLabel_ThongTin;
    private javax.swing.JLabel jLabel_Tinh;
    private javax.swing.JLabel jLabel_TuaSach;
    private javax.swing.JLabel jLabel_TuaSach1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Hocvien;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_HoTen;
    private javax.swing.JTextField txt_MaHV;
    // End of variables declaration//GEN-END:variables
}
