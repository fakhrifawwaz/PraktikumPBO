package Jobsheet7.tugas;

public class Produk {
    public String idProduk;
    public String nama;
    public double harga;

    public Produk() {
        this.idProduk = "-";
        this.nama = "-";
        this.harga = 0;
        System.out.println("Constructor Produk (tanpa parameter) dipanggil");
    }

    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
        System.out.println("Constructor Produk (berparameter) dipanggil");
    }

    public void cekKadaluarsa() {
        System.out.println("Produk umum belum memiliki aturan kadaluarsa khusus.");
    }

    public void tampilInformasi() {
        System.out.println("ID Produk : " + idProduk);
        System.out.println("Nama      : " + nama);
        System.out.println("Harga     : Rp" + harga);
    }
}