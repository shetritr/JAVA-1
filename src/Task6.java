public class Task6 {
	public static int[][] variableTable (int m, int k){
		int[][] variableNames = new int[m][k];
		int j;//number of day in every clause
		int count=1;//give the name of the xi
		for (int i = 0; i < variableNames.length; i++) {
			j=0;//begin day zero in every clause
			while (j<k) {
				variableNames[i][j]=count;
				j++;//next day
				count++;//count the x
			}
		}
		return variableNames;
	}
}
