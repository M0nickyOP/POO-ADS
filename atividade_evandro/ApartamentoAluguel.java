package atividade_evandro;
import java.util.Scanner;
import java.lang.String;

public class ApartamentoAluguel {
    public static void main(String[] args){
        double valorTotal;
        int colegas;
        double valorIndividual;
        double valorRestante;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do aluguel");
        valorTotal = sc.nextDouble();
        System.out.print("Digite o numero de pessoas do apartamento");
        colegas = sc.nextInt();

        valorIndividual = (double) colegas / valorTotal;
        valorRestante =(double) colegas % valorTotal;

        String formatado = String.format("%.2f", valorIndividual);
        System.out.print(formatado);
        System.out.print("O valor individual e " + formatado + " e o valor que não foi dividido foi" + valorRestante);


    }
}
