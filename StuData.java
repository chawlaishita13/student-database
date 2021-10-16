

import java.util.Iterator;

public class StuData implements Student_ {
	private String nm;
	private String entno;
	private String hostelnm;
	private String dept;
	private String comCred;
	public String cgpa;
	private LinkedList<CourseGrade> courseList;
	
	
	public StuData(String entryNo,String name,String department,String hostelName) {
		nm=name;
		entno=entryNo;
		hostelnm=hostelName;
		dept=department;
		
		courseList=new LinkedList<CourseGrade>();
		
	}
		public String name() {
			return nm;
		}
	
	  public String entryNo() {
		  return entno;
	  }
	   public String hostel() {
		   return hostelnm;// Returns student's hostel name
	   }
	   public String department() {
		   return dept;// Returns student's department name
	   }
	   public String completedCredits() {
		   return comCred;// Returns student's credits earned
	   }
	   
	   public void addCourse(CourseGrade cg) {
		   courseList.add(cg);
	   }

	public String cgpa() {
		return cgpa;
	}
	
	public LinkedListIterator<CourseGrade> courseList() {
		return courseList.positions();
	}
	 
	public LinkedList courseL() {
		return courseList;
	}
	

	
	

}
