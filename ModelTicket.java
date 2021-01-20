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
    private String kendaraan;
    private int harga;
    public void setKendaraan(String kendaraan){
        this.kendaraan = kendaraan;
    }
    public String getKendaraan(){
        return kendaraan;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    } 
}
