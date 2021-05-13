import java.util.Collection;
import java.util.Scanner;

public class Pole implements Ukoly {
	Scanner sc = new Scanner(System.in);
	public Ukol[] ukpole;
	
	@Override
	public void pridatUkol(Ukol ukol) {
		for(int i = 0; i< ukpole.length;i++) {
			 ukpole[i].setUkol(ukol.getUkol());
		 }
	}
	@Override
	public Collection najdiUkol(String nazev) {
		for(int i = 0; i< ukpole.length;i++) {
			 if(ukpole[i].getUkol().equals(nazev)) {
				 return (Collection) ukpole[i];
			 }
			 
		 }
		return null;
	}
	
}
