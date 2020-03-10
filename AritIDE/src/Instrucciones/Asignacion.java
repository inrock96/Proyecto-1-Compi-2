/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import AST.NodoAST;
import Expresiones.Expresion;
import TablaDeSimbolos.Simbolo;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;

/**
 *
 * @author inti_
 */
public class Asignacion implements NodoAST{
    
    private String id;
    private Expresion valor;
    private Simbolo variable;
    private Tipo.Tipos tipo;
    private int fila,columna;
    public Asignacion(String id, Expresion valor, int fila, int columna) {
        this.id = id;
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
        tipo = Tipo.Tipos.NONE;
    }

    public Asignacion(Expresion a, Expresion b, int aleft, int aright) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        valor.ejecutar(ts);
        if(!ts.setGlobal(id, new Simbolo(id, valor, valor.getTipo(),fila,columna))){
            ts.setLocal(new Simbolo(id, valor, valor.getTipo(),fila,columna));
            tipo = valor.getTipo();
        }
        return null;
    }

    @Override
    public Tipo.Tipos getTipo() {
        return tipo;
    }
    
}
