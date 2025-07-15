
public class PersonagemGame {
	private int saudeAtual;
	private String nome;


	public int getSaudeAtual(){
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual){
		this.saudeAtual = saudeAtual;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}


	public void tomarDano(int quantidadeDeDano) {
		saudeAtual = saudeAtual - quantidadeDeDano  <= 0 ? 0 : saudeAtual - quantidadeDeDano;
	}

	public void receberCura(int quantidadeDeCura) {
		saudeAtual = saudeAtual + quantidadeDeCura  >= 100 ? 100 : saudeAtual + quantidadeDeCura;
	}
}
