public class Task4 {
	public static boolean[][] findExamConflicts(int m, int[][] studentCourses) {
		boolean[][] table = new boolean[m][m];
		for (int i = 0; i <studentCourses.length; i++) {//Choose student 
			for (int j = 0; j < studentCourses[i].length; j++) {//the row
				for (int j2 = 0; j2 <studentCourses[i].length ; j2++) {//the col
					if(studentCourses[i][j]==studentCourses[i][j2]){
						table[studentCourses[i][j]][studentCourses[i][j2]]=false;
					}else{
						table[studentCourses[i][j]][studentCourses[i][j2]]=true;
					}
					
						
				}
				
			}
			
		}
		return table;
	}
}
