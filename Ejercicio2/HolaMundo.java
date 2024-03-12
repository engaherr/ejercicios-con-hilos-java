package Ejercicio2;

public class HolaMundo implements Runnable{

    private String salida;
    private static int LATENCIA = 200;

    

    public HolaMundo(String salida) {
        this.salida = salida;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(salida + " ");
            try {
                Thread.sleep(LATENCIA);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
