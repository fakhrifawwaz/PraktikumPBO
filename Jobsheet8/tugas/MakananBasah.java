package Jobsheet8.tugas;

public class MakananBasah extends Produk {
    public int umurJam;                    
    public final int MASA_SIMPAN_JAM = 8;

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

    @Override
    public void tampilkanCaraSimpan() {
        System.out.println("Cara Simpan : Simpan di kulkas, habiskan sebelum 8 jam");
    }
}
