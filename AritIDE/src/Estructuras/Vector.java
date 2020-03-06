/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Expresiones.Expresion;
import TablaDeSimbolos.Tipo;
import java.util.ArrayList;

/**
 *
 * @author inti_
 */
public class Vector {
    private Tipo.Tipos tipo;
    private int tamano;
    private Object[] valores;
    
    public Vector(Tipo.Tipos tipo, Object[] valores, int tamano) {
        this.tipo = tipo;
        this.valores = valores;
        this.tamano = tamano;
    }
    
    public void setValor(Expresion valor, int posicion){
        if(posicion<tamano&&posicion>-1){
            if(valor.getTipo()==this.tipo){
                valores[posicion]=valor.getValor();
            }else{
                //Error de tipo
            }
        }else{
            //error de acceso
        }
    }
}
