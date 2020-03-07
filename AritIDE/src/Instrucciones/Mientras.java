/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import AST.NodoAST;
import Expresiones.Expresion;
import TablaDeSimbolos.TablaDeSimbolos;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class Mientras implements NodoAST{
    Expresion condicion;
    LinkedList<NodoAST> instrucciones;
    int fila,columna;

    public Mientras(Expresion condicion, LinkedList<NodoAST> instrucciones, int fila, int columna) {
        this.condicion = condicion;
        this.instrucciones = instrucciones;
        this.fila = fila;
        this.columna = columna;
    }
    

    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
