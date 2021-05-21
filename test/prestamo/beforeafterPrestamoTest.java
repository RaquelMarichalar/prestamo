/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class beforeafterPrestamoTest {
  private static Prestamo instance;
  
  public beforeafterPrestamoTest() {
  }
  
  @Before
  public void setUp() {
    instance = new Prestamo();// Crea la clase antes de cada ejercicio.
  }
  
  @After
  public void tearDown() {
     instance = new Prestamo();// vacía el resultado después de cada ejercicio.
  }

  
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