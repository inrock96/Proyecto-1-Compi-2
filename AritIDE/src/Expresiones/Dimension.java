/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;

/**
 *
 * @author inti_
 */
public class Dimension implements NodoAST{
    Expresion valor;
    int tipo;
    int fila,columna;

    public Dimension(Expresion valor, int tipo, int fila, int columna) {
        this.valor = valor;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipo.Tipos getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
