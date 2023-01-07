package setup;


import java.util.concurrent.TimeUnit;

public class Driver {
    //
    public static void main(String[] args) throws InterruptedException {
        sDriver sDriver = new sDriver();
        sDriver.start();
        TimeUnit.SECONDS.sleep(3);
        sDriver.interrupt();
    }
}
