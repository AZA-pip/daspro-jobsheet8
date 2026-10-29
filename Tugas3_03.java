import java.util.Scanner;
public class Tugas3_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        int jml_toko=0;
        do{
            System.out.print("masukkan jumlah toko: ");
            jml_toko = sc.nextInt();
            if(jml_toko <1){
                System.out.println("toko minimal 1, masukkan lagi jumlah toko");
            }
        }while(jml_toko < 1);

        int total_semua=0;
        int toko_terbanyak=0;
        int barang_terbanyak=-1;
        
        for (int no_toko = 1; no_toko <= jml_toko; no_toko++) {
            System.out.println("Toko " +no_toko );

            int pelanggan = 0;
            do {
                System.out.print("Masukkan jumlah pelanggan toko " +no_toko +": ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif, ulangi");
                }
            } while (pelanggan < 0);

            int total_toko = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang = 0;
                do {
                    System.out.print("Jumlah barang pelanggan " + p +": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif, ulangi");
                    }
                } while (barang < 0);
                total_toko += barang; 
            }
            System.out.println("Toko "+no_toko + " - pelanggan: "+pelanggan+ ", total barang: "+ total_toko);

            total_semua += total_toko;
            
            if (total_toko > barang_terbanyak) {
                barang_terbanyak = total_toko;
                toko_terbanyak = no_toko;
            }
        }
        
        System.out.println("Total barang seluruh toko: " + total_semua);
        System.out.println("Toko dengan barang terbanyak: " + toko_terbanyak);

        sc.close();
    }
}
