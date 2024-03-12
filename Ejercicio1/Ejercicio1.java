package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        SecuenciaNumeros unoACien = 
        new SecuenciaNumeros(1, 100);
        SecuenciaNumeros cienAUno = 
        new SecuenciaNumeros(100, 1);

        Thread p1 = new Thread(unoACien, "Hilo 1: ");
        Thread p2 = new Thread(cienAUno, "Hilo 2: ");

        p1.start();
        p2.start();
    }
}
