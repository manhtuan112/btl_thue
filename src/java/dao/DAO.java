/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.History;
import model.SettingInform;
import model.User;
import utilities.Utilities;

/**
 *
 * @author ADMIN
 */
public class DAO {
    
    
    
    
    public Account login(String user, String pass, Connection conn){
        
        String query = "select * from accountadmin where username = ? and password = ?";
        try{
//            Connection conn = DBContext.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getString(1), 
                        rs.getString(3),
                        rs.getString(2));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Account checkAccountExist(String user){

        String query = "select * from accountadmin where username = ?";
        try{
            Connection conn = DBContext.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getString(1), 
                        rs.getString(3),
                        rs.getString(2));
            }


        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean signup(String user, String pass, Connection conn){
        Calendar d = Calendar.getInstance();
        String idUser = "ACC_"+user.toLowerCase()+"_"+d.get(Calendar.YEAR);
        String query = "insert into accountadmin values(?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idUser);
            ps.setString(2, pass);
            ps.setString(3, user);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
    public List<User> getUserByAddress(String tinh, String huyen, String xa, String status){
        List<User> list = new ArrayList<>();
        List<String> value = new ArrayList<>();

        
        String query = "SELECT * FROM users where diachi in (select idDC from diachi where ";
        if(!tinh.equals("")){
            value.add("tinh="+"\'"+tinh+"\'");
        }
        if(!huyen.equals("")){
            value.add("huyen="+"\'"+huyen+"\'");
        }
        if(!xa.equals("")){
            value.add("xa="+"\'"+xa+"\'");
        }
        
        
        
        if(value.size()==1){
            query += value.get(0) + ')';
        } else if(value.size()==2){
            query += value.get(0) + " and " + value.get(1)+')';
        } else {
            query += value.get(0) + " and " + value.get(1)+ " and "+value.get(2)+')';
        }
        
        if(status.equals("1")){
            query += " and sothueconno!='0'";
        } else if(status.equals("2")){
            query += " and sothueconno='0'";
        } else if(status.equals("0")){
            query += "";
        } else{
            return null;
        }
        
        Connection conn = DBContext.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                User u = new User();
                u.setHoten(rs.getString(4));
                u.setGioitinh(rs.getString(5));
                u.setEmail(rs.getString(2));
                u.setImage(rs.getString(10));
                u.setNgaysinh(Utilities.convertDate(rs.getString(7)));
                u.setNghenghiep(rs.getString(6));
                u.setIdThue(rs.getString(8));
                u.setSothueconno(Utilities.convertMoneyFormat(rs.getLong(14)));
                
                list.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<User> getUserByNameorIdThue(String filter_roll, String value, String status){
        List<User> list = new ArrayList<>();
        String query="";
        if(filter_roll.equals("2")){
            query = "select * from users where hoten = ?";
        } else if(filter_roll.equals("3")){
            query = "select * from users where idThue = ?";
        } else{
            return null;
        }
        
        if(status.equals("1")){
            query += " and sothueconno!='0'";
        } else if(status.equals("2")){
            query += " and sothueconno='0'";
        } else if(status.equals("0")){
            query+="";
        } else{
            return null;
        }
        
        Connection conn = DBContext.getConnection();
        
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, value);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                User u = new User();
                u.setHoten(rs.getString(4));
                u.setGioitinh(rs.getString(5));
                u.setEmail(rs.getString(2));
                u.setImage(rs.getString(10));
                u.setNgaysinh(Utilities.convertDate(rs.getString(7)));
                u.setNghenghiep(rs.getString(6));
                u.setIdThue(rs.getString(8));
                u.setSothueconno(Utilities.convertMoneyFormat(rs.getLong(14)));
                
                list.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    
    public User getUserByIdThue(String idThue){
        String query = "select * from users where idthue = ?";
        Connection conn = DBContext.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idThue);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setCccd(rs.getString(1));
                u.setEmail(rs.getString(2));
                u.setSdt(rs.getString(3));
                u.setHoten(rs.getString(4));
                u.setGioitinh(rs.getString(5));
                u.setNghenghiep(rs.getString(6));
                u.setNgaysinh(Utilities.convertDate(rs.getString(7)));
                u.setIdThue(rs.getString(8));
                u.setThunhap(Utilities.convertMoneyFormat(rs.getLong(9)));
                u.setImage(rs.getString(10));
                u.setThunhapkhongchiuthue(Utilities.convertMoneyFormat(rs.getLong(11)));
                u.setKhoangiamtru(Utilities.convertMoneyFormat(rs.getLong(12)));              
                u.setIdDiachi(rs.getInt(13));
                u.setSothueconno(Utilities.convertMoneyFormat(rs.getLong(14)));


                
                return u;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//-------------------------------------------------------Chức năng cấu hình------------------------------------------------------
    // lấy danh sách bảng cấu hình
    public List<SettingInform> getBangBieuThue(){
        List<SettingInform> list = new ArrayList<>();
        String query = "select * from bangbieuthue";
       
        try{
            Connection conn = DBContext.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SettingInform st = new SettingInform();
                st.setId(rs.getInt(1));
                st.setMocDuoi(rs.getString(2));
                st.setMocTren(rs.getString(3));
                st.setThueSuat(rs.getFloat(4));
                st.setNgaySuaDoi(rs.getDate(5));
                list.add(st);
            }
        }catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    // lấy thông tin cấu hình 
    public SettingInform getSettingInforById(String id){
        String query = "SELECT * FROM bangbieuthue where id = ?";
        Connection conn = DBContext.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new SettingInform(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getFloat(4), rs.getDate(5));
            }
           
        }catch(SQLException ex){
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    // cấu hình lại các thông số   
    public boolean updateSettingInform(int id, String mocDuoi, String mocTren, float thueSuat, String ngaySuaDoi, Connection conn){
        String query = "update bangbieuthue set mocduoi=?, moctren =?, thuesuat=?, ngaysuadoi=? where id=?";
//        Connection conn = DBContext.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,mocDuoi);
            ps.setString(2,mocTren);
            ps.setFloat(3,thueSuat);
            ps.setString(4,ngaySuaDoi);
            ps.setInt(5,id);
            ps.executeUpdate();
            return true;
            
        }catch(SQLException ex){
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//---------------------------------------------------------Hết chức năng cấu hình-------------------------------------------------------
    public String getAddresById(String id){
        String diachi="";
        String query = "select * from diachi where idDC=?";
        Connection conn = DBContext.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                diachi += rs.getString(4) + ", ";
                diachi += rs.getString(3) + ", ";
                diachi += rs.getString(2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return diachi;
        
    }
    
    public List<History> getHistoryByIdThue(String idThue){
        List<History> list = new ArrayList<>();
        String query = "select * from lichsudongthue where idThue=?";
        Connection conn = DBContext.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, idThue);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new History(Utilities.convertDate(rs.getString(2)),
                        rs.getString(5),
                        Utilities.convertMoneyFormat(rs.getLong(4)),
                        Utilities.convertMoneyFormat(rs.getLong(3)),
                        Utilities.convertMoneyFormat(rs.getLong(6)),
                        rs.getString(1)));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<History> getHistorybyAddressDate(String tinh,int thang, int nam){
        List<History> list=new ArrayList<>();
        String query= " select* from lichsudongthue where (idthue in (select idThue from users where diachi in (select idDC from diachi where tinh=?))) and month(ngaydongthue)=? and year(ngaydongthue)=?";
        Connection conn = DBContext.getConnection();
        try{
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, tinh);
            ps.setInt(2, thang);
            ps.setInt(3, nam);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                History n = new History(
                        Utilities.convertDate(rs.getString(2)),
                        rs.getString(5),
                        Utilities.convertMoneyFormat(rs.getLong(4)),
                        Utilities.convertMoneyFormat(rs.getLong(3)),
                        Utilities.convertMoneyFormat(rs.getLong(6)),
                        rs.getString(1));
                list.add(n);
            }
        }catch(SQLException ex){
            System.out.println("exception");
        }
        return list;
    }
    
}
