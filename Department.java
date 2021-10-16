

import java.util.Iterator;

public class Department implements Entity_{
	private String deptNm;
	
	private LinkedList<Student_> studList;

	public Department(String nm) {
		deptNm=nm;
		studList=new LinkedList<>();
	
	}


public String name() {
	// TODO Auto-generated method stub
	return deptNm;
}

public void addStudent(StuData s) {
	studList.add(s);
}

public LinkedListIterator<Student_> studentList() {
	return studList.positions();
}

public LinkedList deptL() {
	return studList;
}

 
}

