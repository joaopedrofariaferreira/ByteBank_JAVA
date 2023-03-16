package bytebank;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(15,75);
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente joao = new Cliente();
		joao.setNome("Joao Pedro de Faria Ferreira");
		
		conta.setTitular(joao);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador backend");
		
	}

}
