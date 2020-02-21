/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import TablaDeSimbolos.Tipo;
import java.util.ArrayList;

/**
 *
 * @author inti_
 */
public class Vector {
    private Tipo tipo;
    private int tamano;
    private Object[] valores;
    public Vector(Tipo tipo, Object[] valor, int tamano) {
        this.tipo = tipo;
        this.valores = valores;
        this.tamano = tamano;
    }
}
