package atividade_evandro;
import java.util.Scanner;

public class HorarioVoo {
    public static void main(String[] args) {
        int voo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o horario do voo");
        voo = sc.nextInt();
        String operadorTernario = (voo > 6 && voo < 18) ? "Diurno" : "Noturno";
        System.out.print(operadorTernario);
    }
}
