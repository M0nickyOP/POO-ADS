package atividade_evandro;

import java.util.Scanner;

public class PesoEmbalagem {
    public static void main(String[] args) {
        byte embalagem1 = 100;
        byte embalagem2 = 120;
        int soma;
        Scanner sc = new Scanner(System.in);

        soma = (int) embalagem1 + embalagem2;
        System.out.print(soma);
    }
}
