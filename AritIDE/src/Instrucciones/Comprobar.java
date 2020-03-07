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
public class Comprobar implements NodoAST{
    Expresion identificador;
    LinkedList<NodoAST> casos;
    NodoAST defecto;
    int fila,columna;

    public Comprobar(Expresion identificador, LinkedList<NodoAST> casos, NodoAST defecto, int fila, int columna) {
        this.identificador = identificador;
        this.casos = casos;
        this.defecto = defecto;
        this.fila = fila;
        this.columna = columna;
    }
    public Comprobar(Expresion identificador, LinkedList<NodoAST> casos, int fila, int columna) {
        this.identificador = identificador;
        this.casos = casos;
        this.fila = fila;
        this.columna = columna;
    }
    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
