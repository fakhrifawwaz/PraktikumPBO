package Jobsheet7.tugas;

import java.time.LocalDate;
import java.time.LocalTime;

public class InheritanceDemo {
    public static void main(String[] args) {
        MakananKering mk1 = new MakananKering("MK001", "Keripik Singkong", 15000,
                LocalDate.of(2025, 1, 10));
        System.out.println("--- Info Makanan Kering ---");
        mk1.tampilInformasi();
        mk1.cekKadaluarsa();

        MakananKering mk2 = new MakananKering();
        System.out.println("--- Info Makanan Kering ---");
        mk2.tampilInformasi();

        System.out.println();

        MakananBasah mb1 = new MakananBasah("MB001", "Nasi Goreng", 20000,
                LocalTime.of(6, 0));
        System.out.println("--- Info Makanan Basah ---");
        mb1.tampilInformasi();
        mb1.cekKadaluarsa();

        MakananBasah mb2 = new MakananBasah();
        System.out.println("--- Info Makanan Basah ---");
        mb2.tampilInformasi();
    }
}
