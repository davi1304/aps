package exemploFacade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Classe fachada
public class AbrirArquivotexto {
	
	private String url;
	
	public AbrirArquivotexto(String url) {
		this.url = url;
	}
	

	public String ler() {
		
		String retorno = "";
		
		try {
			FileReader arq = new FileReader(this.url);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			while(linha != null) {
				
					linha = lerArq.readLine();
					retorno += linha;
					linha = lerArq.readLine();
					
				}
				arq.close();
				
				} catch (IOException e) {
					
				retorno = "Erro: Não foi possível ler o arquivo";
				}
		if(retorno.contains("Erro")) {
			return "";
		}
		else {
			return retorno;
		}
}
	
	public void escrever(String text) {
		
		try {
			FileWriter arq2 = new FileWriter(this.url);
			PrintWriter gravarArq = new PrintWriter(arq2);
			gravarArq.print(text);
			gravarArq.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void copiar(String url) {
		AbrirArquivotexto aux = new AbrirArquivotexto(url);
		aux.escrever(this.ler());
	}
}
