package atividade_evandro;

import java.util.Scanner;

public class Velocidade {
    public static void main(String[]args){
        int limiteVelocidade = 60;
        int velocidadeCarro;
        boolean limite;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro");
        velocidadeCarro = sc.nextInt();

        if (velocidadeCarro > limiteVelocidade){
            limite = true;
        }else{
            limite = false;
        }
        System.out.print( "O carro ultrapassou o limite?" +limite);

    }
    }
