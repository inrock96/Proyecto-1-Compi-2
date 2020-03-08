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
public class LlamadaArreglo extends Expresion{
    
    Expresion llamada;
    LinkedList<NodoAST> dimensiones;

    public LlamadaArreglo(Expresion llamada, LinkedList<NodoAST> dimensiones) {
        this.llamada = llamada;
        this.dimensiones = dimensiones;
    }
    
    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
