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
        double biaya = 0;
        double diskon = 0;
        int max;
        int min;

//      diskon aturan 2
        System.out.print("Masukkan nama anda: ");
        String nama = in.nextLine();
        int jumlah = 0;
        String namaKendaraan = order.pesawat.getKendaraan()
                + order.keretaApi.getKendaraan()
                + order.bus.getKendaraan()
                + order.airSpace.getKendaraan();
        for (int i = 0; i < nama.length(); i++) {
            if (nama.charAt(i) != ' ') {
                jumlah++;
            }
        }
        if (jumlah > 10) {
            for (int i = 0; i < nama.length(); i++) {
                if (namaKendaraan.toLowerCase().contains(nama.toLowerCase().split("")[i])) {
                    diskon += 1;
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
            diskon += (int)((Math.random() * ((max + 1) - min)) + min);
        }

//       diskon aturan 3
        System.out.println("Pilih kota tujuan:" + "\n1. Jakarta" + "\n2. Amerika" + "\n3. Bandung");
        int jarak = 0;
        String tujuan = "";
        boolean loop = true;
        while (loop) {
            int input = in.nextInt();
            switch (input) {
                case 1:
                    tujuan = "Jakarta";
                    max = 900;
                    min = 800;
                    jarak += (int) ((Math.random() * ((max + 1) - min)) + min);
                    diskon += 4;
                    loop = false;
                    break;
                case 2:
                    tujuan = "Amerika";
                    max = 2000;
                    min = 1500;
                    jarak += (int) ((Math.random() * ((max + 1) - min)) + min);
                    diskon += 6;
                    loop = false;
                    break;
                case 3:
                    tujuan = "Bandung";
                    max = 600;
                    min = 500;
                    jarak += (int) ((Math.random() * ((max + 1) - min)) + min);
                    diskon += 8;
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
                    biaya += order.pesawat.getHarga();
                    loop = false;
                    break;
                case 2:
                    biaya += order.keretaApi.getHarga();
                    loop = false;
                    break;
                case 3:
                    biaya += order.bus.getHarga();
                    loop = false;
                    break;
                case 4:
                    biaya += order.airSpace.getHarga();
                    loop = false;
                    break;
                default:
                    System.out.println("Try again");
            }
        }
        
        System.out.println("\n=================== Tiket ===================");
        System.out.printf("%-40s %s\n", "Nama", ": " + nama);
        System.out.printf("%-40s %s\n", "Kota tujuan", ": " + tujuan);
        System.out.printf("%-40s %s\n", "Jarak antara Surabaya ke " + tujuan, ": " + jarak);
        System.out.printf("%-40s %s\n", "Total diskon", ": " + diskon);
        System.out.printf("%-40s %s\n", "Biaya sebelum diskon", ": " + biaya);
        System.out.printf("%-40s %s\n", "Biaya total", ": " + (biaya - (biaya*(diskon/100))));
    }
}
