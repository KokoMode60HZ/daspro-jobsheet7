import java.util.Scanner;

public class Bioskop07 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000,
        total_tiket_terjual = 0,
        total_pendapatan = 0, jumlahTiket;
        double hargaSebelumDiskon, potonganHarga, hargaBayar,
        diskon = 0;

        while(true){
           System.out.println("Masukkan jumlah tiket : ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0){
            System.out.println("jumlah tiket tidak valid");

                break;
            }if (jumlahTiket > 10){
                diskon = 0.15;
            }else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

        hargaSebelumDiskon = jumlahTiket * hargaTiket;
        potonganHarga = hargaSebelumDiskon * diskon;
        hargaBayar = hargaSebelumDiskon - potonganHarga;

        total_tiket_terjual += jumlahTiket;
        total_pendapatan += hargaBayar;

        System.out.println("total bayar : Rp." + hargaBayar);
        System.out.println("total tiket terjual : " + total_tiket_terjual + " tiket");
        System.out.println("total pendapatan = " + total_pendapatan);
        System.out.println("--------------------------------------");

   }


    }


}
