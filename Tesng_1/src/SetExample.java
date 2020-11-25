import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> St = new HashSet<String>();
		List<String> Lt = new ArrayList<String>();
		St.add("Apple");
		St.add("Ball");
		St.add("Apple");
		St.add("Ball");
		St.add("Cat");
	//Iterator<String> Iter= St.iterator();
	
		Lt.add("Apple");
		Lt.add("Ball");
		Lt.add("Apple");
		Lt.add("Ball");
		Lt.add("Cat");
		System.out.println("The Set Elem:" + St);
		System.out.println("The List Elem:" + Lt);
		

	}

}
