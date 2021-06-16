/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IDanhMucDAO;
import com.mapper.DanhMucMapper;
import com.model.DanhMucModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class DanhMucDAO extends AbstractDAO<DanhMucModel> implements IDanhMucDAO {

    private String sql;

    @Override
    public List<DanhMucModel> findAll() {
        sql = "SELECT * FROM danhmuc ";
        return query(sql, new DanhMucMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(DanhMucModel newDM) {
        sql = "INSERT INTO danhmuc(TenDanhMuc) VALUES (?)";
        return insert(sql, newDM.getTenDanhMuc());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DanhMucModel updateDM) {
        sql = "UPDATE danhmuc SET TenDanhMuc = ? WHERE MaDanhMuc =?";
        update(sql, updateDM.getTenDanhMuc(), updateDM.getMaDanhMuc());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maDM) {
        sql = "DELETE FROM danhmuc WHERE MaDanhMuc = ?";
        update(sql, maDM);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
