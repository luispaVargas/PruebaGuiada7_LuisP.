/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lab03
 */
  abstract class Delivery implements Chargeable {
      
      private String trackingId;
      private double distanceKm;

    public Delivery(String trackingId, double distanceKm) {
        this.trackingId = trackingId;
        this.distanceKm = distanceKm;
    }
      
      
      public int baseCharge(){
          return 40;
          
      }
      
     protected abstract int ratePerKm();

    @Override
    public String Label() {
        return "Envio a domicilio";
    }

    @Override
    public int calculateCharge() {
        return baseCharge() + (int)(distanceKm * ratePerKm());
       
    }
         
     
    
}
