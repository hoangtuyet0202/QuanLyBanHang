/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.HoaDonModel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IHoaDonDAO extends IGenericDAO<HoaDonModel> {

    List<HoaDonModel> findAll();

    List<HoaDonModel> findByNgay(Date date);

    int insert(HoaDonModel newHD, String gioDen);
    
    void update1(HoaDonModel updateHD);// mã KH k null
    
    void update2(HoaDonModel updateHD);// mã KH null
    
    void delete(int maHD);
}
