/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class basicavalorbordePrestamoTest {
  
  public basicavalorbordePrestamoTest() {
  }

   public void testEstudioborde1000() {
    System.out.println("estudio");
    int cantidad = 1000;
    Prestamo instance = new Prestamo();
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioborde15000() {
    System.out.println("estudio");
    int cantidad = 15000;
    Prestamo instance = new Prestamo();
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  }
  

