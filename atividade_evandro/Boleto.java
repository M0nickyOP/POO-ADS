package atividade_evandro;
import java.util.Scanner;

public class Boleto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pago = false;

        do {
            System.out.println("Emitindo boleto de cobrança...");

            System.out.print("O cliente já pagou? (true/false): ");
            pago = sc.nextBoolean();

        } while (!pago);

        System.out.println("Pagamento confirmado! Encerrando emissão de boletos.");
        sc.close();
    }
}

