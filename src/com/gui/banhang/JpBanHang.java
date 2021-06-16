/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.banhang;

import com.dao.IChiTietHoaDonDAO;
import com.dao.IHoaDonDAO;
import com.dao.IKhachHangDAO;
import com.dao.INhanVienDAO;
import com.dao.ISanPhamDAO;
import com.dao.impl.ChiTietHoaDonDAO;
import com.dao.impl.HoaDonDAO;
import com.dao.impl.KhachHangDAO;
import com.dao.impl.NhanVienDAO;
import com.dao.impl.SanPhamDAO;
import com.gui.main.Run;
import com.model.ChiTietHoaDonModel;
import com.model.HoaDonModel;
import com.model.SanPhamModel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author VITQUAY
 */
public class JpBanHang extends javax.swing.JPanel {

    HoaDonModel hd;
    Map<Integer, ChiTietHoaDonModel> arrCTHD = new HashMap<>();
    int maHD, giamgia, maKH;
    int tongtien;
    Date date = new Date();
    public static JpBanHang bh;

    NumberFormat chuyentien = new DecimalFormat("#,###,###");
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    IHoaDonDAO hddao = new HoaDonDAO();
    INhanVienDAO nvdao = new NhanVienDAO();
    ISanPhamDAO spdao = new SanPhamDAO();
    IKhachHangDAO khdao = new KhachHangDAO();
    IChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();

    /**
     * Creates new form JpBanHang
     */
    public JpBanHang() {
        initComponents();
        bh = this;
        lblMaNV.setText(String.valueOf(nvdao.findMaNVById(Run.tk.getIdTK())));
        setCenter();
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
        txtKey = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnThemSP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpListSP = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTongtien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblMaSP = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblXoa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(4, 4));

        txtKey.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NHẬP TÊN HOẶC MÃ SẢN PHẨM");

        btnThemSP.setBackground(new java.awt.Color(153, 255, 153));
        btnThemSP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemSP.setText("THÊM");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jpListSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpListSPLayout = new javax.swing.GroupLayout(jpListSP);
        jpListSP.setLayout(jpListSPLayout);
        jpListSPLayout.setHorizontalGroup(
            jpListSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        jpListSPLayout.setVerticalGroup(
            jpListSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jpListSP);

        btnThanhToan.setBackground(new java.awt.Color(153, 255, 153));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(0, 153, 51));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 204, 204));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 102, 102));
        btnHuy.setText("HỦY PHIẾU");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("THÔNG TIN HÓA ĐƠN");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("TỔNG TIỀN");

        lblTongtien.setText("...");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("MÃ KHÁCH HÀNG");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("MÃ NHÂN VIÊN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("GIẢM GIÁ");

        lblMaNV.setText("...");

        txtGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiamGiaActionPerformed(evt);
            }
        });
        txtGiamGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGiamGiaKeyReleased(evt);
            }
        });

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });
        txtMaKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKHKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKHKeyReleased(evt);
            }
        });

        jLabel9.setText("VNĐ");

        jLabel11.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txtMaKH)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaSP.setText("Mã");

        lblTenSP.setText("Tên Sản Phẩm");

        lblDonGia.setText("Đơn Giá");

        lblSoLuong.setText("Số Lượng");

        lblXoa.setText("Thao Tác");

        jLabel4.setText("Giảm");

        jLabel8.setText("Tăng");

        jLabel10.setText("Thành Tiền");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnRefresh.setBackground(new java.awt.Color(255, 204, 204));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKey, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(btnThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyActionPerformed

    public int createHD() { 
        hd = new HoaDonModel();
        hd.setTrangThai(0);
        hd.setMaNhanVien(nvdao.findMaNVById(Run.tk.getIdTK())); 
        hd.setMaHoaDon(hddao.insert(hd, sf.format(date)));
        return hd.getMaHoaDon();
    }

    public void tinhTien() {
        tongtien = 0;
        for (Map.Entry<Integer, ChiTietHoaDonModel> entry : arrCTHD.entrySet()) {
            tongtien += entry.getValue().getThanhTien();
        }
        lblTongtien.setText(String.valueOf(tongtien));
    }

    public void fillListSP() {
        if (arrCTHD.isEmpty()) {
            jpListSP.removeAll();
            jpListSP.updateUI();
        } else {
            jpListSP.setVisible(true);
            jScrollPane1.setVisible(true);
            JPanel[] pn = new JPanel[arrCTHD.size()];
            jpListSP.removeAll();
            jpListSP.setLayout(new BoxLayout(jpListSP, BoxLayout.Y_AXIS));

            int i = 0;
            for (Map.Entry<Integer, ChiTietHoaDonModel> entry : arrCTHD.entrySet()) {
                pn[i] = new JPanel();
                Border blackline = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
                pn[i].setName(String.valueOf(entry.getKey()));
                pn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                pn[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
                pn[i].setBackground(Color.decode("#b3ff99"));
                pn[i].setLayout(new GridLayout());
                pn[i].setPreferredSize(new Dimension(674, 50));
                pn[i].setMaximumSize(new Dimension(674, 50));
                pn[i].setMinimumSize(new Dimension(674, 50));

                JLabel lblMaSP1 = new JLabel(String.valueOf(entry.getKey()), JLabel.CENTER);
                lblMaSP1.setBorder(blackline);
                pn[i].add(lblMaSP1).setForeground(Color.decode("#001a66"));

                JLabel lblTenSP1 = new JLabel(spdao.findByMa(entry.getKey()), JLabel.CENTER);
                lblTenSP1.setBorder(blackline);
                pn[i].add(lblTenSP1).setForeground(Color.decode("#ff0000"));

                JLabel lblDonGia1 = new JLabel(String.valueOf(entry.getValue().getDonGia()) + " VNĐ", JLabel.CENTER);
                lblDonGia1.setBorder(blackline);
                pn[i].add(lblDonGia1).setForeground(Color.decode("#008000"));

                Icon ictru = new ImageIcon("src/images_main/subtract.png");
                JLabel lbltru = new JLabel("", ictru, JLabel.CENTER);
                lbltru.setForeground(Color.decode("#b3ff99"));
                lbltru.setName(String.valueOf(entry.getKey()));
                lbltru.setBorder(blackline);
                pn[i].add(lbltru).addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int sl = arrCTHD.get(Integer.parseInt(e.getComponent().getName())).getSoLuong();
                        if (sl > 1) {
                            sl--;
                            arrCTHD.get(Integer.parseInt(e.getComponent().getName())).setSoLuong(sl);
                            arrCTHD.get(Integer.parseInt(e.getComponent().getName())).setThanhTien(sl * arrCTHD.get(Integer.parseInt(e.getComponent().getName())).getDonGia());
                        } else {
                            int option = JOptionPane.showConfirmDialog(null, "Do you want to delete it?", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION);
                            if (option == JOptionPane.YES_OPTION) {
                                arrCTHD.remove(Integer.parseInt(e.getComponent().getName()));
                            }
                            jpListSP.remove(e.getComponent());
                        }
                        fillListSP();
                    }
                });
                JLabel lblSoLuong1 = new JLabel(String.valueOf(entry.getValue().getSoLuong()), JLabel.CENTER);
                lblSoLuong1.setBorder(blackline);
                pn[i].add(lblSoLuong1).setForeground(Color.decode("#008000"));

                Icon iccong = new ImageIcon("src/images_main/push.png");
                JLabel lblcong = new JLabel("", iccong, JLabel.CENTER);
                lblcong.setForeground(Color.decode("#b3ff99"));
                lblcong.setName(String.valueOf(entry.getKey()));
                lblcong.setBorder(blackline);
                pn[i].add(lblcong).addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int sl = arrCTHD.get(Integer.parseInt(e.getComponent().getName())).getSoLuong();
                        sl++;
                        arrCTHD.get(Integer.parseInt(e.getComponent().getName())).setSoLuong(sl);
                        arrCTHD.get(Integer.parseInt(e.getComponent().getName())).setThanhTien(sl * arrCTHD.get(Integer.parseInt(e.getComponent().getName())).getDonGia());
                        fillListSP();
                    }
                });

                JLabel lblThanhtien1 = new JLabel(String.valueOf(entry.getValue().getThanhTien() + " VNĐ"), JLabel.CENTER);
                lblSoLuong1.setBorder(blackline);
                pn[i].add(lblThanhtien1).setForeground(Color.decode("#008000"));

                Icon ic = new ImageIcon("src/images_main/DeleteRed.png");
                JLabel lbl = new JLabel("", ic, JLabel.CENTER);
                lbl.setForeground(Color.decode("#b3ff99"));
                lbl.setName(String.valueOf(entry.getKey()));
                lbl.setBorder(blackline);
                pn[i].add(lbl).addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int qs;
                        qs = JOptionPane.showConfirmDialog(null, "Hủy sản phẩm ?", "Hủy sản phẩm", JOptionPane.YES_NO_OPTION);
                        if (qs == JOptionPane.YES_OPTION) {
                            arrCTHD.remove(Integer.parseInt(e.getComponent().getName()));
                            fillListSP();
                        }
                    }
                });
                jpListSP.add(pn[i]);
                jpListSP.updateUI();
                i++;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        tinhTien();
    }
    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        if (maHD == 0) {
            maHD = createHD();
        }
        String key = txtKey.getText();
        if (key.length() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập từ khóa!");
        } else {
            if (spdao.findByKey(key) != null) {
                SanPhamModel res = spdao.findByKey(key);
                if (arrCTHD.containsKey(res.getMaSanPham())) {
                    int soluong = arrCTHD.get(res.getMaSanPham()).getSoLuong();
                    int dongia = arrCTHD.get(res.getMaSanPham()).getDonGia();
                    arrCTHD.get(res.getMaSanPham()).setSoLuong(soluong + 1);
                    arrCTHD.get(res.getMaSanPham()).setThanhTien((soluong + 1) * dongia);
                } else {
                    ChiTietHoaDonModel newCTHD = new ChiTietHoaDonModel();
                    newCTHD.setMaHoaDon(maHD);
                    newCTHD.setMaSanPham(res.getMaSanPham());
                    newCTHD.setDonGia(res.getDonGiaBan());
                    newCTHD.setSoLuong(1);
                    newCTHD.setThanhTien(res.getDonGiaBan());
                    arrCTHD.put(newCTHD.getMaSanPham(), newCTHD);
                }
                fillListSP();
            } else {
                JOptionPane.showMessageDialog(null, "Không tồn tại sản phẩm!");
            }
        }
        txtKey.setText("");
    }//GEN-LAST:event_btnThemSPActionPerformed

    public boolean checkThanhVien() {
        if (txtMaKH.getText().length() == 0) {
            return true;
        }
        if (!txtMaKH.getText().matches("-?\\d+(.\\d+)?")) {
            return false;
        } else {
            if (khdao.findByMa(Integer.parseInt(txtMaKH.getText())) != null) {
                return true;
            } else {
                return false;
            }
        }
    }
    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        if (maHD != 0 && !arrCTHD.isEmpty()) {
            hd.setTrangThai(1);
            if (!txtGiamGia.getText().matches("-?\\d+(.\\d+)?") || txtGiamGia.getText().length() == 0) {
                giamgia = 0;
            } else {
                giamgia = Integer.parseInt(txtGiamGia.getText());
            }
            if (!checkThanhVien()) {
                JOptionPane.showMessageDialog(null, "Khách hàng chưa đăng ký thành viên!");
                txtMaKH.setText("");
            } else {
                if (txtMaKH.getText().length() == 0) {
                    maKH = 0;
                } else {
                    maKH = Integer.parseInt(txtMaKH.getText());
                }
                DLThanhToan thanhtoan = new DLThanhToan(Run.QLBanHang, true, Integer.parseInt(lblTongtien.getText()), giamgia, maKH, maHD, hd, arrCTHD);
                thanhtoan.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chưa có sản phẩm nào! Vui lòng thêm sản phẩm!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToanActionPerformed

    public void resetUI() {
        tongtien = 0;
        giamgia = 0;
        maKH = 0;
        arrCTHD.clear();
        txtKey.setText("");
        txtMaKH.setText("");
        txtGiamGia.setText("");
        tinhTien();
        fillListSP();
    }
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (maHD != 0) {
            int option = JOptionPane.showConfirmDialog(null, "Hủy hóa đơn ?", "Hủy hóa đơn", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                hddao.delete(maHD);
                maHD = 0;
                hd = null;
                resetUI();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chưa có hóa đơn nào được tạo!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed


    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiamGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiamGiaActionPerformed

    private void txtGiamGiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiamGiaKeyReleased
        int temp = tongtien;
        if (!txtGiamGia.getText().matches("-?\\d+(.\\d+)?")) {
            txtGiamGia.setText("");
            lblTongtien.setText(String.valueOf(temp));
        } else {
            if (Integer.parseInt(txtGiamGia.getText()) >= 100) {
                lblTongtien.setText("0");
            } else {
                int giam = Integer.parseInt(txtGiamGia.getText());
                temp = tongtien * (100 - giam) / 100;
                lblTongtien.setText(String.valueOf(temp));
            }
        }
    }//GEN-LAST:event_txtGiamGiaKeyReleased

    private void txtMaKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKHKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHKeyReleased

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        resetUI();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtMaKHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKHKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpListSP;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTongtien;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtMaKH;
    // End of variables declaration//GEN-END:variables

    public void setCenter() {
        lblMaSP.setHorizontalAlignment(JLabel.CENTER);
        lblMaSP.setVerticalAlignment(JLabel.CENTER);
        lblTenSP.setHorizontalAlignment(JLabel.CENTER);
        lblTenSP.setVerticalAlignment(JLabel.CENTER);
        lblDonGia.setHorizontalAlignment(JLabel.CENTER);
        lblDonGia.setVerticalAlignment(JLabel.CENTER);
        lblSoLuong.setHorizontalAlignment(JLabel.CENTER);
        lblSoLuong.setVerticalAlignment(JLabel.CENTER);
        lblXoa.setHorizontalAlignment(JLabel.CENTER);
        lblXoa.setVerticalAlignment(JLabel.CENTER);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}