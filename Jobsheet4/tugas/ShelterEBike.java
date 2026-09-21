package Jobsheet4.tugas;

import java.util.ArrayList;

public class ShelterEBike {
    private String namaShelter;
    private ArrayList<EBike> daftarEBike;

    public ShelterEBike(String namaShelter) {
        this.namaShelter = namaShelter;
        this.daftarEBike = new ArrayList<>();
    }

    public void tambahEBike(EBike ebike) {
        daftarEBike.add(ebike);
    }

    public String getInfo() {
        String info = "Shelter: " + namaShelter + "\n";
        if (!daftarEBike.isEmpty()) {
            info += "Daftar E-Bike Tersedia:\n";
            for (EBike e : daftarEBike) {
                info += "- " + e.getInfo() + "\n";
            }
        } else {
            info += "Belum ada E-Bike di shelter ini.\n";
        }
        return info;
    }
}