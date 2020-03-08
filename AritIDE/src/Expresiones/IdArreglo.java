/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class IdArreglo extends Expresion{
    String id;
    LinkedList<NodoAST> dimensiones;
    int fila,columna;

    public IdArreglo(String id, LinkedList<NodoAST> dimensiones, int fila, int columna) {
        this.id = id;
        this.dimensiones = dimensiones;
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
