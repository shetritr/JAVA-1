public class Task7 {
	public static void convertInput(int[][] variableNames, String[] students, 
		      String[] courses, int[][] studentCourses, int k) {	
		for (int i = 0; i < variableNames.length; i++) {
			SATSolver.addClauses(Task5.exactlyOne(variableNames[i]));//add the condition exactly one day 

		}
		
		// part 2
		boolean[][] conflicts = Task4.findExamConflicts(variableNames.length, studentCourses);
		for (int i = 0; i < conflicts.length; i++) {
			for (int j = i+1; j < conflicts[i].length; j++) {
                if(conflicts[i][j]){//check if the tests on a same day 
                	SATSolver.addClauses(Task5.notSameDay(variableNames[i],variableNames[j] ));//add the condition not same day.

                }
			}
		}
	}
}
