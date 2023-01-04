package zadaca3;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLCreator {

	public void kreiraj(String imeFajl, List<Student> student) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			
			Element root = doc.createElement("Student");
			doc.appendChild(root);
			

			for (int i=0;i<student.size();i++) {
				Element studentElement = doc.createElement("Student");
				root.appendChild(studentElement);
				
				studentElement.setAttribute("id",String.valueOf(i));

				Element ime =  doc.createElement("Ime");
				studentElement.appendChild(ime);

				Element prezime = doc.createElement("Prezime");
				studentElement.appendChild(prezime);

				Element index = doc.createElement("Indeks");
				studentElement.appendChild(indeks);

				ime.appendChild(doc.createTextNode(student.get(i).getIme()));
				prezime.appendChild(doc.createTextNode(student.get(i).getPrezime()));
				index.appendChild(doc.createTextNode(String.valueOf(student.get(i).getIndeks())));
			}
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			DOMSource src = new DOMSource (doc);
			
			StreamResult result = new StreamResult (new File(imeFajl));

			t.transform(src, result);
			
			System.out.println("Kreiran e fajl so ime: "+ imeFajl);

			System.out.println("Zacuvano");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
