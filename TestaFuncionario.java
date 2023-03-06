package bytebank_herdado;

public class TestaFuncionario {

	public static void main (String[] args){
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("12345678910");
		nico.setSalario(5000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 10;
		
		
	}
}
