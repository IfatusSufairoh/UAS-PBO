/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ticket {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Transportation order = new Transportation();
        double payment = 0;
        double discount = 0;
        int max;
        int min;

//      diskon aturan 2
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();
        int jumlah = 0;
        String namaKendaraan = order.pesawat.getTransportation()
                + order.keretaApi.getTransportation()
                + order.bus.getTransportation()
                + order.airSpace.getTransportation();
        for (int i = 0; i < nama.length(); i++) {
            if (nama.charAt(i) != ' ') {
                jumlah++;
            }
        }
        if (jumlah > 10) {
            for (int i = 0; i < nama.length(); i++) {
                if (namaKendaraan.toLowerCase().contains(nama.toLowerCase().split("")[i])) {
                    discount += 1;
                    break;
                }
            }
        }

//     diskon aturan 1        
        System.out.println("Pukul berapa anda memesan tiket ini? (HH:MM)");
        String[] pukul = in.nextLine().split(":");
        int jam = Integer.parseInt(pukul[0]);
        int menit = Integer.parseInt(pukul[1]);
        if ((jam == 8 && menit <= 59 && menit >= 0) || (jam == 9 && menit == 0)) {
            max = 2;
            min = 1;
            discount += (int)((Math.random() * ((max + 1) - min)) + min);
        }

//       diskon aturan 3
        System.out.println("Pilih kota tujuan:" + "\n1. Jakarta" + "\n2. Amerika" + "\n3. Bandung");
        int distance = 0;
        String location = "";
        boolean loop = true;
        while (loop) {
            int input = in.nextInt();
            switch (input) {
                case 1:
                    location = "Jakarta";
                    max = 900;
                    min = 800;
                    distance += (int) ((Math.random() * ((max + 1) - min)) + min);
                    discount += 4;
                    loop = false;
                    break;
                case 2:
                    location = "Amerika";
                    max = 2000;
                    min = 1500;
                    distance += (int) ((Math.random() * ((max + 1) - min)) + min);
                    discount += 6;
                    loop = false;
                    break;
                case 3:
                    location = "Bandung";
                    max = 600;
                    min = 500;
                    distance += (int) ((Math.random() * ((max + 1) - min)) + min);
                    discount += 8;
                    loop = false;
                    break;
                default:
                    System.out.println("Try again");
            }
        }

        System.out.println("Pilih kendaraan:" + "\n1. Pesawat" + "\n2. Kereta Api" + "\n3. Bus" + "\n4. Air Space");
        loop = true;
        while (loop) {
            int input = in.nextInt();
            switch (input) {
                case 1:
                    payment += order.pesawat.getPrice();
                    loop = false;
                    break;
                case 2:
                    payment += order.keretaApi.getPrice();
                    loop = false;
                    break;
                case 3:
                    payment += order.bus.getPrice();
                    loop = false;
                    break;
                case 4:
                    payment += order.airSpace.getPrice();
                    loop = false;
                    break;
                default:
                    System.out.println("Try again");
            }
        }
        
        System.out.println("\n=================== Tiket ===================");
        System.out.printf("%-40s %s\n", "Name", ": " + nama);
        System.out.printf("%-40s %s\n", "Location", ": " + location);
        System.out.printf("%-40s %s\n", "Distance " + location, ": " + distance);
        System.out.printf("%-40s %s\n", "Discount Total", ": " + discount);
        System.out.printf("%-40s %s\n", "Payment", ": " + payment);
        System.out.printf("%-40s %s\n", "Payment Total", ": " + (payment - (payment*(discount/100))));
    }
}
