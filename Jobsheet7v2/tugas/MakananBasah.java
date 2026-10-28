package Jobsheet7v2.tugas;

// SUBCLASS dari Produk
public class MakananBasah extends Produk {
    public int umurJam;                    // sudah berapa jam sejak diproduksi
    public final int MASA_SIMPAN_JAM = 8;  // tahan 8 jam

    public MakananBasah(String idProduk, String nama, double harga, int umurJam) {
        super(idProduk, nama, harga);
        this.umurJam = umurJam;
    }

    @Override
    public void cekKadaluarsa() {
        System.out.println("Umur Produk : " + umurJam + " jam");
        if (umurJam > MASA_SIMPAN_JAM) {
            System.out.println("Status      : SUDAH KADALUARSA");
        } else {
            System.out.println("Status      : Masih layak dikonsumsi");
        }
    }
}
