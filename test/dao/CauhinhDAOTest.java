/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.util.List;
import model.Account;
import model.History;
import model.SettingInform;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CauhinhDAOTest {
    
    Connection conn = DBContext.getConnection();
    
    public CauhinhDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
//-------------------------------------Test hàm GetBangBieuThue ------------------------------------------------------------------
 
    @Test
    public void testGetBangBieuThue() {
        System.out.println("getBangBieuThue voi mong muon la 7 muc thue ");
        DAO instance = new DAO();
        List<SettingInform> result = instance.getBangBieuThue();
        assertNotNull(result);
        assertTrue(result.size() == 7);
//        fail("The test case is a prototype.");
    }
    
    
    
//-------------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
//-------------------------------------test hàm GetSettingInforById---------------------------------------------------------------
    
    @Test
    public void testGetSettingInforById_Test1() {
        System.out.println("getSettingInforById khi id null: ");
        String id = "";
        DAO instance = new DAO();
        SettingInform expResult = null;
        SettingInform result = instance.getSettingInforById(id);
        assertEquals(expResult.getId(), result.getId());

    }
    
    @Test
    public void testGetSettingInforById_Test2() {
        System.out.println("getSettingInforById hop le: ");
        String id = "1";
        DAO instance = new DAO();
        SettingInform expResult = null;
        SettingInform result = instance.getSettingInforById(id);
        assertEquals(expResult.getId(), result.getId());

    }
    
    @Test
    public void testGetSettingInforById_Test3() {
        System.out.println("getSettingInforById khong hop le: ");
        String id = "-1";
        DAO instance = new DAO();
        SettingInform expResult = null;
        SettingInform result = instance.getSettingInforById(id);
        assertEquals(expResult.getId(), result.getId());

    }
//------------------------------------------------------------------------------------------------------------------------------   
    

    
    
//-----------------------------------Test hàm UpdateSettingInform------------------------------------------------------------------
    
    
    // update vao ban ghi khong ton tai(vi co id = 0)
    @Test
    public void testUpdateSettingInform_Test() {
        System.out.println("updateSettingInform khi doi tuong update có id = 0"
                + ", mocDuoi = rong, mocTren = rong, thueSuat = 0, ngaySuaDoi = rong: ");
        int id = 1;
        String mocDuoi = "";
        String mocTren = "";
        float thueSuat = 0.0f;
        String ngaySuaDoi = "";
        
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            // thêm đối tượng mới
            boolean check = instance.updateSettingInform(id, mocDuoi, mocTren, thueSuat, ngaySuaDoi, conn);
            assertTrue(check);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu
            SettingInform set = instance.getSettingInforById(String.valueOf(id));
            
            
            assertEquals(mocDuoi, set.getMocDuoi());
            assertEquals(mocTren, set.getMocDuoi());
            assertEquals(thueSuat, set.getThueSuat());
            assertEquals(ngaySuaDoi, set.getNgaySuaDoi());
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                conn.rollback();
                conn.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;  
        
        
//        fail("The test case is a prototype.");
    }
    
    
    // Update vao ban ghi co id = 1 nhung voi cac gia tri rong
    @Test
    public void testUpdateSettingInform_Test1() {
        System.out.println("updateSettingInform khi doi tuong update có id = 1, "
                + "mocDuoi = rong, mocTren = rong, thueSuat = 0, ngaySuaDoi = rong:  ");
        int id = 1;
        String mocDuoi = "";
        String mocTren = "";
        float thueSuat = 0.0f;
        String ngaySuaDoi = "";
        
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            // thêm đối tượng mới
            boolean check = instance.updateSettingInform(id, mocDuoi, mocTren, thueSuat, ngaySuaDoi, conn);
            assertTrue(check);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu
            SettingInform set = instance.getSettingInforById(String.valueOf(id));
            
            
            assertEquals(mocDuoi, set.getMocDuoi());
            assertEquals(mocTren, set.getMocDuoi());
            assertEquals(thueSuat, set.getThueSuat());
            assertEquals(ngaySuaDoi, set.getNgaySuaDoi());
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                conn.rollback();
                conn.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;  
        
    }
    
    
    // update khi thieu truong mocTren va thueSuat = 0
    @Test
    public void testUpdateSettingInform_Test2() {
        System.out.println("updateSettingInform khi doi tuong update co id = "
                + "1, mocDuoi = 0, mocTren = rong, thueSuat = 0, ngaySuaDoi = 2023-02-14: ");
        int id = 1;
        String mocDuoi = "0";
        String mocTren = "";
        float thueSuat = 0.0f;
        String ngaySuaDoi = "2023-02-14";
        
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            // thêm đối tượng mới
            boolean check = instance.updateSettingInform(id, mocDuoi, mocTren, thueSuat, ngaySuaDoi, conn);
            assertTrue(check);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu
            SettingInform set = instance.getSettingInforById(String.valueOf(id));
            
            
            assertEquals(mocDuoi, set.getMocDuoi());
            assertEquals(mocTren, set.getMocDuoi());
            assertEquals(thueSuat, set.getThueSuat());
            assertEquals(ngaySuaDoi, set.getNgaySuaDoi());
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                conn.rollback();
                conn.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;  
    }
    
    
    // Update vao ban ghi co id = 1 nhung voi cac gia tri ngaySuaDoi = rong
    @Test
    public void testUpdateSettingInform_Test3() {
        System.out.println("updateSettingInform khi doi tuong update có id = 1, "
                + "mocDuoi = 0, mocTren = 6, thueSuat = 0, ngaySuaDoi = rong:  ");
        int id = 1;
        String mocDuoi = "0";
        String mocTren = "6";
        float thueSuat = 5.0f;
        String ngaySuaDoi = "";
        
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            // thêm đối tượng mới
            boolean check = instance.updateSettingInform(id, mocDuoi, mocTren, thueSuat, ngaySuaDoi, conn);
            assertTrue(check);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu
            SettingInform set = instance.getSettingInforById(String.valueOf(id));
            
            
            assertEquals(mocDuoi, set.getMocDuoi());
            assertEquals(mocTren, set.getMocDuoi());
            assertEquals(thueSuat, set.getThueSuat());
            assertEquals(ngaySuaDoi, set.getNgaySuaDoi());
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                conn.rollback();
                conn.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;  
        
    }
    
    
    
    // update hop le tat ca cac doi tuong
    @Test
    public void testUpdateSettingInform_Test4() {
        System.out.println("updateSettingInform khi doi tuong update co id = "
                + "1, mocDuoi = 0, mocTren = 5, thueSuat = 5, ngaySuaDoi = 2023-02-14: ");
        int id = 1;
        String mocDuoi = "0";
        String mocTren = "5";
        float thueSuat = 5.0f;
        String ngaySuaDoi = "2023-02-14";
        
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            // thêm đối tượng mới
            boolean check = instance.updateSettingInform(id, mocDuoi, mocTren, thueSuat, ngaySuaDoi, conn);
            assertTrue(check);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu
            SettingInform set = instance.getSettingInforById(String.valueOf(id));
            
            
            assertEquals(mocDuoi, set.getMocDuoi());
            assertEquals(mocTren, set.getMocDuoi());
            assertEquals(thueSuat, set.getThueSuat());
            assertEquals(ngaySuaDoi, set.getNgaySuaDoi());
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                conn.rollback();
                conn.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;  
    }
}
