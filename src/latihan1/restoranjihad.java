package latihan1;

import java.util.Scanner;

public class restoranjihad {

    public static void main(String[] args) {
        System.out.println("    ================  ");
        System.out.println(" == Jihad Resto & Bar == ");
        System.out.println("=====      Menu      ===== ");
        System.out.println("==========================");
        System.out.println("1.Ares");
        System.out.println("2.Rebong");
        System.out.println("3.Rujak");
        System.out.println("4.Plecing");
        System.out.println("5.Nasi Puyung");

        byte pilihan;
        String Keterangan; //deklrasi variabel

        Scanner inputan = new Scanner(System.in);
        System.out.print("Pilih menu makanan [1-5] = ");
        pilihan = inputan.nextByte();

        switch (pilihan) {
            case 1:
                Keterangan = "Harga : Rp 2.000.000";
                break;
            case 2:
                Keterangan = "Harga : Rp 5.000.000";
                break;
            case 3:
                Keterangan = "Harga : Rp 1.000.000";
                break;
            case 4:
                Keterangan = "Harga : Rp 4.000.000";
                break;
            case 5:
                Keterangan = "Harga : Rp 3.000.000";
                break;
            default:
                Keterangan = "Makanan Tidak tersedia";
                break;

        }
        System.out.print(Keterangan);
    }
}
