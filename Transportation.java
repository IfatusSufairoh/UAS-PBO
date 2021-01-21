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
public class Transportation {
    ModelTicket pesawat;
    ModelTicket keretaApi;
    ModelTicket bus;
    ModelTicket airSpace; 
    public void Transportation (){
        pesawat = new ModelTicket();//memanggil set pada class modelTicket          ; 
        pesawat.setTransportation("Pesawat");
        pesawat.setPrice(585000);
        
        keretaApi = new ModelTicket();
        keretaApi.setTransportation("Kereta Api");
        keretaApi.setPrice(332000);
        
        bus = new ModelTicket();
        bus.setTransportation("Bus");
        bus.setPrice(190000);
        
        airSpace = new ModelTicket();
        airSpace.setTransportation("Air Space");
        airSpace.setPrice(1333999);
    }
}
