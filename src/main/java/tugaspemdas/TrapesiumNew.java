package tugaspemdas;

public class TrapesiumNew {
    public static void main(String[] args) {
        int alas=7;
        int tinggi=3;
//        trapesiumOriginal(alas,tinggi);
        trapesiumTerbalik(alas,tinggi);
    }

    public static void trapesiumOriginal(int panjangAlas, int tinggi){
       int atas =panjangAlas-2*(tinggi-1);
       int spasi=tinggi-1;
       for(int i =0;i<tinggi;i++){
           for (int k=0;k<spasi;k++){
               System.out.print("   ");
           }
           for(int j=0;j<atas;j++){
               System.out.print("*  ");
           }
           System.out.println();
           atas+=2;
           spasi--;
       }
    }

    public static void trapesiumTerbalik(int panjangAtas,int tinggi){
        int spasi=0;
        for(int i=0;i<tinggi;i++){
            for(int k=0;k<spasi;k++){
                System.out.print("   ");
            }
            for (int j=0;j<panjangAtas;j++){
                System.out.print("*  ");
            }
            System.out.println();
            panjangAtas-=2;
            spasi++;
        }
    }
}
