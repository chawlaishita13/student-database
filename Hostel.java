

import java.util.Iterator;

public class Hostel implements Entity_{
		private String hostelNm;
		
		private LinkedList<Student_> studList;
	
		public Hostel(String nm) {
			hostelNm=nm;
			studList=new LinkedList<>();
		
		}
	
	
	public String name() {
		// TODO Auto-generated method stub
		return hostelNm;
	}
	
	public void addStudent(StuData s) {
		studList.add(s);
	}
	
	public LinkedListIterator<Student_> studentList() {
		return studList.positions();
	}
	public LinkedList studentL() {
		return studList;
	}
	
	
	 
}



