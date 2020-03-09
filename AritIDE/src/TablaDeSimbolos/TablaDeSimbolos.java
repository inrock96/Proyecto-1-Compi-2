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

    public TablaDeSimbolos(TablaDeSimbolos anterior) {
        this.tabla = new HashMap<String, Simbolo>();
        this.anterior = anterior;
    }
    
    public void setLocal(Simbolo simbolo){
            this.tabla.put(simbolo.getIdentificador(), simbolo);
        
    }
    public boolean setGlobal(String id, Simbolo simbolo){
        for(TablaDeSimbolos e = this; e!=null;e = e.getAnterior()){
            Simbolo encontrado = e.tabla.get(id);
            if(encontrado!=null){
                e.tabla.put(id, simbolo);                
                return true;
                
            }
        }
        return false;
    }
    public Simbolo getVariable(String id){
        Simbolo encontrado;
        for(TablaDeSimbolos e = this;e!=null;e=e.anterior){
            encontrado = e.tabla.get(id);
            if(encontrado!=null){
                return encontrado;
            }
        }
        return null;
    }
    
    public Map<String,Simbolo> getTabla(){
        return tabla;
    }
    
    public TablaDeSimbolos getAnterior(){
        return this.anterior;
    }
    
}
