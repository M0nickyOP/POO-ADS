package atividade_evandro;
import java.util.Scanner;
public class Farmacia {
    public static void main(String[] args){
        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome");
        nome = sc.nextLine();
        System.out.print("Digite sua idade");
        idade = sc.nextInt();

        System.out.print("Ola senhor(a) " + nome + ", bem vindo(a) ao Sistema da Farmacia Droga+");
    }
}
