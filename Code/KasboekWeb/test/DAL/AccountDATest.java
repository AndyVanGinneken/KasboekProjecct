/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Account;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andy
 */
public class AccountDATest {
    
    public AccountDATest() {
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

    /**
     * Test of getByEmail method, of class AccountDA.
     */
    @Test
    public void testGetByEmail() {
        System.out.println("getByEmail");
        String email = "";
        Account expResult = null;
        Account result = AccountDA.getByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAccount method, of class AccountDA.
     */
    @Test
    public void testSaveAccount() {
        System.out.println("saveAccount");
        Account account = null;
        account = new Account("andy", "andy@andy.bz", "bur", true);
        AccountDA.saveAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class AccountDA.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        int id = 0;
        AccountDA.deleteAccount(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdatePassword method, of class AccountDA.
     */
    @Test
    public void testUpdatePassword() {
        System.out.println("UpdatePassword");
        int id = 0;
        String password = "";
        AccountDA.UpdatePassword(id, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccounts method, of class AccountDA.
     */
    @Test
    public void testGetAllAccounts() {
        System.out.println("getAllAccounts");
        boolean isAdmin = false;
        List<Account> expResult = null;
        List<Account> result = AccountDA.getAllAccounts(isAdmin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
