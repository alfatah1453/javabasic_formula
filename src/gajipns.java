
import java.util.Scanner;

public class gajipns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendeklrasikan variabel
        Integer gol1, gol2, gol3, Gaji, lama = null, t1, t2, t3;
        String golongan;

        gol1 = 2500000;
        gol2 = 3000000;
        gol3 = 4000000;
        t1 = 1000000;
        t2 = 1500000;
        t3 = 2000000;

        System.out.print("Masukkan Golongan : ");
        Gaji = input.nextInt();

        //proses
        Gaji = gol1 + t1;
        System.out.println("Gaji Bersih:" + Gaji);

       

    }
}
