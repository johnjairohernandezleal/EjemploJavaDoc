/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc;
import com.gm.javadoc.*;

/**
 *clase para probar el concepto de javadoc
 * @author john hernandez
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * metodo que ejecuta la prueba de la clase aritmetica
     * @param args argumento de la linea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int resultado = new Aritmetica(3, 2).sumar();
        System.out.println("resultado:" + resultado);
        
        int resultado2 = new Aritmetica(5,3).sumar();
        System.out.println("resultado2 = " + resultado2);
        
        
        
       
        
        
    }
    
}
