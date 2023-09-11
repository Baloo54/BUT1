#include <stdio.h>
int main(){
  int n, j;j = 0;
  printf("donnez un nombre svp:");
  scanf("%d", &n);
  for(int i = 2; i < n; i++){
    if ((n % i) == 0) j = 1;
  }
 printf((j==1)?"Ce nombre n'est pas premier\n":"Ce nombre est premier\n");
}
