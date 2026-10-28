package Jobsheet7v2.tugas;

public class InheritanceDemo {
    public static void main(String[] args) {
        MakananKering mk1 = new MakananKering("MK001", "Keripik Singkong", 15000, 200);
        System.out.println("--- Info Makanan Kering ---");
        mk1.tampilInformasi();
        mk1.cekKadaluarsa();

        MakananKering mk2 = new MakananKering("MK002", "Nabati Keju", 12000, 400);
        System.out.println("--- Info Makanan Kering ---");
        mk2.tampilInformasi();
        mk2.cekKadaluarsa();

        System.out.println();

        MakananBasah mb1 = new MakananBasah("MB001", "Pastel", 2000, 10);
        System.out.println("--- Info Makanan Basah ---");
        mb1.tampilInformasi();
        mb1.cekKadaluarsa();

        MakananBasah mb2 = new MakananBasah("MB002", "Sosis Solo", 2500, 5);
        System.out.println("--- Info Makanan Basah ---");
        mb2.tampilInformasi();
        mb2.cekKadaluarsa();
    }
}
