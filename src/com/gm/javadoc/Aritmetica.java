/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.javadoc;

/**
 *esta clase permite realizar operaciones aritmeticas tales como sumar, restar, etc
 * @author john hernandez
 * @version 1.0
 */
public class Aritmetica {
    /**
     * primer Operando es de tipo entero
     */
    int operandoA;
    /**
     * segundo operando es de tipo entero
     */
    int operandoB;
    
    /**
     * contrcutor vacio
     */
    public Aritmetica(){
        
    }
    /**
     * constructor con 2 argumentos
     * @param a recibe el valor del operando a
     * @param b recibe el valor del operando b
     */
    public Aritmetica(int a, int b){
        this.operandoA=a;
        this.operandoB=b;
        
    }
    
    /**
     * este metodo realiza la operacion sumar de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar(){
        return operandoA + operandoB;
    }
    
}
