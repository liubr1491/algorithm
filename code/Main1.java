public class Main1 {

    private boolean stop = false;

    public void run() {
        while (!stop) {
            doSomething();
        }
    }

    private void doSomething() {
        // do something
    }
}