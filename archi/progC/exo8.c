#include <stdio.h>
int main(void){
  int Majuscule(void){
    char lettre;
    while (printf("Donnez une lettre minuscule\n"),lettre = getchar(),(lettre<'`')||(lettre>'{')); 
    printf("%c\n", lettre -32);
  }
  Majuscule();
}
