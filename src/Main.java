import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator(0);
        List<Thread> threadList = new LinkedList<>();
//      CREAR LISTA DE HILOS
        for (int i = 0; i < 100; i++){
            Thread incrementalTHread = new Thread(new IncrementalTask(accumulator, 1000));
            incrementalTHread.start();
        }
        try {
//            HACER JOIN DE TODS LOS HILOS DE LA LISTA

            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(accumulator.getValue());
    }
}