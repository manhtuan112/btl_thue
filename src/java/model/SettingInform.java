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
    private String thueSuat;
    private String mocThue;
    private Date ngaySuaDoi;

    public SettingInform() {
    }

    public SettingInform(int id, String thueSuat, String mocThue, Date ngaySuaDoi) {
        this.id = id;
        this.thueSuat = thueSuat;
        this.mocThue = mocThue;
        this.ngaySuaDoi = ngaySuaDoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThueSuat() {
        return thueSuat;
    }

    public void setThueSuat(String thueSuat) {
        this.thueSuat = thueSuat;
    }

    public String getMocThue() {
        return mocThue;
    }

    public void setMocThue(String mocThue) {
        this.mocThue = mocThue;
    }

    public Date getNgaySuaDoi() {
        return ngaySuaDoi;
    }

    public void setNgaySuaDoi(Date ngaySuaDoi) {
        this.ngaySuaDoi = ngaySuaDoi;
    }

    @Override
    public String toString() {
        return "SettingInform{" + "id=" + id + ", thueSuat=" + thueSuat + ", mocThue=" + mocThue + ", ngaySuaDoi=" + ngaySuaDoi + '}';
    }
    
   
}
