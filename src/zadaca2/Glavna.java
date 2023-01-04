package zadaca2;

import java.io.IOException;

public class Glavna {

	public static void main(String[] args) {

		int i;
		String tekst="";
		try {
			System.out.println("Vnesi...");
			while((i = System.in.read()) != 10)
				tekst+=(char)i;
				System.out.println(tekst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
