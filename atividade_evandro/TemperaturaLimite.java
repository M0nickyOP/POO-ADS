package atividade_evandro;

import java.util.Scanner;

public class TemperaturaLimite {
    public static void main(String[] args) {
        int registro;
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite as temperaturas diarias, digite -100 para encerrar");
        while(true){
            registro = sc.nextInt();
            if(registro == -100){
            break;
            }
            soma = soma + registro;
        }
        System.out.print("O valor total e : "+ soma );
        sc.close();
    }
    }
