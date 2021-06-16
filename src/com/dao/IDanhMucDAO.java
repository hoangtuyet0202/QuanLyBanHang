/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.DanhMucModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IDanhMucDAO extends IGenericDAO<DanhMucModel> {

    List<DanhMucModel> findAll();

    int insert(DanhMucModel newDM);

    void update(DanhMucModel updateDM);

    void delete(int maDM);
}
