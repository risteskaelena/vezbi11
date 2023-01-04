package zadaca1;

import java.io.IOException;

public class Glavna {

	public static void main(String[] args) throws IOException {

		Datoteka objekt = new Datoteka("fajl.txt");
		objekt.zapis("Zdravo");
		objekt.citaj();
	}

}
