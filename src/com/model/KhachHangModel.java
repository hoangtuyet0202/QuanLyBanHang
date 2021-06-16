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
public class KhachHangModel {
    private int maKhachHang, diemTichLuy;
    private String tenKhachHang,diaChi, soDT;

    public KhachHangModel() {
    }

    public KhachHangModel(int maKhachHang, int diemTichLuy, String tenKhachHang) {
        this.maKhachHang = maKhachHang;
        this.diemTichLuy = diemTichLuy;
        this.tenKhachHang = tenKhachHang;
    }

    public KhachHangModel(int maKhachHang, int diemTichLuy, String tenKhachHang, String diaChi, String soDT) {
        this.maKhachHang = maKhachHang;
        this.diemTichLuy = diemTichLuy;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
}
