package atividade_evandro;
import java.util.Scanner;

public class Energia {
    public static void main(String[]args){
        int consumokWh;
        double valorkWh;
        double valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o consumo de kWh");
        consumokWh = sc.nextInt();
        System.out.print("Digite o valor cobrado por kWh");
        valorkWh = sc.nextDouble();

        valorTotal = (double) valorkWh * consumokWh;

        System.out.print("O valor total da conta e " + valorTotal);
    }
}
