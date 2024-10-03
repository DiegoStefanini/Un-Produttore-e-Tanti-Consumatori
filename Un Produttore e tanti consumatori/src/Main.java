import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci C: ");
        int nConsumatori = input.nextInt();

        buffer RisorsaCondivisa = new buffer();
        //creo produttore
        produttore prod = new produttore(RisorsaCondivisa);
        Thread a = new Thread(prod);
        a.start();
        for (int i = 0; i != nConsumatori; i++) {
            consumatore cons = new consumatore(RisorsaCondivisa);
            Thread b = new Thread(cons);
            b.start();
        }
    }
}