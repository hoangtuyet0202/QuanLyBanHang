/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IChiTietHoaDonDAO;
import com.mapper.ChiTietHoaDonMapper;
import com.model.ChiTietHoaDonModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class ChiTietHoaDonDAO extends AbstractDAO<ChiTietHoaDonModel> implements IChiTietHoaDonDAO {

    private String sql;

    @Override
    public List<ChiTietHoaDonModel> findAll() {
        sql = "SELECT * FROM chitiethd";
        return query(sql, new ChiTietHoaDonMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChiTietHoaDonModel> findByHoaDon(int maHD) {
        sql = "SELECT * FROM chitiethd WHERE MaHoaDon = ?";
        return query(sql, new ChiTietHoaDonMapper(), maHD);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(ChiTietHoaDonModel newCTHD) {
        sql = "INSERT INTO chitiethd (MaHoaDon, MaSanPham, SoLuong, DonGia, ThanhTien) VALUES (?,?,?,?,?)";
        return insert(sql, newCTHD.getMaHoaDon(), newCTHD.getMaSanPham(), newCTHD.getSoLuong(), newCTHD.getDonGia(), newCTHD.getThanhTien());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ChiTietHoaDonModel updateCTHD) {
        sql = "UPDATE chitiethd SET SoLuong = ? AND ThanhTien = ? WHERE MaChiTietHD =? ";
        update(sql,updateCTHD.getSoLuong(), updateCTHD.getThanhTien(), updateCTHD.getMaCTHD());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
