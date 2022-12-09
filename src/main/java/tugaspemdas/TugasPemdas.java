package tugaspemdas;

import java.util.Scanner;

public class TugasPemdas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu, menuTrapesium, menuSegitiga;
        int panjang, lebar, tinggi, atas, sisi;
        int alas = 0;

        while(true){
        menu();
        menu = in.nextInt();
        if (menu == 1) {
            System.out.println("PERSEGI");
            System.out.print("Masukan Panjang : ");
            panjang = in.nextInt();
            cetakPersegi(panjang,panjang);
        } else if (menu == 2) {
            System.out.println("PERSEGI PANJANG");
            System.out.print("Masukan Panjang : ");
            panjang = in.nextInt();
            System.out.print("Masukan Lebar : ");
            lebar = in.nextInt();
            cetakPersegi(panjang, lebar);
            if (panjang == lebar) {
                System.out.println("Ini Bukan Persegi Panjang");
            }
        } else if (menu == 3) {
            while (true){
                menuSegitiga();
                menuSegitiga = in.nextInt();
                if (menuSegitiga == 1) {
                    System.out.println("SEGITIGA SAMA KAKI");
                    System.out.print("Masukan Tinggi : ");
                    tinggi = in.nextInt();
                    //Method segitiga sama kaki
                    cetakSegitigaSamaKaki(tinggi);
                } else if (menuSegitiga == 2) {
                    System.out.println("SEGITIGA SIKU - SIKU");
                    System.out.print("Masukan Tinggi : ");
                    tinggi = in.nextInt();
                    cetakSegitigaSiku(tinggi);
                } else if (menuSegitiga == 3) {
                    System.out.println("Anda Kembali Ke - Menu");
                    break;
                } else {
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                    System.out.println("Silakan Pilih Kembali");
                }
            }
        } else if (menu == 4) {
            System.out.println("JAJAR GENJANG");
            System.out.print("Masukan Alas : ");
            alas = in.nextInt();
            System.out.print("Masukan Tinggi : ");
            tinggi = in.nextInt();
            cetakJajarGenjang(alas, tinggi);
        } else if (menu == 5) {
            while (true){
                menuTrapesium();
                menuTrapesium = in.nextInt();
                if (menuTrapesium == 1) {
                    System.out.println("TRAPESIUM");
                    System.out.print("Masukan Alas : ");
                    alas = in.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    tinggi = in.nextInt();
                    int atasTrapesium = alas - (2 * (tinggi - 1));
                    if (atasTrapesium < 2) {
                        System.out.println("Trapesium ini mungkin tidak sempurna");
                    }
                    cetakTrapesiumOriginal(alas, tinggi);
                } else if (menuTrapesium == 2) {
                    System.out.println("TRAPESIUM TERBALIK");
                    System.out.print("Masukan Atas : ");
                    atas = in.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    tinggi = in.nextInt();
                    int atasTrapesium = alas - (2 * (tinggi - 1));
                    if (atasTrapesium < 2) {
                        System.out.println("Trapesium ini mungkin tidak sempurna");
                    }
                    cetakTrapesiumTerbalik(atas, tinggi);
                } else if (menuTrapesium == 3) {
                    System.out.println("Anda Kembali Ke - Menu");
                    break;
                } else {
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                    System.out.println("Silakan Pilih Kembali");
                }
            }
        } else if (menu == 6) {
            System.out.println("SEGI LIMA");
            System.out.print("Masukan Panjang Sisi (Hanya Ganjil lebih dari 3) : ");
            sisi = in.nextInt();
            cetakPentagon(sisi);
        } else if (menu == 7) {
            System.out.println("SEGI DELAPAN");
            System.out.print("Masukan Panjang Sisi : ");
            sisi = in.nextInt();
            if (sisi < 2) {
                System.out.println("Segi delapan ini mungkin tidak sempurna");
            }
            cetakOktagon(sisi);
        } else if (menu == 8) {
            System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
            System.out.println("Anda Keluar Dari Program.");
            break;
        } else {
            System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
            System.out.println("Silakan Pilih Kembali");
        }
    }
    }

    public static void menu() {
        System.out.println("================================================");
        System.out.println("PROGRAM BANGUN DATAR");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Segi Lima");
        System.out.println("7. Segi Delapan");
        System.out.println("8. Keluar");
        System.out.print("Silakan Pilih Menu : ");
    }

    public static void menuTrapesium() {
        System.out.println("TRAPESIUM");
        System.out.println("1. Trapesium");
        System.out.println("2. Trapesium Terbalik");
        System.out.println("3. Kembali");
        System.out.print("Silakan Pilih Menu : ");
    }

    public static void menuSegitiga() {
        System.out.println("SEGITIGA");
        System.out.println("1. Segitiga Sama Kaki");
        System.out.println("2. Segitiga Siku - Siku");
        System.out.println("3. Kembali");
        System.out.print("Silakan Pilih Menu : ");
    }


    public static void cetakPersegi(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {           //banyak baris ke bawah
            for (int j = 0; j < panjang; j++) {     //panjang satu baris
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    public static void cetakJajarGenjang(int alas, int tinggi) {
        int maju = tinggi - 1;                  //spasi baris pertama
        for (int i = 0; i < tinggi; i++) {      //banyak baris ke bawah
            for (int k = 0; k < maju; k++) {    //spasi
                System.out.print("   ");
            }
            maju--;
            for (int j = 0; j < alas; j++) {    //panjang satu baris
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    public static void cetakSegitigaSamaKaki(int tinggi) {
        int nilaiAwalSegitiga = 1;
        int spasi = tinggi - 1;                             //spasi baris pertama
        for (int i = 0; i < tinggi; i++) {                  //banyak baris ke bawah
            for (int k = 0; k < spasi; k++) {               //print spasi
                System.out.print("   ");
            }
            for (int j = 0; j < nilaiAwalSegitiga; j++) {   //print bintang2 untuk segitiga
                System.out.print("*  ");
            }
            System.out.println();
            nilaiAwalSegitiga += 2;                         //+2 karena bertambah di sisi kanan dan sisi kiri
            spasi--;
        }
    }

    public static void cetakTrapesiumOriginal(int panjangAlas, int tinggi) {
        int atas = panjangAlas - (2 * (tinggi - 1));    //panjang sisi atas
        int spasi = tinggi - 1;
        for (int i = 0; i < tinggi; i++) {              //banyak baris ke bawah
            for (int k = 0; k < spasi; k++) {           //print spasi
                System.out.print("   ");
            }
            for (int j = 0; j < atas; j++) {            //print baris bintang2 "*  "
                System.out.print("*  ");
            }
            System.out.println();
            atas += 2;                                  //panjang baris bertambah 2 karena bertambah di kedua sisi
            spasi--;
        }
    }

    public static void cetakTrapesiumTerbalik(int panjangAtas, int tinggi) {
        int spasi = 0;
        for (int i = 0; i < tinggi; i++) {              //banyak baris ke bawah
            for (int k = 0; k < spasi; k++) {           //print spasi
                System.out.print("   ");
            }
            for (int j = 0; j < panjangAtas; j++) {     //print baris bintang2
                System.out.print("*  ");
            }
            System.out.println();
            panjangAtas -= 2;                           //-2 karena berkurang di setiap sisi
            spasi++;
        }
    }

    public static void cetakSegitigaSiku(int tinggi) {
        int panjangBaris = 1;
        for (int i = 0; i < tinggi; i++) {              //banyak baris ke bawah
            for (int j = 0; j < panjangBaris; j++) {    //print bintang2 ke samping
                System.out.print("*  ");
            }
            System.out.println();
            panjangBaris++;
        }
    }

    public static void cetakOktagon(int sisi) {
        cetakTrapesiumOriginal(sisi + 2 * (sisi - 1), sisi);
        cetakPersegi((2 * sisi) + (sisi - 2), sisi - 2);
        cetakTrapesiumTerbalik(sisi + 2 * (sisi - 1), sisi);
    }

    public static void cetakPentagon(int sisi) {
        int segitigaAwal = 1;
        int spasi2 = sisi - 1;                             //
        for (int i = 0; i < sisi - 1; i++) {               //tinggi segitiga-1 karena dimakan satu baris oleh bagian bawah
            for (int k = 0; k < spasi2; k++) {          //print spasi
                System.out.print("   ");
            }
            spasi2--;
            for (int j = 0; j < segitigaAwal; j++) {    //print bintang2
                System.out.print("*  ");
            }
            System.out.println();
            segitigaAwal += 2;
        }

        int panjang = 2 * sisi - 1;    //sama seperti rumus alas segitiga sama kaki
        int spasi = 0;
        boolean mines = true;       //
        for (int i = 0; i < sisi; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < panjang; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            if (mines) {
                spasi++;
                panjang -= 2;
                mines = false;
            } else {
                mines = true;
            }
        }
    }
}