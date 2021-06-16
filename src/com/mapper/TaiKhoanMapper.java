/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.TaiKhoanModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class TaiKhoanMapper implements RowMapper<TaiKhoanModel> {

    @Override
    public TaiKhoanModel mapRow(ResultSet rs) {
        try {
            TaiKhoanModel taiKhoanModel = new TaiKhoanModel();
            taiKhoanModel.setUsername(rs.getString("username"));
            taiKhoanModel.setPassword(rs.getString("password"));
            taiKhoanModel.setLv(rs.getInt("lv"));
            taiKhoanModel.setIdTK(rs.getInt("idTK"));
            return taiKhoanModel;
        } catch (SQLException e) {
            return null;
        }
    }

}
