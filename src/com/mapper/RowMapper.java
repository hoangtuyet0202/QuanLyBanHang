/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import java.sql.ResultSet;

/**
 *
 * @author VITQUAY
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs);
	// nếu rs.get<null> thì có bị lỗi hay lấy giá trị null?
}
