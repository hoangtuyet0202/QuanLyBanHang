/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author VITQUAY
 */
public class TaiKhoanModel {
    private String username,password;
    private int idTK,lv;

    public TaiKhoanModel() {
    }

    public TaiKhoanModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public TaiKhoanModel(String username, String password, int lv, int idTK) {
        this.username = username;
        this.password = password;
        this.lv = lv;
        this.idTK = idTK;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getIdTK() {
        return idTK;
    }

    public void setIdTK(int idTK) {
        this.idTK = idTK;
    }
    
}
