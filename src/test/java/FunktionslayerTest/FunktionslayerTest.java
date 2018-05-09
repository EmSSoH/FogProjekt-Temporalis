/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunktionslayerTest;

import FunctionLayer.Stykliste;
import org.junit.Test;

/**
 *
 * @author Juste
 */
public class FunktionslayerTest {
    
    @Test
    public void testStykliste(){
       Stykliste styk = new Stykliste(600,780); 
       System.out.println(styk.getTrykimpBrædt25x200mm540());
    }
}
