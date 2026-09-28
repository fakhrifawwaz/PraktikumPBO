package Jobsheet4.tugas;

public class EBikeDemo {
    public static void main(String[] args) {
        EBike bike1 = new EBike("E01", "Polygon", 90);
        EBike bike2 = new EBike("E02", "Wimcycle", 100);
        EBike bike3 = new EBike("E03", "United", 80);

        ShelterEBike shelterSipil = new ShelterEBike("Shelter Gedung Sipil");
        shelterSipil.tambahEBike(bike1);
        shelterSipil.tambahEBike(bike2);

        ShelterEBike shelterRektorat = new ShelterEBike("Shelter Gedung Rektorat");
        shelterRektorat.tambahEBike(bike3);

        System.out.println(shelterSipil.getInfo());
        System.out.println(shelterRektorat.getInfo());

        Peminjaman pinjam1 = new Peminjaman("P01", "2026-09-21", bike1);
        System.out.println(pinjam1.getInfo());
        Peminjaman pinjam2 = new Peminjaman("P02", "2026-09-22", bike3);
        System.out.println(pinjam2.getInfo());
    }
}
