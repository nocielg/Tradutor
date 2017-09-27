
public class Tradutor {

	private String traducao;
	
	public void adicionaTraducao(String palavra, String traducao) {
		this.traducao = traducao;
		
	}

	public boolean estaVazio() {
		
		return (traducao==null);
	}

	public Object traduzir(String palavra) {
		return traducao;
	}

}
