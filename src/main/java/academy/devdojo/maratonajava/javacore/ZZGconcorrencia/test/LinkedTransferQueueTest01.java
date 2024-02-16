package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Rafa")); // se não inserir retorna erro
        System.out.println(tq.offer("Rafa2")); // se não inserir retorna false
        System.out.println(tq.offer("Rafa2", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("DevDojo"));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());

        System.out.println(tq.remainingCapacity());
    }
}
