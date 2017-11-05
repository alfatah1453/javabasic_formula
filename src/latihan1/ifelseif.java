/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author RPL 2
 */
public class ifelseif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendeklrasikan variabel
        double NH, UTS, UAS, NA;
        String Keterangan;

        System.out.print("Nilai Harian : ");
        NH = input.nextDouble();
        System.out.print("Nilai UTS : ");
        UTS = input.nextDouble();
        System.out.print("Nilai UAS : ");
        UAS = input.nextDouble();

        //proses
        NA = (0.2 * NH) + (0.3 * UTS) + (0.5 * UAS);
        System.out.println("Nilai Akhir :" + NA);

        if (NA >= 91) {
            Keterangan = "Grade A ";
        } else if (NA >= 81) {
            Keterangan = "Grade B+";
        } else if (NA >= 71) {
            Keterangan = "Grade B";
        } else if (NA >= 61) {
            Keterangan = "Grade C";
        } else {
            Keterangan = "Grade E";
            
        }System.out.println("Grade : " + Keterangan);

    }
}
