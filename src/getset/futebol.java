package getset;

public class futebol {
	private String nomeTime;
	
	
	public String getNomeTime() {
		return nomeTime;
	}


	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}


	public void mostraTime() {
		System.out.printf("seu time é: %s\n ", getNomeTime());
		
	}
}
