/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.History;
import model.SettingInform;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;






public class DAOTest {
    
    public DAOTest() {
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
    
    //===========================================Tuấn
    //---------------------------------TEST GetBangBieuThue---------------------------------------------
    @Test
    public void testGetBangBieuThue_Test1() {
        System.out.println("getBangBieuThue voi doi tuong null: ");
        DAO instance = new DAO();
        List<SettingInform> result = instance.getBangBieuThue();
        assertNotNull(result);
        assertTrue(result.size() == 7);
//        fail("The test case is a prototype.");
    }
    
//--------------------------------------------------------------------------------------------------

    
//---------------------------------TEST GetSettingInforById-----------------------------------------
    @Test
    public void testGetSettingInforById_Test1() {
        System.out.println("getSettingInforById khi id null: ");
        String id = "";
        DAO instance = new DAO();
        SettingInform result = instance.getSettingInforById(id);
        assertNull(result);
    }
    
    @Test
    public void testGetSettingInforById_Test2() {
        System.out.println("getSettingInforById hop le");
        String idString = "5";
        int idExpected = Integer.parseInt(idString);
        DAO instance = new DAO();
        
        SettingInform result = instance.getSettingInforById(idString);
        assertEquals(idExpected, result.getId());
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSettingInforById_Test3() {
        System.out.println("getSettingInforById hop le");
        String id = "-1";
        DAO instance = new DAO();
        SettingInform result = instance.getSettingInforById(id);
        assertNull(result);
        
//        fail("The test case is a prototype.");
    }
//--------------------------------------------------------------------------------------------------

    
//---------------------------------TEST UpdateSettingInform-----------------------------------------
    @Test
    public void testUpdateSettingInform_Test1() {
        System.out.println("updateSettingInform khi doi tuong update rong: ");
        int id = 0;
        String mocThue = "";
        String thueSuat = "";
        String ngaySuaDoi = "";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test2() {
        System.out.println("updateSettingInform khi mocThue doi tuong update rong: ");
        int id = 0;
        String mocThue = "";
        String thueSuat = "6%";
        String ngaySuaDoi = "2023-04-04";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test3() {
        System.out.println("updateSettingInform khi thueSuat doi tuong update rong: ");
        int id = 0;
        String mocThue = "1";
        String thueSuat = "";
        String ngaySuaDoi = "2023-04-04";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test4() {
        System.out.println("updateSettingInform khi ngaySuaDoi doi tuong update rong: ");
        int id = 0;
        String mocThue = "1";
        String thueSuat = "6%";
        String ngaySuaDoi = "";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test5() {
        System.out.println("updateSettingInform voi doi tuong hop le: ");
        int id = 1;
        String mocThue = "1";
        String thueSuat = "6%";
        String ngaySuaDoi = "2023-04-04";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test6() {
        System.out.println("updateSettingInform voi mocThue va thueSuat doi tuong rong cung voi id khong hop le: ");
        int id = 0;
        String mocThue = "";
        String thueSuat = "";
        String ngaySuaDoi = "2023-04-04";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
   
    @Test
    public void testUpdateSettingInform_Test7() {
        System.out.println("updateSettingInform voi mocThue va ngaySuaDoi doi tuong rong cung voi id khong hop le: ");
        int id = 0;
        String mocThue = "";
        String thueSuat = "6%";
        String ngaySuaDoi = "";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test8() {
        System.out.println("updateSettingInform voi thueSuat va ngaySuaDoi doi tuong rong cung voi id khong hop le: ");
        int id = 0;
        String mocThue = "1";
        String thueSuat = "";
        String ngaySuaDoi = "";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test9() {
        System.out.println("updateSettingInform voi mocThue va thueSuat doi tuong rong cung voi id hop le: ");
        int id = 1;
        String mocThue = "";
        String thueSuat = "";
        String ngaySuaDoi = "2023-04-04";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
   
    @Test
    public void testUpdateSettingInform_Test10() {
        System.out.println("updateSettingInform voi mocThue va ngaySuaDoi doi tuong rong cung voi id hop le: ");
        int id = 1;
        String mocThue = "";
        String thueSuat = "6%";
        String ngaySuaDoi = "";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSettingInform_Test11() {
        System.out.println("updateSettingInform voi thueSuat va ngaySuaDoi doi tuong rong cung voi id hop le: ");
        int id = 1;
        String mocThue = "1";
        String thueSuat = "";
        String ngaySuaDoi = "";
        DAO instance = new DAO();
        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
    
//---------------------------------------------------------------------------------------
    
//
//    @Test
//    public void testGetHistorybyAddressDate() {
//        System.out.println("getHistorybyAddressDate");
//        String tinh = "";
//        int thang = 0;
//        int nam = 0;
//        DAO instance = new DAO();
//        List<History> expResult = null;
//        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
//        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
//    }
    
}
