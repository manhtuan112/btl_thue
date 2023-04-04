/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KhongDuyTuan
 */
public class SettingInformTest {
    
    public SettingInformTest() {
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
//--------------------------------------TESST GETID-------------------------------------------
    @Test
    public void testGetId_Test1() {
        System.out.println("getId sai: ");
        SettingInform instance = new SettingInform();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetId_Test2() {
        System.out.println("getId hop le: ");
        SettingInform instance = new SettingInform();
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetId_Test3() {
        System.out.println("getId vuot qua muc hop le: ");
        SettingInform instance = new SettingInform();
        int expResult = 10;
        int result = instance.getId();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }  
 //---------------------------------------------------------------------------------

    
    
//--------------------------------------TESST SETID-------------------------------------------
    @Test
    public void testSetId_Test1() {
        System.out.println("setId khong hop le: ");
        int id = 0;
        SettingInform instance = new SettingInform();
        instance.setId(id);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetId_Test2() {
        System.out.println("setId hop le: ");
        int id = 1;
        SettingInform instance = new SettingInform();
        instance.setId(id);
//        fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testSetId_Test3() {
        System.out.println("setId am: ");
        int id = 1;
        SettingInform instance = new SettingInform();
        instance.setId(id);
//        fail("The test case is a prototype.");
    }
//---------------------------------------------------------------------------------

    
    
//--------------------------------------TESST GetThueSuat-------------------------------------------
    @Test
    public void testGetThueSuat_Test1() {
        System.out.println("getThueSuat rong: ");
        SettingInform instance = new SettingInform();
        String expResult = "";
        String result = instance.getThueSuat();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetThueSuat_Test2() {
        System.out.println("getThueSuat hop le: ");
        SettingInform instance = new SettingInform();
        String expResult = "5%";
        String result = instance.getThueSuat();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetThueSuat_Test3() {
        System.out.println("getThueSuat am: ");
        SettingInform instance = new SettingInform();
        String expResult = "-5%";
        String result = instance.getThueSuat();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
//--------------------------------------------------------------------------------------------------

    
//--------------------------------------TESST SetThueSuat-------------------------------------------
    @Test
    public void testSetThueSuat_Test1() {
        System.out.println("setThueSuat rong: ");
        String thueSuat = "";
        SettingInform instance = new SettingInform();
        instance.setThueSuat(thueSuat);
//        fail("The test case is a prototype.");
    }
    @Test
    public void testSetThueSuat_Test2() {
        System.out.println("setThueSuat hop le: ");
        String thueSuat = "5%";
        SettingInform instance = new SettingInform();
        instance.setThueSuat(thueSuat);
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetThueSuat_Test3() {
        System.out.println("setThueSuat am: ");
        String thueSuat = "-5%";
        SettingInform instance = new SettingInform();
        instance.setThueSuat(thueSuat);
//        fail("The test case is a prototype.");
    }
//--------------------------------------------------------------------------------------------------    

    
//--------------------------------------TESST GetMocThue-------------------------------------------
    @Test
    public void testGetMocThue_Test1() {
        System.out.println("getMocThue rong");
        SettingInform instance = new SettingInform();
        String expResult = "";
        String result = instance.getMocThue();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetMocThue_Test2() {
        System.out.println("getMocThue hop le");
        SettingInform instance = new SettingInform();
        String expResult = "Trên 6 đến 10";
        String result = instance.getMocThue();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
//--------------------------------------------------------------------------------------------------    

    
//--------------------------------------TESST SetMocThue-------------------------------------------    
    @Test
    public void testSetMocThue_Test1() {
        System.out.println("setMocThue rong: ");
        String mocThue = "";
        SettingInform instance = new SettingInform();
        instance.setMocThue(mocThue);
//        fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testSetMocThue_Test2() {
        System.out.println("setMocThue hop le: ");
        String mocThue = "Trên 6 đến 10";
        SettingInform instance = new SettingInform();
        instance.setMocThue(mocThue);
//        fail("The test case is a prototype.");
    }
//--------------------------------------------------------------------------------------------------    

    
//--------------------------------------TESST GetNgaySuaDoi-------------------------------------------
    @Test
    public void testGetNgaySuaDoi_Test1() {
        System.out.println("getNgaySuaDoi rong: ");
        SettingInform instance = new SettingInform();
        Date expResult = null;
        Date result = instance.getNgaySuaDoi();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
//--------------------------------------------------------------------------------------------------    

    
//--------------------------------------TESST SetNgaySuaDoi------------------------------------------- 

    @Test
    public void testSetNgaySuaDoi() {
        System.out.println("setNgaySuaDoi rong: ");
        Date ngaySuaDoi = null;
        SettingInform instance = new SettingInform();
        instance.setNgaySuaDoi(ngaySuaDoi);
//        fail("The test case is a prototype.");
    }
    
//--------------------------------------------------------------------------------------------------    


    @Test
    public void testToString() {
        System.out.println("toString");
        SettingInform instance = new SettingInform();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
}
