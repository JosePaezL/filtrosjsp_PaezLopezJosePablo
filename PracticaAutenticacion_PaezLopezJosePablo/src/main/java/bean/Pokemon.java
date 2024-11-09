/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Jose Pablo
 */
public class Pokemon implements Serializable{
    private int numero;
    private String nombre;
    private String tipo;
    private String evolucion;
    private int poder;
    private String descripcion;

    public Pokemon(int numero, String nombre, String tipo, String evolucion, int poder, String descripcion) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.evolucion = evolucion;
        this.poder = poder;
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "numero=" + numero + ", nombre=" + nombre + ", tipo=" + tipo + ", evolucion=" + evolucion + ", poder=" + poder + ", descripcion=" + descripcion + '}';
    }
    
}
