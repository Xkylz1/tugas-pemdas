package tugaspemdas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nyoba {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang : ");
        int panjangSisi = input.nextInt();
        System.out.print("Masukan lebar : ");
        int lebar = input.nextInt();
        persegiPanjang(panjangSisi,lebar);
//        int panjangSisi=5;
//        persegi(panjangSisi);

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

    public static void persegiPanjang(int panjang, int lebar){
        for (int i = 0;i<panjang;i++){
            System.out.print("*  ");
        }
        for (int i =2; i<lebar;i++){
            System.out.println();
            System.out.print("*  ");
            for (int j =2;j<panjang;j++){
                System.out.print("   ");
            }
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0;i<panjang;i++){
            System.out.print("*  ");
        }
    }
}
