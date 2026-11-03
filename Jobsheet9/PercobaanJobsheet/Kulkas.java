package PercobaanJobsheet;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return super.getInfo() + " | Jumlah pintu: " + jumlahPintu;
    }
}
