package tugaspemdas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nyoba {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Masukan panjang sisi: ");
//        int panjangSisi = input.nextInt();
        int panjangSisi=5;
        persegi(panjangSisi);

    }

    public static void persegi(int sisi){
        for(int i =0;i<sisi;i++) {
            System.out.print("*  ");
        }
        for (int i=2;i<sisi;i++){
            System.out.println();
            System.out.print("*  ");
            for(int j=2;j<sisi;j++){
                System.out.print("   ");
            }
            System.out.print("*  ");
        }
        System.out.println();
        for(int i =0;i<sisi;i++) {
            System.out.print("*  ");
        }
    }
}
