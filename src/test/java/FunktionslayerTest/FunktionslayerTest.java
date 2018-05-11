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
       Stykliste styk = new Stykliste(600,720,530,220); 
       System.out.println(styk.getTrykimpBrædt25x200mm360());
       System.out.println(styk.getTrykimpBrædt25x200mm540());
       System.out.println(styk.getTrykimpbrædt25x125mm360());// 3 burde være 2
       System.out.println(styk.getTrykimpbrædt25x125mm540());// 3 burde være 4
       System.out.println(styk.getLægteubh38x73mm420());
       System.out.println(styk.getRegulærub45x95mm270());
       System.out.println(styk.getRegulærub45x95mm240());
       System.out.println("asdasdasd" + " " + styk.getRegulærub45x95mm360());
       System.out.println(styk.getSpærtræubh45x195mm600());
       System.out.println(styk.getSpærtræubh45x195mm480());
       System.out.println(styk.getTrykimpstolpe97x97mm300()); //mangler 1 stolpe somewhere
       System.out.println(styk.getTrykimpbrædt19x100mm210());
       System.out.println(styk.getTrykimpbrædt19x100mm540());
       System.out.println(styk.getTrykimpbrædt19x100mm360());
       System.out.println(styk.getPlastmoecoliteblåtonet600());
       System.out.println(styk.getPlastmoecoliteblåtonet360());
       System.out.println(styk.getPlastmobundskruer50stk());
       System.out.println(styk.getHulbånd1x20mm10mtr()); 
       System.out.println(styk.getUniversal190mmhøjre());
       System.out.println(styk.getUniversal190mmvenstre());
       System.out.println(styk.getSkruer4komma5x60mm50stk());
       System.out.println(styk.getBeslagskruer4x50mm50stk());// 7 burde være 15 men antalet af skruer er insane ...
       System.out.println(styk.getBræddebolt10x120mm()); 
       System.out.println(styk.getFirkantsskiver40x40x11mm());
       System.out.println(styk.getSkruer4komma5x70mm50stk());
       System.out.println(styk.getSkruer4komma5x50mm50stk());
       System.out.println(styk.getStalddørsgreb50x75());
       System.out.println(styk.getThængsel390mm());
       System.out.println(styk.getVinkelbeslag35());
    
     
    }
}
