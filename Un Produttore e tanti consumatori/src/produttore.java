public class produttore implements Runnable{
    private buffer Buffer;

    public produttore(buffer a) {
        Buffer = a;
    }

    public void run() {
        int x, t;
        while (true) {
            x = (int)(Math.random() * 2048) - 1024;
            t = 200;
            if (x > 0)
                t = (int) (x/100*50);
            Buffer.push(x);
            try {
                Thread.sleep(t);
            } catch (InterruptedException e) {}
        }
    }
}
