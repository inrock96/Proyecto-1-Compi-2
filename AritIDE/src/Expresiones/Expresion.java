/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public abstract class Expresion implements NodoAST{
    
    private Object valor;
    
    public Object getValor(){
        return valor;
    }
    
}
