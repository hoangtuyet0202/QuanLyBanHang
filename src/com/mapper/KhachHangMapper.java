/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.KhachHangModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class KhachHangMapper implements RowMapper<KhachHangModel> {

    @Override
    public KhachHangModel mapRow(ResultSet rs) {
        try {
            KhachHangModel khachHangModel = new KhachHangModel();
            khachHangModel.setMaKhachHang(rs.getInt("MaKhachHang"));
            khachHangModel.setTenKhachHang(rs.getString("TenKhachHang"));
            khachHangModel.setDiemTichLuy(rs.getInt("DiemTichLuy"));
            khachHangModel.setDiaChi(rs.getString("DiaChi"));
            khachHangModel.setSoDT(rs.getString("SoDienThoai"));
            return khachHangModel;
        } catch (SQLException e) {
            return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
