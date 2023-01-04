package zadaca3;

public class Student {

	private String ime;
	private String prezime;
	private int indeks;
	
	public Student(String ime, String prezime, int indeks) {
		this.ime = ime;
		this.prezime = prezime;
		this.indeks = indeks;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getIndeks() {
		return indeks;
	}

	public void setIndeks(int indeks) {
		this.indeks = indeks;
	}
	
}
