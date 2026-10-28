package Jobsheet8.tugas;

public class DemoAbstract {
    public static void main(String[] args) {

        MakananKering mk1 = new MakananKering("MK001", "Nabati Keju", 3000, 200);
        System.out.println("--- Info Makanan Kering ---");
        mk1.tampilInformasi();
        mk1.cekKadaluarsa();
        mk1.tampilkanCaraSimpan();

        MakananKering mk2 = new MakananKering("MK002", "Beng-Beng", 2500, 400);
        System.out.println("\n--- Info Makanan Kering ---");
        mk2.tampilInformasi();
        mk2.cekKadaluarsa();
        mk2.tampilkanCaraSimpan();

        System.out.println();

        MakananBasah mb2 = new MakananBasah("MB001", "Sosis Solo", 2500, 10);
        System.out.println("--- Info Makanan Basah ---");
        mb2.tampilInformasi();
        mb2.cekKadaluarsa();
        mb2.tampilkanCaraSimpan();

        MakananBasah mb1 = new MakananBasah("MB002", "Roti Bakar", 15000, 5);
        System.out.println("\n--- Info Makanan Basah ---");
        mb1.tampilInformasi();
        mb1.cekKadaluarsa();
        mb1.tampilkanCaraSimpan();
    }
}
