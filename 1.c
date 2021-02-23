

#include<stdio.h>

int main(){
 
    int l,w;
    scanf("%d %d",&l,&w);
    int arr[10]={},i=0,cnt=0;
  
    while(l != w){
      
          if(l>w){
              arr[i] = w;
              l = l - arr[i];
              i++;
              cnt++;
            
          }else if(w>l){
              
              arr[i] = l;
              w = w - arr[i];
               i++;
               cnt++;
            }
    }
     arr[i] = l;
	cnt++;	
      for(int i = 0; i<cnt; i++){
        printf("%d,",arr[i]);
      }
  return 0;
 }

