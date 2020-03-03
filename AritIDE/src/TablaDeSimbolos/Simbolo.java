/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeSimbolos;

/**
 *
 * @author inti_
 */
public class Simbolo {
    
    private final String identificador;
    private Object valor;
    private Tipo.Tipos tipo;
    private int fila, columna;

    public Simbolo(String identificador, Object valor, Tipo.Tipos tipo, int fila, int columna) {
        this.identificador = identificador;
        this.valor = valor;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Tipo.Tipos getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }

    public void setTipo(Tipo.Tipos tipo) {
        this.tipo = tipo;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
}
