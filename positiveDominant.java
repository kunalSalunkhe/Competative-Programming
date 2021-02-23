


import java.io.*;

 class Dominance {

  public static boolean isPositiveDominant(int[] n) {

	int flag = 0,p=0;

	for(int i = 0; i<n.length; i++){

		if(n[i]>0){

			flag = 0;
			for(int j = 0; j<i; j++){

				if(n[i] == n[j]){

					flag = 1;
					break;
				}
			}

			if(flag == 0)
				p++;
		}
	}

	if(p>(n.length/2))
		return true;
	else
		return false;	
		
  }
	
	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

	for(int i = 0; i<n; i++){

		arr[i] = Integer.parseInt(br.readLine());
	}

	System.out.println(isPositiveDominant(arr));
		
	}
}
