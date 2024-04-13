/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y;

/**
 *
 * @author ASUS
 */
public class LaptopUser {
   private Laptop laptop;
   public LaptopUser(Laptop laptop){
       this.laptop = laptop;
   }
   void turnOnLaptop(){
       this.laptop.powerOn();
   }
   void turnOffLaptop(){
       this.laptop.powerOff();
   }
   void makeLaptopLouder(){
       this.laptop.volumeUp();
   }
   void makeLaptopSilence(){
       this.laptop.volumeDown();
   }
}
