package zadaca1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datoteka {

	public String ime;
	public FileInputStream vlez;
	public FileOutputStream izlez;

	public Datoteka(String ime) {
		this.ime = ime;
	}
	
	public void zapis(String tekst) throws IOException {
		izlez=new FileOutputStream(ime);
		for(int i=0; i<tekst.length(); i++) {
			izlez.write(tekst.charAt(i));
		}
	}
	
	public void citaj() throws IOException {
		vlez= new FileInputStream(ime);
		int x;
		while ((x=vlez.read()) != -1) {
			System.out.print((char) x);
		}
		vlez.close();
	}
	
}
