import java.util.Random;

public class Hilo extends Thread{

    public String nombre;

    public Hilo(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run(){
        Random r=new Random();
        try {
            long t1=System.currentTimeMillis();
            Thread.sleep(r.nextInt(1000)*3);
            long t2=System.currentTimeMillis();
            System.out.println("Soy el hilo " + this.nombre +" y he dormido por " + (t2-t1));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




}
