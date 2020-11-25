import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> Ar = new ArrayList<String>();
		Ar.add("Apple");
		Ar.add("Ball");
		Ar.add("Pineapple");
		Ar.add("Cat");
		Ar.add("");
		Collections.sort(Ar);
		// System.out.println(Ar);
		Ar.remove("Apple");
		// System.out.println(Ar);
		Iterator<String> IT = Ar.iterator();

		while (IT.hasNext()) {
			String s = IT.next();
			//System.out.println(" the elemnt is :" + s);
		}
		ListIterator<String> LIT = Ar.listIterator();
		while (LIT.hasNext()) {
			String b = LIT.next();
			//System.out.println(b);
		}
		while (LIT.hasPrevious()) {
			String c = LIT.previous();
			System.out.println(c);
		}
		
	}

}
