package ppj;

public class Paczki extends Rodzaj implements Wymiar {

	public Paczki(String rodzaj) {
		setRodzaj(rodzaj);
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public void wysoko��() {
		if (getRodzaj().equals("wysoko��")) {
			
		}
	}
}