

import java.util.Iterator;

public class Course implements Entity_{
	private String courseNum;
	private String courseName;
	private LinkedList<Student_> studList;

	public Course(String num,String name) {
		courseNum=num;
		courseName=name;
		studList=new LinkedList<>();
	
	}

	public String coursenm() {
		return courseName;
}
public String name() {
	// TODO Auto-generated method stub
	return courseNum;
}

public void addStudent(StuData s) {
	studList.add(s);
}

public LinkedListIterator<Student_> studentList() {
	return studList.positions();
}

public LinkedList courseL() {
	return studList;
}

 
}


