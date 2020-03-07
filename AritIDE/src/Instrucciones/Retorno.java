/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import AST.NodoAST;
import Expresiones.Expresion;
import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public class Retorno implements NodoAST{
    Expresion retorno;
    int fila,columna;

    public Retorno(Expresion retorno, int fila, int columna) {
        this.retorno = retorno;
        this.fila = fila;
        this.columna = columna;
    }
    public Retorno( int fila, int columna) {
        this.retorno = null;
        this.fila = fila;
        this.columna = columna;
    }
    

    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
