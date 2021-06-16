/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.ISanPhamDAO;
import com.mapper.SanPhamMapper;
import com.model.SanPhamModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class SanPhamDAO extends AbstractDAO<SanPhamModel> implements ISanPhamDAO {

    private String sql;

    @Override
    public List<SanPhamModel> findAll() {
        sql = "SELECT * FROM sanpham";
        return query(sql, new SanPhamMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamModel> findByDanhMuc(int maDM) {
        sql = "SELECT * FROM sanpham WHERE MaDanhMuc = ?";
        return query(sql, new SanPhamMapper(), maDM);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SanPhamModel findByKey(String key) {
        SanPhamModel sp = null;
        if(key.matches("-?\\d+(.\\d+)?")) {
            sql = "SELECT * FROM sanpham WHERE MaSanPham = ?";
            if(!query(sql, new SanPhamMapper(), Integer.parseInt(key)).isEmpty())
                sp = query(sql, new SanPhamMapper(), Integer.parseInt(key)).get(0);
        }
        else {
            sql = "SELECT * FROM sanpham WHERE TenSanPham like ?";
            if(!query(sql, new SanPhamMapper(), "%"+key + "%").isEmpty())
                sp = query(sql, new SanPhamMapper(), "%" + key + "%").get(0);
        }
        return sp;
    }

    @Override
    public int insert(SanPhamModel newSP) {
        sql = "INSERT INTO sanpham(MaDanhMuc, TenSanPham, DonGiaNhap, DonGiaBan, SoLuong, GhiChu) VALUES (?,?,?,?,?,?,?)";
        return insert(sql, newSP.getMaDanhMuc(), newSP.getTenSanPham(), newSP.getDonGiaNhap(), newSP.getDonGiaBan(), newSP.getSoLuong(), newSP.getGhiChu());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(SanPhamModel updateSP) {
        sql = " UPDATE sanpham SET MaDanhMuc = ?, TenSanPham =?, DonGiaNhap =?, DonGiaBan = ?, SoLuong = ?, GhiChu =? WHERE MaSanPham = ?";
        update(sql, updateSP.getMaDanhMuc(), updateSP.getTenSanPham(), updateSP.getDonGiaNhap(), updateSP.getDonGiaBan(), updateSP.getSoLuong(), updateSP.getGhiChu(), updateSP.getMaSanPham());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maSP) {
        sql = "DELETE sanpham WHERE MaSanPham = ?";
        update(sql, maSP);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findByMa(int maSP) {
        sql = "SELECT * FROM sanpham WHERE MaSanPham = ?";
        if(!query(sql, new SanPhamMapper(), maSP).isEmpty()) {
            return query(sql, new SanPhamMapper(), maSP).get(0).getTenSanPham();
        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
