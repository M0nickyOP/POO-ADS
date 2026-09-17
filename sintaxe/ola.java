import java.util.Scanner
class Main(){

public static void main(String[]args){
String nome;
int idade;
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu nome");
nome = sc.nextLine();
System.out.println("Digite sua idade");
idade = sc.nextInt();

System.out.println("Ola " + nome + "sua idade e" + nome);

}
