package bytebank_herdado;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando a bonificação de editor de vídeo");
		return super.getBonificacao() + 100;
	}
	
}
