/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BikeDelivery;
import Model.Chargeable;
import Model.Packaging;
import Model.VanDelivery;


/**
 *
 * @author Lab03
 */
public class ChargeableController {
    private Chargeable[] lista;
   private int contador;

    public ChargeableController() {
        this.lista = new Chargeable[10];
        contador = 0;
        
    }
   
   
   
    
    public void registrarBikeDelivery(String trackingId, double distanceKm){
        
       BikeDelivery bikeDelivery = new BikeDelivery(trackingId, distanceKm);
        
      lista[contador] = bikeDelivery;
             contador++;
        
        
        
    }
    
    public void registrarVanDelivery(String trackingId,double distanceKm){
        VanDelivery vanDelivery = new VanDelivery(trackingId,distanceKm);
       
        
        lista[contador] = vanDelivery;
        contador++;
    }
    
    public void registrarPackaging (int items, int chargePerItem){
        Packaging packaging = new Packaging(items,  chargePerItem);
        lista[contador] = packaging;
        contador++;
    }
    
    public double calcularTotalGeneral(){
        double total = 0;
       for(int i = 0; i < contador;i++){
           total += lista[i].calculateCharge();
           
         
           
       } 
       return total;
    }
    
    public String mostrarResultados(){
        
        String resultado = "";
        
        for(int i = 0;i < contador; i++){
            
            resultado += lista[i].Label() + "- cobro -" + lista[i].calculateCharge() + "\n";
        }
        return resultado;
    }
    
    
}
