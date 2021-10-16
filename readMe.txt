

-> class pos:
 * value(): returns the value stored in this position.
 * after(): returns the next position of the linked list.
 
-> class LinkedList:
 * count(): returns the size of the linked list.
 * add(): adds an element of type T to the linked list and returns its position.
 * positions(): returns an object of class LinkedListIterator which has the functions hasNext() and next() which are used for traversing the list.
 
-> class LinkedListIterator:
 * hasNext(): returns true when current element is not null.
 * next(): returns current value and then moves to the next position in the list.

-> class StuData implements Student_:
 * name(): returns name of the student.
 * entryNo(): returns entry no. of the student.
 * hostel(): returns hostel of the student.
 * department(): returns department of the student.
 * completedCredits(): calculates the total credits completed by student.
 * cgpa(): calculates the cgpa of the student and rounds off upto two decimal places.
 * courseList(): returns iterator of the list of courses of that student.
 * courseL(): returns courselist of students.

-> class CourseGrade  implements CourseGrade_ :
 *coursetitle(): returns course title
 *coursenum():returns course number
 *grade():returns grade of that course
 
-> classes Hostel, Department, Course implement Entity_ : 
 *name(): returns the name of the entity.
 *studentList(): returns iterator of list of students that share that particular entity name.It helps us traverse the list of students.

-> class Assignment 1
 *getData(): It takes Student File(file 1) and Course File(file 2) as arguments.

 *answerQueries(): It takes Query File(file 3) as argument.
  It reads file 3 and stores each line in a linked list(allQueries). Then allQueries is traversed and queries are resolved.
  INFO-
  allHostels list is traversed and student with the required name or entry number is searched and all its details are printed( Entry number, Name, Department, Hostel, CGPA, and the course-numbers of all courses taken with the obtained grades in each). 
  The course numbers are sorted lexicographically by using an object of class SortArray.
  SHARE-
  entityname is searched in allHostels, allCourses, allDepartments. In whichever linked list entityname is found all the entry numbers of its studentList are printed.( Entry numbers are sorted lexicographically by using an object of class SortArray)
  COURSETITLE-
  Coursenumber is searched in allCourses list. Then using any student of the studentList of that course, coursetitle is printed.
 
 *main(): getData() and answerQueries() are called. 

 *sort(): sorts the given array in increasing order and prints the array.

