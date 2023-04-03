/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.concurrent.ExecutionException;
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
public class AccountTest {
    
    public AccountTest() {
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
    
    
    //Testcase for IDUser
    
    @Test
    public void testGetIDuser_Test1() {
        System.out.println("getIDuser_Test1: Khoi tao dung");
        Account instance = new Account("123456789", "admin1", "123456");
        String expResult = "123456789";
        String result = instance.getIDuser();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetIDuser_Test2() {
        System.out.println("getIDuser_Test1: Khoi tao nhung khong truyen tham so");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getIDuser();
        assertEquals(expResult, result);
        
    }

    @Test()
    public void testSetIDuser_Test1() {
        
        System.out.println("setIDuser_Test1: Khoi tao dung");
        String IDuser = "123456";
        Account instance = new Account();
        instance.setIDuser(IDuser);
        
        String expected = "123456";
        String result = instance.getIDuser();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetIDuser_Test2() {
        
        System.out.println("setIDuser_Test1: Khoi tao voi chuoi rong");
        String IDuser = "";
        Account instance = new Account();
        instance.setIDuser(IDuser);

    }
    
    
    
    //Testcase for Username

    @Test
    public void testGetUsername_Test1() {
        System.out.println("getUsername_Test1: Khoi tao dung");
        Account instance = new Account("123456789", "admin1", "123456");
        String expResult = "admin1";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetUsername_Test2() {
        System.out.println("getUsername_Test2: Khoi tao nhung khong truyen tham so");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }
    @Test()
    public void testSetUsername_Test1() {
        
        System.out.println("setUsername_Test1: Khoi tao dung");
        String Username = "admin1";
        Account instance = new Account();
        instance.setIDuser(Username);
        
        String expected = "admin1";
        String result = instance.getIDuser();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetUsername_Test2() {
        
        System.out.println("setIDuser_Test1: Khoi tao voi chuoi rong");
        String Username = "";
        Account instance = new Account();
        instance.setIDuser(Username);

    }
    
    //Testcase for Password

    @Test
    public void testGetPassword_Test1() {
        System.out.println("getPassword_Test1: Khoi tao dung");
        Account instance = new Account("123456789", "admin1", "123456");
        String expResult = "123456";
        String result = instance.getPassword();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetPassword_Test2() {
        System.out.println("getPassword_Test2: Khoi tao nhung khong truyen tham so");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetPassword_Test1() {
        System.out.println("setPassword_Test1: Khoi tao dung");
        String Password = "123456";
        Account instance = new Account();
        instance.setPassword(Password);
        
        String expected = "123456";
        String result = instance.getPassword();
        
        assertEquals(expected, result);

    }
    
    @Test(expected = Exception.class)
    public void testSetPassword_Test2() {
        
        System.out.println("setPassword_Test2: Khoi tao voi chuoi rong");
        String Password = "";
        Account instance = new Account();
        instance.setIDuser(Password);

    }

    
    
}
