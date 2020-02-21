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
public class NodoError {
    private int col;
    private int line;
    private String tipo;
    private String mensaje;

    public NodoError(int col, int line, String tipo, String mensaje) {
        this.col = col;
        this.line = line;
        this.tipo = tipo;
        this.mensaje = mensaje;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
