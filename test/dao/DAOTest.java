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

    @Test
    public void testLogin_Test1() {
        System.out.println("login_Test1: Khoi tao voi tai khoan va mat khau dung 1");
        String user = "admin";
        String pass = "123";
        DAO instance = new DAO();
        Account expResult = new Account("ACC_admin_2023", user, pass);
        Account result = instance.login(user, pass);
        assertNotNull(result);
        
        
        assertEquals(expResult.getIDuser(), result.getIDuser());
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getPassword(), result.getPassword());

        

    }
    
    @Test
    public void testLogin_Test2() {
        System.out.println("login_Test2: Khoi tao voi tai khoan hoac mat khau sai 2");
        String user = "admin";
        String pass = "1234";
        DAO instance = new DAO();
        Account result = instance.login(user, pass);
        assertNull(result);
 

    }
    
    @Test
    public void testLogin_Test3() {
        System.out.println("login_Test3: Khoi tao voi tai khoan hoac mat khau rong 3");
        String user = "admin";
        String pass = "";
        DAO instance = new DAO();
        Account result = instance.login(user, pass);
        assertNull(result);

    }

    @Test
    public void testCheckAccountExist_Test1() {
        System.out.println("checkAccountExist_Test1: Tai khoan da ton tai 4");
        String user = "admin";
        DAO instance = new DAO();
        Account result = instance.checkAccountExist(user);
        assertNotNull(result);
    }
    
    @Test
    public void testCheckAccountExist_Test2() {
        System.out.println("checkAccountExist_Test2: Tai khoan chua ton tai 5");
        String user = "admin123";
        DAO instance = new DAO();
        Account result = instance.checkAccountExist(user);
        assertNull(result);
    }
    
    
    @Test
    public void testSignup_Test1() {
        System.out.println("signup_Test1: Khoi tao dung 6");
        String user = "admin4";
        String pass = "123";
        DAO instance = new DAO();
        instance.signup(user, pass);
    }
    
    @Test(expected = Exception.class)
    public void testSignup_Test2() {
        System.out.println("signup_Test1: Khoi tao voi tai khoan da bi trung 7");
        String user = "admin";
        String pass = "123";
        DAO instance = new DAO();
        instance.signup(user, pass);
    }
    
    @Test(expected = Exception.class)
    public void testSignup_Test3() {
        System.out.println("signup_Test3: Khoi tao voi username hoac password rong 8");
        String user = "";
        String pass = "123";
        DAO instance = new DAO();
        instance.signup(user, pass);
    }
    
    
    @Test
    public void testGetUserByAddress_Test1() {
        System.out.println("getUserByAddress_Test1: Khoi tao dung voi day du tinh huyen xa va so thue con no dung dinh dang (1 hoac 2) va ton tai nguoi dong thue theo dung dia chi truyen vao 9");
        String tinh = "Hà Nội";
        String huyen = "Ba Đình";
        String xa = "Phúc Xá";
        String status = "1";
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNotNull(result);
        assertNotEquals(0, result.size());
    }
    
    @Test
    public void testGetUserByAddress_Test2() {
        System.out.println("getUserByAddress_Test2: Khoi tao dung voi day du tinh huyen xa va so thue con no dung dinh dang (1 hoac 2) va khong ton tai nguoi dong thue theo dung dia chi truyen vao 10");
        String tinh = "Hà Nội";
        String huyen = "Thanh Xuân";
        String xa = "Khương Đình";
        String status = "1";
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
    
    @Test
    public void testGetUserByAddress_Test3() {
        System.out.println("getUserByAddress_Test3: Khoi tao voi thong tin hoac tinh hoac huyen hoac xa trong va so thue con no dung dinh dang (1 hoac 2) 11");
        String tinh = "";
        String huyen = "Thanh Xuân";
        String xa = "";
        String status = "1";
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNotNull(result);
        assertTrue(result.size()>=0);
    }
    
    @Test
    public void testGetUserByAddress_Test4() {
        System.out.println("getUserByAddress_Test4: Khoi tao voi thong tin tinh huyen xa va so thue con no khong dung dinh dang (khac 1 hoac 2) 12");
        String tinh = "Hà Nội";
        String huyen = "Thanh Xuân";
        String xa = "Nhân Chính";
        String status = "test";
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNull(result);
        
    }
    
    @Test
    public void testGetUserByAddress_Test5() {
        System.out.println("getUserByAddress_Test5: Khoi tao voi thong tin tinh huyen xa khong hop le 13");
        String tinh = "hanoi";
        String huyen = "Thanh Xuân";
        String xa = "Nhân Chính";
        String status = "1";
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNotNull(result);
        assertEquals(0, result.size());
        
    }

    
    @Test
    public void testGetUserByNameorIdThue_Test1() {
        System.out.println("getUserByNameorIdThue_Test1: Khoi tao dung tim kiem nguoi dung theo idThue(Ton tai nguoi dung) 14");
        String filter_roll = "3";
        String value = "0102859048";
        String status = "0";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(value, result.get(0).getIdThue());
    }
    
    @Test
    public void testGetUserByNameorIdThue_Test2() {
        System.out.println("getUserByNameorIdThue_Test2: Khoi tao dung tim kiem nguoi dung theo idThue(Khong ton tai nguoi dung) 15");
        String filter_roll = "3";
        String value = "0102859048";
        String status = "1";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
    
    @Test
    public void testGetUserByNameorIdThue_Test3() {
        System.out.println("getUserByNameorIdThue_Test3: Khoi tao sai tim kiem nguoi dung theo idThue nhung sai dinh dang status(khac 0,1,2) 16");
        String filter_roll = "3";
        String value = "0102859048";
        String status = "fsdf";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }
    
    @Test
    public void testGetUserByNameorIdThue_Test4() {
        System.out.println("getUserByNameorIdThue_Test4: Khoi tao sai filter_roll(khac 2,3) 17");
        String filter_roll = "gfd";
        String value = "0102859048";
        String status = "1";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }
    
    
    @Test
    public void testGetUserByNameorIdThue_Test5() {
        System.out.println("getUserByNameorIdThue_Test5: Khoi tao dung tim kiem nguoi dung theo Hoten(Ton tai nguoi dung) 18");
        String filter_roll = "2";
        String value = "Nguyễn Mạnh Tuân";
        String status = "0";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNotNull(result);
        assertTrue(result.size()>0);
        for(User u: result){
            assertEquals(value, u.getHoten());
        }
    }
    
    @Test
    public void testGetUserByNameorIdThue_Test6() {
        System.out.println("getUserByNameorIdThue_Test2: Khoi tao dung tim kiem nguoi dung theo Hoten(Khong ton tai nguoi dung) 19");
        String filter_roll = "2";
        String value = "nguyenmanhtuan";
        String status = "0";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
    
    @Test
    public void testGetUserByNameorIdThue_Test7() {
        System.out.println("getUserByNameorIdThue_Test3: Khoi tao sai tim kiem nguoi dung theo Hoten nhung sai dinh dang status(khac 0,1,2) 20");
        String filter_roll = "2";
        String value = "Nguyễn Mạnh Tuân";
        String status = "fsdf";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }
    
    

//    @Test
//    public void testGetBangBieuThue() {
//        System.out.println("getBangBieuThue");
//        DAO instance = new DAO();
//        List<SettingInform> expResult = null;
//        List<SettingInform> result = instance.getBangBieuThue();
//        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
//    }
//
    @Test
    public void testGetUserByIdThue_Test1() {
        System.out.println("getUserByIdThue_test1: Khoi tao dung tim kiem nguoi dung theo idThue(Ton tai nguoi dung) 21");
        String idThue = "0102859048";
        DAO instance = new DAO();
        
        User result = instance.getUserByIdThue(idThue);
        assertNotNull(result);
        assertEquals(idThue, result.getIdThue());
    }
    
    @Test
    public void testGetUserByIdThue_Test2() {
        System.out.println("getUserByIdThue_test2: Khoi tao dung tim kiem nguoi dung theo idThue(Khong ton tai nguoi dung) 21");
        String idThue = "010285048";
        DAO instance = new DAO();
        
        User result = instance.getUserByIdThue(idThue);
        assertNull(result);
    }
    
//
//    @Test
//    public void testGetSettingInforById() {
//        System.out.println("getSettingInforById");
//        String id = "";
//        DAO instance = new DAO();
//        SettingInform expResult = null;
//        SettingInform result = instance.getSettingInforById(id);
//        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testUpdateSettingInform() {
//        System.out.println("updateSettingInform");
//        int id = 0;
//        String mocThue = "";
//        String thueSuat = "";
//        String ngaySuaDoi = "";
//        DAO instance = new DAO();
//        instance.updateSettingInform(id, mocThue, thueSuat, ngaySuaDoi);
////        fail("The test case is a prototype.");
//    }
//
    @Test
    public void testGetAddresById_Test1() {
        System.out.println("getAddresById_Test1: Khoi tao dung 22");
        String id = "1";
        DAO instance = new DAO();
        String expResult = "Phúc Xá, Ba Đình, Hà Nội";
        String result = instance.getAddresById(id);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetAddresById_Test2() {
        System.out.println("getAddresById_Test2: Khoi tao sai(khong ton tai idDiachi truyen vào) 23");
        String id = "56y";
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getAddresById(id);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetAddresById_Test3() {
        System.out.println("getAddresById_Test3: Khoi tao sai(idDiachi la chuoi rong) 24");
        String id = "";
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getAddresById(id);
        assertEquals(expResult, result);

    }
//
    @Test
    public void testGetHistoryByIdThue_Test1() {
        System.out.println("getHistoryByIdThue_Test1: Khoi tao dung(ton tai idThue) va ton tai lich su dong thue 25");
        String idThue = "0102859048";
        DAO instance = new DAO();
        
        List<History> result = instance.getHistoryByIdThue(idThue);
        assertNotNull(result);
        assertTrue(result.size()>0);
        for(History h: result){
            assertEquals(idThue, h.getIdthue());
        }

    }
    
    @Test
    public void testGetHistoryByIdThue_Test2() {
        System.out.println("getHistoryByIdThue_Test2: Khoi tao dung(ton tai idThue) va khong ton tai lich su dong thue 26");
        String idThue = "0102859045";
        DAO instance = new DAO();
        
        List<History> result = instance.getHistoryByIdThue(idThue);
        assertNotNull(result);
        assertTrue(result.size()==0);

    }
    
    @Test
    public void testGetHistoryByIdThue_Test3() {
        System.out.println("getHistoryByIdThue_Test2: Khoi tao sai(khong ton tai idThue) 27");
        String idThue = "010285904t5";
        DAO instance = new DAO();
        
        List<History> result = instance.getHistoryByIdThue(idThue);
        assertNotNull(result);
        assertTrue(result.size()==0);

    }
    
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
