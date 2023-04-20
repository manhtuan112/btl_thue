/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


/**
 *
 * @author KhongDuyTuan
 */
public class SettingInform {
    private int id;
    private String mocDuoi;
    private String mocTren;
    private float thueSuat;
    private Date ngaySuaDoi;

    public SettingInform() {
    }

    public SettingInform(int id, String mocDuoi, String mocTren, float thueSuat, Date ngaySuaDoi) {
        this.id = id;
        this.mocDuoi = mocDuoi;
        this.mocTren = mocTren;
        this.thueSuat = thueSuat;
        this.ngaySuaDoi = ngaySuaDoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMocDuoi() {
        return mocDuoi;
    }

    public void setMocDuoi(String mocDuoi) {
        this.mocDuoi = mocDuoi;
    }

    public String getMocTren() {
        return mocTren;
    }

    public void setMocTren(String mocTren) {
        this.mocTren = mocTren;
    }

    public float getThueSuat() {
        return thueSuat;
    }

    public void setThueSuat(float thueSuat) {
        this.thueSuat = thueSuat;
    }

    public Date getNgaySuaDoi() {
        return ngaySuaDoi;
    }

    public void setNgaySuaDoi(Date ngaySuaDoi) {
        this.ngaySuaDoi = ngaySuaDoi;
    }
    
   
}
