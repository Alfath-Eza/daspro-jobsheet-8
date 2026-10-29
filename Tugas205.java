import java.util.Scanner;

public class Tugas205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta input nilai n (minimal 3)
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        // Validasi agar n minimal 3
        if (n < 3) {
            System.out.println("Nilai n minimal harus 3.");
        } else {
            int jumlahSeluruhAngka = 0;
            
            
            for (int i = 1; i <= n; i++) {
                
                
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    
                    
                    System.out.printf("%4d", hasil);
                    
                    
                    jumlahSeluruhAngka += hasil;
                }
                
                System.out.println();
            }
            
            
            System.out.println("\nJumlah seluruh angka: " + jumlahSeluruhAngka);
        }
        
        sc.close();
    }
}
    

