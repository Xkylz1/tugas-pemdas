package tugaspemdas;

import java.util.Scanner;

public class TugasPemdas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu, menuTrapesium, menuSegitiga;
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
            if (menu == 1) {
                System.out.println("PERSEGI");
                System.out.print("Masukan Panjang : ");
                panjang = in.nextInt();
                //method persegi
                persegi(panjang);
            } else if (menu == 2) {
                System.out.println("PERSEGI PANJANG");
                System.out.print("Masukan Panjang : ");
                panjang = in.nextInt();
                System.out.print("Masukan Lebar : ");
                lebar = in.nextInt();
                //method Persegi Panjang
                persegiPanjang(panjang, lebar);
                if(panjang ==lebar){
                    System.out.println("Ini Bukan Persegi Panjang");
                }
            } else if (menu == 3) {
                do {
                    menuSegitiga();
                    menuSegitiga = in.nextInt();
                    if (menuSegitiga == 1) {
                        System.out.println("SEGITIGA SAMA KAKI");
                        System.out.print("Masukan Tinggi : ");
                        tinggi = in.nextInt();
                        //Method segitiga sama kaki
                        segitigaSamaKaki(tinggi);
                    } else if (menuSegitiga == 2) {
                        System.out.println("SEGITIGA SIKU - SIKU");
                        System.out.print("Masukan Tinggi : ");
                        tinggi = in.nextInt();
                        //method segitiga siku - siku
                        segitigaSiku(tinggi);
                    } else if (menuSegitiga == 3) {
                        System.out.println("Anda Kembali Ke - Menu");
                        end = true;
                    } else {
                        System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                        System.out.println("Silakan Pilih Kembali");
                    }
                } while (end == false);
                end = false;
            } else if (menu == 4) {
                System.out.println("JAJAR GENJANG");
                System.out.print("Masukan Alas : ");
                alas = in.nextInt();
                System.out.print("Masukan Tinggi : ");
                tinggi = in.nextInt();
                //method Jajar genjang
                jajarGenjang(alas, tinggi);
            } else if (menu == 5) {
                do {
                    menuTrapesium();
                    menuTrapesium = in.nextInt();
                    if (menuTrapesium == 1) {
                        System.out.println("TRAPESIUM");
                        System.out.print("Masukan Alas : ");
                        alas = in.nextInt();
                        System.out.print("Masukan Tinggi : ");
                        tinggi = in.nextInt();
                        //method trapesium atas
                        trapesium(atas, tinggi);
                        if (alas <= tinggi) {
                            System.out.println("Ini bukan trapesium");
                        }
                    } else if (menuTrapesium == 2) {
                        System.out.println("TRAPESIUM TERBALIK");
                        System.out.print("Masukan Atas : ");
                        atas = in.nextInt();
                        System.out.print("Masukan Tinggi : ");
                        tinggi = in.nextInt();
                        //method Trapesium Bawah
                        trapesiumBawah(bawah, tinggi);
                        if(tinggi >= atas){
                            System.out.println("Ini Bukan Trapesium");
                        }
                    } else if (menuTrapesium == 3) {
                        System.out.println("Anda Kembali Ke - Menu");
                        end = true;
                    } else {
                        System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                        System.out.println("Silakan Pilih Kembali");
                    }
                } while (end == false);
                end = false;
            } else if (menu == 6) {
                System.out.println("SEGI LIMA");
                System.out.println("");
                
                
                
                
                
            } else if (menu == 8) {
                System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
                System.out.println("Anda Keluar Dari Program.");
                end = true;       
            } else {
                System.out.println("Menu Yang Anda Pilih Tidak Tersedia !");
                System.out.println("Silakan Pilih Kembali");
            }

        } while (end == false);
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

    public static void persegi(int panjang) {
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("*  ");
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

    public static void segitigaSamaKaki(int tinggi) {
        int nilaiAwalSegitiga = 1;
        int spasi = tinggi - 1;
        for (int i = 0; i < tinggi; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < nilaiAwalSegitiga; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            nilaiAwalSegitiga += 2;
            spasi--;
        }
    }

    public static void trapesium(int lebarAtas, int tinggi) {
        int spasi = tinggi - 1;

        for (int i = 0; i < tinggi; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < lebarAtas; j++) {
                System.out.print("*  ");
            }
            System.out.println();
//            panjangBaris
            lebarAtas += 2;
            spasi--;
        }
    }

    public static void belahKetupat(int panjangRusuk) {
        int tinggiSegitiga = panjangRusuk / 2;
        int nilaiAwalSegitiga = 1;
        int spasi = tinggiSegitiga;//(tinggi segitiga -1 +1
        for (int i = 0; i < tinggiSegitiga; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < nilaiAwalSegitiga; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            nilaiAwalSegitiga += 2;
            spasi--;
        }
        for (int i = 0; i < panjangRusuk; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        nilaiAwalSegitiga -= 2;
        spasi++;
        for (int i = 0; i < tinggiSegitiga; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < nilaiAwalSegitiga; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            nilaiAwalSegitiga -= 2;
            spasi++;

        }
    }

    public static void trapesiumBawah(int bawah, int y) {
        int spasi = 0;
        int panjangAtas = bawah + 2 * (y - 1);
        for (int i = 0; i < y; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < panjangAtas; j++) {
                System.out.print("*  ");
            }
            System.out.println();
//            panjangBaris
            panjangAtas -= 2;
            spasi++;
        }
    }

    public static void segitigaSiku(int tinggi) {
        int panjangBaris = 1;
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < panjangBaris; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            panjangBaris++;
        }
    }
}
