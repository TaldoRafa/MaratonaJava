package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream().map(storeService::getPricesAsyncCompletableFuture).toList();
        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).toList();
        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms \n", end - start);
    }
}
