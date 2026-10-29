import java.util.Scanner;

public class Tugas305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Meminta input jumlah toko (minimal 1)
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        // Validasi agar jumlah toko minimal 1
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarang = -1; 
            int tokoTerbanyak = 0; 
            
           
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\nToko " + i);
                
                System.out.print("  Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();
                
                while (jumlahPelanggan < 0) {
                    System.out.print("  Jumlah pelanggan tidak boleh negatif. Ulangi: ");
                    jumlahPelanggan = sc.nextInt();
                }
                
                int totalBarangToko = 0;
       
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("    Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int barangPelanggan = sc.nextInt();
                    
                    
                    while (barangPelanggan < 0) {
                        System.out.print("    Jumlah barang tidak boleh negatif. Ulangi: ");
                        barangPelanggan = sc.nextInt();
                    }
                    
                    totalBarangToko += barangPelanggan;
                }
                   System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                
        
                totalBarangSeluruhToko += totalBarangToko;
                
           
                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }
     
            System.out.println("\n========================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        
        sc.close();
    }
}