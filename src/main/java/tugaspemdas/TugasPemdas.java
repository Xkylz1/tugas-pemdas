package tugaspemdas;

import java.util.Scanner;

public class TugasPemdas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            displayMenu();
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    handlePersegi(in);
                    break;
                case 2:
                    handlePersegiPanjang(in);
                    break;
                case 3:
                    handleSegitiga(in);
                    break;
                case 4:
                    handleJajarGenjang(in);
                    break;
                case 5:
                    handleTrapesium(in);
                    break;
                case 6:
                    handleSegiLima(in);
                    break;
                case 7:
                    handleSegiDelapan(in);
                    break;
                case 8:
                    System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
                    System.out.println("Anda Keluar Dari Program.");
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                    System.out.println("Silakan Pilih Kembali");
            }
        }
    }

    public static void displayMenu() {
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

    public static void handlePersegi(Scanner in) {
        System.out.println("PERSEGI");
        System.out.print("Masukan Panjang : ");
        int panjang = in.nextInt();
        cetakPersegi(panjang, panjang);
    }

    public static void handlePersegiPanjang(Scanner in) {
        System.out.println("PERSEGI PANJANG");
        System.out.print("Masukan Panjang : ");
        int panjang = in.nextInt();
        System.out.print("Masukan Lebar : ");
        int lebar = in.nextInt();
        cetakPersegi(panjang, lebar);
        if (panjang == lebar) {
            System.out.println("Ini Bukan Persegi Panjang");
        }
    }

    public static void handleSegitiga(Scanner in) {
        while (true) {
            displaySegitigaMenu();
            int menuSegitiga = in.nextInt();
            switch (menuSegitiga) {
                case 1:
                    handleSegitigaSamaKaki(in);
                    break;
                case 2:
                    handleSegitigaSikuSiku(in);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                    System.out.println("Silakan Pilih Kembali");
            }
        }
    }

    public static void displaySegitigaMenu() {
        System.out.println("SEGITIGA");
        System.out.println("1. Segitiga Sama Kaki");
        System.out.println("2. Segitiga Siku - Siku");
        System.out.println("3. Kembali");
        System.out.print("Silakan Pilih Menu : ");
    }

    public static void handleSegitigaSamaKaki(Scanner in) {
        System.out.println("SEGITIGA SAMA KAKI");
        System.out.print("Masukan Tinggi : ");
        int tinggi = in.nextInt();
        cetakSegitigaSamaKaki(tinggi);
    }

    public static void handleSegitigaSikuSiku(Scanner in) {
        System.out.println("SEGITIGA SIKU - SIKU");
        System.out.print("Masukan Tinggi : ");
        int tinggi = in.nextInt();
        cetakSegitigaSiku(tinggi);
    }

    public static void handleJajarGenjang(Scanner in) {
        System.out.println("JAJAR GENJANG");
        System.out.print("Masukan Alas : ");
        int alas = in.nextInt();
        System.out.print("Masukan Tinggi : ");
        int tinggi = in.nextInt();
        cetakJajarGenjang(alas, tinggi);
    }

    public static void handleTrapesium(Scanner in) {
        while (true) {
            displayTrapesiumMenu();
            int menuTrapesium = in.nextInt();
            switch (menuTrapesium) {
                case 1:
                    handleTrapesiumOriginal(in);
                    break;
                case 2:
                    handleTrapesiumTerbalik(in);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                    System.out.println("Silakan Pilih Kembali");
            }
        }
    }

    public static void displayTrapesiumMenu() {
        System.out.println("TRAPESIUM");
        System.out.println("1. Trapesium");
        System.out.println("2. Trapesium Terbalik");
        System.out.println("3. Kembali");
        System.out.print("Silakan Pilih Menu : ");
    }

    public static void handleTrapesiumOriginal(Scanner in) {
        System.out.println("TRAPESIUM");
        System.out.print("Masukan Alas : ");
        int alas = in.nextInt();
        System.out.print("Masukan Tinggi : ");
        int tinggi = in.nextInt();
        int atasTrapesium = alas - (2 * (tinggi - 1));
        if (atasTrapesium < 2) {
            System.out.println("Trapesium ini mungkin tidak sempurna");
        }
        cetakTrapesiumOriginal(alas, tinggi);
    }

    public static void handleTrapesiumTerbalik(Scanner in) {
        System.out.println("TRAPESIUM TERBALIK");
        System.out.print("Masukan Atas : ");
        int atas = in.nextInt();
        System.out.print("Masukan Tinggi : ");
        int tinggi = in.nextInt();
        int atasTrapesium = atas - (2 * (tinggi - 1));
        if (atasTrapesium < 2) {
            System.out.println("Trapesium ini mungkin tidak sempurna");
        }
        cetakTrapesiumTerbalik(atas, tinggi);
    }

    // Define other methods for handling shapes...
    public static void handleSegiLima(Scanner in) {
        System.out.println("SEGI LIMA");
        System.out.print("Masukan Panjang Sisi (Hanya Ganjil lebih dari 3) : ");
        int sisi = in.nextInt();
        cetakPentagon(sisi);
    }

    public static void handleSegiDelapan(Scanner in) {
        System.out.println("SEGI DELAPAN");
        System.out.print("Masukan Panjang Sisi : ");
        int sisi = in.nextInt();
        if (sisi < 2) {
            System.out.println("Segi delapan ini mungkin tidak sempurna");
        }
        cetakOktagon(sisi);
    }

    //Print Method
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