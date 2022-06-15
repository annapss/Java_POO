
public class ProgramaMain {
	public static void main(String[] args) {
		/*Casting*/
		short j = 10;
		//byte b = (byte) i; // byte b = 130 -> não podemos fazer isso
		//byte -110 até 128; Não podemos colocar uma variável que tem um tipo maior dentro de uma que tem um tipo menor
		long cpf = 16957516752L; //temos que colocar o L pois o Java entende o numero como um int
		byte b = 10;
		byte c = 10;
		byte d = (byte)(b + c); //toda vez que uma soma for feita, o resultado é um int. Então, tem que passar pra byte
		System.out.println(d);
		
		/*Incremento*/
		int w = 5;
		int f = 5;
		int x = w++; //-> atribui o valor de w a x e depois incrementa o w -> w = 6, x = 5
		int t = ++f; //-> incrementa o valor de f e depois atribui o valor de t a w -> f = 6, t = 6
		
		/*Usando loops*/
		for(int i = 0; i < 10; i++) {
			System.out.println("rodada " + i);
		}
		for(int i = 0; i < 10; i++)
		{
			if(i == 3)
			{
				continue;
			}
			System.out.println(i);
		}
		int cont = 1;
		while(cont < 10)
		{
			int y = cont;
			cont++;
		}
	}
}
