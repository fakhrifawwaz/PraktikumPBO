public class AlatCamping implements DapatDisewa {
    private String nama;
    private String jenis;
    private double hargaSewa;

    public AlatCamping(String nama, String jenis, double hargaSewa) {
        this.nama = nama;
        this.jenis = jenis;
        this.hargaSewa = hargaSewa;
    }

    public void tampilInfo() {
        System.out.println(nama + " | Jenis: " + jenis + " | Sewa: Rp" + hargaSewa);
    }

    @Override
    public void bayar() {
        System.out.println("Membayar sewa " + nama + " sebesar Rp" + hargaSewa);
    }

    @Override
    public void pinjam() {
        System.out.println(nama + " dipinjam");
    }

    @Override
    public void kembalikan() {
        System.out.println(nama + " dikembalikan");
    }
}