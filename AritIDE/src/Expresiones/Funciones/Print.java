/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones.Funciones;
import AST.NodoAST;
import Expresiones.Expresion;
import GUI.Ventana;
import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public class Print extends Funcion{
    int fila,col;
    Expresion expresion;

    public Print(int fila, int col, Expresion expresion) {
        this.fila = fila;
        this.col = col;
        this.expresion = expresion;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        
        expresion.ejecutar(ts);
        Ventana.entrada.setText(Ventana.entrada.getText()+expresion.getValor()+"\n");
        return null;
    }
    
}
