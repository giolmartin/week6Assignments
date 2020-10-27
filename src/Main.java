
import acm.program.*;

public class Main extends ConsoleProgram {

	public void run() {
		
		ExpandableArray array = new ExpandableArray();
		
		array.set(5, "Bye");
		array.set(3, "Hello");
		array.set(30, "Growing");
		array.set(19, "is");
		array.set(10, "List");
		
			
		System.out.println(array.get(3));
		System.out.println(array.get(10));
		System.out.println(array.get(19));
		System.out.println(array.get(30));
		System.out.println(array.get(5));
		
		
		
		
		
	}
}
