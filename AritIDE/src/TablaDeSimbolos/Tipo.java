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
public class Tipo {
    public enum Tipos{
        INTEGER,
        NUMERIC,
        STRING,
        VECTOR,
        LIST,
        MATRIX,
        ARRAY
    }
    public enum Operador{
        MAS,
        MENOS,
        MENOSUNARIO,
        POR,
        DIV,
        MOD,
        POT,
        MAYOR,
        MENOR,
        MAYIGUAL,
        MENIGUAL,
        AND,
        OR,
        IGUALACION,
        DIFERENCIACION
    }
}
