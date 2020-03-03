/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import TablaDeSimbolos.Tipo.Operador;

/**
 *
 * @author inti_
 */
public class ExpresionNumerica extends Expresion{
    private Expresion operando1;
    private Expresion operando2;
    private Expresion operandoU;
    private int fila, columna;
    Tipo.Operador operador;

    public ExpresionNumerica(Expresion operando1, Expresion operando2, Tipo.Operador operador, int fila, int columna) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador = operador;
        this.fila = fila;
        this.columna = columna;
    }

    public ExpresionNumerica( Expresion operandoU,int fila, int columna) {
        this.operandoU = operandoU;
        this.fila = fila;
        this.columna = columna;
    }
    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Object izquierdo,derecho,unario=null;
        
        if(this.operandoU==null){
            izquierdo = operando1.ejecutar(ts);
            derecho = operando2.ejecutar(ts);
            if(izquierdo==null||derecho==null)  return null;
        }else{
            unario= operandoU.ejecutar(ts);
            if(unario==null)    return null;
        }
        
        if(this.operador==Operador.MAS){
            
        }else if(this.operador==Operador.MENOS){
            
        }else if(this.operador==Operador.POR){
            
        }else if(this.operador==Operador.DIV){
            
        }else if(this. operador==Operador.MOD){
            
        }else if(this.operador==Operador.POT){
            
        }else if(this.operador==Operador.MENOSUNARIO){
            
        }
        return null;
    }
    
}
