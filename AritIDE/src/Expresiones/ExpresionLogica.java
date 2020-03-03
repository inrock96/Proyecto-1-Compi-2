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
public class ExpresionLogica extends Expresion{
    private Expresion operando1;
    private Expresion operando2;
    private Expresion operandoU;
    private int fila,columna;
    private Tipo.Operador operador;

    public ExpresionLogica(Expresion operando1, Expresion operando2, Tipo.Operador operador, int fila, int columna) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.fila = fila;
        this.columna = columna;
        this.operador = operador;
    }

    public ExpresionLogica(Expresion operandoU, int fila, int columna) {
        this.operandoU = operandoU;
        this.fila = fila;
        this.columna = columna;
    }

    public ExpresionLogica(Expresion a, Tipo.Operador operador, int aleft, int aright) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Object izquierdo,derecho,unario=null;
        this.tipo = Tipos.BOOLEANO;
        if(this.operandoU==null){
            izquierdo = operando1.ejecutar(ts);
            derecho = operando2.ejecutar(ts);
            if(izquierdo==null||derecho==null)  return null;
        }else{
            unario= operandoU.ejecutar(ts);
            if(unario==null)    return null;
        }
        
        if(this.operador==Tipo.Operador.AND){
            if(tipo==operando1.getTipo()){
                
            }else{
                
            }
        }else if(this.operador==Tipo.Operador.OR){
            if(tipo==operando1.getTipo()){
                
            }else{
                
            }
        }else if(this.operador==Tipo.Operador.NOT){
            if(tipo==operando1.getTipo()){
                
            }else{
                
            }
        }
        return null;
    }
    
}
