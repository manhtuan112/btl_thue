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

    
        @Test
    public void testUpdateSettingInform_Test1() {
        System.out.println("updateSettingInform khi doi tuong update rong: ");
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
}
