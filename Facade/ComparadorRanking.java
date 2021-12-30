package exemploFacade;

//Classe auxiliar
public class ComparadorRanking implements Comparable<ComparadorRanking>{

	private String nome;
	private Double pontua��o;
	private String Dificuldade;

	public ComparadorRanking(String nome2, Double pontua��oreal, String Dificuldade2) {
		setNome(nome2);
		setPontua��o(pontua��oreal);
		setDificuldade(Dificuldade2);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPontua��o() {
		return pontua��o;
	}
	public void setPontua��o(Double pontua��oreal) {
		this.pontua��o = pontua��oreal;
	}
	public String getDificuldade() {
		return Dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		Dificuldade = dificuldade;
	}

	@Override
	public int compareTo(ComparadorRanking o) {
		if(this.pontua��o> o.getPontua��o()) {
			return -1;
		}else if(this.pontua��o<o.getPontua��o()) {
			return 1;
		}else {
		return 0;
		}
	}
	
	
}
