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
public class Print extends FuncionPropia{
    String id;
    Expresion expresion;

    public Print(String id) {
        super(id);
    }
    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        
        Object valor  = expresion.ejecutar(ts);
        
        Ventana.entrada.setText(Ventana.entrada.getText()+valor+"\n");
        return null;
    }
    
}
