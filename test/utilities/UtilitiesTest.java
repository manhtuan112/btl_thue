/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package utilities;

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
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
    public void testConvertDate_Test1() {
        System.out.println("convertDate_Test1: Truyen dung dinh dang mong muon YYYY-mm-DD");
        String date = "2023-10-05";
        String expResult = "05/10/2023";
        String result = Utilities.convertDate(date);
        assertEquals(expResult, result);
    }
    
    @Test(expected = Exception.class)
    public void testConvertDate_Test2() {
        System.out.println("convertDate_Test2: Truyen sai dinh dang mong muon YYYY-mm-DD");
        String date = "2023/10/05";
        
        String result = Utilities.convertDate(date);
        
    }

    @Test
    public void testConvertMoneyFormat_Test1() {
        System.out.println("convertMoneyFormat_Test1: Truyen dung dinh dang 1 so");
        long money = 100000000L;
        String expResult = "100.000.000";
        String result = Utilities.convertMoneyFormat(money);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testConvertMoneyFormat_Test2() {
        System.out.println("convertMoneyFormat_Test2: Truyen dinh dang 1 so am");
        long money = -100000000L;
        String expResult = "-100.000.000";
        String result = Utilities.convertMoneyFormat(money);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testConvertMoneyFormat_Test3() {
        System.out.println("convertMoneyFormat_Test3: Truyen dinh dang 1 so lon");
        long money = 100000000000000000L;
        String expResult = "100.000.000.000.000.000";
        String result = Utilities.convertMoneyFormat(money);
        assertEquals(expResult, result);
    }
    
}
