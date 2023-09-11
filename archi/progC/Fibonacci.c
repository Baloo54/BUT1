#include <stdio.h>
int main(){
    int a, b, c, d, i;
    b = 0; c = 1; d = 0  ;
    printf("donnez un nombre svp a > 2\n");
    scanf("%d",&a);
    while(a<3){
        scanf("%d", &a);
    }
    for(i = 0; i < a; i++){
	 b = c + d;
	 c = d;
	 d = b;
    	 }
    printf("%d\n", b);
}
