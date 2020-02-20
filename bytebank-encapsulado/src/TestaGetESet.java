
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(2748,14493);

		conta.setNumero(1222);
		System.out.println(conta.getNumero());

		conta.setAgencia(2748);
		System.out.println(conta.getAgencia());

		Cliente Leandro = new Cliente();
		Leandro.setNome("Leandro Marques");
     	System.out.println(Leandro.getNome());

		conta.setTitular(Leandro);
		conta.getTitular().setProfissao("programador");

		System.out.println(Leandro.getProfissao());
		System.out.println(conta.getTitular().getProfissao());

		conta.deposita(1000);
		System.out.println(conta.getTitular().getNome() );
		
		double valorSaque = 1500.0;

		System.out.println(conta.getSaldo());
		
		if(conta.getSaldo() + 1000 >= valorSaque){
		    double novoSaldo = (conta.getSaldo()+ 1000) - valorSaque;
		    conta.setSaldo(novoSaldo);
		}
		
		System.out.println(conta.getSaldo());
		
		
	}
}
