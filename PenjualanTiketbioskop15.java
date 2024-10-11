import java.util.Scanner;
public class PenjualanTiketbioskop15 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int totalTiket = 0;
      double totalHarga = 0;
      int hargaPerTiket = 50000;

      while (true) {
        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        int jumlahTiket = sc.nextInt();

        if  (jumlahTiket <0) {
            System.out.println("Jumlah tiket tidak valid. Harap masukkan angka positif. ");
            continue;
        }
        double diskon = 0.0;
        if (jumlahTiket > 10) {
            diskon = 0.15;
        }else if (jumlahTiket > 4){
            diskon = 0.10;
        }

        double hargaTiket = jumlahTiket * hargaPerTiket;
        double hargaSetelahDiskon = hargaTiket * (1 - diskon);

        totalTiket += jumlahTiket;
        totalHarga += hargaSetelahDiskon;

        System.out.println("Total harga " + totalHarga);
        System.out.println("Total tiket terjual " + totalTiket);
      }
    }
}
