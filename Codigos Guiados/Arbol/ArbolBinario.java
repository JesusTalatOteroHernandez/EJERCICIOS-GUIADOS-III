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
public class ArbolBinario {
    private Nodo raiz;

    /**
     * Constructor
     * @param raiz 
     */
    public ArbolBinario(Nodo raiz) {
        this.raiz = null;
    }

    /**
     * Constructor especial vacio
     */
    public ArbolBinario() {
    }
    
    /**
     * Metodo para insertar elementos
     * @param valor 
     */
    public void insertar (int valor){
        this.raiz = inseratarRecursivo(this.raiz, valor);
    }
    
    /**
     * Realiza la insercion del nodo a un de los lados de los otros nodo o raiz
     * @param actual
     * @param valor
     * @return 
     */
    private Nodo inseratarRecursivo(Nodo actual, int valor){
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.getDato()) {
            actual.hijoIzq = inseratarRecursivo(actual.hijoIzq, valor);
        }else if (valor > actual.getDato()) {
            actual.hijoDer = inseratarRecursivo(actual.hijoDer, valor);
        }
        return actual;
    }
    
    /**
     * Recorrido 
     */
    public void recorrerInorden(){
        System.out.print("Recorrido Inorden ");
        recorrerInordenRecursivo(this.raiz);
        System.out.println();
    }
    
    /**
     * Realiza el recorrido despues de analalizar la raiz
     * @param nodo 
     */
    private void recorrerInordenRecursivo(Nodo nodo){
        if (nodo !=null) {
            recorrerInordenRecursivo(nodo.hijoIzq);
            System.out.println(nodo.getDato() + "");
            recorrerInordenRecursivo(nodo.hijoDer);
        }
    }
}
