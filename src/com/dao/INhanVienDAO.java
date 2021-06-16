/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.NhanVienModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface INhanVienDAO extends IGenericDAO<NhanVienModel> {

    List<NhanVienModel> findAll();
    
    int findMaNVById(int id);

    int insert(NhanVienModel newNV);

    void update(NhanVienModel updateNV);

    void delete(int maNV);
}
