package bytebank;

public class Main {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(1,367974);
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Rafael Lima da Silva");
		cliente1.setCpf("304.543.590-47");
		cliente1.setProfissao("Programador");
		
		conta1.setTitular(cliente1);
		conta1.setSaldo(1500);
		
		System.out.println("**********************************");
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Cpf do titular: "+cliente1.getCpf());
		System.out.println("Profissão do titular: "+cliente1.getProfissao());
		System.out.println("---------------------------------");
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Número da conta: "+conta1.getNumero());
		System.out.println("Saldo: "+conta1.getSaldo());
		System.out.println("**********************************");
		
		
		
		Conta conta2 = new Conta(1,325674);
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Lucas Krebs");
		cliente2.setCpf("305.443.520-57");
		cliente2.setProfissao("Engenheiro Mecânico");
		
		conta2.setTitular(cliente1);
		conta2.setSaldo(2500);
		
		System.out.println("**********************************");
		System.out.println("Nome: "+cliente2.getNome());
		System.out.println("Cpf do titular: "+cliente2.getCpf());
		System.out.println("Profissão do titular: "+cliente2.getProfissao());
		System.out.println("---------------------------------");
		System.out.println("Agencia: "+conta2.getAgencia());
		System.out.println("Número da conta: "+conta2.getNumero());
		System.out.println("Saldo: "+conta2.getSaldo());
		System.out.println("**********************************");
		
		conta2.transfere(3000, conta1);
		
		
		
		System.out.println("NOVOS RESULTADOSSSSS");
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Cpf do titular: "+cliente1.getCpf());
		System.out.println("Profissão do titular: "+cliente1.getProfissao());
		System.out.println("---------------------------------");
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Número da conta: "+conta1.getNumero());
		System.out.println("Saldo: "+conta1.getSaldo());
		System.out.println("**********************************");
		
		System.out.println("**********************************");
		System.out.println("Nome: "+cliente2.getNome());
		System.out.println("Cpf do titular: "+cliente2.getCpf());
		System.out.println("Profissão do titular: "+cliente2.getProfissao());
		System.out.println("---------------------------------");
		System.out.println("Agencia: "+conta2.getAgencia());
		System.out.println("Número da conta: "+conta2.getNumero());
		System.out.println("Saldo: "+conta2.getSaldo());
		System.out.println("**********************************");
		
		
		
		
	}

}
