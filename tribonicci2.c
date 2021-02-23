
		//give array memory using malloc i.e. on heap and then perform operation on them.


#include<stdio.h>

#include <stdlib.h>

					//ya adress chya pudhche adress + 1...+2..+3   char char byte ne pudhe jail, so, 
int *tribonacci(int signature[], int n) {	//ya adress vr laue store karu shakto pudhe.

    int a = signature[0];
    int b = signature[1];
    int c = signature[2];
  
   int *ar = (int*)malloc(n*4);
    int sum =0;
  
    for(int i = 0; i<n; i++){
      
        if(i == 0){
            *(ar+i) = a;			//..adress ahe ani tyavr value store kartoy. na ki array i.e size declare karun mg jaga milvun
            *(ar+(++i)) = b;				//nahi ...aapn pro he direct jaga milvto ani pudhchya jagevr declare n karta
            *(ar+(++i)) = c;				//kabja milvun vaprun gheto.
        }
      	else{
  	    sum = a+b+c;
     	    *(ar + i) = sum;
     	    a = b;
            b = c;
            c = sum;
         }
     }
  
//	for(int i = 0; i<10; i++)
//		printf("%d\n",arr[i]);

 return ar;

}

void main(){

	int arro[3];

	for(int i = 0; i<3; i++)
		scanf("%d",arro+i);
	
	int *arry = tribonacci(arro,10);

	for(int i = 0; i<10; i++)
		printf("%ld\n",*(arry+i));
}
	
