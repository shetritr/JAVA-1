
public class Task2 {
	public static void printSchedule(int[] schedule, String[] courses) {
		if(check(schedule, courses)){
		 
				for(int i=0;i<=howmany(schedule);i++){
					System.out.print("Day"+" "+i+": ");//print the Day and number 
					int j=1;
					for(int k=0;k<schedule.length;k++){
						if(j==1){
							if(schedule[k]==i){
							System.out.print(courses[k]);//print the courses
							j--;
							}
							}else if(schedule[k]==i){
								System.out.print(", "+ courses[k]);
							}

					}
				System.out.println();
				}

		}
	}




    public static int howmany(int[] schedule) {//function find how many day i have 
	int max=0;
	for(int i=0;i<schedule.length;i++){
		if(max<schedule[i]){
			max=schedule[i];
		}
	}
    return max;
    }
    public static boolean check(int[] schedule,String[] courses) {//function find how many day i have 
	boolean ans =true;
    	if(schedule!=null){
		    if(schedule.length==0){//check if schedule is empty
			      throw new IllegalArgumentException("the schedule array is empty");
		    }
		    if(courses.length==0){//check if courses is empty
			    throw new IllegalArgumentException("the courses array is empty");
		   }
		     if(schedule.length==courses.length){//check if courses and schedule equal 
		     return ans;
		     }else throw new IllegalArgumentException("The length of the two arrays schedule and courses ​​do not equal ");
		
		}else throw new IllegalArgumentException("schedule is null");
    }




}
