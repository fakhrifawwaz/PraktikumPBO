package Jobsheet8.tugas;

public abstract class Produk {
    public String idProduk;
    public String nama;
    public double harga;

    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println("ID Produk : " + idProduk);
        System.out.println("Nama      : " + nama);
        System.out.println("Harga     : Rp" + harga);
    }

    public abstract void cekKadaluarsa();
    public abstract void tampilkanCaraSimpan();
}
