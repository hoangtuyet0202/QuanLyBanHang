/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.SanPhamModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class SanPhamMapper implements RowMapper<SanPhamModel> {

    @Override
    public SanPhamModel mapRow(ResultSet rs) {
        SanPhamModel sanPhamModel = new SanPhamModel();
        try {
            sanPhamModel.setMaSanPham(rs.getInt("MaSanPham"));
            sanPhamModel.setMaDanhMuc(rs.getInt("MaDanhMuc"));
            sanPhamModel.setTenSanPham(rs.getString("TenSanPham"));
            sanPhamModel.setDonGiaNhap(rs.getInt("DonGiaNhap"));
            sanPhamModel.setDonGiaBan(rs.getInt("DonGiaBan"));
            sanPhamModel.setSoLuong(rs.getInt("SoLuong"));
            sanPhamModel.setGhiChu(rs.getString("GhiChu"));
            return sanPhamModel;
        } catch (SQLException ex) {
            return null;
        }
    }

}
