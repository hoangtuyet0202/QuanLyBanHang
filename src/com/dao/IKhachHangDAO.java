/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.KhachHangModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IKhachHangDAO extends IGenericDAO<KhachHangModel> {

    List<KhachHangModel> findAll();
    
    KhachHangModel findByMa(int ma);

    int insert(KhachHangModel newKH);

    void update(KhachHangModel updateKH);

    void delete(int maKH);
}
