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
public class If implements NodoAST{
    Expresion condicion;
    LinkedList<NodoAST>elseifs;
    LinkedList<NodoAST>instrucciones;
    LinkedList<NodoAST>instrElse;
    int fila,columna;
    
    
    public If(Expresion condicion, 
             LinkedList<NodoAST> instrucciones, int fila, int columna) {
        this.condicion = condicion;
        this.elseifs = null;
        this.instrucciones = instrucciones;
        this.fila = fila;
        this.columna = columna;
    }
    
    public If(Expresion condicion, LinkedList<NodoAST> instrucciones, LinkedList<NodoAST> elseifs, int fila, int columna) {
        this.condicion = condicion;
        this.elseifs = elseifs;
        this.instrucciones = instrucciones;
        this.fila = fila;
        this.columna = columna;
    }
    
    public If(Expresion condicion, LinkedList<NodoAST> instrucciones, LinkedList<NodoAST> elseifs,LinkedList<NodoAST> instrElse, int fila, int columna) {
        this.condicion = condicion;
        this.elseifs = elseifs;
        this.instrucciones = instrucciones;
        this.fila = fila;
        this.columna = columna;
        this.instrElse = instrElse;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
