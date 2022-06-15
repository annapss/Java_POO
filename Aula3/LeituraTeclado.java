import java.util.Scanner;
public class LeituraTeclado {
	public static void main(String[] args) {
		System.out.println("Insira seu nome: ");
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Seu nome eh " + linha + " e voce tem " + idade + " anos");
	}
}
