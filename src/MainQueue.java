//Ji Sison
//I adapted the code from https://www.geeksforgeeks.org/queue-interface-java/
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    private Queue<Integer> mainQueue;
    private WaitingQueue waitingQueue;
    private int maxSize = 5;

    public MainQueue() {
        mainQueue = new LinkedList<>();
        waitingQueue = new WaitingQueue();
    }

    public void enqueue(int x) {
        if (mainQueue.size() < maxSize) {
            mainQueue.add(x);
            System.out.println(x + " enqueued to main queue");
        } else {
            System.out.println(x + " enqueued to waiting queue");
            waitingQueue.enqueue(x);
        }
    }

    public int dequeue() {
        int x = mainQueue.remove(); //front element in main queue
        System.out.println(x + " has been removed from the main queue.");
        
        //transfer elements from WaitingQueue to MainQueue
        if (!waitingQueue.isEmpty()) {
            for (int i = 0; i < maxSize - mainQueue.size(); i++) {
                if (waitingQueue.isEmpty()) {
                    break;
                }
                int y = waitingQueue.dequeue(); //front element in waiting queue
                mainQueue.add(y);
                System.out.println( y + " has been transferred " +"from the waiting queue to the main queue.");
            }
        }
        return x;
    }

    public void printQ() {
        System.out.println("------------------------");
        System.out.println("MainQueue elements are:");
        for (Integer i : mainQueue) {
            System.out.print(i + " ");
        }
        System.out.println("\n \nWaitingQueue elements are:");
        waitingQueue.printQ();
        System.out.println("------------------------");
    }
}
