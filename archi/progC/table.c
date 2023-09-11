#include <stdio.h>
int main(){
int i, j;
for(i=1;i<11; i++){
   for(j=1; j<11; j++){
     printf("%d",j*i);
   }
   j++;
   printf("\n");
   }
}
