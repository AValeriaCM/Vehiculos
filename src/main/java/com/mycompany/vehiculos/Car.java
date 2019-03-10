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
public class Car extends PoweredVehicle {
    /**
     * Declaracion de variables
     */
    private String marchas;
    private String tipoGasolina;
    /**
     * Constructor de la clase
     * @param marchas
     * @param tipoGasolina
     * @param motor
     * @param transmision
     * @param puerta
     * @param llantas
     * @param marca
     * @param modelo
     * @param precio 
     */
    public Car(String marchas, String tipoGasolina, String motor, String transmision, String puerta, String llantas, String marca, String modelo, String precio) {
        super(motor, transmision, puerta, llantas, marca, modelo, precio);
        this.marchas = marchas;
        this.tipoGasolina = tipoGasolina;
    }
    /**
     * 
     * @return 
     */
    public String getMarchas() {
        return marchas;
    }
    /**
     * 
     * @param marchas 
     */
    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }
    /**
     * 
     * @return 
     */
    public String getTipoGasolina() {
        return tipoGasolina;
    }
    /**
     * 
     * @param tipoGasolina 
     */
    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void encender() {
        System.out.println("  --Enciende carro...");
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void apagar() {
        System.out.println("  --Apaga carro...");
    }
    
    /**
     * Metodo que imprime string
     */
    public void imprimeCarro(){
        
        System.out.println("***Este metodo es del carro");
        
    }
    
    
    
}
