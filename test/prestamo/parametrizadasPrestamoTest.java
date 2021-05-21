/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author rmari
 */


/**
 *
 * @author rmari
 */
@RunWith(value=Parameterized.class)
public class  parametrizadasPrestamoTest {
  
  private int numero;
  private String mensajedevuelto;
  
  
  public parametrizadasPrestamoTest(int numero, String mensajedevuelto) {
    
    this.numero=numero;
    this.mensajedevuelto = mensajedevuelto;
  }
  
  @Parameterized.Parameters
    public static Iterable<Object> getData() {
        List<Object> prestamo = new ArrayList<>();

     
        prestamo.add (new Object[] {1000,"Felicidades, préstamo concedido"});
        prestamo.add (new Object[] {15000,"Felicidades, préstamo concedido"});
        prestamo.add (new Object[] {1500, "Felicidades, préstamo concedido"});
        prestamo.add (new Object[] {16000,"Préstamo no concedido es una operación con demasiado riesgo"});
        prestamo.add (new Object[] {800,"Préstamo no concedido carece de interes"});
      
        
        return prestamo;
    }
 
  @Test
  public void testEstudio() {
    System.out.println("estudio");
    int cantidad = this.numero;
    Prestamo instance = new Prestamo();
    String expResult = this.mensajedevuelto;
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    
  }
  
}

