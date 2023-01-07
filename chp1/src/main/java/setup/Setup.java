package setup;

class Setup implements Runnable {
    //

    @Override
    public void run() {
        System.out.println("I am running bro. "+System.currentTimeMillis());
    }
}
