package Jobsheet7.tugas;

import java.time.LocalDate;

public class MakananKering extends Produk {
    private LocalDate tanggalProduksi;
    private static final int MASA_SIMPAN_HARI = 365; // asumsi masa simpan 1 tahun

    // Constructor tanpa parameter (overloading #1)
    public MakananKering() {
        super(); // memanggil Produk()
        this.tanggalProduksi = LocalDate.now();
        System.out.println("Constructor MakananKering (tanpa parameter) dipanggil");
    }

    // Constructor berparameter (overloading #2)
    public MakananKering(String idProduk, String nama, double harga, LocalDate tanggalProduksi) {
        super(idProduk, nama, harga); // memanggil constructor Produk berparameter
        this.tanggalProduksi = tanggalProduksi;
        System.out.println("Constructor MakananKering (berparameter) dipanggil");
    }

    // Overriding method cekKadaluarsa() milik Produk
    @Override
    public void cekKadaluarsa() {
        LocalDate tanggalKadaluarsa = tanggalProduksi.plusDays(MASA_SIMPAN_HARI);
        System.out.println("Tanggal Produksi  : " + tanggalProduksi);
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);

        if (LocalDate.now().isAfter(tanggalKadaluarsa)) {
            System.out.println("Status            : SUDAH KADALUARSA");
        } else {
            System.out.println("Status            : Masih layak dikonsumsi");
        }
    }
}
