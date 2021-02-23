

#include<stdio.h>
#include <stdbool.h>		//for including bool datatype.
#include<string.h>

bool is_pangram(char str_in[]) {
  
      int flag = 0;
  
    for(int i = 65,j = 97; i<91; i++,j++){
      
            for(int k = 0; k<strlen(str_in); k++){
              
                  if((i == str_in[k]) || (j == str_in[k])){
                        flag++;
                        break;
                  }
            }
    }
      
    if(flag == 26)
          return true;
    else
          return false;

    //  <----  hajime!

}

void main(){

	char *s = "abcdefghijklmnopqrstuvwxyz";

	if(is_pangram(s))
		printf("string is pangram\n");
	else
		printf("string is not pangram\n");
}
