public class buffer {
    private int[] Arr;
    private int Massimo;
    private int i;
    public buffer() {
        i=0;
        Massimo = 100;
        Arr = new int[100];
    }
    public synchronized int push (int add) {
        if (i <Massimo ) {
            Arr[i] = add;
            i++;
            return add;
        } else {
            return -1025;
        }
    }
    public boolean Pieno() {
        if (i >-1) {
            return true;
        } else
            return false;
    }
    public synchronized int pop() {
        if (i > 0) {
            int ritorno = Arr[0];
            int appoggio;
            for (int j = 1; j != i; j++) {
                Arr[j - 1] = Arr[j];
            }
            i--;
            return ritorno;
        } else
            return -1025;
    }
}
