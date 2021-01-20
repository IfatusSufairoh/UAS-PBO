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
    public Transportation (){
        pesawat = new ModelTicket();//memanggil set pada class modelTicket          ; 
        pesawat.setKendaraan("Pesawat");
        pesawat.setHarga(585000);
        
        keretaApi = new ModelTicket();
        keretaApi.setKendaraan("Kereta Api");
        keretaApi.setHarga(332000);
        
        bus = new ModelTicket();
        bus.setKendaraan("Bus");
        bus.setHarga(190000);
        
        airSpace = new ModelTicket();
        airSpace.setKendaraan("Air Space");
        airSpace.setHarga(1333999);
    }
}
