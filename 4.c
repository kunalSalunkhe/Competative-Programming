

#include<stdio.h>
#include<string.h>

char *chan(char *text){

	char *s;
		
      int i = 0;
      int l = strlen(text);
        for(i = 0; i<l; i++){
           
		 if(text[i] >= 65 && text[i] <= 90){
               			
				 s[i] = (int)(text[i]) - 64;
           
		 }else if(text[i] >= 97 && text[i]<=124)
                		
				 s[i] = (int)(text[i]) - 96;
        }
        s[i] = '\0';

		

}

void main(){

	char *ch = "the server's";
	
	chan(ch);

}	
