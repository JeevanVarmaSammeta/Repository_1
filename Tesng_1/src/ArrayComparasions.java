import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayComparasions {

	public static void main(String[] args) {
		String[] st = { "Jeevan", "Varma", "Jeevan", "Sammeta", "Varma" };
 String th= new String();
		for (int i = 0; i < st.length; i++) {

			for (int j = i + 1; j < st.length; j++) {
				if (st[j] == st[i]) {
					//System.out.println(st[j]);

					th=st[j];
					System.out.println(th);
				}
				//System.out.println(th);
			}
		}
		List<String> Li = new ArrayList<String>();
		
		Li.add("X");
		Li.add("B");
		Li.add("A");
		Li.add("A");
		Li.add("V");
		Li.add("");
		Collections.sort(Li);
		 System.out.println(Li);
		Iterator<String> IT = Li.iterator();
		
		while (IT.hasNext()) {
			String a = IT.next();
			System.out.println("The Strings are:"+""+"" + a);
		}
		ListIterator<String> Lp = Li.listIterator();
		while (Lp.hasNext()) {
			String a = Lp.next();
			System.out.println("The StringsList are:"+""+"" + a);
		}
		while (Lp.hasPrevious()) {
			String b = Lp.previous();
			System.out.println("The list itr:"+""+ b);
		}
		Set<String> SetV= new HashSet<String>();
		String x="";
		SetV.add("X");
		SetV.add("Y");
		SetV.add("Y");
		SetV.add("Z");
		SetV.add(x);
		
		System.out.println("The Set Value :"+SetV);


	}
}
