package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private double numero;
	private static int total;
	Cliente titular;
	
	public Conta(int agencia, double numero) {
		if(agencia >=0 && numero >=0) {
			total++;
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("Criou uma conta");
			System.out.println("O total de contas é "+ Conta.total);
		}else {
			System.out.println("Não é possivel criar contas com valor negativo");
			return;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getNumero() {
		return numero;
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	

	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		System.out.println("Não há saldo suficiente para fazer essa transferência");
		return false; //tem um else imaginario ai, os codigos constumam aparecer assim 

	}

}
