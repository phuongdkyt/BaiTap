package test2;

public class GradeBook {
	  String courseName;
     private static int numberOfGradebook;
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
   public void displayMessage() {
	   System.out.println("Welcome to the grade"+courseName);
   }

public GradeBook() {
	numberOfGradebook++;
}

public GradeBook(String courseName) {
	super();
	this.courseName = courseName;
}

public static int getNumberOfGradebook() {
	return numberOfGradebook;
}




}
