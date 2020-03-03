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
public abstract class Expresion implements NodoAST{
    
    private Object valor;
    Tipo.Tipos tipo;
    public Object getValor(){
        return valor;
    }
    public Tipo.Tipos getTipo(){
        return tipo;
    }
    
}
