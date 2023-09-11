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
    j = 0; h = 0;
    for(i = (sizeof(tab2)/sizeof(tab2[0])); i >= 0; i--)
    {
        for(j = 0; j < strlen(tab2[i]); j++)
        {
            if((tab2[i][j] < 'A') | (tab2[i][j] > '~') | (tab2[i][j] == ' ') | (tab2[i][j] == '`'))continue;
            tab3[h++] = tab2[i][j]; 
        }
        tab3[h++] = ' ';
    }
    printf("%s\n", tab3);
}