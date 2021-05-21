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
public class basicaPrestamoTest {
  
  public basicaPrestamoTest() {
  }

  
  /**
   * Test of estudio method, of class Prestamo.
   */
  @Test
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
  
   @Test
  public void testEstudioequivalenciacorrecto() {
    System.out.println("estudio");
    int cantidad = 1500;
    Prestamo instance = new Prestamo();
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioequivalenciamayor() {
    System.out.println("estudio");
    int cantidad = 16000;
    Prestamo instance = new Prestamo();
    String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioequivalenciamenor() {
    System.out.println("estudio");
    int cantidad = 800;
    Prestamo instance = new Prestamo();
    String expResult = "Préstamo no concedido carece de interes";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
  
  
}
