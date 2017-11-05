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
public class pertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendeklrasikan variabel
        double NH,UTS,UAS,NA;
        
        System.out.print("Nilai Harian : ");
        NH= input.nextDouble();
        System.out.print("Nilai UTS : ");
        UTS= input.nextDouble();
        System.out.print ("Nilai UAS : ");
        UAS= input.nextDouble();
        
        //proses
        NA = (0.2*NH)+(0.3*UTS)+(0.5*UAS);
        System.out.println("Nilai Akhir :" +NA);
        
        if ((NA>=91)&&(UAS>=90)){
            System.out.print("Grade A ");
        }else{
            System.out.print("Grade B+");
        }
    }
}
