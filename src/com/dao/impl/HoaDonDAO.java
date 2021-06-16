/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IHoaDonDAO;
import com.mapper.HoaDonMapper;
import com.model.HoaDonModel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class HoaDonDAO extends AbstractDAO<HoaDonModel> implements IHoaDonDAO {

    private String sql;

    @Override
    public List<HoaDonModel> findAll() {
        sql = "SELECT * FROM hoadon";
        return query(sql, new HoaDonMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDonModel> findByNgay(Date date) {
        sql = "SELECT * FROM hoadon WHERE GioDen = ?";
        return query(sql, new HoaDonMapper(), date);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(HoaDonModel newHD, String gioDen) {
        sql = "INSERT INTO hoadon(MaNhanVien, GioDen, TrangThai) VALUES (?,?,?)";
        return insert(sql, newHD.getMaNhanVien(), gioDen, newHD.getTrangThai());

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update1(HoaDonModel updateHD) {
        sql = "UPDATE hoadon SET GiamGia = ?, MaKhachHang = ?, TongTien=?, TrangThai =? WHERE MaHoaDon=?";
        update(sql, updateHD.getGiamGia(), updateHD.getMaKhachHang(), updateHD.getTongTien(), updateHD.getTrangThai(), updateHD.getMaHoaDon());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update2(HoaDonModel updateHD) {
        sql = "UPDATE hoadon SET GiamGia = ?, TongTien=?, TrangThai =? WHERE MaHoaDon=?";
        update(sql, updateHD.getGiamGia(), updateHD.getTongTien(), updateHD.getTrangThai(), updateHD.getMaHoaDon());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maHD) {
        sql = "DELETE FROM hoadon WHERE MaHoaDon = ?";
        update(sql, maHD);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
