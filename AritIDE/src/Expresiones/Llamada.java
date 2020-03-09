/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import AST.NodoAST;
import Expresiones.Funciones.Funcion;
import Expresiones.Funciones.FuncionProgramada;
import GUI.Ventana;
import Instrucciones.Asignacion;
import Instrucciones.Break;
import TablaDeSimbolos.NodoError;
import TablaDeSimbolos.Simbolo;
import TablaDeSimbolos.Singleton;
import TablaDeSimbolos.TablaDeSimbolos;
import TablaDeSimbolos.Tipo;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.LinkedList;

/**
 *
 * @author inti_
 */
public class Llamada extends Expresion{
    String identificador;
    LinkedList<NodoAST> argumentos;
    int fila, columna;
    Tipo.Tipos tipo;

    public Llamada(String identificador, LinkedList<NodoAST> parametros, int fila, int columna) {
        this.identificador = identificador;
        this.argumentos = parametros;
        this.fila = fila;
        this.columna = columna;
    }
    
    public Llamada(String identificador, int fila, int columna) {
        this.identificador = identificador;
        this.argumentos = null;
        this.fila = fila;
        this.columna = columna;
    }
    
    

    
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        Object result = Singleton.getFuncion(identificador);
        if(result!=null){
            FuncionProgramada f = (FuncionProgramada)result;
            this.tipo= f.getTipo();
            if(f.getParametros().size()==this.argumentos.size()){
                for (int i = 0; i < f.getParametros().size(); i++) {
                    result = this.argumentos.get(i).ejecutar(ts);
                    if(result !=null){
                        Asignacion asig = (Asignacion)f.getParametros().get(i);
                        asig.ejecutar(ts);
                        if(!argumentos.get(i).getTipo().equals(asig.getTipo())||!asig.getTipo().equals(Tipo.Tipos.NONE)){
                            Ventana.Error.add(new NodoError(columna,fila,"Semántico","Error, el parametro "+(i++)+" no tiene el mismo tipo"));
                            return null;
                        }
                        Simbolo s = new Simbolo(identificador, result, tipo, fila, columna);
                        
                    }else{
                        Ventana.Error.add(new NodoError(columna,fila,"Semántico","Error, argumento nulo"));
                       return null;
                    }
                }
            }else{
                Ventana.Error.add(new NodoError(columna,fila,"Semántico","Error, el número de argumentos no es el mismo que el de los parametros"));
                return null;
            }
        }else{
            Ventana.Error.add(new NodoError(columna,fila,"Semántico","Error, no existe una función con ese nombre"));
            return null;
        }
    }
    
}
