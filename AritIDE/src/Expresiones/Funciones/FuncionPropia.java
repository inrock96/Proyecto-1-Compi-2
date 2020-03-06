/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones.Funciones;

import AST.NodoAST;
import Expresiones.Expresion;
import Instrucciones.Asignacion;
import TablaDeSimbolos.TablaDeSimbolos;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class FuncionPropia extends Funcion{
    String id;
    LinkedList<Asignacion> parametros;
    public FuncionPropia(String id) {
        this.id = id;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
