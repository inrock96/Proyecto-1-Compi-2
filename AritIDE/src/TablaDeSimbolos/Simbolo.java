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
    private Tipo tipo;

    public Simbolo(String identificador, Object valor, Tipo tipo) {
        this.identificador = identificador;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
}
