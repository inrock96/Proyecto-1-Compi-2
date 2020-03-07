/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public class Break implements NodoAST{
    int fila,columna;

    public Break(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
