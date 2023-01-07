package winterbe;

import java.util.concurrent.*;

public class WinterBe {
    //
    private static int counter=0;
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        //
       /* Runnable task = () -> {
            String name = Thread.currentThread().getName();
            counter++;
            System.out.println("Hello - " + name + ", "+counter);
        };
        task.run();

        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("DONE");*/

      /*  ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
           String tname = Thread.currentThread().getName();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello "+tname);
        });

        try {
            System.out.println("Attempt to shutdown executor...");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.MICROSECONDS);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(executorService.isTerminated());
            if (!executorService.isShutdown()) {
                System.out.println("cancel all non-finished ones");

            }
            executorService.shutdownNow();
            System.out.println("Shutdown finished");
        }*/

        Callable<Integer> task = () -> {
          try {
              TimeUnit.SECONDS.sleep(2);
              return 500;
          }catch (InterruptedException e) {
             throw e;
          }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("Future done? "+future.isDone());

        Integer r = future.get(1, TimeUnit.SECONDS);

        System.out.println("Future done? "+future.isDone());
        System.out.println("Future result = "+r);
        executor.shutdownNow();
        r = future.get();
    }
}
