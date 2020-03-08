/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class Llamada extends Expresion{
    String identificador;
    LinkedList<NodoAST> parametros;
    int fila, columna;
    Tipo.Tipos tipo;

    public Llamada(String identificador, LinkedList<NodoAST> parametros, int fila, int columna) {
        this.identificador = identificador;
        this.parametros = parametros;
        this.fila = fila;
        this.columna = columna;
    }
    
    public Llamada(String identificador, int fila, int columna) {
        this.identificador = identificador;
        this.parametros = null;
        this.fila = fila;
        this.columna = columna;
    }
    
    

    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
