package atividade_evandro;
import java.util.Scanner;

public class PedidoFinanciamento {
    public static void main(String[] args) {
        boolean rendaCliente;
        Scanner sc = new Scanner(System.in);
        System.out.print("A renda do cliente é maior ou igual a 2500?\n");
        rendaCliente = sc.nextBoolean();
        String operador = (rendaCliente) ? "Financiamento aprovado" : "Financiamento negado";
        System.out.print(operador);


    }
    }
