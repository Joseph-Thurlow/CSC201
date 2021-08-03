package Week_1.test3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Sender {
    Queue<String> q = new LinkedList<>();

    public void createPacket() {
        Random r = new Random();
        if(r.nextInt(5) == 1) {
            q.add("Hello!");
            System.out.println("Sending packet.");
        }
    }

    public boolean checkQueue() {
        if(q.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String getInstance() {
        return q.poll();
    }
}
