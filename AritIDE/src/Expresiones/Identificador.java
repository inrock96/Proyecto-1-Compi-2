/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import GUI.Ventana;
import TablaDeSimbolos.NodoError;
import TablaDeSimbolos.Simbolo;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;

/**
 *
 * @author inti_
 */
public class Identificador extends Expresion {
    private String id;
    private int columna,fila;

    public Identificador(String id, int columna, int fila) {
        this.id = id;
        this.columna = columna;
        this.fila = fila;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Simbolo simbolo = ts.getVariable(id);
        if(simbolo==null){
            Ventana.Error.add(new NodoError(columna,fila,"Semantico","Error, este id no ha sido creado"));
            return null;
        }else{
            return simbolo.getValor();
        }
    }
    public Tipo.Tipos getTipo(TablaDeSimbolos ts){
        return null;
    }
}
