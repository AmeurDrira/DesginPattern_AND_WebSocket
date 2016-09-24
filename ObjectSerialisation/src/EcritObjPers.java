
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class EcritObjPers {

	public static void main(String[] args) {
		Date d = new Date();
		Entry e = new Entry(d, 1, "commentaire 1");
		FileOutputStream f;
		ObjectOutputStream s;
		try {
			f = new FileOutputStream("/Users/ameur/Downloads/f1.txt");
			s = new ObjectOutputStream(f);
			s.writeObject(e);// s�rialisation
			//s.toString();
			System.out.println(s);
			s.close();
			f.close();
		} catch (Exception e2) {
			e2.printStackTrace();

		}
	}
}
