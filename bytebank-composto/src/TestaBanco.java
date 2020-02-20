
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente leandro = new Cliente();
		leandro.nome = "Leandro Marques";
		leandro.cpf ="111.222.333-44";
		leandro.profissao = "programador";
		
		Conta contaLeandro = new Conta();
		contaLeandro.agencia = 2748;
		contaLeandro.numero = 14493;
		contaLeandro.deposita(10);
		
		contaLeandro.titular = leandro;
		
		System.out.println(contaLeandro.titular.nome );
		System.out.println(contaLeandro.titular.profissao );
		System.out.println(contaLeandro.titular.cpf );
	}
}
