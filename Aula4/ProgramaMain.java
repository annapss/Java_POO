import java.util.Scanner;
public class ProgramaMain {
	public static double calculaMedia(Aluno [] t)
	{
		/*Funcao que calcula a media das notas de uma turma*/
		double soma = 0;
		for(int i = 0; i < t.length; i++)
		{
			soma += t[i].nota;
		}
		return soma / t.length;
	}
	public static int achaMaior(Aluno [] t, boolean [] p)
	{
		double maior = 0;
		int posicao = 0;
		for(int i = 0; i < t.length; i++)
		{
			if(t[i].nota > maior && p[i] == false)
			{
				maior = t[i].nota;
				posicao = i;
			}
		}
		return posicao;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []x = new int[3]; //declaração de array -> cria array do tipo int
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		
		Cachorro []y = new Cachorro[3]; // declarando array que pode vir a receber objetos do tipo Cachorro
		//o array y comeca com valores NULL em todas as posicoes, logo eh preciso colocar objetos dentro do array
		y[0] = new Cachorro();
		y[1] = new Cachorro();
		y[2] = new Cachorro();
		
		/*Soma dos elementos do array x*/
		int soma = 0;
		for(int i = 0; i < x.length; i++)
		{
			soma += x[i];
		}
		System.out.println(soma);
		
		/*Inserindo objetos no array y*/
		for(int i = 0; i < y.length; i++)
		{
			y[i] = new Cachorro();
			System.out.println("Digite o nome do cachorro " + i + " : ");
			y[i].nome = sc.nextLine();
			System.out.println("Digite o tamanho do cachorro " + i + " : ");
			y[i].tamanho = sc.nextFloat();
			sc.nextLine();
		}
		/*Imprimindo o que está dentro do array y*/
		for(int i = 0; i < y.length; i++)
		{
			System.out.println("O nome do cachorro " + (i + 1) + " eh " + y[i].nome);
			System.out.println("O seu tamanho eh " + y[i].tamanho + '\n');
		}
		
		/*Programa que recebe dados de alunos e 
		 faz a media da turma e os ordena de acordo com a nota - ordem decrescente*/
		Aluno []turma = new Aluno[3];
		for(int i = 0; i < turma.length; i++)
		{
			turma[i] = new Aluno();
			System.out.println("Digite o nome do aluno: ");
			turma[i].nome = sc.next();	
			System.out.println("Digite a nota do aluno: ");
			turma[i].nota = sc.nextDouble();
		}
		System.out.println("A media da turma eh " + calculaMedia(turma));
		Aluno [] turmaOrdenada = new Aluno[3];
		boolean [] passei = new boolean[3];
		int cont = 0;
		while(cont != 3)
		{
			int posicaoMaior = achaMaior(turma, passei);
			turmaOrdenada[cont] = new Aluno();
			turmaOrdenada[cont] = turma[posicaoMaior];
			passei[posicaoMaior] = true;
			cont++;
		}
		for(int i = 0; i < turmaOrdenada.length; i++)
		{
			System.out.println("Nome: " + turmaOrdenada[i].nome);
			System.out.println("Nota: " + turmaOrdenada[i].nota + '\n');
		}
		
	}
}
