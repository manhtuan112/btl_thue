/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class History {
    private String ngaydongthue, idLichsu;
    private String sotiendadong, sotienconno, sotienphaidong;

    public History(String ngaydongthue, String idLichsu, String sotiendadong, String sotienconno, String sotienphaidong) {
        this.ngaydongthue = ngaydongthue;
        this.idLichsu = idLichsu;
        this.sotiendadong = sotiendadong;
        this.sotienconno = sotienconno;
        this.sotienphaidong = sotienphaidong;
    }

    public String getNgaydongthue() {
        return ngaydongthue;
    }

    public void setNgaydongthue(String ngaydongthue) {
        this.ngaydongthue = ngaydongthue;
    }

    public String getIdLichsu() {
        return idLichsu;
    }

    public void setIdLichsu(String idLichsu) {
        this.idLichsu = idLichsu;
    }

    public String getSotiendadong() {
        return sotiendadong;
    }

    public void setSotiendadong(String sotiendadong) {
        this.sotiendadong = sotiendadong;
    }

    public String getSotienconno() {
        return sotienconno;
    }

    public void setSotienconno(String sotienconno) {
        this.sotienconno = sotienconno;
    }

    public String getSotienphaidong() {
        return sotienphaidong;
    }

    public void setSotienphaidong(String sotienphaidong) {
        this.sotienphaidong = sotienphaidong;
    }

    @Override
    public String toString() {
        return "History{" + "ngaydongthue=" + ngaydongthue + ", idLichsu=" + idLichsu + ", sotiendadong=" + sotiendadong + ", sotienconno=" + sotienconno + ", sotienphaidong=" + sotienphaidong + '}';
    }

    
    
    


}
