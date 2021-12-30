package exemploFacade;
import java.util.ArrayList;

//Classe fachada
public class AbrirRanking{
	
	private String URL = "exemploRanking.txt";
    private int[] posi�oes = new int[40];
	private ArrayList<ComparadorRanking> ranking;
	
	public AbrirRanking() {
		ranking = new ArrayList<ComparadorRanking>();
		this.abrirRanking();
	}

	public void abrirRanking() {
	
		ArrayList<String> strings = new ArrayList<String>();
		getDelimitadores(URL,0,'-');
		String u = "";
		String pontua��o="";
		String dificuldade="";
		Double pontua��oreal = 0.0;
		int tamanho = 0;
		
			for(int x=0;x<posi�oes.length;x++) {
				if(posi�oes[x]!=0) {
					tamanho++;
					}
				}
			for(int x=0;x<tamanho;x++) {
				if(x==0) {
					u = new AbrirArquivotexto(URL).ler().substring(0, posi�oes[x]);  //Uso da classe "fachada" "AbrirArquivotexto"
				}
					else {
						u= new AbrirArquivotexto(URL).ler().substring(posi�oes[x-1]+1, posi�oes[x]);
					}
					strings.add(u);
				}
				int i=0;
			for(int x=0;x<strings.size();x++) {
				if(x==0 ||x==i*4) {
					u = strings.get(x);
				} else if (x==1 ||x==i*4+1) {
						pontua��o = strings.get(x);
					} else if (x==2||x==i*4+2) {
						dificuldade = strings.get(x);
				}else {
					
					pontua��oreal = Double.valueOf(pontua��o);
					ComparadorRanking c1 = new ComparadorRanking(u, pontua��oreal,dificuldade);
					ranking.add(c1);
					i++;
				}
			}	
		}
	
	
	 public void ler() {
		 for(int z = 0; z<ranking.size(); z++) {
				System.out.println(ranking.get(z).getNome()+" - "+ranking.get(z).getPontua��o()+" | "+ranking.get(z).getDificuldade());
			}
	 }
	
		public void getDelimitadores(String url, int b, char chs) {
			String aux = new AbrirArquivotexto(url).ler();
			int c = 0 ;
			for (int i=b;i<aux.length();i++) {
				if(aux.charAt(i)== chs) {
					posi�oes [c] = i;
					c++;
			}
		}
	}
}

