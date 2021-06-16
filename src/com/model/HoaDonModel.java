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
public class HoaDonModel {
    private int maHoaDon,giamGia, maNhanVien, tongTien, maKhachHang, trangThai;
    private Date gioDen;

    public HoaDonModel() {
    }

    public HoaDonModel(int maHoaDon, int maNhanVien, int tongTien, Date gioDen) {
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.tongTien = tongTien;
        this.gioDen = gioDen;
    }

    public HoaDonModel(int maHoaDon, int giamGia, int maNhanVien, int tongTien, int maKhachHang, int trangThai, Date gioDen) {
        this.maHoaDon = maHoaDon;
        this.giamGia = giamGia;
        this.maNhanVien = maNhanVien;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
        this.trangThai = trangThai;
        this.gioDen = gioDen;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getGioDen() {
        return gioDen;
    }

    public void setGioDen(Date gioDen) {
        this.gioDen = gioDen;
    }
    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
