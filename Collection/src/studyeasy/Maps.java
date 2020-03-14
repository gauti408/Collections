package studyeasy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		
		student.put(1,"Gautam");
		student.put(2,"abhi");
		student.put(3,"ani");
		student.put(6,"nagu");
		student.put(5,"debu");
		student.put(4,"Alok");
		student.put(2, "hagdg");
		System.out.println(student.get(2));
		for(Map.Entry<Integer,String> entry : student.entrySet()){
		    System.out.println(entry);
		}
		System.out.println("**************");
		for(Integer key : student.keySet()) {
			System.out.println(key+" "+student.get(key));
		}
		System.out.println("**************");
		Iterator<Entry<Integer,String>> entry =student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer,String> temp = entry.next();
			System.out.println(temp.getKey()+" "+ temp.getValue());
		}
	}

}
