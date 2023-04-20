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
public class TheodoidanhsachDAOTest {
    
    Connection conn = DBContext.getConnection();
    
    
    public TheodoidanhsachDAOTest() {
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
        System.out.println("login_Test1(hợp lệ): Khởi tạo với tài khoản và mật khẩu đúng");
        String user = "admin";
        String pass = "123";
        DAO instance = new DAO();
        Account expResult = new Account("ACC_admin_2023", user, pass);
        
        Account result = instance.login(user, pass, conn);
        assertNotNull(result);
        
        
        assertEquals(expResult.getIDuser(), result.getIDuser());
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getPassword(), result.getPassword());

        

    }
    
    @Test
    public void testLogin_Test2() {
        System.out.println("login_Test2: Khởi tạo với tài khoản sai: tài khoản không có trong trong cơ sở dữ liệu");
        String user = "admin@";
        String pass = "123";
        DAO instance = new DAO();
        Account result = instance.login(user, pass, conn);
        assertNull(result);
 
    }
    
    @Test
    public void testLogin_Test3() {
        System.out.println("login_Test3: Khởi tạo với mật khẩu sai");
        String user = "admin";
        String pass = "1234";
        DAO instance = new DAO();
        Account result = instance.login(user, pass, conn);
        assertNull(result);
    }
    
    @Test
    public void testLogin_Test4() {
        System.out.println("login_Test4: Khởi tạo với tài khoản hoặc mật khẩu rỗng");
        String user = "admin";
        String pass = "";
        DAO instance = new DAO();
        Account result = instance.login(user, pass, conn);
        assertNull(result);

    }

    @Test
    public void testCheckAccountExist_Test1() {
        System.out.println("checkAccountExist_Test1(hợp lệ): Tài khoản đã tồn tại trong csdl");
        String user = "admin";
        DAO instance = new DAO();
        Account result = instance.checkAccountExist(user);
        assertNotNull(result);
        assertEquals(result.getUsername(), user);
    }

    
    @Test
    public void testCheckAccountExist_Test2() {
        System.out.println("checkAccountExist_Test2: Tài khoản chưa tồn tại trong csdl");
        String user = "admin123";
        DAO instance = new DAO();
        Account result = instance.checkAccountExist(user);
        assertNull(result);
    }

    
    @Test
    
    public void testSignup_Test1() {
        System.out.println("signup_Test1(hợp lệ): Khởi tạo đúng");
        String user = "admin4";
        String pass = "123";
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            
 
            // thêm đối tượng mới
            boolean check = instance.signup(user, pass, conn);
            assertTrue(check);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu
            Account result = instance.login(user, pass, conn);
            assertNotNull(result);
            assertEquals(result.getUsername(), user);
            assertEquals(result.getPassword(), pass);

           
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
    
    @Test()
    public void testSignup_Test2() {
        System.out.println("signup_Test2: Khởi tạo với tài khoản đã bị trùng trong csdl");
        String user = "admin";
        String pass = "123";
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            
 
            // thêm đối tượng mới
            boolean check = instance.signup(user, pass, conn);
            assertTrue(check==false);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu chưa
            Account result = instance.login(user, pass, conn);
            assertNull(result);
            

           
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
    
    @Test()
    public void testSignup_Test3() {
        System.out.println("signup_Test3: Khởi tạo với tài khoản rỗng");
        String user = "";
        String pass = "123";
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            
 
            // thêm đối tượng mới
            boolean check = instance.signup(user, pass, conn);
            assertTrue(check==false);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu chưa
            Account result = instance.login(user, pass, conn);
            assertNull(result);
            

           
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
    
    @Test()
    public void testSignup_Test4() {
        System.out.println("signup_Test4: Khởi tạo với mật khẩu rỗng");
        String user = "admin";
        String pass = "";
        Connection conn = DBContext.getConnection();
        try{
            DAO instance = new DAO();
            conn.setAutoCommit(false);
            
            
 
            // thêm đối tượng mới
            boolean check = instance.signup(user, pass, conn);
            assertTrue(check==false);
             
 
            //Kiểm tra đối tượng đã có trong cơ sở dũ liệu chưa
            Account result = instance.login(user, pass, conn);
            assertNull(result);
            

           
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
    

    @Test
    public void testGetUserByAddress_Test1() {
        System.out.println("getUserByAddress_Test1: Khởi tạo hợp lệ: đầy đủ tỉnh huyện xã "
                + "và số thuế còn nợ đúng định dạng (0, 1 hoặc 2) và tồn tại người đóng thuế theo đúng địa chỉ truyển vào");
        String tinh = "Hà Nội";
        String huyen = "Ba Đình";
        String xa = "Phúc Xá";
        String status = "1"; // tương ứng với còn nợ thuế
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNotNull(result);
        assertNotEquals(0, result.size());
        for(User u: result){
            assertEquals(xa+", "+huyen+", "+tinh, u.getDiachi());
            assertTrue(u.getSothueconno().equals("0"));
        }
    }
  
    @Test
    public void testGetUserByAddress_Test2() {
        System.out.println("getUserByAddress_Test2: Khởi tạo hợp lệ: đầy đủ tỉnh huyện xã "
                + "và số thuế còn nợ đúng định dạng (0, 1 hoặc 2) và không tồn tại người đóng thuế theo đúng địa chỉ truyển vào");
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
        System.out.println("getUserByAddress_Test3: Khởi tạo với thông tin hoặc của huyện hoặc cả tỉnh hoặc của xã"
                + " và số thuế còn nợ đúng định dạng (0, 1 hoac 2)");
        String tinh = "";
        String huyen = "Thanh Xuân";
        String xa = "";
        String status = "2"; // tương ứng với đã nộp đủ
        DAO instance = new DAO();

        List<User> result = instance.getUserByAddress(tinh, huyen, xa, status);
        assertNotNull(result);
        assertTrue(result.size()>=0);
        for(User u: result){
            assertEquals(huyen, u.getDiachi());
            assertTrue(!u.getSothueconno().equals("0"));
        }
    }
    
    @Test
    public void testGetUserByAddress_Test4() {
        System.out.println("getUserByAddress_Test4: Khởi tạo với thông tin tỉnh huyện xã và số thuế còn nợ không đúng "
                + "định dạng (khac 0, 1 hoac 2)");
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
        System.out.println("getUserByAddress_Test5: Khởi tạo với thông tin tỉnh huyện xã không hợp lệ");
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
        System.out.println("getUserByNameorIdThue_Test1(hợp lệ): "
                + "Khoi tao dung tim kiem nguoi dung theo idThue(Ton tai nguoi dung)");
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
        System.out.println("getUserByNameorIdThue_Test2(hợp lệ): Khoi tao tim kiem nguoi dung theo "
                + "idThue(Khong ton tai nguoi dung)");
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
        System.out.println("getUserByNameorIdThue_Test3: Khoi tao tim kiem nguoi dung "
                + "theo idThue nhung sai dinh dang status(khac 0,1,2)");
        String filter_roll = "3";
        String value = "0102859048";
        String status = "fsdf";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }
    
    @Test
    public void testGetUserByNameorIdThue_Test4() {
        System.out.println("getUserByNameorIdThue_Test4: Khoi "
                + "tao lọc theo idthue nhưng sai filter_roll(khác 3)");
        String filter_roll = "gfd";
        String value = "0102859048";
        String status = "1";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }
    
    
    @Test
    public void testGetUserByNameorIdThue_Test5() {
        System.out.println("getUserByNameorIdThue_Test5(hợp lệ): Khoi tao dung tim kiem nguoi "
                + "dung theo Hoten(Ton tai nguoi dung)");
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
        System.out.println("getUserByNameorIdThue_Test6(hợp lê): Khoi tao tim kiem nguoi"
                + " dung theo Hoten(Khong ton tai nguoi dung)");
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
        System.out.println("getUserByNameorIdThue_Test7: Khoi tao tim kiem nguoi dung theo "
                + "Hoten nhung sai dinh dang status(khac 0,1,2)");
        String filter_roll = "2";
        String value = "Nguyễn Mạnh Tuân";
        String status = "fsdf";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }
    
    
    @Test
    public void testGetUserByNameorIdThue_Test8() {
        System.out.println("getUserByNameorIdThue_Test8: Khoi "
                + "tao lọc theo idthue nhưng sai filter_roll(khác 2)");
        String filter_roll = "gfd";
        String value = "0102859048";
        String status = "1";
        DAO instance = new DAO();
        List<User> result = instance.getUserByNameorIdThue(filter_roll, value, status);
        assertNull(result);
        
    }

    @Test
    public void testGetUserByIdThue_Test1() {
        System.out.println("getUserByIdThue_test1(hợp lệ): Khoi tao tim kiem nguoi "
                + "dung theo idThue(Ton tai nguoi dung)");
        String idThue = "0102859048";
        DAO instance = new DAO();
        
        User result = instance.getUserByIdThue(idThue);
        assertNotNull(result);
        assertEquals(idThue, result.getIdThue());
    }
    
    @Test
    public void testGetUserByIdThue_Test2() {
        System.out.println("getUserByIdThue_test2: Khoi tao tim kiem nguoi dung"
                + " theo idThue(Khong ton tai nguoi dung)");
        String idThue = "010285048";
        DAO instance = new DAO();
        
        User result = instance.getUserByIdThue(idThue);
        assertNull(result);
    }
    
    
    @Test
    public void testGetUserByIdThue_Test3() {
        System.out.println("getUserByIdThue_test3: Khoi tao tim kiem nguoi dung"
                + " nhưng để trống idThue");
        String idThue = "";
        DAO instance = new DAO();
        
        User result = instance.getUserByIdThue(idThue);
        assertNull(result);
    }
//
    @Test
    public void testGetAddresById_Test1() {
        System.out.println("getAddresById_Test1(hợp lệ): Khoi tao");
        String id = "1";
        DAO instance = new DAO();
        String expResult = "Phúc Xá, Ba Đình, Hà Nội";
        String result = instance.getAddresById(id);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetAddresById_Test2() {
        System.out.println("getAddresById_Test2: Khoi tao (khong ton tai idDiachi truyen vào)");
        String id = "56y";
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getAddresById(id);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetAddresById_Test3() {
        System.out.println("getAddresById_Test3: Khoi tao sai(idDiachi la chuoi rong)");
        String id = "";
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getAddresById(id);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetHistoryByIdThue_Test1() {
        System.out.println("getHistoryByIdThue_Test1(hợp lệ): Khoi tao dung(ton tai idThue) "
                + "va ton tai lich su dong thue");
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
        System.out.println("getHistoryByIdThue_Test2: Khoi tao dung(ton tai idThue)"
                + " va khong ton tai lich su dong thue");
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
    
}
