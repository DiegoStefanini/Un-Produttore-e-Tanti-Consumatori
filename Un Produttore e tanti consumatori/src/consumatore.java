public class consumatore implements Runnable{
    private buffer Buffer;
    private int pos, neg;
    private int[] Positivi;
    public consumatore(buffer a) {
        Buffer = a;
        pos = 0;
        neg = 0;
        Positivi = new int[5];
    }

    public void run() {
        int n;
        while (true) {
            if (Buffer.Pieno()) {
                n = Buffer.pop();
                int media = 0;
                if (n != -1025) {
                    if (n > 0) {
                        pos++;
                        if (pos % 5 == 0) {
                            for (int i = 0; i != 5; i++) {
                                media += Positivi[i];
                            }
                            media = media/5;
                            Positivi = new int[5];
                        }
                    } else {
                        neg++;
                    }
                    System.out.println("Ho letto " + neg + " numeri negativi e " + media +" è la media dei numeri positivi" );
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
        }
    }
}
