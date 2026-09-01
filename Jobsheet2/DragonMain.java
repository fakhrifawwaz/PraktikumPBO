package Jobsheet2;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.move(7);
        dragon1.changeDirection(2);
        dragon1.move(5);
        dragon1.printPosition();

        Dragon dragon2 = new Dragon();
        dragon2.changeDirection(3);
        dragon2.move(3);
        dragon2.printPosition();
    }
}
