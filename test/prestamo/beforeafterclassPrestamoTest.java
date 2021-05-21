/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class beforeafterclassPrestamoTest {
   private static Prestamo instance;
        
  
  public beforeafterclassPrestamoTest() {
    
  }
  
  @BeforeClass
  public static void setUpClass() {
    
    instance = new Prestamo();// Crea la clase solo una vez antes de ejecutar el ejercicio.
  }
  
  @AfterClass
  public static void tearDownClass() {
    instance = new Prestamo();// vacía el resultado al finalizar todos los ejercicios.
  }

  /**
   * Test of main method, of class Prestamo.
   */
  @Test
  public void testEstudioborde1000() {
    System.out.println("estudio");
    int cantidad = 1000;
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioborde15000() {
    System.out.println("estudio");
    int cantidad = 15000;
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioequivalenciacorrecto() {
    System.out.println("estudio");
    int cantidad = 1500;
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioequivalenciamayor() {
    System.out.println("estudio");
    int cantidad = 16000;
    String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   
  }
  
   @Test
  public void testEstudioequivalenciamenor() {
    System.out.println("estudio");
    int cantidad = 800;
    String expResult = "Préstamo no concedido carece de interes";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review t
  }
  
}
