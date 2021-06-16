/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.ITaiKhoanDAO;
import com.mapper.TaiKhoanMapper;
import com.model.TaiKhoanModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class TaiKhoanDAO extends AbstractDAO<TaiKhoanModel> implements ITaiKhoanDAO {

    private String sql;

    @Override
    public List<TaiKhoanModel> findAll() {
        sql = "SELECT * FROM taikhoan";
        return query(sql, new TaiKhoanMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TaiKhoanModel> findByLevel(int lv) {
        sql = "SELECT * FROM taikhoan WHERE lv = ?";
        return query(sql, new TaiKhoanMapper(), lv);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TaiKhoanModel updateTK) {
        sql = "UPDATE taikhoan SET username = ?, password =? , lv =? WHERE idTK =? ";
        update(sql,updateTK.getIdTK(), updateTK.getPassword(), updateTK.getLv(), updateTK.getUsername());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String username) {
        sql = "DELETE taikhoan WHERE username like ?";
        update(sql, "%" + username + "%");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lvTK(TaiKhoanModel tk) {
        int lv = 0;
        sql = "SELECT lv FROM taikhoan WHERE idTK = ?";
        TaiKhoanModel rs = query(sql, new TaiKhoanMapper(), tk.getIdTK()).get(0);
        lv = rs.getIdTK();
        return lv;
        } //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public TaiKhoanModel findByUserPass(String username, String pass) {
        sql = "SELECT * FROM taikhoan WHERE username = ? AND password =?";
        if(!query(sql,new TaiKhoanMapper(),username, pass).isEmpty())
            return query(sql, new TaiKhoanMapper(), username, pass).get(0);
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
