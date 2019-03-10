/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valeria Castañeda
 */
public class Principal {
    /**
     * Constructor de la clase
     */
    public void principal(){
    
        Skateboard skate1 = new Skateboard("Tabla1","Tabla11","Tabla12","Tabla13","Tabla14");
        Skateboard skate2 = new Skateboard("Tabla2","Tabla21","Tabla22","Tabla23","Tabla24");
        
        Car car1 = new Car("Carro1","Carro11","Carro12","Carro13","Carro14","Carro15","Carro16","Carro17","Carro18");
        Car car2 = new Car("Carro2","Carro21","Carro22","Carro23","Carro24","Carro25","Carro26","Carro27","Carro28");
    
        Bicycle cycle1 = new Bicycle("Cicla1","Cicla11","Cicla12","Cicla13","Cicla14","Cicla15");
        Bicycle cycle2 = new Bicycle("Cicla2","Cicla21","Cicla22","Cicla23","Cicla24","Cicla25");
        
        Jet jet1 = new Jet("Jet1","Jet11","Jet12","Jet13","Jet14","Jet15","Jet16","Jet17","Jet18");
        Jet jet2 = new Jet("Jet2","Jet21","Jet22","Jet23","Jet24","Jet25","Jet26","Jet27","Jet28");
    
        /**
         * Declaracion y llenado de lista
         */
        List<Vehicle> vehicle = new ArrayList<>();
    
        vehicle.add(car1);
        vehicle.add(car2);
        vehicle.add(jet1);
        vehicle.add(jet2);
        vehicle.add(cycle1);
        vehicle.add(cycle2);
        vehicle.add(skate1);
        vehicle.add(skate2);
        
        /**
         * Ciclo que evalúa los datos
         */
        
        for (Vehicle listaAux:vehicle){
            
            if (listaAux instanceof Car){
           
                Car carAux = (Car) listaAux;
                car1.encender();
                car1.apagar();
                car1.imprimeCarro();
                car1.imprimirVehiculo();
                car1.imprimeMotorizado();
                
            }
            else if (listaAux instanceof Jet){
            
                Jet jetAux = (Jet) listaAux;
                jetAux.encender();
                jetAux.apagar();
                jetAux.imprimeJet();
                jetAux.imprimirVehiculo();
                jetAux.imprimeMotorizado();
            }
            else if (listaAux instanceof Bicycle){
            
                Bicycle cycleAux = (Bicycle) listaAux;
                cycleAux.encender();
                cycleAux.apagar();
                cycleAux.imprimeBicicleta();
                cycleAux.imprimirVehiculo();
            }
            else if (listaAux instanceof Skateboard){
            
                Skateboard skateAux = (Skateboard) listaAux;
                skateAux.encender();
                skateAux.apagar();
                skateAux.imprimeSkateboard();
                skateAux.imprimirVehiculo();
            }
        }
    }
    
}
