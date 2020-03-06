/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class AST {
        LinkedList<NodoAST> instrucciones;

    public AST(LinkedList<NodoAST> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public LinkedList<NodoAST> getInstrucciones() {
        return instrucciones;
    }
    
        
}
