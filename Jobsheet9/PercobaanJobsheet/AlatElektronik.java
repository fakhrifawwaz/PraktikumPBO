package PercobaanJobsheet;

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        return String.format("Merk: %s | Harga: Rp%.0f | Warna: %s", merk, harga, warna);
    }
}