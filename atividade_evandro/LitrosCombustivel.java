package atividade_evandro;
import java.util.Scanner;

public class LitrosCombustivel {
    public static void main(String[] args){
        int tanqueCarro;
        int quantidadeCombustivel;
        int litrosFaltam;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a capacidade do tanque do carro");
        tanqueCarro = sc.nextInt();
        System.out.print("Quantidade de litros que ainda faltam");
        quantidadeCombustivel = sc.nextInt();

        litrosFaltam = tanqueCarro - quantidadeCombustivel;

        System.out.print("Os litros que faltam sao"+ litrosFaltam);


    }
}
