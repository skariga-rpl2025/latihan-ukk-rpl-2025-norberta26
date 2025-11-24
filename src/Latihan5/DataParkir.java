
package Latihan5;


public class DataParkir {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();

        k.setNoPolisi("N 1986 RB");
        k.setMerk("Toyota Avanza");
        k.setTahun(2022);

        System.out.println("=== Data Kendaraan ===");
        System.out.println("No Polisi : " + k.getNoPolisi());
        System.out.println("Merk      : " + k.getMerk());
        System.out.println("Tahun     : " + k.getTahun());
    }
}


