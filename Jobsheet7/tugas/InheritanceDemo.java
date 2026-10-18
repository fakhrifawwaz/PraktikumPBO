package Jobsheet7.tugas;

import java.time.LocalDate;
import java.time.LocalTime;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Objek 1: subclass MakananKering
        MakananKering mk = new MakananKering("MK001", "Keripik Singkong", 15000,
                LocalDate.of(2026, 1, 10));
        System.out.println("--- Info Makanan Kering ---");
        mk.tampilInformasi();
        mk.cekKadaluarsa();

        System.out.println();

        // Objek 2: subclass MakananBasah
        MakananBasah mb = new MakananBasah("MB001", "Nasi Goreng", 20000,
                LocalTime.of(6, 0));
        System.out.println("--- Info Makanan Basah ---");
        mb.tampilInformasi();
        mb.cekKadaluarsa();
    }
}
