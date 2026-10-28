package Jobsheet7v2.tugas;

// SUPERCLASS
public class Produk {
    public String idProduk;
    public String nama;
    public double harga;

    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    // hanya ada di superclass, subclass tidak perlu override
    public void tampilInformasi() {
        System.out.println("ID Produk : " + idProduk);
        System.out.println("Nama      : " + nama);
        System.out.println("Harga     : Rp" + harga);
    }

    // akan di-override oleh subclass
    public void cekKadaluarsa() {
        System.out.println("Produk umum belum memiliki aturan kadaluarsa.");
    }
}
