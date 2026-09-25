package atividade_evandro;
import java.util.Scanner;

public class IdadeAnos {
    public static void main(String[]args) {
        double idade;
        int idadeInteiro;
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade em anos e meses \n");
        idade = sc.nextDouble();

        idadeInteiro = (int) idade;
        System.out.print("A idade em inteiro e "+ idadeInteiro);
    }
}
