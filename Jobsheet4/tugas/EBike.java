package Jobsheet4.tugas;

public class EBike {
    private String kode;
    private String tipe;
    private int baterai;

    public EBike(String kode, String tipe, int baterai) {
        this.kode = kode;
        this.tipe = tipe;
        this.baterai = baterai;
    }

    public String getInfo() {
        return "Kode: " + kode + " | Tipe: " + tipe + " | Baterai: " + baterai + "%";
    }

    public String getKode() {
        return kode;
    }
}