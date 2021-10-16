

public interface GradeInfo_ {
	
		   enum LetterGrade {
			A, Aminus, B, Bminus, C, Cminus, D, E, F, I; 
		   } // I is the place-holder grade for the current semester, where grade has not been earned yet 
		   public static int gradepoint(GradeInfo_.LetterGrade grade) {
			   switch(grade) {
			   case A: return 10;
			   case Aminus:return 9;
			   case B:return 8;
			   case Bminus:return 7;
			   case C:return 6;
			   case Cminus: return 5;
			   case D:return 4;
			   case E: return 3;
			   case F:return 2;
			   case I: return 0;
			   default:return 0;
			   }
		   }
		}

