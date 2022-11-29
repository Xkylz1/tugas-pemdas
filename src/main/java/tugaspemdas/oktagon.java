package tugaspemdas;

public class oktagon {
    public static void main(String[] args) {
        oktagon(1);
    }

    public static void oktagon(int x){
        trapesium(x,x);
        persegiPanjang(2*x+x-2,x-2);
        trapesiumBawah(x,x);
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
    public static void trapesiumBawah(int bawah, int y) {
        int spasi = 0;
        int panjangAtas = bawah+2*(y-1);
        for (int i = 0; i < y; i++) {
            for (int k = 0; k < spasi; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < panjangAtas; j++) {
                System.out.print("*  ");
            }
            System.out.println();
//            panjangBaris
            panjangAtas-= 2;
            spasi++;
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
}
