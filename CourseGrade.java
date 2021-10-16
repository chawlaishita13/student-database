

public class CourseGrade implements CourseGrade_{
	String coursetitle;
	String coursenum;
	GradeInfo_.LetterGrade grade;
	GradeInfo_ gradei;
	
	public CourseGrade(String title,String num,GradeInfo_.LetterGrade g) {
		coursetitle=title;
		coursenum=num;
		grade=g;
		
	}
	

	public String coursetitle() {
		return coursetitle;
		
	}

	public String coursenum() {
		return coursenum;
	}
	
	

	public GradeInfo_.LetterGrade grade() {
		return grade;
	}

	public GradeInfo_ gradei() {
		return gradei;
	}
	

}
