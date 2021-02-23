
#include<stdio.h>
#include<string.h>

char *DuplicateEncoder(char str[])
{

    int arr[20], a = 0;

    for(int i = 0; i<strlen(str)-1; i++){
      
        for(int j = i+1; j<strlen(str); j++){
          
                if(str[i] == str[j]){
                  
                  arr[a] = i;
		  a++;
		  arr[a] = j;
		  a++;
              }
          }
      }

	for(int i = 0; i<a-1; i++){

		str[arr[i]] = ')';
	}
	for(int i = 0; i<strlen(str)-1; i++) {
		if(str[i] !=  ')') 
			str[i] = '(';
   	}
               
 	 return  str;
}

void main(){

	char s[] = "reccede";
	printf("%d\n",strlen(s));
	char *s1 = DuplicateEncoder(s);

	puts(s1);
}

