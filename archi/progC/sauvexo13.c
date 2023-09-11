#include <stdio.h>
#include <string.h>
int main(void)
{
    char tab[1000],tab2[10][10], tab3[1000];
    int i, j, h;
    printf("écrivez un texte:\n");
    fgets(tab, sizeof(tab), stdin); 
    j = 0; h = 0;
    for(i = 0; i < strlen(tab); i++)
    {
        if (tab[i] == ' ')j++, h = 0;
        else
        {
            tab2[j][h++] = tab[i];
        }
    }
    h = 0;
    for(i = 0; i < sizeof(tab2)/sizeof(tab2[0]); i++)
        while(tab2[i][h] != 0)
        {
            printf("%c", tab2[i][h]);
            h++;
        }
        h = 0;
    printf("%s", tab2[0]);
}