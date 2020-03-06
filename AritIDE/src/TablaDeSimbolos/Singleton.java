/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeSimbolos;

import Expresiones.Funciones.*;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author inti_
 */
public class Singleton {
    private static Map funciones ;
    private static Singleton singleton=null;
    private Singleton(){
        
        funciones = new Hashtable();
    }
    public static Singleton getInstanceOf(){
        if(singleton==null){
            singleton = new Singleton();
            
            crearNativas();
        }
        return singleton;
    }
    private static void crearNativas(){
        Print imprimir = new Print("print");
        funciones.put("print", imprimir);
    }
    public static void addFuncion(FuncionProgramada f){
        funciones.put(f.getId(),f);
    }   
    public static Funcion getFuncion(String id){
        return (Funcion)funciones.get(id);
    }

    
    
}
