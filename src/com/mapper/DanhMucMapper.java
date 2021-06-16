/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.DanhMucModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class DanhMucMapper implements RowMapper<DanhMucModel>{

    @Override
    public DanhMucModel mapRow(ResultSet rs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            DanhMucModel danhMucModel = new DanhMucModel();
            danhMucModel.setMaDanhMuc(rs.getInt("MaDanhMuc"));
            danhMucModel.setTenDanhMuc(rs.getString("TenDanhMuc"));
            return danhMucModel;
        } catch (SQLException e) {
            return null;
        }
    }
    
    
}
