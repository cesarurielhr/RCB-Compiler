/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisLexico;


/**
 *
 * @author cesar
 */
public class ErrorToken {
    int id;
    String tipo;
    String descripcion;
    int linea;
    int Column;
    String lexema;

    public ErrorToken(int id, String tipo, String descripcion,String lexema, int linea, int Column) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.linea = linea;
        this.Column = Column;
        this.lexema = lexema;
    }
    
    public ErrorToken(String tipo,int var1, String var2, Token var3) {
        this.id = var1;
        this.descripcion = var2;
        this.lexema = var3.getLexeme();
        this.linea = var3.getLine();
        this.Column = var3.getColumn();
    }

    
    @Override
    public String toString() {
        return "Error "+tipo+" "+ id+": En la línea: " + linea + ", caracter: "+Column+" - descripción: " + descripcion + ", Cadena: " + lexema;
    }
    
    
}
