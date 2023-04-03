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
public class HistoryTest {
    
    public HistoryTest() {
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

    
    //Ngaydongthue
    @Test
    public void testGetNgaydongthue_Test1() {
        System.out.println("getNgaydongthue_Test1: Khoi tao dung 1");
        History instance = new History(
                "2023-02-12", 
                "HN020001", 
                "1500000", 
                "1500000", 
                "4500000", 
                "0102859048");
        String expResult = "2023-02-12";
        String result = instance.getNgaydongthue();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNgaydongthue_Test2() {
        System.out.println("getNgaydongthue_Test2: Khoi tao dung nhung khong truyen tham so 2");
        History instance = new History();
        String expResult = "";
        String result = instance.getNgaydongthue();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetNgaydongthue_Test1() {
        
        System.out.println("setNgaydongthue_Test1: Khoi tao dung 3");
        String Ngaydongthue = "2001-02-12";
        History instance = new History();
        instance.setNgaydongthue(Ngaydongthue);
        
        String expected = "2001-02-12";
        String result = instance.getNgaydongthue();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetNgaydongthue_Test2() {
        
        System.out.println("setNgaydongthue_Test2: Khoi tao voi chuoi rong 4");
        String Ngaydongthue = "";
        History instance = new History();
        instance.setNgaydongthue(Ngaydongthue);

    }
    
    @Test(expected = Exception.class)
    public void testSetNgaydongthue_Test3() {
        
        System.out.println("setNgaydongthue_Test3: Khoi tao voi chuoi khong dung dinh dang YYYY-mm-dd hoac DD/mm/YYYY 5");
        String Ngaydongthue = "121gdfkljs";
        History instance = new History();
        instance.setNgaydongthue(Ngaydongthue);

    }
    
    
    //IdLichsu
    @Test
    public void testGetIdLichsu_Test1() {
        System.out.println("getIdLichsu_Test1: Khoi tao dung 6");
        History instance = new History(
                "2023-02-12", 
                "HN020001", 
                "1500000", 
                "1500000", 
                "4500000", 
                "0102859048");
        String expResult = "2023-02-12";
        String result = instance.getIdLichsu();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdLichsu_Test2() {
        System.out.println("getIdLichsu_Test2: Khoi tao dung nhung khong truyen tham so 7");
        History instance = new History();
        String expResult = "";
        String result = instance.getIdLichsu();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetIdLichsu_Test1() {
        
        System.out.println("setIdLichsu_Test1: Khoi tao dung 8");
        String IdLichsu = "0102859045";
        History instance = new History();
        instance.setIdLichsu(IdLichsu);
        
        String expected = "0102859045";
        String result = instance.getIdLichsu();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetIdLichsu_Test2() {
        
        System.out.println("setIdLichsu_Test2: Khoi tao voi chuoi rong 9");
        String IdLichsu = "";
        History instance = new History();
        instance.setIdLichsu(IdLichsu);

    }
    
    

    //Sotiendadong
    @Test
    public void testGetSotiendadong_Test1() {
        System.out.println("getSotiendadong_Test1: Khoi tao dung 10");
        History instance = new History(
                "2023-02-12", 
                "HN020001", 
                "1500000", 
                "1500000", 
                "4500000", 
                "0102859048");
        String expResult = "1500000";
        String result = instance.getSotiendadong();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSotiendadong_Test2() {
        System.out.println("getSotiendadong_Test2: Khoi tao dung nhung khong truyen tham so 11");
        History instance = new History();
        String expResult = "";
        String result = instance.getSotiendadong();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetSotiendadong_Test1() {
        
        System.out.println("setSotiendadong_Test1: Khoi tao dung 12");
        String Sotiendadong = "12000000";
        History instance = new History();
        instance.setSotiendadong(Sotiendadong);
        
        String expected = "12000000";
        String result = instance.getSotiendadong();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotiendadong_Test2() {
        
        System.out.println("setSotiendadong_Test2: Khoi tao voi chuoi rong 13");
        String Sotiendadong = "";
        History instance = new History();
        instance.setSotiendadong(Sotiendadong);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotiendadong_Test3() {
        
        System.out.println("setTSotiendadong_Test3: Khoi tao voi chuoi so am 14");
        String Sotiendadong = "-12000000";
        History instance = new History();
        instance.setSotiendadong(Sotiendadong);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotiendadong_Test4() {
        
        System.out.println("setSotiendadong_Test4: Khoi tao voi chuoi so qua lon 15");
        String Sotiendadong = "12000000000000000000";
        History instance = new History();
        instance.setSotiendadong(Sotiendadong);

    }
    

    //Sotienconno
    @Test
    public void testGetSotienconno_Test1() {
        System.out.println("getSotienconno_Test1: Khoi tao dung 16");
        History instance = new History(
                "2023-02-12", 
                "HN020001", 
                "1500000", 
                "1500000", 
                "4500000", 
                "0102859048");
        String expResult = "1500000";
        String result = instance.getSotienconno();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSotienconno_Test2() {
        System.out.println("getSotienconno_Test2: Khoi tao dung nhung khong truyen tham so 17");
        History instance = new History();
        String expResult = "";
        String result = instance.getSotienconno();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetSotienconno_Test1() {
        
        System.out.println("setSotienconno_Test1: Khoi tao dung 18");
        String Sotienconno = "12000000";
        History instance = new History();
        instance.setSotienconno(Sotienconno);
        
        String expected = "12000000";
        String result = instance.getSotienconno();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotienconno_Test2() {
        
        System.out.println("setSotienconno_Test2: Khoi tao voi chuoi rong 19");
        String Sotienconno = "";
        History instance = new History();
        instance.setSotienconno(Sotienconno);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotienconno_Test3() {
        
        System.out.println("setSotienconno_Test3: Khoi tao voi chuoi so am 20");
        String Sotienconno = "-12000000";
        History instance = new History();
        instance.setSotienconno(Sotienconno);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotienconno_Test4() {
        
        System.out.println("setSotienconno_Test4: Khoi tao voi chuoi so qua lon 21");
        String Sotienconno = "12000000000000000000";
        History instance = new History();
        instance.setSotienconno(Sotienconno);

    }

    
    //Sotienphaidong
    @Test
    public void testGetSotienphaidong_Test1() {
        System.out.println("getSotienphaidong_Test1: Khoi tao dung 22");
        History instance = new History(
                "2023-02-12", 
                "HN020001", 
                "1500000", 
                "1500000", 
                "4500000", 
                "0102859048");
        String expResult = "4500000";
        String result = instance.getSotienphaidong();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSotienphaidong_Test2() {
        System.out.println("getSotienphaidong_Test2: Khoi tao dung nhung khong truyen tham so 23");
        History instance = new History();
        String expResult = "";
        String result = instance.getSotienphaidong();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetSotienphaidong_Test1() {
        
        System.out.println("setSotienphaidong_Test1: Khoi tao dung 24");
        String Sotiendadong = "12000000";
        History instance = new History();
        instance.setSotienphaidong(Sotiendadong);
        
        String expected = "12000000";
        String result = instance.getSotienphaidong();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotienphaidong_Test2() {
        
        System.out.println("setSotienphaidong_Test2: Khoi tao voi chuoi rong 25");
        String Sotienphaidong = "";
        History instance = new History();
        instance.setSotienphaidong(Sotienphaidong);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotienphaidong_Test3() {
        
        System.out.println("setTSotienphaidong_Test3: Khoi tao voi chuoi so am 26");
        String Sotiendadong = "-12000000";
        History instance = new History();
        instance.setSotienphaidong(Sotiendadong);

    }
    
    @Test(expected = Exception.class)
    public void testSetSotienphaidong_Test4() {
        
        System.out.println("setSotienphaidong_Test4: Khoi tao voi chuoi so qua lon 27");
        String Sotienphaidong = "12000000000000000000";
        History instance = new History();
        instance.setSotienphaidong(Sotienphaidong);

    }

    
    //Idthue
    @Test
    public void testGetIdthue_Test1() {
        System.out.println("getIdthue_Test1: Khoi tao dung 28");
        History instance = new History(
                "2023-02-12", 
                "HN020001", 
                "1500000", 
                "1500000", 
                "4500000", 
                "0102859048");
        String expResult = "0102859048";
        String result = instance.getIdthue();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdthue_Test2() {
        System.out.println("getIdthue_Test2: Khoi tao dung nhung khong truyen tham so 29");
        History instance = new History();
        String expResult = "";
        String result = instance.getIdthue();
        assertEquals(expResult, result);
    }
    
    
    
    
    @Test()
    public void testSetIdthue_Test1() {
        
        System.out.println("setIdthue_Test1: Khoi tao dung 30");
        String Idthue = "0102859045";
        History instance = new History();
        instance.setIdthue(Idthue);
        
        String expected = "0102859045";
        String result = instance.getIdthue();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetIdthue_Test2() {
        
        System.out.println("setIdthue_Test2: Khoi tao voi chuoi rong 31");
        String Idthue = "";
        History instance = new History();
        instance.setIdthue(Idthue);

    }

    
    
}
