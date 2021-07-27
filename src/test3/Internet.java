package test3;

import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Internet {
    Sender alice = new Sender();
    Receiver bob = new Receiver();

    public void internetProcess() {
        alice.createPacket();
        if(alice.checkQueue()) {
            bob.importPacket(alice.getInstance());
        }
        bob.readPacket();

    }

    public static void main(String[ ] args) throws InterruptedException {
        Internet net = new Internet();
        for (int i = 0; i < 50; i++) {
            net.internetProcess();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
