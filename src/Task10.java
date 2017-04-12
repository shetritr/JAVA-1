public class Task10 {
	public static int[] solveMinDaysETP(String[] students, String[] courses, int[][] studentCourses) {
    int [] ans=new int[0];//Default the ans
    if(Task0.legalData(students, courses, studentCourses, 1)){//check the legality  of the data
    	for (int i = 1; i <= courses.length&&(ans.length==0); i++) {
    		ans=Task9.solveETP(students, courses, studentCourses, i);//k=1 is the first k
		}
    }else throw new IllegalArgumentException("Illegal input");
    return ans;
	}
}
