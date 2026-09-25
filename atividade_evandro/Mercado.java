package atividade_evandro;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args){
        double preco;
        int quant;
        double total;
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o preço do produto");
        preco = sc.nextDouble();
        System.out.print("Digite o preço do produto");
        quant = sc.nextInt();
        total =(double) preco * quant;

        System.out.print("O preço do produto é " + preco + ", a quantidade é " + quant + ", o preco total e " + total);
    }
}
