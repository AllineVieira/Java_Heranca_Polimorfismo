package bytebank_herdado;

public class TestaFuncionario {

	public static void main (String[] args){
		
		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("12345678910");
		nico.setSalario(5000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 10;
		
		
	}
}
