
public class TestaContaSemCliente {

		public static void main(String[] args) {
			
			Conta contaDoLeandro = new Conta();
			
			contaDoLeandro.deposita(1500);
			
			//associar a conta ao cliente
			//na classe conta o atributo "titular" é do tipo cliente 
			contaDoLeandro.titular = new Cliente();
			
			
			System.out.println(contaDoLeandro.getSaldo());

			contaDoLeandro.titular.nome ="Leandro";
			System.out.println(contaDoLeandro.titular.nome);
			
			
		}
}
