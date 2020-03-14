package studyeasy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code obj) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = obj.getSectionNo()+obj.getLectureNo();
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	}
	
	
	
}

public class Tree {
	public static void main(String[] args) {
	
	Map<Code, String> student = new TreeMap<>();
	student.put(new Code("S01","L01"), "Gautam");
	student.put(new Code("S02","L02"), "Rahul");
	student.put(new Code("S02","L03"), "Nitish");
	student.put(new Code("S05","L05"), "Tejsvi");
	
	for(Map.Entry<Code, String> entry : student.entrySet()) {
//		System.out.println(entry.getKey()+" "+entry.getValue());
		if (entry.getValue().equals("Gautam")) {
			System.out.println(entry.getKey());
		}
	}
	System.out.println(student.get(new Code("S02","L02") ));
	
	}

}
