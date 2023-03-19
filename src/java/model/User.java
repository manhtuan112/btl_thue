/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class User {
    private String cccd, sdt, hoten, email, image, nghenghiep, ngaysinh, idThue, diachi, gioitinh;
    private String thunhap, thunhapkhongchiuthue, khoangiamtru, sothueconno;
    private int idDiachi;

    public User() {
    }

    public User(String cccd, String sdt, String hoten, String email, String image, String nghenghiep, String ngaysinh, String idThue, String diachi, String gioitinh, String thunhap, String thunhapkhongchiuthue, String khoangiamtru, String sothueconno, int idDiachi) {
        this.cccd = cccd;
        this.sdt = sdt;
        this.hoten = hoten;
        this.email = email;
        this.image = image;
        this.nghenghiep = nghenghiep;
        this.ngaysinh = ngaysinh;
        this.idThue = idThue;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.thunhap = thunhap;
        this.thunhapkhongchiuthue = thunhapkhongchiuthue;
        this.khoangiamtru = khoangiamtru;
        this.sothueconno = sothueconno;
        this.idDiachi = idDiachi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getIdThue() {
        return idThue;
    }

    public void setIdThue(String idThue) {
        this.idThue = idThue;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getThunhap() {
        return thunhap;
    }

    public void setThunhap(String thunhap) {
        this.thunhap = thunhap;
    }

    public String getThunhapkhongchiuthue() {
        return thunhapkhongchiuthue;
    }

    public void setThunhapkhongchiuthue(String thunhapkhongchiuthue) {
        this.thunhapkhongchiuthue = thunhapkhongchiuthue;
    }

    public String getKhoangiamtru() {
        return khoangiamtru;
    }

    public void setKhoangiamtru(String khoangiamtru) {
        this.khoangiamtru = khoangiamtru;
    }

    public String getSothueconno() {
        return sothueconno;
    }

    public void setSothueconno(String sothueconno) {
        this.sothueconno = sothueconno;
    }

    public int getIdDiachi() {
        return idDiachi;
    }

    public void setIdDiachi(int idDiachi) {
        this.idDiachi = idDiachi;
    }

    @Override
    public String toString() {
        return "User{" + "cccd=" + cccd + ", sdt=" + sdt + ", hoten=" + hoten + ", email=" + email + ", image=" + image + ", nghenghiep=" + nghenghiep + ", ngaysinh=" + ngaysinh + ", idThue=" + idThue + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", thunhap=" + thunhap + ", thunhapkhongchiuthue=" + thunhapkhongchiuthue + ", khoangiamtru=" + khoangiamtru + ", sothueconno=" + sothueconno + ", idDiachi=" + idDiachi + '}';
    }

    
    
    

    
    
}
