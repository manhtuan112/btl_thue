/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

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
public class UserTest {
    
    public UserTest() {
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

    
    //CCCD
    @Test
    public void testGetCccd_Test1() {
        System.out.println("getCccd_Test1: Khoi tao dung 1");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "012201005252";
        String result = instance.getCccd();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCccd_Test2() {
        System.out.println("getCccd_Test2: Khoi tao dung nhung khong truyen tham so 2");
        User instance = new User();
        String expResult = "";
        String result = instance.getCccd();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetCccd_Test1() {
        
        System.out.println("setCccd_Test1: Khoi tao dung 3");
        String Cccd = "123456";
        User instance = new User();
        instance.setCccd(Cccd);
        
        String expected = "123456";
        String result = instance.getCccd();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetCccd_Test2() {
        
        System.out.println("setCccd_Test2: Khoi tao voi chuoi rong 4");
        String Cccd = "";
        User instance = new User();
        instance.setCccd(Cccd);

    }
    
    //Sdt

    @Test
    public void testGetStd_Test1() {
        System.out.println("getStd_Test1: Khoi tao dung 5");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "0388085178";
        String result = instance.getSdt();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetStd_Test2() {
        System.out.println("getStd_Test2: Khoi tao dung nhung khong truyen tham so 6");
        User instance = new User();
        String expResult = "";
        String result = instance.getSdt();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetSdt_Test1() {
        
        System.out.println("setSdt_Test1: Khoi tao dung 7");
        String Sdt = "0388864256";
        User instance = new User();
        instance.setSdt(Sdt);
        
        String expected = "0388864256";
        String result = instance.getSdt();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetSdt_Test2() {
        
        System.out.println("setSdt_Test2: Khoi tao voi chuoi rong 8");
        String Sdt = "";
        User instance = new User();
        instance.setSdt(Sdt);

    }
    
    //Hoten

    @Test
    public void testGetHoten_Test1() {
        System.out.println("getStd_Test1: Khoi tao dung 9");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "Nguyen Manh Tuan";
        String result = instance.getHoten();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHoten_Test2() {
        System.out.println("getStd_Test2: Khoi tao dung nhung khong truyen tham so 10");
        User instance = new User();
        String expResult = "";
        String result = instance.getHoten();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetHoten_Test1() {
        
        System.out.println("setHoten_Test1: Khoi tao dung 11");
        String Hoten = "Nguyen Manh Tuan";
        User instance = new User();
        instance.setHoten(Hoten);
        
        String expected = "Nguyen Manh Tuan";
        String result = instance.getHoten();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetHoten_Test2() {
        
        System.out.println("setHoten_Test2: Khoi tao voi chuoi rong 12");
        String Hoten = "";
        User instance = new User();
        instance.setHoten(Hoten);

    }
    
    //Email

    @Test
    public void testGetEmail_Test1() {
        System.out.println("getEmail_Test1: Khoi tao dung 13");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "manhtuan123@gmain.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail_Test2() {
        System.out.println("getEmail_Test2: Khoi tao dung nhung khong truyen tham so 14");
        User instance = new User();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetEmail_Test1() {
        
        System.out.println("setEmail_Test1: Khoi tao dung 15");
        String Email = "manhtuan@gmail.com";
        User instance = new User();
        instance.setEmail(Email);
        
        String expected = "manhtuan@gmail.com";
        String result = instance.getEmail();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetEmail_Test2() {
        
        System.out.println("setEmail_Test2: Khoi tao voi chuoi rong 16");
        String Email = "";
        User instance = new User();
        instance.setEmail(Email);

    }

    //Image
    @Test
    public void testGetImage_Test1() {
        System.out.println("getImage_Test1: Khoi tao dung 17");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg";
        String result = instance.getImage();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetImage_Test2() {
        System.out.println("getImage_Test2: Khoi tao dung nhung khong truyen tham so 18");
        User instance = new User();
        String expResult = "";
        String result = instance.getImage();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetImage_Test1() {
        
        System.out.println("setImage_Test1: Khoi tao dung 19");
        String Image = "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg";
        User instance = new User();
        instance.setImage(Image);
        
        String expected = "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg";
        String result = instance.getImage();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetImage_Test2() {
        
        System.out.println("setImage_Test2: Khoi tao voi chuoi rong 20");
        String Image = "";
        User instance = new User();
        instance.setEmail(Image);

    }
    //Nghenghiep

    @Test
    public void testGetNghenghiep_Test1() {
        System.out.println("getNghenghiep_Test1: Khoi tao dung 21");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "Sinh viên";
        String result = instance.getNghenghiep();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNghenghiep_Test2() {
        System.out.println("getNghenghiep_Test2: Khoi tao dung nhung khong truyen tham so 22");
        User instance = new User();
        String expResult = "";
        String result = instance.getNghenghiep();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetNghenghiep_Test1() {
        
        System.out.println("setNghenghiep_Test1: Khoi tao dung 23");
        String Nghenghiep = "Sinh viên";
        User instance = new User();
        instance.setNghenghiep(Nghenghiep);
        
        String expected = "Sinh viên";
        String result = instance.getNghenghiep();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetNghenghiep_Test2() {
        
        System.out.println("setNghenghiep_Test2: Khoi tao voi chuoi rong 24");
        String Nghenghiep = "";
        User instance = new User();
        instance.setNghenghiep(Nghenghiep);

    }
    
    //Ngaysinh

    @Test
    public void testGetNgaysinh_Test1() {
        System.out.println("getNgaysinh_Test1: Khoi tao dung 25");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "2001-02-12";
        String result = instance.getNgaysinh();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNgaysinh_Test2() {
        System.out.println("getNgaysinh_Test2: Khoi tao dung nhung khong truyen tham so 26");
        User instance = new User();
        String expResult = "";
        String result = instance.getNgaysinh();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetNgaysinh_Test1() {
        
        System.out.println("setNgaysinh_Test1: Khoi tao dung 27");
        String Ngaysinh = "2001-02-12";
        User instance = new User();
        instance.setNgaysinh(Ngaysinh);
        
        String expected = "2001-02-12";
        String result = instance.getNgaysinh();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetNgaysinh_Test2() {
        
        System.out.println("setNgaysinh_Test2: Khoi tao voi chuoi rong 28");
        String Ngaysinh = "";
        User instance = new User();
        instance.setNgaysinh(Ngaysinh);

    }
    
    //IdThue

    @Test
    public void testGetIdThue_Test1() {
        System.out.println("getNgaysinh_Test1: Khoi tao dung 29");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "0102859045";
        String result = instance.getIdThue();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdThue_Test2() {
        System.out.println("getIdThue_Test2: Khoi tao dung nhung khong truyen tham so 30");
        User instance = new User();
        String expResult = "";
        String result = instance.getIdThue();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetIdThue_Test1() {
        
        System.out.println("setIdThue_Test1: Khoi tao dung 31");
        String IdThue = "0102859045";
        User instance = new User();
        instance.setIdThue(IdThue);
        
        String expected = "0102859045";
        String result = instance.getIdThue();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetIdThue_Test2() {
        
        System.out.println("setIdThue_Test2: Khoi tao voi chuoi rong 32");
        String IdThue = "";
        User instance = new User();
        instance.setIdThue(IdThue);

    }
    //Diachi

    @Test
    public void testGetDiachi_Test1() {
        System.out.println("getDiachi_Test1: Khoi tao dung 33");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "Ha Noi";
        String result = instance.getDiachi();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDiachi_Test2() {
        System.out.println("getDiachi_Test2: Khoi tao dung nhung khong truyen tham so 34");
        User instance = new User();
        String expResult = "";
        String result = instance.getDiachi();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetDiachi_Test1() {
        
        System.out.println("setDiachi_Test1: Khoi tao dung 35");
        String Diachi = "Ha Noi";
        User instance = new User();
        instance.setDiachi(Diachi);
        
        String expected = "Ha Noi";
        String result = instance.getDiachi();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetDiachi_Test2() {
        
        System.out.println("setDiachi_Test2: Khoi tao voi chuoi rong 36");
        String Diachi = "";
        User instance = new User();
        instance.setDiachi(Diachi);

    }

    
    //Gioitinh
    @Test
    public void testGetGioitinh_Test1() {
        System.out.println("getGioitinh_Test1: Khoi tao dung 37");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "Nam";
        String result = instance.getGioitinh();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGioitinh_Test2() {
        System.out.println("getGioitinh_Test2: Khoi tao dung nhung khong truyen tham so 38");
        User instance = new User();
        String expResult = "";
        String result = instance.getGioitinh();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetGioitinh_Test1() {
        
        System.out.println("setGioitinh_Test1: Khoi tao dung 39");
        String Gioitinh = "Nam";
        User instance = new User();
        instance.setGioitinh(Gioitinh);
        
        String expected = "Nam";
        String result = instance.getGioitinh();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetGioitinh_Test2() {
        
        System.out.println("setGioitinh_Test2: Khoi tao voi chuoi rong 40");
        String Gioitinh = "";
        User instance = new User();
        instance.setGioitinh(Gioitinh);

    }
    
    //Thunhap

     @Test
    public void testGetThunhap_Test1() {
        System.out.println("getThunhap_Test1: Khoi tao dung 41");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "12.000.000";
        String result = instance.getThunhap();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetThunhap_Test2() {
        System.out.println("getThunhap_Test2: Khoi tao dung nhung khong truyen tham so 42");
        User instance = new User();
        String expResult = "";
        String result = instance.getThunhap();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetThunhap_Test1() {
        
        System.out.println("setThunhap_Test1: Khoi tao dung 43");
        String Thunhap = "12000000";
        User instance = new User();
        instance.setThunhap(Thunhap);
        
        String expected = "12000000";
        String result = instance.getThunhap();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetThunhap_Test2() {
        
        System.out.println("setThunhap_Test2: Khoi tao voi chuoi rong 44");
        String Thunhap = "";
        User instance = new User();
        instance.setThunhap(Thunhap);

    }
    
    @Test(expected = Exception.class)
    public void testSetThunhap_Test3() {
        
        System.out.println("setThunhap_Test3: Khoi tao voi chuoi so am 45");
        String Thunhap = "-12000000";
        User instance = new User();
        instance.setThunhap(Thunhap);

    }
    
    @Test(expected = Exception.class)
    public void testSetThunhap_Test4() {
        
        System.out.println("setThunhap_Test4: Khoi tao voi chuoi so qua lon 46");
        String Thunhap = "12000000000000000000";
        User instance = new User();
        instance.setThunhap(Thunhap);

    }
    
    //Thunhapkhongchiuthue

    @Test
    public void testGetThunhapkhongchiuthue_Test1() {
        System.out.println("getThunhapkhongchiuthue_Test1: Khoi tao dung 47");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "1.000.000";
        String result = instance.getThunhapkhongchiuthue();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetThunhapkhongchiuthue_Test2() {
        System.out.println("getThunhapkhongchiuthue_Test2: Khoi tao dung nhung khong truyen tham so 48");
        User instance = new User();
        String expResult = "";
        String result = instance.getThunhapkhongchiuthue();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetThunhapkhongchiuthue_Test1() {
        
        System.out.println("setThunhapkhongchiuthue_Test1: Khoi tao dung 49");
        String Thunhapkhongchiuthue = "12000000";
        User instance = new User();
        instance.setThunhapkhongchiuthue(Thunhapkhongchiuthue);
        
        String expected = "12000000";
        String result = instance.getThunhapkhongchiuthue();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetThunhapkhongchiuthue_Test2() {
        
        System.out.println("setThunhapkhongchiuthue_Test2: Khoi tao voi chuoi rong 50");
        String Thunhapkhongchiuthue = "";
        User instance = new User();
        instance.setThunhap(Thunhapkhongchiuthue);

    }
    
    @Test(expected = Exception.class)
    public void testSetThunhapkhongchiuthue_Test3() {
        
        System.out.println("setThunhapkhongchiuthue_Test3: Khoi tao voi chuoi so am 51");
        String Thunhapkhongchiuthue = "-12000000";
        User instance = new User();
        instance.setThunhapkhongchiuthue(Thunhapkhongchiuthue);

    }
    
    @Test(expected = Exception.class)
    public void testSetThunhapkhongchiuthue_Test4() {
        
        System.out.println("setThunhapkhongchiuthue_Test4: Khoi tao voi chuoi so qua lon 52");
        String Thunhapkhongchiuthue = "12000000000000000000000";
        User instance = new User();
        instance.setThunhap(Thunhapkhongchiuthue);

    }
    
    //Khoangiamtru

    @Test
    public void testGetKhoangiamtru_Test1() {
        System.out.println("getKhoangiamtru_Test1: Khoi tao dung 53");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "1.000.000";
        String result = instance.getKhoangiamtru();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetKhoangiamtru_Test2() {
        System.out.println("getKhoangiamtru_Test2: Khoi tao dung nhung khong truyen tham so 54");
        User instance = new User();
        String expResult = "";
        String result = instance.getKhoangiamtru();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetKhoangiamtru_Test1() {
        
        System.out.println("setKhoangiamtru_Test1: Khoi tao dung 55");
        String Khoangiamtru = "12000000";
        User instance = new User();
        instance.setKhoangiamtru(Khoangiamtru);
        
        String expected = "12000000";
        String result = instance.getKhoangiamtru();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetKhoangiamtru_Test2() {
        
        System.out.println("setThunhapkhongchiuthue_Test2: Khoi tao voi chuoi rong 56");
        String Khoangiamtru = "";
        User instance = new User();
        instance.setKhoangiamtru(Khoangiamtru);

    }
    
    @Test(expected = Exception.class)
    public void testSetKhoangiamtru_Test3() {
        
        System.out.println("setKhoangiamtru_Test3: Khoi tao voi chuoi so am 57");
        String Khoangiamtru = "-12000000";
        User instance = new User();
        instance.setKhoangiamtru(Khoangiamtru);

    }
    
    @Test(expected = Exception.class)
    public void testSetKhoangiamtru_Test4() {
        
        System.out.println("setKhoangiamtru_Test4: Khoi tao voi chuoi so qua lon 58");
        String Khoangiamtru = "12000000000000000000000";
        User instance = new User();
        instance.setKhoangiamtru(Khoangiamtru);

    }

    
    //Sothueconno
    @Test
    public void testGetSothueconno_Test1() {
        System.out.println("getKhoangiamtru_Test1: Khoi tao dung 59");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        String expResult = "1.000.000";
        String result = instance.getSothueconno();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSothueconno_Test2() {
        System.out.println("getSothueconno_Test2: Khoi tao dung nhung khong truyen tham so 60");
        User instance = new User();
        String expResult = "";
        String result = instance.getSothueconno();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetSothueconno_Test1() {
        
        System.out.println("setSothueconno_Test1: Khoi tao dung 61");
        String Sothueconno = "12000000";
        User instance = new User();
        instance.setSothueconno(Sothueconno);
        
        String expected = "12000000";
        String result = instance.getSothueconno();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetSothueconno_Test2() {
        
        System.out.println("setSothueconno_Test2: Khoi tao voi chuoi rong 62");
        String Sothueconno = "";
        User instance = new User();
        instance.setSothueconno(Sothueconno);

    }
    
    @Test(expected = Exception.class)
    public void testSetSothueconno_Test3() {
        
        System.out.println("setSothueconno_Test3: Khoi tao voi chuoi so am 63");
        String Sothueconno = "-12000000";
        User instance = new User();
        instance.setSothueconno(Sothueconno);

    }
    
    @Test(expected = Exception.class)
    public void testSetSothueconno_Test4() {
        
        System.out.println("setSothueconno_Test4: Khoi tao voi chuoi so qua lon 64");
        String Sothueconno = "12000000000000000000000";
        User instance = new User();
        instance.setSothueconno(Sothueconno);

    }
    
    //IdDiachi

    @Test
    public void testGetIdDiachi_Test1() {
        System.out.println("getKhoangiamtru_Test1: Khoi tao dung 65");
        User instance = new User(
                "012201005252", 
                "0388085178",
                "Nguyen Manh Tuan",
                "manhtuan123@gmain.com",
                "http://lavenderstudio.com.vn/wp-content/uploads/2019/10/gia-chup-hinh-chan-dung-ca-nhan-tp-hcm-01.jpg",
                "Sinh viên",
                "2001-02-12",
                "0102859045",
                "Ha Noi",
                "Nam",
                "12.000.000",
                "1.000.000",
                "1.200.000",
                "0",
                1);
        int expResult = 1;
        int result = instance.getIdDiachi();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdDiachi_Test2() {
        System.out.println("getIdDiachi_Test2: Khoi tao dung nhung khong truyen tham so 66");
        User instance = new User();
        int expResult = -1;
        int result = instance.getIdDiachi();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetIdDiachi_Test1() {
        
        System.out.println("setIdDiachi_Test1: Khoi tao dung 67");
        int IdDiachi = 1;
        User instance = new User();
        instance.setIdDiachi(IdDiachi);
        
        int expected = 1;
        int result = instance.getIdDiachi();
        
        assertEquals(expected, result);

    }
    
    
    
    @Test(expected = Exception.class)
    public void testSetIdDiachi_Test2() {
        
        System.out.println("setIdDiachi_Test3: Khoi tao voi so am 68");
        int IdDiachi = -5;
        User instance = new User();
        instance.setIdDiachi(IdDiachi);

    }
    
    @Test(expected = Exception.class)
    public void testSetIdDiachi_Test3() {
        
        System.out.println("setIdDiachi_Test4: Khoi tao voi so qua lon 69");
        int IdDiachi = 1000000000;
        User instance = new User();
        instance.setIdDiachi(IdDiachi);

    }
    

    
}
