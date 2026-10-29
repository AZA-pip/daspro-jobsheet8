import java.util.Scanner;
public class Tugas2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;
        int total=0;
        do{
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
            if(n<3){
                System.out.println("nilai n minimal 3, masukkan ulang ");
            }
        }while(n<3);

        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n ;j++){

                int kali = i* j;
                System.out.print(" ");
                System.out.print(kali);

                total += kali;
                
            }
            System.out.println();
        }System.out.println("Jumlah seluruh angka: "+ total);
        
        sc.close();
    }
}
