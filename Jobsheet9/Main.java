public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Honda Jazz", 5, 250000);
        AlatCamping tenda = new AlatCamping("Tenda Eiger", "Tenda", 50000);

        mobil.tampilInfo();
        mobil.pinjam();
        mobil.bayar();
        mobil.kembalikan();

        System.out.println();

        tenda.tampilInfo();
        tenda.pinjam();
        tenda.bayar();
        tenda.kembalikan();
    }
}