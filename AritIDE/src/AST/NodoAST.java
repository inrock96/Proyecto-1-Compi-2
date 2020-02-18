/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import TablaDeSimbolos.TablaDeSimbolos;

/**
 *
 * @author inti
 */
public interface NodoAST {
    /**
     * 
     * @param ts
     * @return 
     */
    Object ejecutar(TablaDeSimbolos ts);
}
