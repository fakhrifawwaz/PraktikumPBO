package PercobaanJobsheet;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Polytron";
        kulkas.harga = 2500000;
        kulkas.warna = "Silver";
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "Samsung";
        tv.harga = 3500000;
        tv.warna = "Hitam";
        tv.jenisLayar = "LED";
        tv.volume = 10;
        tv.naikkanVolume();

        System.out.println(kulkas.getInfo());
        System.out.println(tv.getInfo());
    }
}