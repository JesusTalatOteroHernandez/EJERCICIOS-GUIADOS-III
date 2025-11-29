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
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        System.out.println("Insertando valores: 50, 30, 70, 20, 40");
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        
        arbol.recorrerInorden(); 
    }
}
