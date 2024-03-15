import java.util.Scanner;

public class HitungBangunDatar {

    private static int nextint;
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("--- Isikan Pilihan --- ");
        
        
        int Pilihan = Sc.nextInt();
        
        if (Pilihan==1){
            bujursangkar bs = new bujursangkar(10);
            //int luas bs.hitungLuas();
            //int Keliling bs.hitungKeliling();
            System.out.println(bs);
            
        }
    }
    
}
