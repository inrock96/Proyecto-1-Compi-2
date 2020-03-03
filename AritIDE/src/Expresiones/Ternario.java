/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public class Ternario extends Expresion{
    
    private Expresion condicion;
    private Expresion valorVerdadero;
    private Expresion valorFalso;
    private int fila, columna;

    public Ternario(Expresion condicion, Expresion valorVerdadero, Expresion valorFalso, int fila, int columna) {
        this.condicion = condicion;
        this.valorVerdadero = valorVerdadero;
        this.valorFalso = valorFalso;
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Object cond = condicion.ejecutar(ts);
        if((boolean)cond == true){
            return valorVerdadero.ejecutar(ts);
        }else{
            return valorFalso.ejecutar(ts);
        }
    }
        
}
