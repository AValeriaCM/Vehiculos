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
public abstract class Vehicle implements IPrincipal {
    /**
     * Declaracion de metodos
     */
    private String llantas;
    private String marca;
    private String modelo;
    private String precio;
    /**
     * Constructor de la clase
     * @param llantas
     * @param marca
     * @param modelo
     * @param precio 
     */
    public Vehicle(String llantas, String marca, String modelo, String precio) {
        this.llantas = llantas;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void encender(){
        System.out.println("  --Enciende vehiculo...");
    }
    /**
     * Metodo de la interface
     */
    @Override
    public void apagar(){
        System.out.println("  --Apagar vehiculo...");
    }
    /**
     * Metodo que imprime String
     */
    public void imprimirVehiculo(){
        System.out.println("==METODO VEHICULO==");
    }
    
    /**
     * 
     * @return 
     */
    public String getLlantas() {
        return llantas;
    }
    /**
     * 
     * @param llantas 
     */
    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }
    /**
     * 
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    /**
     * 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * 
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * 
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * 
     * @return 
     */
    public String getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio 
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
