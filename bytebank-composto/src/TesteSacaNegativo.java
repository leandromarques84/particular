
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
	
		Conta conta = new Conta();
		
		conta.deposita(200);
		
		conta.saca(300);
		System.out.println(conta.getSaldo());
		System.out.println();
		
		 
		
	}
}
