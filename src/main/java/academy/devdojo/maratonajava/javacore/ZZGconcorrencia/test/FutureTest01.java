package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(4);
            return 4.35D;
        });
        System.out.println(doSomeThing());
        Double dolarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        System.out.println("Dolar: " + dolarResponse);
        executorService.shutdown();
    }

    private static long doSomeThing() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
