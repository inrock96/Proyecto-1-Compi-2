/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeSimbolos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author inti_
 */
public class TablaDeSimbolos {
    private Map<String, Simbolo > tabla;
    private TablaDeSimbolos anterior;
    private LinkedList<Funcion> funciones;

    public TablaDeSimbolos(TablaDeSimbolos anterior) {
        this.tabla = new HashMap<String, Simbolo>();
        this.anterior = anterior;
        this.funciones = new LinkedList<Funcion>();
    }
    
    public void setVariable(Simbolo simbolo){
        
    }
    
    public Simbolo getVariable(String id){
        Simbolo encontrado = new Simbolo();
        return encontrado;
    }
    
    public void setFuncion(Funcion f){
        
    }
    
    public Funcion getFuncion(String id){
        return null;
    }
    
    public Map<String,Simbolo> getTabla(){
        return tabla;
    }
    
    public TablaDeSimbolos getAnterior(){
        return this.anterior;
    }
    
}
