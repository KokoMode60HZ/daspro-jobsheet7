import java.util.Scanner;

public class SiakadFor07 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double nilai, terendah = 100, tertinggi = 0;
        int mahasiswaLulus = 0, mahasiswaTidakLulus = 0;


        for (int i = 1 ;  i <= 10 ; i++ ){
            System.out.print("Masukkan nilai mahasiswa ke - " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;

            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 60){
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mahasiswaTidakLulus);
    }
}