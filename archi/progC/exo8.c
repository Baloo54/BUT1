#include <stdio.h>
int main(void){
  char lettre;
  while (printf("Donnez une lettre minuscule\n"),lettre = getchar(),(lettre<'`')||(lettre>'{')); 
  printf("%c\n", lettre -32);
}
