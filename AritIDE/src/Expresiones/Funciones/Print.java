/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones.Funciones;
import AST.NodoAST;
import Expresiones.Expresion;
import GUI.Ventana;
import TablaDeSimbolos.NodoError;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class Print extends FuncionProgramada{
    
    public Print(String id, LinkedList<NodoAST> parametros, LinkedList<NodoAST> instrucciones, int fila, int columna) {
        super(id, parametros,instrucciones,fila,columna);
        this.setTipo(Tipo.Tipos.VOID);
    }

    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        
        Expresion e = (Expresion)getParametros().get(0);
        if(e!=null){
            e.ejecutar(ts);
            Ventana.entrada.setText(Ventana.entrada.getText()+e+"\n");
            return null;
        }
        Ventana.Error.add(new NodoError(getFila(), getColumna(),"Semántico","Expresion con error"));
        return null;
    }
    
}
