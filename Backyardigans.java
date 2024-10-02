package atividadeRobo;

public class Backyardigans {
	private String nome;
	private String musica;
	private String duracao;
	
	public Backyardigans(String nome, String musica, String duracao){
		this.nome = nome;
		this.musica = musica;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
}
