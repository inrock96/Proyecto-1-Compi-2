/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeSimbolos;

import Expresiones.Funciones.Funcion;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class Singleton {
    private static LinkedList<Funcion> funciones;
    private Singleton(){
        funciones = new LinkedList<>();
    }
    public static LinkedList getInstanceOf(){
        if(funciones==null){
            funciones = new LinkedList<>();
        }
        return funciones;
    }
}
