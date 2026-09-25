package atividade_evandro;

import java.util.Scanner;

public class CinemaIdoso {
    public static void main(String[] args){
        boolean socioCinema;
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("É socio do cinema?");
        socioCinema = sc.nextBoolean();
        System.out.print("Qual sua idade?");
        idade = sc.nextInt();

        if(socioCinema || idade > 60) {
            System.out.print("Elegivel para desconto");
        }else{
            System.out.print("Não elegivel para desconto");
        }
    }
}
