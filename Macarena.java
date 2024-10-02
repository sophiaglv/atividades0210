package atividadeRobo;

public class Macarena {
	private String nome;
	private String musica;
	private int complexidade;
	private int velocidade;
	
	public Macarena(String nome, String musica, int complexidade, int velocidade){
		this.nome = nome;
		this.musica = musica;
		this.complexidade = complexidade;
		this.velocidade = velocidade;
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

	public int getComplexidade() {
		return complexidade;
	}

	public void setComplexidade(int complexidade) {
		this.complexidade = complexidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
	
}
