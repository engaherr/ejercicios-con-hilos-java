package Ejercicio1;

public class SecuenciaNumeros implements Runnable{

    private int iniciaNumero;
    private int terminaNumero;
    private static int LATENCIA = 100;


    public SecuenciaNumeros(int iniciaNumero, int terminaNumero) {
        this.iniciaNumero = iniciaNumero;
        this.terminaNumero = terminaNumero;
    }

    @Override
    public void run() {
        if(iniciaNumero > terminaNumero) {
            for(int i = iniciaNumero; i >= terminaNumero; i--) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(LATENCIA);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (iniciaNumero < terminaNumero) {
            for (int i = iniciaNumero; i <= terminaNumero; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(LATENCIA);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}