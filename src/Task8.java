public class Task8 {
	public static int[] convertOutput(int[][] variableNames, boolean[] assignment) {
		int[] schedule = new int[variableNames.length];
		for (int i = 0; i < schedule.length; i++) {//count the curses , check which day the test of the cures i 
			for (int j = 0; j < variableNames[i].length; j++) {
				if(assignment[variableNames[i][j]]){//check if the day j is the test day for the cures i
					schedule[i]=j;//put the chosen day in schedule
				}
			}
		}
		return schedule;
	}
}
