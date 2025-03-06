package com.java8code;

import java.util.concurrent.CompletableFuture;

public class UniqueElementInJavaStream {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 10).thenApplyAsync(i -> i * 2).thenCompose(i -> CompletableFuture.supplyAsync(() -> i + 20)
                .thenApplyAsync(x-> x+10).thenApplyAsync(x->x*2).exceptionally(e -> {
                    System.out.println("Exception occurred: " + e);
                    return 0;
                }));
        completableFuture.thenAccept(System.out::println);
    }
}
