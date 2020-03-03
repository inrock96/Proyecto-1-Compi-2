/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import TablaDeSimbolos.Tipo.Tipos;

/**
 *
 * @author inti_
 */
public class ExpresionRelacional extends Expresion{
    
    private Expresion operando1,operando2;
    private Tipo.Operador operador;
    private int fila, columna;

    public ExpresionRelacional(Expresion operando1, Expresion operando2, Tipo.Operador operador, int fila, int columna) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador = operador;
        this.fila = fila;
        this.columna = columna;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Object izquierdo,derecho,unario=null;
        izquierdo = operando1.ejecutar(ts);
        derecho = operando2.ejecutar(ts);
        this.tipo = Tipos.BOOLEANO;
        if(izquierdo==null||derecho==null)  return null;
                
        if(this.operador==Tipo.Operador.MAYOR){
            
        }else if(this.operador==Tipo.Operador.MENOR){
            
        }else if(this.operador==Tipo.Operador.MAYIGUAL){
            
        }else if(this.operador==Tipo.Operador.MENIGUAL){
            
        }else if(this.operador==Tipo.Operador.IGUALACION){
            
        }else if(this.operador==Tipo.Operador.DIFERENCIACION){
            
        }
        return null;
    }
    
}
