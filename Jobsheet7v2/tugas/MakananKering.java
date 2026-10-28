package Jobsheet7v2.tugas;

// SUBCLASS dari Produk
public class MakananKering extends Produk {
    public int umurHari;                      // sudah berapa hari sejak diproduksi
    public final int MASA_SIMPAN_HARI = 365;  // tahan 1 tahun

    public MakananKering(String idProduk, String nama, double harga, int umurHari) {
        super(idProduk, nama, harga);
        this.umurHari = umurHari;
    }

    @Override
    public void cekKadaluarsa() {
        System.out.println("Umur Produk : " + umurHari + " hari");
        if (umurHari > MASA_SIMPAN_HARI) {
            System.out.println("Status      : SUDAH KADALUARSA");
        } else {
            System.out.println("Status      : Masih layak dikonsumsi");
        }
    }
}
