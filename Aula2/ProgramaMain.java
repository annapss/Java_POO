
public class ProgramaMain {
	public static void main(String[] args) {
		Cao c = new Cao();
		c.nome = "Bidu";
		c.tamanho = 10f;
		System.out.println("Nome do cao 1: " + c.nome);
		Cao c2 = new Cao();
		c2.nome = "Pluto";
		c2.tamanho = 5f;
		Cao c3 = c; //c3 aponta para o mesmo objeto que c, logo a saida eh a mesma
		System.out.println("Nome do cao 3: " + c3.nome);	
		c3.latir();
	}
}
