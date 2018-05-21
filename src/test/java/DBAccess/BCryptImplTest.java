/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esben
 */
public class BCryptImplTest {
    
    public BCryptImplTest() {
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
     * Test of verifyHash method, of class BCryptImpl.
     */
    @Test
    public void testVerifyHash() {
        System.out.println("verifyHash");
        String password = "1234";
        BCryptImpl instance = new BCryptImpl(10);
        String hash = instance.hash(password);
        boolean result = instance.verifyHash(password, hash);
        assertTrue(result);
        
        password = "fug";
        hash = instance.hash(password);
        result = instance.verifyHash(password, hash);
        assertTrue(result);
        
        password = "EtEllerAndetTredjePasswordSomJegSkalTeste1234$$$SikkeDogEtLangtPasswordJegHåberIkkeDetBliverEtProblem987654321";
        hash = instance.hash(password);
        result = instance.verifyHash(password, hash);
        assertTrue(result);
        
        password = "rigtigt";
        hash = instance.hash(password);
        result = instance.verifyHash("forkert", hash);
        assertFalse(result);
    }
    
}
