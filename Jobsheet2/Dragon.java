package Jobsheet2; 

public class Dragon {

    int x; //untuk posisi mendatar(kanan atau kiri)
    int y; //untuk posisi vertikal(atas atau bawah)
    int direction; // arah hadap dragonnya 1=atas, 2=kanan, 3=bawah, 4=kiri

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1; //harus 1-4 agar tidak terlahir dalam "arah kosong"
    }

    public void  changeDirection(int newDirection){
        //hanya boleh arah 1-4 karena arah 0 tidak ada, dan arah 5 ke atas tidak ada
        if (newDirection >= 1 && newDirection <= 4){ 
            direction = newDirection;
        } else {
            System.out.println("arah tidak valid, Harus 1 - 4!");
        }
    }

    public void move(int steps){
        switch (direction){
            case 1:
                y += steps; // ke atas
                break;
            case 2:
                x += steps; // ke kanan
                break;
            case 3:
                y -= steps; // ke bawah
                break;
            case 4:
                x -= steps; // ke kiri
                break;
        }
    }

    public void printPosition(){
        System.out.println("Posisi Dragon: (" + x + ", " + y + ") arah: " + direction);
        //laporan posisi dan arah dragonnya 
    }

}