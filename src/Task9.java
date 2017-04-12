public class Task9 {
	public static int[] solveETP(String[] students, String[] courses, int[][] studentCourses, int k) {
		int [] ans={};
		if(Task0.legalData(students, courses, studentCourses, k)){//check the legality  of the data
			int nVars=k*courses.length;//number of variables
			SATSolver.init(nVars);
			int [][] variableNames= Task6.variableTable(courses.length,k);//Create the variables 
			Task7.convertInput(variableNames, students, courses, studentCourses, k);
			boolean[] assignment =SATSolver.getSolution();//get the solution from SATSolver
			if(assignment.length==nVars+1){//is the formula sat  length of the boolean array is nVars+1
				int [] schedule=Task8.convertOutput(variableNames, assignment);	
			if(Task3.isLegalSchedule(schedule, students, courses, studentCourses, k)){//check if the schedule legal
				ans=schedule;
			}else throw new AssertionError("An internal error occurred, received illegal schedule");
			}
		}else throw new IllegalArgumentException("Illegal input");
		return ans;
		
	}
}
