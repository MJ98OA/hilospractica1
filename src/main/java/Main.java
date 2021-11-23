import java.util.ArrayList;

public class Main {

    public static void main(String [] args){
        ArrayList<Hilo> lh=new ArrayList<Hilo>();
        for(int i=0;i<5;i++){


            Hilo h=new Hilo("Hilo: "+i);

            h.start();
        }

    }

}
