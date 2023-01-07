package setup;


public class sDriver extends Thread{

    @Override
    public void run() {
        System.out.println("I am sleeping. Wake me up");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am done with sleeping");

    }
}
