/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.ChiTietHoaDonModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IChiTietHoaDonDAO extends IGenericDAO<ChiTietHoaDonModel> {

    List<ChiTietHoaDonModel> findAll();

    List<ChiTietHoaDonModel> findByHoaDon(int maHD);

    int insert(ChiTietHoaDonModel newCTHD);
    
    void update(ChiTietHoaDonModel updateCTHD);
}
