



class F{

	static int countLast(int[][] mrr){

		int sum=0;
	
		for(int i = 0; i<mrr.length; i++){

			sum = sum + mrr[i][0] - mrr[i][1];
			
		}
		
	return sum;
	}

	public static void main(String[] args){

	int[][] mrr = new int[][]{{10,0},{3,5},{2,5}};

	System.out.println(countLast(mrr));

	}
}
