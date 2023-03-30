
import dao.DAO;
import java.util.List;
import model.SettingInform;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KhongDuyTuan
 */
public class test {
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<SettingInform> list = dao.getBangBieuThue();
        for (SettingInform o : list) {
            System.out.println(o);
            
        }
    }
    
}
