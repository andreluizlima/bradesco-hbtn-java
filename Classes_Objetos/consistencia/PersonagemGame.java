
public class PersonagemGame {
	private int saudeAtual;
	private String nome;
	private String status;

	public PersonagemGame(int saudeInicial, String nome) {
		this.nome = nome;
		setSaudeAtual(saudeInicial);
	}

	public int getSaudeAtual(){
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual){
		status = saudeAtual > 0 ? "vivo" : "morto";
		this.saudeAtual = saudeAtual;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = (nome == null || nome.isEmpty()) ? this.nome : nome;
	}

	public String getStatus(){
		return status;
	}


	public void tomarDano(int quantidadeDeDano) {
		setSaudeAtual(saudeAtual - quantidadeDeDano  <= 0 ? 0 : saudeAtual - quantidadeDeDano);
	}

	public void receberCura(int quantidadeDeCura) {
		setSaudeAtual(saudeAtual + quantidadeDeCura  >= 100 ? 100 : saudeAtual + quantidadeDeCura);
	}
}
