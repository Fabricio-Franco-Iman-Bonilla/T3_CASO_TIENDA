/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

/**
 *
 * @author Fabricio
 */
public abstract class Prenda {
    String marca;
    int stock;
    Double precio;
    String talla;
    String sexoDestinado;
    String color;
    
    public abstract String mostrarDetalle();
    
}
