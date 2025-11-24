
package Latihan4;


public class DataPerusahaan {
    public static void main(String[] args) {
        Karyawan k = new Karyawan();

        k.setNIP("K001");
        k.setNama("REVANSYAH PUTRA");
        k.setDivisi("Marketing");

        System.out.println("=== Data Karyawan ===");
        System.out.println("NIP     : " + k.getNIP());
        System.out.println("Nama    : " + k.getNama());
        System.out.println("Divisi  : " + k.getDivisi());
    }
}


