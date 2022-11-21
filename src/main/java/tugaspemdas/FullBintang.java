package tugaspemdas;

public class FullBintang {
    public static void main(String[] args) {
        int x = 8;
        int y = 4;
        int z = 5;

        persegi(y);
        System.out.println();
        persegiPanjang(x, y);
        System.out.println();
        jajarGenjang(x, y);
        System.out.println();
        segitiga(z, z);
        System.out.println();
    }

    public static void persegi(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
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

    public static void jajarGenjang(int panjang, int tinggi) {
        int maju = tinggi - 1;
        for (int i = 0; i < tinggi; i++) {
            for (int k = 0; k < maju; k++) {
                System.out.print("   ");
            }
            maju--;
            for (int j = 0; j < panjang; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    //masih jelek
    public static void segitiga(int alas, int tinggi) {
//        int barrierKiri = alas;
        for (int i = 0; i < tinggi; i++) {
//            for (int k = 0; k < barrierKiri; k++) {
//                System.out.print(" ");
//        }
//            barrierKiri--;
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}