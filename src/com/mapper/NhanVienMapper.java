/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.NhanVienModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class NhanVienMapper implements RowMapper<NhanVienModel>{

    @Override
    public NhanVienModel mapRow(ResultSet rs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            NhanVienModel nhanVienModel = new NhanVienModel();
            nhanVienModel.setMaNhanVien(rs.getInt("MaNhanVien"));
            nhanVienModel.setIdTK(rs.getInt("idTK"));
            nhanVienModel.setTenNhanVien(rs.getString("TenNhanVien"));
            nhanVienModel.setGioiTinh(rs.getString("GioiTinh"));
            nhanVienModel.setSoDienThoai(rs.getString("SoDienThoai"));
            nhanVienModel.setDiaChi(rs.getString("DiaChi"));
            nhanVienModel.setNgaySinh(rs.getDate("NgaySinh"));
            return nhanVienModel;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
