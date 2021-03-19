package ketnoimssql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class DSSach extends javax.swing.JFrame {

    static DefaultTableModel dtm;
    public DSSach() {
        initComponents();
        layDauSach();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_DSSach = new javax.swing.JLabel();
        jLabel_ThongTin = new javax.swing.JLabel();
        jLabel_MaSach = new javax.swing.JLabel();
        txt_MaSach = new javax.swing.JTextField();
        jLabel_TacGia = new javax.swing.JLabel();
        txt_TacGia = new javax.swing.JTextField();
        jLabel_TuaSach = new javax.swing.JLabel();
        txt_TuaSach = new javax.swing.JTextField();
        jLabel_NXB = new javax.swing.JLabel();
        txt_NXB = new javax.swing.JTextField();
        jLabel_ChucNang = new javax.swing.JLabel();
        btn_Xoa = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();
        jLabel_DanhSach = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_DauSach = new javax.swing.JTable();

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
        jLabel_DSSach.setText("DANH SÁCH CÁC ĐẦU SÁCH TRONG THƯ VIỆN");

        jLabel_ThongTin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ThongTin.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_ThongTin.setText("Thông tin");

        jLabel_MaSach.setText("Mã sách");

        jLabel_TacGia.setText("Tác giả");

        jLabel_TuaSach.setText("Tựa sách");

        jLabel_NXB.setText("Nhà xuất bản");

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

        jTable_DauSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SÁCH", "TỰA SÁCH", "TÁC GIẢ", "NHÀ XUẤT BẢN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_DauSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DauSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_DauSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btn_Luu)
                        .addGap(54, 54, 54)
                        .addComponent(btn_Xoa))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel_TuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_TuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_Thoat)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_NXB)
                                .addGap(18, 18, 18)
                                .addComponent(txt_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel_DSSach)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_ThongTin))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_ChucNang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_DanhSach)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_DSSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ThongTin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_MaSach)
                            .addComponent(txt_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TuaSach)
                            .addComponent(txt_TuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jLabel_ChucNang)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Thoat)
                    .addComponent(btn_Luu))
                .addGap(19, 19, 19)
                .addComponent(jLabel_DanhSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //Hiển thị thông tin tất cả đầu sách có trong thư viện
    private void layDauSach() {    
        DefaultTableModel dtm = (DefaultTableModel) jTable_DauSach.getModel();
        dtm.setNumRows(0);        
        Connection ketNoi = KetNoiMSSQL.layKetNoi();
        String sql = "select * from SACH";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("MASACH"));
                vt.add(rs.getString("TUASACH"));
                vt.add(rs.getString("TACGIA"));
                vt.add(rs.getString("NHAXUATBAN"));
                dtm.addRow(vt);
            }
            jTable_DauSach.setModel(dtm);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            Logger.getLogger(DSSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Lưu sách
    private void luuDauSach(String maSach, String tuaSach, String tacGia, String nhaXuatBan) {
        Connection ketNoi = KetNoiMSSQL.layKetNoi();
        String sql = "insert into SACH values (?,?,?,?)";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maSach);
            ps.setString(2, tuaSach);
            ps.setString(3, tacGia);
            ps.setString(4, nhaXuatBan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DSSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Kiểm tra sách đã tồn tại chưa. 0: Chưa có, 1: Sách đã có rồi.
    private boolean kiemTraSach(String maSach) {                
        String sql = "select * from SACH where MASACH = '" + maSach + "'";
        boolean tonTai = false;
        try {
            Connection cn = KetNoiMSSQL.layKetNoi();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) tonTai = true;
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DSSach.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return tonTai;
    }
    
    private void xoaDauSach(String maSach) {
        Connection ketNoi = KetNoiMSSQL.layKetNoi();
        String sql = "delete from SACH where MASACH = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maSach);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DSSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        
        int i = jTable_DauSach.getSelectedRow();
        if(i<0){
            JOptionPane.showMessageDialog(this, "Vui long chon dau sach can xoa!");
        }else{
            dtm = (DefaultTableModel) jTable_DauSach.getModel();
            String maSach = dtm.getValueAt(i,0).toString().trim();
            boolean check = kiemTraSach(maSach);
            if(check == true){
                int ret=JOptionPane.showConfirmDialog(this, "Ban chac chan muon xoa?", "Xac nhan", 0);
                if(ret==JOptionPane.OK_OPTION){
                    xoaDauSach(maSach);
                    JOptionPane.showMessageDialog(this, "Xoa sach thanh cong");
                    this.layDauSach();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Khong tim thay thong tin sach can xoa.\nXoa khong thanh cong!");
            }
        }       
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        // TODO add your handling code here:
        //System.exit(0); //Đóng tất cả các form, tức là đóng cả chương trình.
        this.dispose(); //Chỉ đóng form hiện hành.
        new QuanLyThuVien().setVisible(true);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        String maSach = txt_MaSach.getText().trim().toUpperCase(),
               tuaSach = txt_TuaSach.getText(),
               tacGia = txt_TacGia.getText(),
               nhaXuatBan = txt_NXB.getText();
        
//==================== Lưu ko kiểm tra
//        luuDauSach(maSach, tuaSach, tacGia, nhaXuatBan);
//        JOptionPane.showMessageDialog(this, "Thêm đầu sách thành công");                
//        this.layDauSach();
        
//=================== Lưu có kiểm tra
        int kiemTraMaSach = 0, kiemTraTuaSach = 0, kiemTraTacGia = 0, kiemTraNhaXuatBan = 0;
        if (maSach.equals("")) {
            kiemTraMaSach = 1;
            JOptionPane.showMessageDialog(this, "Mã sách không được bỏ trống");
        }
        else if (tuaSach.equals("")) {
            kiemTraTuaSach = 1;
            JOptionPane.showMessageDialog(this, "Tựa sách không được bỏ trống");
        }
        else if (tacGia.equals("")) {
            kiemTraTacGia = 1;
            JOptionPane.showMessageDialog(this, "Tác giả không được bỏ trống");
        }
        else if (nhaXuatBan.equals("")) {
            kiemTraNhaXuatBan = 1;
            JOptionPane.showMessageDialog(this, "Nhà xuất bản không được bỏ trống");
        }
        else if (kiemTraMaSach != 1 && kiemTraNhaXuatBan != 1 && kiemTraTacGia != 1 && kiemTraTuaSach != 1) {
            boolean check = kiemTraSach(maSach);
            if (check == true) {
                System.out.println("Sach da ton tai");
                JOptionPane.showMessageDialog(this, "Mã sách đã có, bạn muốn cập nhật lại thông tin");
            } 
            else {                
                luuDauSach(maSach, tuaSach, tacGia, nhaXuatBan);
                JOptionPane.showMessageDialog(this, "Thêm đầu sách thành công");                
                this.layDauSach();
            }
        }
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void jTable_DauSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DauSachMouseClicked
        int i = jTable_DauSach.getSelectedRow();
        dtm = (DefaultTableModel) jTable_DauSach.getModel();
        
        txt_MaSach.setText(dtm.getValueAt(i, 0).toString()); //Dòng i cột 0
        txt_TuaSach.setText(dtm.getValueAt(i, 1).toString()); //Dòng i cột 1
        txt_TacGia.setText(dtm.getValueAt(i, 2).toString());
        txt_NXB.setText(dtm.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable_DauSachMouseClicked

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
//            java.util.logging.Logger.getLogger(DSSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DSSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DSSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DSSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DSSach().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel_ChucNang;
    private javax.swing.JLabel jLabel_DSSach;
    private javax.swing.JLabel jLabel_DanhSach;
    private javax.swing.JLabel jLabel_MaSach;
    private javax.swing.JLabel jLabel_NXB;
    private javax.swing.JLabel jLabel_TacGia;
    private javax.swing.JLabel jLabel_ThongTin;
    private javax.swing.JLabel jLabel_TuaSach;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_DauSach;
    private javax.swing.JTextField txt_MaSach;
    private javax.swing.JTextField txt_NXB;
    private javax.swing.JTextField txt_TacGia;
    private javax.swing.JTextField txt_TuaSach;
    // End of variables declaration//GEN-END:variables
}