package Jobsheet8.tugas;

public class MakananKering extends Produk {
    public int umurHari;                      
    public final int MASA_SIMPAN_HARI = 365;  

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

    @Override
    public void tampilkanCaraSimpan() {
        System.out.println("Cara Simpan : Simpan di wadah tertutup rapat, tempat kering dan sejuk");
    }
}
