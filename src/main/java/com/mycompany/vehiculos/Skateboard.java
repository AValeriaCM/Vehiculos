/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos;

/**
 *
 * @author Valeria Castañeda
 */
public class Skateboard extends Vehicle{
    /**
     * Declaracion de variables
     */
    private String tipoMadera;
    /**
     * Constructor de la clase
     * @param tipoMadera
     * @param llantas
     * @param marca
     * @param modelo
     * @param precio 
     */
    public Skateboard(String tipoMadera, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.tipoMadera = tipoMadera;
    }
    /**
     * 
     * @return 
     */
    public String getTipoMadera() {
        return tipoMadera;
    }
    /**
     * 
     * @param tipoMadera 
     */
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
    
    /**
     * Metodo de la interface
     */
     @Override
    public void encender() {
        System.out.println("  --Enciende skateboard...");
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void apagar() {
        System.out.println("  --Apagar skateboard...");
    }
    /**
     * Metodo que imprime string
     */
    public void imprimeSkateboard(){
    
        System.out.println("***Este metodo es del skateboard");
        
    }
}
