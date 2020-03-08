/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones.Funciones;

import AST.NodoAST;
import Estructuras.Arreglo;
import Estructuras.Lista;
import Estructuras.Matriz;
import TablaDeSimbolos.Singleton;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class FuncionProgramada extends Funcion{
    
    final private String id;
    private LinkedList<NodoAST> instrucciones;
    private LinkedList<NodoAST> parametros;
    private Tipo.Tipos tipo;
    final private int fila,columna;
    private TablaDeSimbolos local;
    
    /**
     * 
     * @param id
     * @param instrucciones
     * @param parametros
     * @param fila
     * @param columna 
     * Constructor para funciones con parametros
     */
    public FuncionProgramada(String id, LinkedList<NodoAST> parametros, LinkedList<NodoAST> instrucciones, int fila, int columna) {
        this.id = id;
        this.instrucciones = instrucciones;
        this.parametros = parametros;
        this.fila = fila;
        this.columna = columna;
    }
    
    
    /**
     * 
     * @param id
     * @param instrucciones
     * @param aleft
     * @param aright 
     * Constructor para funciones sin parámetros
     */
    public FuncionProgramada(String id, LinkedList<NodoAST> instrucciones, int fila, int columna) {
        this.id = id;
        this.instrucciones = instrucciones;
        this.fila = fila;
        this.columna = columna;
        parametros = null;
    }
    
    
    
    protected boolean verificarTipo(Tipo.Tipos tipo, Object result){
        if(this.getTipo()==tipo.INTEGER&&result instanceof Integer){
         return true;   
        }
        if(this.getTipo()==tipo.ARRAY&&result instanceof Arreglo){
         return true;   
        }
        if(this.getTipo()==tipo.NUMERIC&&result instanceof Double){
         return true;   
        }
        if(this.getTipo()==tipo.BOOLEANO&&result instanceof Boolean){
         return true;   
        }
        if(this.getTipo()==tipo.STRING&&result instanceof String){
         return true;   
        }
        if(this.getTipo()==tipo.MATRIX&&result instanceof Matriz){
         return true;   
        }
        if(this.getTipo()==tipo.LIST&&result instanceof Lista){
         return true;   
        }
        return false;
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Singleton.addFuncion(this);
        return null;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    

    /**
     * @return the instrucciones
     */
    public LinkedList<NodoAST> getInstrucciones() {
        return instrucciones;
    }

    /**
     * @param instrucciones the instrucciones to set
     */
    public void setInstrucciones(LinkedList<NodoAST> instrucciones) {
        this.instrucciones = instrucciones;
    }

    /**
     * @return the tipo
     */
    public Tipo.Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo.Tipos tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    
    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    
    /**
     * @return the local
     */
    public TablaDeSimbolos getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(TablaDeSimbolos local) {
        this.local = local;
    }
    
}
