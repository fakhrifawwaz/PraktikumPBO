public class Mobil implements DapatDisewa {
    private String nama;
    private int kapasitas;
    private double hargaSewa;

    public Mobil(String nama, int kapasitas, double hargaSewa) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.hargaSewa = hargaSewa;
    }

    public void tampilInfo() {
        System.out.println(nama + " | Kapasitas: " + kapasitas + " orang | Sewa: Rp" + hargaSewa);
    }

    @Override
    public void bayar() {
        System.out.println("Membayar sewa mobil " + nama + " sebesar Rp" + hargaSewa);
    }

    @Override
    public void pinjam() {
        System.out.println("Mobil " + nama + " dipinjam");
    }

    @Override
    public void kembalikan() {
        System.out.println("Mobil " + nama + " dikembalikan");
    }
}