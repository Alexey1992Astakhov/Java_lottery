import java.util.Comparator;
import java.util.PriorityQueue;

public class Lottery {
    private PriorityQueue<Toys> queue;

    public Lottery(){
        queue = new PriorityQueue<>(Comparator.comparingDouble(Toys::getWeight));
    }

    public void put(Toys toys) {
        queue.offer(toys);
    }

    public Toys get() {
        return queue.poll();
    }
}
