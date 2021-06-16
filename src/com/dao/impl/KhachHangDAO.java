/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IKhachHangDAO;
import com.mapper.KhachHangMapper;
import com.model.KhachHangModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class KhachHangDAO extends AbstractDAO<KhachHangModel> implements IKhachHangDAO {

    private String sql;

    @Override
    public List<KhachHangModel> findAll() {
        sql = "SELECT * FROM khachhang";
        return query(sql, new KhachHangMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(KhachHangModel newKH) {
        sql = "INSERT INTO khachhang(TenKhachHang, DiemTichLuy, DiaChi, SoDienThoai) VALUES (?,?,?,?,?)";
        return insert(sql, newKH.getTenKhachHang(), newKH.getDiemTichLuy(), newKH.getDiaChi(), newKH.getSoDT());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(KhachHangModel updateKH) {
        sql = "UPDATE khachhang SET TenKhachHang = ?, DiemTichLuy = ?, DiaChi = ?, SoDienThoai = ? WHERE MaKhachHang = ?";
        update(sql, updateKH.getTenKhachHang(), updateKH.getDiemTichLuy(), updateKH.getDiaChi(), updateKH.getSoDT(), updateKH.getMaKhachHang());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maKH) {
        sql = "DELETE FROM khachhang WHERE MaKhachHang = ?";
        update(sql, maKH);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHangModel findByMa(int ma) {
        sql = "SELECT * FROM khachhang WHERE MaKhachHang = ?";
        if(!query(sql, new KhachHangMapper(), ma).isEmpty()) {
            return query(sql, new KhachHangMapper(), ma).get(0);
        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
