package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        HolaMundo hola = new HolaMundo("hola");
        HolaMundo mundo = new HolaMundo("mundo");

        Thread p1 = new Thread(hola);
        Thread p2 = new Thread(mundo);

        p1.start();
        p2.start();
    }
}
