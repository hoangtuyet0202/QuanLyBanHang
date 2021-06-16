/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.HoaDonModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class HoaDonMapper implements RowMapper<HoaDonModel>{

    @Override
    public HoaDonModel mapRow(ResultSet rs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            HoaDonModel hoaDonModel = new HoaDonModel();
            hoaDonModel.setMaHoaDon(rs.getInt("MaHoaDon"));
            hoaDonModel.setMaHoaDon(rs.getInt("GiamGia"));
            hoaDonModel.setMaHoaDon(rs.getInt("MaNhanVien"));
            hoaDonModel.setMaHoaDon(rs.getInt("TongTien"));
            hoaDonModel.setGioDen(rs.getDate("GioDen"));
            hoaDonModel.setMaKhachHang(rs.getInt("MaKhachHang"));
            return hoaDonModel;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
