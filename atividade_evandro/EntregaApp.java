package atividade_evandro;
import java.util.Scanner;

public class EntregaApp {
    public static void main(String[]args) {
        double taxaFixa = 6.00;
        double valorPedido;
        double valorTotal;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do pedido: ");
        valorPedido = sc.nextDouble();
        valorTotal = taxaFixa + valorPedido;
        System.out.print("O valor total do pedido e " + valorTotal);
    }
}
