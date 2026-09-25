package atividade_evandro;
import java.util.Scanner;

public class DescontoLoja {
    public static void main(String[]args) {
        double valorRoupa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da roupa \n");
        valorRoupa = sc.nextDouble();

        valorRoupa *= 0.90;
        System.out.print("O valor da roupa e " + valorRoupa);

    }
    }
