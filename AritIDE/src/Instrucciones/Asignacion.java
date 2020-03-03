/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import AST.NodoAST;
import Expresiones.Expresion;
import TablaDeSimbolos.Simbolo;
import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public class Asignacion implements NodoAST{
    
    private String id;
    private Expresion valor;
    private Simbolo variable;
    private int fila,columna;
    public Asignacion(String id, Expresion valor, int fila, int columna) {
        this.id = id;
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        if(!ts.setGlobal(id, new Simbolo(id, valor, valor.getTipo(),fila,columna))){
            ts.setLocal(new Simbolo(id, valor, valor.getTipo(),fila,columna));
        }
        return null;
    }
    
}
