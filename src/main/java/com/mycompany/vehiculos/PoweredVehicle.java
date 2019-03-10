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
public abstract class PoweredVehicle extends Vehicle{
    /**
     * Declaracion de variables
     */
    private String motor;
    private String transmision;
    private String puerta;
    /**
     * Constructor de la clase
     * @param motor
     * @param transmision
     * @param puerta
     * @param llantas
     * @param marca
     * @param modelo
     * @param precio 
     */
    public PoweredVehicle(String motor, String transmision, String puerta, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.motor = motor;
        this.transmision = transmision;
        this.puerta = puerta;
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void encender(){
        System.out.println("  --Encender vehiculo...");
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void apagar(){
        System.out.println("  --Apagar vehiculo...");
    }

    /**
     * Metodo que imprime string
     */
    public void imprimeMotorizado(){
        
        System.out.println("***Este metodo es del vehiculo motorizado");
        
    }
}
