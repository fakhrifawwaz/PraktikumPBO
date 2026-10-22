package Jobsheet7.tugas;

import java.time.LocalTime;

public class MakananBasah extends Produk {
    private LocalTime jamProduksi;
    private static final int MASA_SIMPAN_JAM = 8; 

    public MakananBasah() {
        super(); 
        this.jamProduksi = LocalTime.now();
        System.out.println("Constructor MakananBasah (tanpa parameter) dipanggil");
    }

    public MakananBasah(String idProduk, String nama, double harga, LocalTime jamProduksi) {
        super(idProduk, nama, harga);
        this.jamProduksi = jamProduksi;
        System.out.println("Constructor MakananBasah (berparameter) dipanggil");
    }

    @Override
    public void cekKadaluarsa() {
        LocalTime batasKonsumsi = jamProduksi.plusHours(MASA_SIMPAN_JAM);
        System.out.println("Jam Produksi      : " + jamProduksi);
        System.out.println("Batas Konsumsi    : " + batasKonsumsi);

        if (LocalTime.now().isAfter(batasKonsumsi)) {
            System.out.println("Status            : SUDAH KADALUARSA");
        } else {
            System.out.println("Status            : Masih layak dikonsumsi");
        }
    }
}
