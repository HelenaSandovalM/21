/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HELENA
 */
public class RulesTest {
    
    public RulesTest() {
    }
       
    /**
     * RulesTest of compare method, of class Rules.
     */
    @Test
    public void testCompareE1() {
        System.out.println("Compara valores por jugador 17 y 15");
        Player player1 = new Player();
        player1.setScore(17);
        
        Player player2 = new Player();
        player2.setScore(15);
        
           Rules instance = new Rules();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = false;
        boolean result2 = false;
        instance.compare(player1, player2);
        
        if(player1.getScore()>player2.getScore()&&player1.getScore()<=21 ){
	    result1 = true;
        }else
            if(player1.getScore()<player2.getScore()&&player2.getScore()<=21){
            result2 = true;}
        
        assertEquals(expResult1, result1);
        
        if (result1 != expResult1)
        // TODO review the generated test code and remove the default call to fail.
        {fail("The test case is a prototype.");}
   

    }
    
@Test
    public void testCompareE2() {
        System.out.println("Compara valores por jugador 18 y 20");
        Player player1 = new Player();
        player1.setScore(18);
        
        Player player2 = new Player();
        player2.setScore(20);
        
           Rules instance = new Rules();
        boolean expResult1 = false;
        boolean expResult2 = true;
        boolean result1 = false;
        boolean result2 = false;
        instance.compare(player1, player2);
        
        if(player1.getScore()>player2.getScore()&&player1.getScore()<=21 ){
	    result1 = true;
        }else
            if(player1.getScore()<player2.getScore()&&player2.getScore()<=21){
            result2 = true;}
        
        assertEquals(expResult2, result2);
        
        if (result2 != expResult2)
        // TODO review the generated test code and remove the default call to fail.
        {fail("The test case is a prototype.");}

    }
    
    @Test
    public void testCompareE3() {
        System.out.println("Compara valores por jugador 10 y 20");
        Player player1 = new Player();
        player1.setScore(10);
        Player player2 = new Player();
        player2.setScore(20);
        
        Rules instance = new Rules();
        boolean expResult1 = false;
        boolean expResult2 = true;
        boolean result1 = false;
        boolean result2 = false;
        instance.compare(player1, player2);
        
        if(player1.getScore()>player2.getScore()&&player1.getScore()<=21 ){
	    result1 = true;
        }else
            if(player1.getScore()<player2.getScore()&&player2.getScore()<=21){
            result2 = true;}
        
        assertEquals(expResult2, result2);
        
        if (result2 != expResult2)
        // TODO review the generated test code and remove the default call to fail.
        {fail("The test case is a prototype.");}

    }
    /**
     * Test of needBrand method, of class Rules.
     */
    
    /**
     * RulesTest of Calculation method, of class Rules.
     */
    @Test
    public void testCalculationE1() {
        System.out.println("Compara valores entre 6 y 11");
        Player player1 = new Player();
        player1.getArr().add(5);
        player1.getArr().add(5);
        player1.getArr().add(5);
        
        Player player2 = new Player();
        player2.getArr().add(11);
        player2.getArr().add(11);
        player2.getArr().add(11);
        
        Rules instance = new Rules();
        instance.Calculation(player1, player2);
     
        int expResult = 6;
        int result = player1.getScore();
        assertEquals(expResult,result, 0.0001);
                
        if ((player1.getScore()!= 6) && (player2.getScore()!= 12))
        // TODO review the generated test code and remove the default call to fail.
        {  fail("The test case is a prototype.");}
    }


    /**
     * RulesTest of brandNumber method, of class Rules.
     */
    @Test
    public void testBrandNumber() {
        System.out.println("brandNumber con 12 ");
        int i = 12;
        Rules instance = new Rules();
        int expResult = 3;
        int result = instance.brandNumber(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult!=result)
        {fail("The test case is a prototype.");}
    }


    /**
     * RulesTest of showBrand method, of class Rules.
     */
    @Test
    public void testShowBrand() {
        System.out.println("showBrand con cartas AAA");
        Player player1 = new Player();
        player1.getArr().add(2);
        player1.getArr().add(2);
        player1.getArr().add(2);
        
        Player player2 = new Player();
        player2.getArr().add(48);
        player2.getArr().add(48);
        player2.getArr().add(48);
        
        Rules instance = new Rules();
        instance.showBrand(player1, player2);
        String result = "";
        String expResult = "AAA";
        for(int i=0;i<player1.getArr().size();i++){
		result = result + "" + instance.BrandFace(player1.getArr().get(i), player1, player2); 
        }
        assertEquals(expResult, result);
        if (result==expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }
        
        
/**
     * RulesTest of BrandFace method, of class Rules.
     */
    @Test
        public void testBrandFace() {
        System.out.println("BrandFace para la letra K");
        int i = 51;
        Player player1 = new Player();
        Player player2 = new Player();
        Rules instance = new Rules();
        String expResult = "K";
        String result =  instance.BrandFace(i, player1, player2);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult!= result){
        fail("The test case is a prototype.");}
    }

    
}
