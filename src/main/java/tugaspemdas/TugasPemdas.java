package tugaspemdas;

import java.util.Scanner;

public class TugasPemdas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;
        int panjang = 0;
        int lebar = 0;
        int tinggi = 0;
        int alas = 0;
        int atas = 0;
        int bawah = 0;
        boolean end = false;
        do {
            menu();
            menu = in.nextInt();
            if (menu == 8) {
                System.out.println("Anda Keluar Dari Program");
                end = true;
            } else if (menu == 1) {
                System.out.println("PERSEGI");
                System.out.print("Masukan Panjang : ");
                panjang = in.nextInt();
                persegi(panjang);
            } else if (menu == 2) {
                System.out.println("PERSEGI PANJANG");
                System.out.print("Masukan Panjang : ");
                panjang = in.nextInt();
                System.out.print("Masukan Lebar : ");
                lebar = in.nextInt();
                persegiPanjang(panjang, lebar);
            } else if (menu == 3) {
                System.out.println("PERSEGI SEGITIGA");
                System.out.print("Masukan Alas : ");
                alas = in.nextInt();
                System.out.print("Masukan Tinggi : ");
                tinggi = in.nextInt();
                segitiga(alas, tinggi);
            } else if (menu == 4) {
                System.out.println("JAJAR GENJANG");
                System.out.print("Masukan Alas : ");
                alas = in.nextInt();
                System.out.print("Masukan Tinggi : ");
                tinggi = in.nextInt();
                jajarGenjang(alas, tinggi);
            } else if (menu == 5) {
                System.out.println("TRAPESIUM");
                System.out.print("Masukan Atas : ");
                atas = in.nextInt();
                System.out.print("Masukan Bawah : ");
                bawah = in.nextInt();
                System.out.print("Masukan Tinggi : ");
                tinggi = in.nextInt();
                //method trapesium
            } else if (menu == 6) {
                System.out.println("BELAH KETUPAT");
//                komponen belah ketupat apa aja?
//                input komponen belah ketupat
//                method belah ketupat        
            } else if (menu == 7) {
                System.out.println("LAYANG - LAYANG");
//                komponen layang layang apa aja?
//                input komponen layang layang
//                method layang layang        
            }

        } while (end == false);
    }

    public static void menu() {
        System.out.println("=============================");
        System.out.println("PROGRAM BANGUN DATAR");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Belah Ketupat");
        System.out.println("7. Layang - Layang");
        System.out.println("8. Keluar");
        System.out.print("Silakan Pilih Menu : ");
    }

    public static void persegi(int panjang) {
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void persegiPanjang(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    public static void jajarGenjang(int alas, int tinggi) {
        int maju = tinggi - 1;
        for (int i = 0; i < tinggi; i++) {
            for (int k = 0; k < maju; k++) {
                System.out.print("   ");
            }
            maju--;
            for (int j = 0; j < alas; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    //masih jelek
    public static void segitiga(int alas, int tinggi) {
//        int barrierKiri = alas/2;
        for (int i = 0; i < tinggi; i++) {
//            for (int k = 0; k < barrierKiri; k++) {
//                System.out.print("   ");
//        }
//            barrierKiri--;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //anjay
}
