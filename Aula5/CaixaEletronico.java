import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c = new Conta();
		Conta d = new Conta();
		System.out.println("Forneca o valor inicial da sua conta:");
		double valor = sc.nextDouble();
		c.setSaldo(valor);
		System.out.println("Digite o valor que deseja transferir:");
		valor = sc.nextDouble();
		c.transferir(valor, d);
		System.out.println("O saldo da conta d eh " + d.getSaldo());
	}
}
