package zadaca3;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		
		XMLCreator objekt = new XMLCreator();
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Franc", "Kafka", 876));
		student.add(new Student("Albert", "Kami", 1005));
		objekt.kreiraj("fajl.xml", student);
	}

}
