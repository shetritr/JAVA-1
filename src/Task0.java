public class Task0 {
	public static boolean same(String[] list){   //function ,this function check 3 things 1) if  list[i]=null 2)if list[i] is empty string 3)if We have two similar strings.and if one of them is true the function return false
		boolean ans=true;
		for(int i=0;i<list.length&&ans;i++ ){
			if(list[i]!=null&&list[i]!=""){//check if the string is null or empty
		       for(int j=i+1;j<list.length&&ans;j++){
			    if(list[j]!=null){//check if the next is null
				    ans=!(list[i]==list[j]);//check if we have same string in different indexes 
			    }else{
				    ans=false; 
			     }
	           }
			}else ans=false;
		}
	    
	return ans;
	}
	public static boolean same(int[] list,int num){//this function return true if we have in studentCourses integer not in the field between 0<i<number of Courses and if someone register for the same course twice or more
		boolean ans=true;
		for(int i=0;i<list.length&&ans;i++ ){
		       for(int j=i+1;j<list.length&&ans;j++){
				    ans=!(list[i]==list[j]||(i>num||i<0));
	         	}
		}
	return ans;
	
	}
	public static boolean legalData(String[] students, String[] courses, int[][] studentCourses, int k) {
		boolean ans =true;
		if(students==null||courses==null||studentCourses==null||k<=0){//check if the arrays is null
		   ans=false;
		}else if(ans){
		     ans =same(courses);//call to function
		     if (ans){
		    	 ans=same(students);//call to function
		     }   
		     if(ans){
		    	 if(studentCourses.length!=students.length){
		    		 ans=false;
		    	 }else{
		    		 for(int i=0 ;i<studentCourses.length&&ans;i++){//check if the array is null or in the studentCourses[i] have 0 courses 
		    			 if(studentCourses[i]!=null&&studentCourses[i].length!=0){
		    				 ans=same(studentCourses[i], courses.length);//call to function
		    			 }else ans=false;
		    		 }
		    	 }
		    	 boolean [] check=new boolean [courses.length];
		    	 for(int i =0;i<studentCourses.length&&ans;i++){//check if someone go to this courses 
		    	     for(int j=0;j<studentCourses[i].length;j++){
		                 check[studentCourses[i][j]]=true;
		    	     }  
		         }
		    	 for(int i=0;i<check.length&&ans;i++){//check if all this array is true
		    		 ans=check[i];
		    	 }
		     }
		     
		}
			
		return ans;	
		
}
}
