package Jobsheet4.tugas;

public class Peminjaman {
    private String idPinjam;
    private String tanggal;
    private EBike ebike;

    public Peminjaman(String idPinjam, String tanggal, EBike ebike) {
        this.idPinjam = idPinjam;
        this.tanggal = tanggal;
        this.ebike = ebike;
    }

    public String getInfo() {
        return "ID Pinjam: " + idPinjam + "\nTanggal: " + tanggal + "\nUnit Dipinjam: " + ebike.getInfo() + "\n";
    }
}