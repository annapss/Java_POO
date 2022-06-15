
public class Conta {
	//O private faz com que esses atributos só sejam acessados pela classe Conta
	private String nomeCliente;
	private double saldo;
	public void setSaldo(double val) //set para mudar o valor do atributo
	{
		saldo = val;
	}
	public double getSaldo() // get para pegar o valor do atributo
	{
		return saldo;
	}
	public boolean sacar(double val)
	{
		if(val > saldo)
		{
			return false;
		}
		else
		{
			saldo -= val;
			return true;
		}
	}
	public void depositar(double val)
	{
		saldo += val;
	}
	public void transferir(double val, Conta a)
	{
		if(sacar(val))
		{
			a.depositar(val);
		}
		else
		{
			System.out.println("Voce nao tem saldo suficiente para fazer essa transferencia");
		}
	}
}
