import java.util.Scanner;
public class SiakadFor15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nilai,tertinggi = 0, terendah = 100;
    int lulus=0, tidakLulus=0;
    for (int i = 1; i <= 10; i++){
        System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi){
            tertinggi = nilai;
        }
        if ( nilai < terendah) {
            terendah = nilai; 
        }
        if (nilai >= 60) {
            lulus += 1;
        }
        else {tidakLulus += 1;}
    }
    
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    System.out.println("Lulus : " + lulus);
    System.out.println("Tidak lulus: " + tidakLulus);
}
}