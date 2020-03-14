package studyeasy;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Gautam");
		set.add("Rahul");
		set.add("Nitish");
		set.add("Afiya");
		set.add("Mia");
		set.add("Rounak");
		
		for(String name : set) {
			System.out.println(name);
		}
		System.out.println(set.contains("Mia"));
		

	}

}
