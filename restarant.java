

import java.io.*;

class Restaurant {

	public static void main(String[] args)throws IOException{

	int a = 2;
	int b = 3;

	int[] arr1 = new int[a];
	int[] arr2 = new int[b*2];

	System.out.println(arr1[0]);

	int arr[] = {1,2,1,1,2,2};

	int sT= 0, tT=0;
	int flag = 0,flag1=0,flag3=0,serviceDeny=0;

	for(int i = 0; i<arr.length; i++){

		if(arr[i] == 1){

			flag = 0;
			for(int j = 0; j<arr1.length; j++){
			
				if(arr1[j] == 0){
				
					arr1[j] = 1;
					flag = 1;
					break;		
				}
				
			}
			if(flag == 0){
	
				flag1 = 0;
				for(int j = 0; j<arr2.length; j++){

					if(arr2[j] == 0){
						
						arr2[j] = 1;
						flag1 = 1;
						break;
					}

				}

			}

		    if(flag == 0 && flag1 == 0)
				serviceDeny++;
		}

		else if(arr[i] == 2){
	
			flag3 = 0;

				for(int j = 0; j<arr2.length; j++){
					
					if(j != arr2.length-1){ 
						if(arr2[j] == 0){
			
							arr2[j] = 1;
							arr2[j+1] = 1;
							flag3 = 1;
							break;
						}		
					}
				}

			if(flag3 == 0)
				serviceDeny+=2;
		}
	}

		System.out.println(serviceDeny);

	}
}
	


