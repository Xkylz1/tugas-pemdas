package tugaspemdas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nyoba {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan panjang : ");
//        int panjangSisi = input.nextInt();
//        System.out.print("Masukan tinggi : ");
//        int lebar = input.nextInt();
//        jajarGenjang(panjangSisi, lebar);
//        int panjangSisi=5;
//        persegi(panjangSisi);
        jajar();

    }

    public static void persegi(int sisi) {
        for (int i = 0; i < sisi; i++) {
            System.out.print("*  ");
        }
        for (int i = 2; i < sisi; i++) {
            System.out.println();
            System.out.print("*  ");
            for (int j = 2; j < sisi; j++) {
                System.out.print("   ");
            }
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < sisi; i++) {
            System.out.print("*  ");
        }
    }

    public static void persegiPanjang(int panjang, int lebar) {
        for (int i = 0; i < panjang; i++) {
            System.out.print("*  ");
        }
        for (int i = 2; i < lebar; i++) {
            System.out.println();
            System.out.print("*  ");
            for (int j = 2; j < panjang; j++) {
                System.out.print("   ");
            }
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < panjang; i++) {
            System.out.print("*  ");
        }
    }

    public static void jajarGenjang(int panjang, int tinggi) {
        int barisMaju = tinggi - 1;
//        for (int i =0;i<tinggi;i++){
//            for (int j=0;j<panjang;j++){
//                System.out.print("*  ");
//            }
//            System.out.println();


        for (int k = 0; k < barisMaju; k++) {
            System.out.print("   ");
        }
        barisMaju--;
        for (int i = 0; i < panjang; i++) {
            System.out.print("*  ");
        }
        for (int i = 2; i < tinggi; i++) {
            for (int k = 0; k < barisMaju; k++) {
                System.out.print("   ");
            }
            barisMaju--;
            System.out.println();
            System.out.print("*  ");
            for (int j = 2; j < panjang; j++) {
                System.out.print("   ");
            }
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < panjang; i++) {
            System.out.print("*  ");
        }
    }

    public static void jajar() {
        int x = 8, y = 5;
        int spasi = y - 1;
        for (int i = 0; i < y; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            spasi--;
            for (int j = 0; j < x; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

