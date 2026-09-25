package atividade_evandro;
import java.util.Scanner;

public class Padaria {
    public static void main(String[]args) {
        double troco;
        double valorPago;
        double valorProduto;
        Scanner sc = new Scanner(System.in);
    System.out.print("Bem vindo a padaria do Seu Juninho, digite o valor do produto");
        valorProduto = sc.nextDouble();
        System.out.print("Digite o valor pago");
        valorPago = sc.nextDouble();

        troco = valorPago - valorProduto;

        System.out.print("O troco e " + troco);
    }
}
