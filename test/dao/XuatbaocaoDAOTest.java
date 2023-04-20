/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

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
public class XuatbaocaoDAOTest {
    
    public XuatbaocaoDAOTest() {
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
    public void testGetHistorybyAddressDate_test1() {
        System.out.println("getHistorybyAddressDate voi tinh, thang, nam k hop le");
        String tinh = "";
        int thang = 0;
        int nam = 0;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
        
    }
    
    @Test
    public void testGetHistorybyAddressDate_test2() {
        System.out.println("getHistorybyAddressDate voi tinh hop le; thang va nam k hop le");
        String tinh = "Hà Nội";
        int thang = 0;
        int nam = 0;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
    }
    
    @Test
    public void testGetHistorybyAddressDate_test3() {
        System.out.println("getHistorybyAddressDate voi tinh và thang hợp lệ ; nam k hop le");
        String tinh = "Hà Nội";
        int thang =3;
        int nam = 0;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
    }
    
    @Test
    public void testGetHistorybyAddressDate_test4() {
        System.out.println("getHistorybyAddressDate voi tinh va nam hop le ; thang k hop le");
        String tinh = "Hà Nội";
        int thang = 0;
        int nam = 2023;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
    }
    
    @Test
    public void testGetHistorybyAddressDate_test5() {
        System.out.println("getHistorybyAddressDate voi thang hop le; tinh va nam k hop le");
        String tinh = "abcd";
        int thang = 3;
        int nam = 0;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
    }
    
    @Test
    public void testGetHistorybyAddressDate_test6() {
        System.out.println("getHistorybyAddressDate voi thang va nam hop le; tinh k hop le");
        String tinh = "abcd";
        int thang = 3;
        int nam = 2023;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
    }
    
    @Test
    public void testGetHistorybyAddressDate_test7() {
        System.out.println("getHistorybyAddressDate voi nam hop le; tinh va thang hop le");
        String tinh = "abcd";
        int thang = 13;
        int nam = 2023;
        DAO instance = new DAO();
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()==0);
    }
    
        @Test
    public void testGetHistorybyAddressDate_test8() {
        System.out.println("getHistorybyAddressDate voi tinh,thang, nam hop le");
        String tinh = "Hà Nội";
        int thang = 3;
        int nam = 2023;
        DAO instance = new DAO();
//        List<History> expResult = null;
        List<History> result = instance.getHistorybyAddressDate(tinh, thang, nam);
        assertNotNull(result);
        assertTrue(result.size()>0);
        for (History h: result){
            String[] date=h.getNgaydongthue().split("/");
            
            int th=Integer.parseInt(date[1]);
            int n=Integer.parseInt(date[2]);
            assertEquals(thang, th);
            assertEquals(nam, n);
        }
    }
    
}
