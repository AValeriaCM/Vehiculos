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
public class Jet extends PoweredVehicle{
    /**
     * Declaracion de variables
     */
    private String turbinas;
    private String alas;
    /**
     * Constructor de la clase
     * @param turbinas
     * @param alas
     * @param motor
     * @param transmision
     * @param puerta
     * @param llantas
     * @param marca
     * @param modelo
     * @param precio 
     */
    public Jet(String turbinas, String alas, String motor, String transmision, String puerta, String llantas, String marca, String modelo, String precio) {
        super(motor, transmision, puerta, llantas, marca, modelo, precio);
        this.turbinas = turbinas;
        this.alas = alas;
    }
    /**
     * 
     * @return 
     */
    public String getTurbinas() {
        return turbinas;
    }
    /**
     * 
     * @param turbinas 
     */
    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }
    /**
     * 
     * @return 
     */
    public String getAlas() {
        return alas;
    }
    /**
     * 
     * @param alas 
     */
    public void setAlas(String alas) {
        this.alas = alas;
    }
    @Override
    public void encender() {
        System.out.println("  --Encender Jet...");
    }

    @Override
    public void apagar() {
        System.out.println("  --Apagar Jet...");
    }
    /**
     * Metodo que imprime string
     */
    public void imprimeJet(){
        
        System.out.println("**Este es el metodo del Jet");
        
    }
}
