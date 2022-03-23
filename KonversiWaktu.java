import java.util.Scanner;
//Nama   : Fahril 
//Nim    : 13020200021
//Tanggal: 22 Maret 2022
//Kelas  : A1

public class KonversiWaktu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jam, menit, detik, konversi;
            System.out.print("Berapa detik yang ingin anda konversikan : ");
            konversi = input.nextInt();

            jam     = konversi/3600;
            menit   = (konversi%3600)/60;
            detik   = (konversi%3600)%60;
            
            System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
            System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
        }
    }

    
    
}
