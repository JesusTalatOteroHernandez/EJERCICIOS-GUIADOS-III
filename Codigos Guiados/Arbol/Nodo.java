/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Jesus Talat Otero Hernandez
 * @Correo 122410702.jtoh@gmail.com
 */
public class Nodo {
    private int dato;
    
    public Nodo hijoIzq;
    public Nodo hijoDer;

    public Nodo(int valor) {
        this.dato = valor;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }
    
    
    /**
     * Encapsulamiento
    */
    
    public int getDato() {
        return dato;
    }
    
    /**
     * Getters y setters
     * @param dato 
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}
