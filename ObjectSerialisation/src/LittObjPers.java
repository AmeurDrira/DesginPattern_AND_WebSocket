
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class LittObjPers {

	public static void main(String[] args) {

		Entry e = null;
		FileInputStream f;
		ObjectInputStream s;
		try {
			f = new FileInputStream("/Users/ameur/Downloads/f1.txt");
			s = new ObjectInputStream(f);
			e = (Entry) s.readObject();
			System.out.print(e);
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
