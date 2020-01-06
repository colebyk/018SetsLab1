import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes {
	
	Set<String> set;
	String[] array;
	int j = 0;
	
	public UniquesDupes() {
		array = "a b c d e f g h a b c d e f g h i j k".split(" ");
		
	}
	
	public void findUniques() {
		System.out.println("Original List: a b c d e f g h a b c d e f g h i j k");
		set = new TreeSet<String>(Arrays.asList(array));
		System.out.println("Uniques: " + set);
	}
	
	public void findDupes() {
		ArrayList<String> dupes = new ArrayList<>();
		int count = 0;
		String current;
		Iterator<String> it = set.iterator();
		for (int i = 0; i< set.size(); i++) {
			count = 0;
			current = it.next();
			for (j = 0; j < array.length; j++) {
				if (array[j].equals(current)) {
					count+=1;
				}
			}
			if (count > 1) {
				dupes.add(current);
			}
		}
		System.out.println("Duplicates: " + dupes);
	}

}
