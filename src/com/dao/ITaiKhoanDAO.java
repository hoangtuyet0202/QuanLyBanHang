/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.TaiKhoanModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface ITaiKhoanDAO extends IGenericDAO<TaiKhoanModel> {

    List<TaiKhoanModel> findAll();

    List<TaiKhoanModel> findByLevel(int lv);

    TaiKhoanModel findByUserPass(String username, String pass);

    void update(TaiKhoanModel updateTK);

    void delete(String username);

    int lvTK(TaiKhoanModel tk);
}
