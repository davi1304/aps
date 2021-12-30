package exemploFacade;

//Classe auxiliar
public class ComparadorRanking implements Comparable<ComparadorRanking>{

	private String nome;
	private Double pontuação;
	private String Dificuldade;

	public ComparadorRanking(String nome2, Double pontuaçãoreal, String Dificuldade2) {
		setNome(nome2);
		setPontuação(pontuaçãoreal);
		setDificuldade(Dificuldade2);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPontuação() {
		return pontuação;
	}
	public void setPontuação(Double pontuaçãoreal) {
		this.pontuação = pontuaçãoreal;
	}
	public String getDificuldade() {
		return Dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		Dificuldade = dificuldade;
	}

	@Override
	public int compareTo(ComparadorRanking o) {
		if(this.pontuação> o.getPontuação()) {
			return -1;
		}else if(this.pontuação<o.getPontuação()) {
			return 1;
		}else {
		return 0;
		}
	}
	
	
}
