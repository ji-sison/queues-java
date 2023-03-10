//Ji Sison
//I adapted the code from https://www.geeksforgeeks.org/queue-interface-java/   
import java.util.LinkedList;
import java.util.Queue;

public class WaitingQueue {

    private Queue<Integer> waitingQueue;

    public WaitingQueue() {
        waitingQueue = new LinkedList<>();
    }

    public void enqueue(int x) {
        System.out.println("Estimated waiting time: " + waitingQueue.size() + " elements\n"); //means there are already n elements in the WaitingQueue
        waitingQueue.add(x);
    }

    public int dequeue() {
        return waitingQueue.remove();
    }

    public void printQ() {
        for (Integer i : waitingQueue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return waitingQueue.isEmpty();
    }

    public int size() {
        return waitingQueue.size();
    }
}
