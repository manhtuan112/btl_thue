/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class SettingControllerTest {
    
    public SettingControllerTest() {
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
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        SettingController instance = new SettingController();
        instance.processRequest(request, response);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        SettingController instance = new SettingController();
        instance.doGet(request, response);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        SettingController instance = new SettingController();
        instance.doPost(request, response);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        SettingController instance = new SettingController();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
}
