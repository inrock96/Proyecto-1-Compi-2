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
public class Primitivo implements NodoAST{
    private Tipo tipo;
    Object valor;

    public Primitivo(Tipo tipo, Object valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        return null;
    }
}
