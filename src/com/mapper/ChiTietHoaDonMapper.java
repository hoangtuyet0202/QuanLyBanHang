/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.ChiTietHoaDonModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class ChiTietHoaDonMapper implements RowMapper<ChiTietHoaDonModel>{

    @Override
    public ChiTietHoaDonModel mapRow(ResultSet rs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            ChiTietHoaDonModel chiTietHoaDonModel = new ChiTietHoaDonModel();
            chiTietHoaDonModel.setMaCTHD(rs.getInt("MaChiTietHD"));
            chiTietHoaDonModel.setMaHoaDon(rs.getInt("MaHoaDon"));
            chiTietHoaDonModel.setMaSanPham(rs.getInt("MaSanPham"));
            chiTietHoaDonModel.setSoLuong(rs.getInt("SoLuong"));
            chiTietHoaDonModel.setDonGia(rs.getInt("DonGia"));
            chiTietHoaDonModel.setThanhTien(rs.getInt("ThanhTien"));
            return chiTietHoaDonModel;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
