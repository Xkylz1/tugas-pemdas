package tugaspemdas;

public class pentagon {
    public static void main(String[] args) {
        int sisi = 8;
//        for (int i=0;i<sisi;)
        penta(sisi);
    }


    public static void penta(int x) {
        int segitigaAwal=1;
        int spasi2=x-1;
        for(int i=0;i<x-1;i++){
            for (int k = 0; k < spasi2; k++) {
                System.out.print("   ");
            }
            spasi2--;
            for(int j=0;j<segitigaAwal;j++){
                System.out.print("*  ");
            }
            System.out.println();
            segitigaAwal+=2;
        }
int panjang=2*x-1;
        int spasi=0;
        boolean mines=true;
        for(int i=0;i<x;i++){
            for (int k=0;k<spasi;k++){
                System.out.print("   ");
            }
            for(int j=0;j<panjang;j++){
                System.out.print("*  ");
            }
            System.out.println();
            if(mines){
                spasi++;
                panjang-=2;
                mines=false;
            }else {
                mines=true;
            }
        }
//        int p = x + 2 * (x - 1);
//        int spasi = 0;
//        for (int i = 0; i < x; i++) {
//            for (int k = 0; k < spasi; k++) {
//                System.out.print("   ");
//            }
//            spasi++;
//            for (int j = 0; j < p; j++) {
//                System.out.print("*  ");
//            }
//            p -= 2;
//            System.out.println();
//        }
    }

}
