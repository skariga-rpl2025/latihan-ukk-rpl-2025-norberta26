 
package Latihan2;

import java.util.Scanner;

public class ProgramVotingKetuaOSIS {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println("=== Program Penghitungan Suara ===");
        System.out.println("Masukkan suara untuk kandidat:");
        System.out.println("A = Kandidat A");
        System.out.println("B = Kandidat B");
        System.out.println("Ketik 'selesai' untuk mengakhiri.");

            // 3. Perulangan menggunakan while
        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine().toLowerCase();

            // 2. Program berhenti jika pengguna mengetik "selesai"
            if (pilihan.equals("selesai")) {
                break;
            }

            // 4. Menghitung suara
            if (pilihan.equals("a")) {
                suaraA++;
            } else if (pilihan.equals("b")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Masukkan hanya A, B, atau selesai.");
            }
        }

             // 5. Menampilkan hasil
        System.out.println("\n=== Hasil Akhir Penghitungan Suara ===");
        System.out.println("Total suara untuk Kandidat A: " + suaraA);
        System.out.println("Total suara untuk Kandidat B: " + suaraB);

    }
}

