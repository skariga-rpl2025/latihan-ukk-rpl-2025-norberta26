
package Latihan3;

import java.util.Scanner;

public class PendaftaranAnggotaGYM {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String nama;
        String lanjut;

        System.out.println("=== Program Pendaftaran Anggota Gym ===");

        do {
            System.out.print("Masukkan nama anggota: ");
            nama = input.nextLine();
            totalAnggota++;

            System.out.print("Daftar anggota lagi? [ya/tidak]> ");
            lanjut = input.nextLine().toLowerCase();

        } while (lanjut.equals("ya")); // 4. Ulangi jika jawab "ya"

        System.out.println("\nPendaftaran selesai.");
        System.out.println("Total anggota yang terdaftar hari ini: " + totalAnggota);

    }
}


