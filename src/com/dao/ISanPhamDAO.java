/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.SanPhamModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface ISanPhamDAO extends IGenericDAO<SanPhamModel> {

    List<SanPhamModel> findAll();

    List<SanPhamModel> findByDanhMuc(int maDM);

    SanPhamModel findByKey(String key);
    
    String findByMa(int maSP);

    int insert(SanPhamModel newSP);

    void update(SanPhamModel updateSP);

    void delete(int maSP);
}
