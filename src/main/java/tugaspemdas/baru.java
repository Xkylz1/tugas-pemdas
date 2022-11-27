package tugaspemdas;

public class baru {
    public static void main(String[] args) {
//        trapesium(5, 10);
//        belahKetupat(5);
//        segitigaSamaKaki(7);
//        ketupat(7);
        trapesiumBawah(4,3);
    }



    public static void trapesium(int x, int y) {
        int spasi = y - 1;

        for (int i = 0; i < y; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < x; j++) {
                System.out.print("*  ");
            }
            System.out.println();
//            panjangBaris
            x += 2;
            spasi--;
        }
    }

    public static void belahKetupat(int panjangRusuk) {
        //loop segitiga atas
        int batasSegitiga = 1;
        int spasi = (panjangRusuk / 2) / 2 + 1;

        for (int i = 0; i < panjangRusuk / 2; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < batasSegitiga; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            batasSegitiga += 2;
            spasi--;
        }
        //baris tengah
//        for(int i=0;i<panjangRusuk;i++){
//            System.out.print("*  ");
//        }
//        System.out.println();
        //loop segitiga bawah
        for (int i = 0; i < panjangRusuk / 2 + 1; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < batasSegitiga; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            spasi++;
            batasSegitiga -= 2;

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

    public static void ketupat(int panjangRusuk) {
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

    public static void trapesiumBawah(int x, int y) {
        int spasi = 0;

        for (int i = 0; i < y; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < x; j++) {
                System.out.print("*  ");
            }
            System.out.println();
//            panjangBaris
            x += 2;
            spasi++;
        }
    }
}
