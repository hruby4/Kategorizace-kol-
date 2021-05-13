
public class Ukol {
	private String ukol;
	private Priorita priorita;

	public Ukol(String ukol,Priorita priorita) {
		this.priorita=priorita;
		this.ukol=ukol;
		
		
	}

	public String getUkol() { //získání úkolu
		return ukol;
	}

	public void setUkol(String ukol) {  //nastaveni ukolu
		this.ukol = ukol;  
	}

	

}
