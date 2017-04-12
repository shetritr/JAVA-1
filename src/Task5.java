public class Task5 {
	public static int[][] atLeastOne(int[] vars)
	{
		int numOfClause = 1;
		int numOfLiteralsInClause = vars.length;
		int[][] formula = new int[numOfClause][numOfLiteralsInClause];
		for (int i = 0; i < formula[0].length; i++) {
			formula[0][i]=vars[i];//we do or between every vars 
		}
		return formula;
	}
	public static int[][] atMostOne(int[] vars)
	{
		int n = vars.length;
		int numOfVarsPairs = n * (n-1) / 2;
		int numOfLiteralsInClause = 2;
		int[][] formula = new int[numOfVarsPairs][numOfLiteralsInClause];
		int k=0;//the left literal in the or Clause
		int j=1;//the right literal
		for (int i = 0; i < formula.length; i++) {//between every two verbs j,i(i!=j) we check not1ornot2 and not1ornot3 .....     
			if(j==n){
				k++;//go to the next left literal
				j=k+1;
			}
			formula[i][0]=-vars[k];
			formula[i][1]=-vars[j];
			j++;//go to the next right literal
		}
		
		return formula;
	}
	public static int[][] exactlyOne(int[] vars)
	{
		int n = vars.length;
		int numOfVarsPairs = n * (n-1) / 2;
		int numOfClauses = numOfVarsPairs + 1;//Because we add the first form atLeastOne and n * (n-1) / 2 from atMostOne
		int[][] formula = new int[numOfClauses][];
		formula[0]=atLeastOne(vars)[0];//take the atLeastOne 
		for (int i = 1; i < formula.length; i++) {//take the atMostOne and together we get the exactlyOne  
			formula[i]=atMostOne(vars)[i-1];
		}
		return formula;
	}
	public static int[][] notSameDay(int[] vars1, int[] vars2) {
		int numOfClause = vars1.length;
		int numOfLiteralsInClause = 2;
		int[][] formula = new int[numOfClause][numOfLiteralsInClause];
		for (int i = 0; i < formula.length; i++) {//if we want to know if at lest on of the var is false ,we need to take -var1 or -var2  and because one of them need to be false so the answer need to be true
			formula[i][0]=-vars1[i];
			formula[i][1]=-vars2[i];
		}		
		return formula;
	}
}
