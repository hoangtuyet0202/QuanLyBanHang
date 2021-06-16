/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.INhanVienDAO;
import com.mapper.NhanVienMapper;
import com.model.NhanVienModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class NhanVienDAO extends AbstractDAO<NhanVienModel> implements INhanVienDAO{
    private String sql;

    @Override
    public List<NhanVienModel> findAll() {
        sql = "SELECT * FROM nhanvien";
        return query(sql, new NhanVienMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(NhanVienModel newNV) {
        sql = "INSERT INTO nhanvien(idTK, TenNhanVien, GioiTinh, SoDienThoai, DiaChi, NgaySinh ) VALUES (?,?,?,?,?,?,?)";
        return insert(sql, newNV.getIdTK(), newNV.getTenNhanVien(), newNV.getGioiTinh()
        , newNV.getSoDienThoai(), newNV.getDiaChi(), newNV.getNgaySinh());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVienModel updateNV) {
        sql = "UPDATE nhanvien SET idTK = ?, TenNhanVien = ?, GioiTinh = ?, SoDienThoai = ?, DiaChi = ?, NgaySinh = ? WHERE MaNhanVien = ?";
        update(sql,updateNV.getIdTK(), updateNV.getTenNhanVien(), updateNV.getGioiTinh(), updateNV.getSoDienThoai(), updateNV.getDiaChi(), updateNV.getNgaySinh(), updateNV.getMaNhanVien());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maNV) {
        sql = "DELETE FROM nhanvien WHERE MaNhanVien = ?";
        update(sql, maNV);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int findMaNVById(int id) {
        sql = "SELECT * FROM nhanvien WHERE idTK = ?";
        if(!query(sql, new NhanVienMapper(), id).isEmpty()) {
            return query(sql, new NhanVienMapper(), id).get(0).getMaNhanVien();
        }
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
