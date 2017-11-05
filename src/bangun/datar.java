package bangun;

import java.util.Scanner;

public class datar {

    public static void main(String[] args) {
        System.out.println("=======Bangun Datar=======");
        System.out.println("==========================");
        System.out.println("1.PERSEGI");
        System.out.println("2.PERSEGI PANJANG");
        System.out.println("3.SEGITIGA");
        System.out.println("4.LINGKARAN");
        int pilihan;
        double luas, sisi = 0, alas = 0,panjang =0,tinggi =0,jari =0; //deklrasi variabel 

        Scanner inputan = new Scanner(System.in);
        System.out.print("Pilih Bangunan = ");
        pilihan = inputan.nextInt();
      
        
        String Keterangan;
        

        switch (pilihan) {
            case 1:
                Keterangan = ("Persegi Panjang");
                System.out.println("Masukkan Sisi :");
                sisi = inputan.nextDouble();
                luas = sisi*sisi;
                System.out.println("Luas Bangunan = "+ luas);
                break;
            case 2:
                Keterangan = "PERSEGI Panjang";
                System.out.println("Masukkan Panjang ");
                panjang=inputan.nextDouble();
                System.out.println("Masukkan Sisi");
                sisi=inputan.nextDouble();
                luas= panjang*sisi;
                System.out.println("Luas Bangunan = "+ luas);
               
                break;
            case 3:
                Keterangan = "SEGITIGA";
                System.out.println("masukkan alas");
                alas = inputan.nextDouble();
                System.out.println("Masukkan tinggi");
                tinggi = inputan.nextDouble();
                luas = tinggi*alas/2;
                System.out.println("Luas Segitiga"+ luas);
                break;
            case 4:
                Keterangan = "Lingkaran";
                System.out.println("masukkan jari");
                jari= inputan.nextDouble();
                luas=3.14*jari*jari;
                System.out.println("luas Lingkaran"+luas);
                break;
            
            default:
                Keterangan = "Makanan Tidak tersedia";
                break;

        }
        System.out.print(Keterangan);
    }
}
