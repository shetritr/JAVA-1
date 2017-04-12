public class Task1 {
	public static void printStudentData(String[] students, String[] courses, int[][] studentCourses, int k) {
		if(Task0.legalData(students, courses, studentCourses, k)){//check if the arrays is legal and if the number of days are legal 
			for(int i=0;i<students.length;i++){
				System.out.print(students[i]+": ");//print the name of the students
				for(int j=0;j<studentCourses[i].length;j++){//print the courses
					if (j==0){
						System.out.print(courses[studentCourses[i][j]]);
					}else{
					System.out.print(", "+courses[studentCourses[i][j]]);
					}
					}
			System.out.println("");
			}
		}else{
			throw new IllegalArgumentException("the input is not llegal");
		}
	
	}
}
