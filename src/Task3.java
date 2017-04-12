public class Task3 {
	public static boolean checkday(int[] schedul,int k){//check the day of courses test
		boolean ans =true;
		for(int i=0;i<schedul.length&&ans;i++){
			if(schedul[i]>=k||schedul[i]<0){
				ans =false;
			}
		}
	return ans;
	}

	public static int [] [] dayarray(int[] schedule,int k){//this function return new array with all test in a specific day   
		int [] [] ans =new int [k][];//the size of the 1-dim is the number of day
		int t; 
		for(int i=0;i<k;i++){
			t=0;
			for(int j=0;j<schedule.length;j++){//count the number of courses in a day
				if(schedule[j]==i){
					t++;
				}
			}
		ans[i]=new int [t];
		}
		for(int i=0;i<ans.length;i++){
			t=0;
			for(int j=0;j<schedule.length;j++){//Creates the 2-dim of the array 
				if(schedule[j]==i){
					ans[i][t]=j;
					t++;
				}
			}
		}
	
	return ans;
	}
	public static boolean studenttest(int[] student,int [] day){//check if the student test 2 tests in one day 
		boolean ans =true;
		int count =0;
		boolean tamp =true;
		for(int i=0;i<day.length&&count<2;i++){
			tamp =true;
			for(int j=0;j<student.length&&tamp;j++){
				if(student[j]==day[i]){
					count++;
					tamp=false;
				}
			}
		}
	if(count>1){
		ans=false;
	}
	return ans;
	}

	public static boolean isLegalSchedule(int[] schedule, String[] students, 
			String[] courses, int[][] studentCourses, int k) {
		  boolean ans =true;
		  if(checkday(schedule, k)){//check the legality 
			int [] [] days=dayarray(schedule,k);//call function
			for (int i = 0; i < days.length&&ans; i++) {
				for (int j = 0; j < studentCourses.length&&ans; j++) {
					ans=studenttest(studentCourses[j], days[i]);//call function
				}
			}
			  
		  }
	return ans;
	}
	public static int[] findConflictingStudent(int[] schedule, String[] students, 
			String[] courses, int[][] studentCourses, int k) {//find the courses as in a same day
		int [] ans=new int [0];
		boolean tamp =true;
		int [] [] days=dayarray(schedule,k);//call function
		for (int i = 0; i < days.length&&tamp; i++) {
			for (int j = 0; j < studentCourses.length&&tamp; j++) {
				tamp=studenttest(studentCourses[j], days[i]);//call function
				if (!tamp){//if we have in a same day two tests
					ans=new int [4];
					ans[0]=i;
					ans[1]=j;
					int count=0;
					for (int j2 = 0; j2 < studentCourses[j].length&&count<2; j2++) {
						for (int l = 0; l < days[i].length; l++) {
							if(studentCourses[j][j2]==days[i][l]){//find the number of the courses
								ans[count+2]=studentCourses[j][j2];
							count++;
							}
						}
					}
				}
			}
		}
	return ans;
	}
	public static void printConflictingStudent(int[] schedule, String[] students, 
			String[] courses, int[][] studentCourses, int k) {
		if(!isLegalSchedule(schedule, students, courses, studentCourses, k)){//check legality 
			int [] arr = findConflictingStudent(schedule, students, courses, studentCourses, k);// call function
		System.out.println(students[arr[1]]+" "+"cannot take exams in "+courses[arr[2]]+" and "+courses[arr[3]]+" as scheduled on day "+arr[0]);
		}
	}
}
