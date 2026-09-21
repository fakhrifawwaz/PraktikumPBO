package Jobsheet4.tugas;

public class EBikeDemo {
    public static void main(String[] args) {
        EBike bike1 = new EBike("E01", "Polygon", 90);
        EBike bike2 = new EBike("E02", "Wimcycle", 100);

        ShelterEBike shelterSipil = new ShelterEBike("Shelter Gedung Sipil");
        shelterSipil.tambahEBike(bike1);
        shelterSipil.tambahEBike(bike2);

        System.out.println(shelterSipil.getInfo());

        Peminjaman pinjam1 = new Peminjaman("P01", "2026-09-21", bike1);
        System.out.println(pinjam1.getInfo());
    }
}
