/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones.Funciones;

import AST.NodoAST;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class Matrix extends FuncionProgramada{

    public Matrix(String id, LinkedList<NodoAST> parametros, LinkedList<NodoAST> instrucciones, int fila, int columna) {
        super(id, parametros, instrucciones, fila, columna);
    }

    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipo.Tipos getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
