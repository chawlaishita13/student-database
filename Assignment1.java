

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Assignment1 {
	
	static LinkedList<Hostel> allHostels =new LinkedList<>();
	static LinkedList<Course> allCourses =new LinkedList<>();
	static LinkedList<Department> allDepartments =new LinkedList<>();
	static LinkedList<StuData> allStudents=new LinkedList<>();
	public static void sort(String []str) {
		for(int i=0;i<str.length;i++) {
			String temp;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getData(args[0],args[1]);
		  
	     LinkedListIterator<StuData> itr=allStudents.positions();
	     while(itr.hasNext()) {
	    	 
	    	 StuData student=itr.next();
	    	 LinkedListIterator<Hostel> itrh=allHostels.positions();
	    	 LinkedListIterator<Department> itrd=allDepartments.positions();
	    	 LinkedListIterator<Course> itrc;
	    	 
	    	 boolean found=false;
	    	 while(itrh.hasNext()&&found==false) {
	    		 Hostel hostel=itrh.next();
	    		 if(hostel.name().equals(student.hostel())){
	    			 hostel.addStudent(student);
	    			 found=true;
	    		 }
	    	 }
	    	 if(found==false) {
	    		 Hostel h=new Hostel(student.hostel());
	    		 h.addStudent(student);
	    		 allHostels.add(h);
	    	 }
	    	 
	    	 found=false;
	    	 while(itrd.hasNext()&&found==false) {
	    		 Department dept=itrd.next();
	    		 if(dept.name().equals(student.department())){
	    			 dept.addStudent(student);
	    			 found=true;
	    		 }
	    	 }
	    	 if(found==false) {
	    		 Department d=new Department(student.department());
	    		 d.addStudent(student);
	    		 allDepartments.add(d);
	    	 }
	    	 
	    	 found=false;
	    	 LinkedListIterator<CourseGrade> stucourseitr=student.courseList();
	    	 
	    	 while(stucourseitr.hasNext()&&found==false) {
	    		 CourseGrade_ stucourse=stucourseitr.next();
	    		 itrc=allCourses.positions();
	    		 while(itrc.hasNext()) {
	    			 Course course =itrc.next();
	    			 if(course.name().equals(stucourse.coursenum())){
	    				 course.addStudent(student);
	    				 found=true;
	    		 }
	    		 }
	    		 
	    		 if(found==false) {
	    			 Course c=new Course(stucourse.coursenum(),stucourse.coursetitle());
		    		 
		    		 c.addStudent(student);
		    		 allCourses.add(c);
	    		 }
	    	 }
	    	
	    		 
	    	 
	    	 
	    	 
			 
	     }
	  answerQueries(args[2]);
		
		
		

	}
	
	private static void getData(String f1,String f2) throws IOException {
		  BufferedReader br = new BufferedReader (new FileReader(f1));
		 
		  String s=br.readLine();
		  
	     while(s!=null)
	     {
	    	 String words[]=s.split(" ");
	    	 StuData student=new StuData(words[0],words[1],words[2],words[3]);
	    	 allStudents.add(student);
	    	 
	    	 BufferedReader br1=new BufferedReader(new FileReader(f2));
	    	 String s1=br1.readLine();
	    	 
	    	 while(s1!=null) {
	    		 String words1[]=s1.split(" ",4);
	    		 if(words1[0].equals(student.entryNo())) {
	    			 GradeInfo_.LetterGrade lg=GradeInfo_.LetterGrade.valueOf(words1[2]);
	    			 CourseGrade courseg=new CourseGrade(words1[3],words1[1],lg);
	    			 student.addCourse(courseg);
	    		
	    			 }
	    		 
	    		 s1=br1.readLine();
	    	 }
	    	 
	    	 s=br.readLine();
	     }
	     
	     LinkedListIterator<StuData> itr=allStudents.positions();
	     while(itr.hasNext()) {
	    	 StuData student=itr.next();
			 LinkedListIterator<CourseGrade> itr1=student.courseList();
			 int gra = 0;
			 int creds = 0;
			 while(itr1.hasNext()) {
				 gra += 3*(GradeInfo_.gradepoint((itr1.next()).grade()));
				 creds+=3;
			 }
			 float cg =(float) gra/creds;
			
			 String calculatedCg=String.format("%.2f", cg);
			 student.cgpa=calculatedCg;
			 
			 
	     }
		br.close();
		
	}
	
	
	public static void answerQueries(String f3) throws IOException{
		BufferedReader br = new BufferedReader (new FileReader(f3));
		 String a=br.readLine();
		 LinkedList<String> query=new LinkedList<>();
		 while(a!=null) {
			 query.add(a);
			 a=br.readLine();
		 }
		 
	     LinkedListIterator<String> q=query.positions();
	     while(q.hasNext())
	     {
	    	 String s=q.next();
	    	 String words[]=s.split(" ");
	    	 if(words[0].equals("INFO")) {
	    		 LinkedListIterator<StuData> itr=allStudents.positions();
	    	     while(itr.hasNext()) {
	    	    	 StuData student=itr.next();
	    	    	 if(student.entryNo().equals(words[1])) {
	    	    		 System.out.print(student.entryNo()+" ");
	    	    		 System.out.print(student.name()+" ");
	    	    		 System.out.print(student.department()+" ");
	    	    		 System.out.print(student.hostel()+" ");
	    	    		 System.out.print(student.cgpa()+" ");
	    	    		 LinkedListIterator<CourseGrade> stucourseitr=student.courseList();
	    		    	 int c=student.courseL().count();
	    		    	 String arr[]=new String[c];
	    		    	 int i=0;
	    		    	 while(stucourseitr.hasNext()) {
	    		    		 CourseGrade stucourse=stucourseitr.next();
	    		    		 
	    		    		 String k=stucourse.coursenum()+" "+stucourse.grade();
	    		    		 arr[i]=k;
	    		    		 i++;
	    		    		
	    		    	 }
	    		    	 sort(arr);
	    		    	 for (int j=0;j<arr.length;j++) {
	    		    		 System.out.print(arr[j]+" ");
	    		    	 }
	    	    	 }
	    	     }
	    	 }
	    	 
	    	 else if(words[0].equals("COURSETITLE")) {
	    		 LinkedListIterator<Course> itr=allCourses.positions();
	    		 while(itr.hasNext()) {
	    			 Course course=itr.next();
	    			 if(course.name().equals(words[1])) {
	    				 System.out.print(course.coursenm());
	    				 break;
	    			 }
	    		 }
	    		 
	    	 }
	    	 
	    	 else if(words[0].equals("SHARE")) {
	    		 boolean b=false;
	    		 LinkedListIterator<Hostel> hostelitr=allHostels.positions();
	    	    		 while(hostelitr.hasNext()) {
	    	    			 Hostel hostel=hostelitr.next();
	    	    			 if(hostel.name().equals(words[2])) {
	    	    				 LinkedListIterator<Student_> stuitr=hostel.studentList();
	    	    				 int i=0;
	    	    				 String arrh[]=new String[hostel.studentL().count()-1];
	    	    				 while(stuitr.hasNext()) {
	    	    					 String stu=(stuitr.next()).entryNo();
	    	    					if(!stu.equals(words[1])) {
	    	    						arrh[i]=stu;
	    	    					    i++;
	    	    					}
	    	    				 }
	    	    				 sort(arrh);
	    	    		    	 for (int j=0;j<arrh.length;j++) {
	    	    		    		 System.out.print(arrh[j]+" ");
	    	    		    	 }
	    	    				 b=true;
	    	    				 break;
	    	    				 
	    	    			 }
	    	    		 }
	    	    if(b==false) {
	    	    	LinkedListIterator<Department> deptitr=allDepartments.positions();
   	    		 while(deptitr.hasNext()) {
   	    			Department dept=deptitr.next();
   	    			 if(dept.name().equals(words[2])) {
   	    				 LinkedListIterator<Student_> stuitr=dept.studentList();
   	    				int i=0;
	    				 String arrd[]=new String[dept.deptL().count()-1];
	    				 while(stuitr.hasNext()) {
	    					 String stu=(stuitr.next()).entryNo();
	    					if(!stu.equals(words[1])) {
	    						arrd[i]=stu;
	    					    i++;
	    					}
	    				 }
	    				 sort(arrd);
	    		    	 for (int j=0;j<arrd.length;j++) {
	    		    		 System.out.print(arrd[j]+" ");
	    		    	 }
   	    				 b=true;
   	    				 break;
   	    				 
   	    			 }
   	    		 }
	    	    		 
	    	}
	    	    
	    	    if(b==false) {
	    	    	LinkedListIterator<Course> crsitr=allCourses.positions();
	   	    		 while(crsitr.hasNext()) {
	   	    			Course crs=crsitr.next();
	   	    			 if(crs.name().equals(words[2])) {
	   	    				 LinkedListIterator<Student_> stuitr=crs.studentList();
	   	    				int i=0;
   	    				 String arrc[]=new String[crs.courseL().count()-1];
   	    				 while(stuitr.hasNext()) {
   	    					 String stu=(stuitr.next()).entryNo();
   	    					if(!stu.equals(words[1])) {
   	    						arrc[i]=stu;
   	    					    i++;
   	    					}
   	    				 }
   	    				 sort(arrc);
   	    		    	 for (int j=0;j<arrc.length;j++) {
   	    		    		 System.out.print(arrc[j]+" ");
   	    		    	 }
	   	    				 b=true;
	   	    				 break;
	   	    				 
	   	    			 }
	   	    		 }
	    	    	
	    	    }
	    	 }
	    	 
	    	 
	    	 System.out.println();
	    	
	    	 
	    	 
	     }
		
		
		
	}
	
	
		
	
}
