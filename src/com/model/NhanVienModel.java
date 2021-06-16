/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Date;

/**
 *
 * @author VITQUAY
 */
public class NhanVienModel {
    private int maNhanVien, idTK;
    private String tenNhanVien, gioiTinh, soDienThoai, diaChi;
    private Date ngaySinh;

    public NhanVienModel() {
    }

    public NhanVienModel(int maNhanVien, int idTK, String tenNhanVien, String gioiTinh, String soDienThoai, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.idTK = idTK;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public NhanVienModel(int maNhanVien, int idTK, String tenNhanVien, String gioiTinh, String soDienThoai, String diaChi, Date ngaySinh) {
        this.maNhanVien = maNhanVien;
        this.idTK = idTK;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getIdTK() {
        return idTK;
    }

    public void setIdTK(int idTK) {
        this.idTK = idTK;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
