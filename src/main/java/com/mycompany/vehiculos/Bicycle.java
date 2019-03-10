/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos;

/**
 *
 * @author SPC7Z
 */
public class Bicycle extends Vehicle {
    /**
     * Declaracion de variables 
     */
   private String marco;
   private String pedales;
   /**
    * Constructor de la clase
    * @param marco
    * @param pedales
    * @param llantas
    * @param marca
    * @param modelo
    * @param precio 
    */
    public Bicycle(String marco, String pedales, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.marco = marco;
        this.pedales = pedales;
    }
    /**
     * 
     * @return 
     */
    public String getMarco() {
        return marco;
    }
    /**
     * 
     * @param marco 
     */
    public void setMarco(String marco) {
        this.marco = marco;
    }
    /**
     * 
     * @return 
     */
    public String getPedales() {
        return pedales;
    }
    /**
     * 
     * @param pedales 
     */
    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    /**
    * Metodo de la interface
    */
    @Override
    public void encender() {
        System.out.println("  --Enciende bicicleta...");
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void apagar() {
        System.out.println("  --Apagar Bicicleta...");
    }
    /**
     * Metodo que imprime string
     */
    public void imprimeBicicleta(){
        
        System.out.println("***Este es el metodo de la bicicleta");
        
    }
   
   
}
