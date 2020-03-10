/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import java.util.Vector;

/**
 *
 * @author inti_
 */
public class Primitivo extends Expresion{
    private Object valor;
    Tipo.Tipos tipo;
    int fila,columna;

    public Primitivo(Object valor, Tipo.Tipos tipo, int fila, int columna) {
        this.valor = valor;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        
        Vector evctor = new Vector();
        return this.valor;
    }
    
}
