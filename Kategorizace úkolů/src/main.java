
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nazev = "Umyt se";
		Priorita dalNal = Priorita.DULEZITE_NALEHAVE;
		Priorita dulNenal = Priorita.DULEZITE_NENALEHAVE;
		Priorita Nal = Priorita.NEDULEZITE_NALEHAVE;
		Priorita Nenal = Priorita.NEDULEZITE_NENALEHAVE;
		Ukol uk1 = new Ukol("Umyt se", Nal);
		Pole p1 = new Pole();
		p1.pridatUkol(uk1);
		p1.najdiUkol(nazev);
		
		
	}

}
