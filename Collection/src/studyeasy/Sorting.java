package studyeasy;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private int Key;
	private String Value;
	public Data(int key, String value) {
		super();
		Key = key;
		Value = value;
	}
	public int getKey() {
		return Key;
	}
	public String getValue() {
		return Value;
	}
	@Override
	public String toString() {
		return "Data [Key=" + Key + ", Value=" + Value + "]";
	}
	
}

public class Sorting {
	public static void main(String[] args) {
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>(){

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getKey() > o2.getKey()) {
					return -1;
				}else if (o1.getKey() < o2.getKey()) {
					return 1;
				}else 
				return 0;
				
			}
			
		};
		
		Set<Data> data = new TreeSet<>(COMPARE_KEY);
		data.add(new Data(1,"Gautam"));
		data.add(new Data(2,"Rohit"));
		data.add(new Data(6,"Sonu"));
		data.add(new Data(4,"Subham"));
		data.add(new Data(3,"Raju"));
		data.add(new Data(5,"Priya"));
		
		for(Data name : data) {
			System.out.println(name);
		}
		
	}

}
