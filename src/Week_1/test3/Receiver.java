package Week_1.test3;

import java.util.LinkedList;
import java.util.Queue;

public class Receiver {
    Queue<String> q = new LinkedList<>();

    public void readPacket() {
        if (!q.isEmpty()) {
            System.out.println("Packet reads: " + q.poll());
        }
    }

    public void importPacket(String packet) {
        q.add(packet);
    }
}
