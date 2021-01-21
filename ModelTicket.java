/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author LENOVO
 */
       
   public class ModelTicket {
    private String Transportation;
    private int Price;
    public void setTransportation(String Transportation){
        this.Transportation = Transportation;
    }
    public String getTransportation(){
        return Transportation;
    }
    public void setPrice(int Price){
        this.Price = Price;
    }
    public int getPrice(){
        return Price;
    } 
}
