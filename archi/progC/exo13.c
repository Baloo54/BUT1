#include <stdio.h>
#include <string.h>
int main(void)
{
    char tab[1000], tab2[1000];
    int i, h, j = 0;
    printf("écrivez un texte:\n");
    fgets(tab, sizeof(tab), stdin); 
    tab[strlen(tab)] = ' ';
    i = strlen(tab) - 3;
    for(i; i >= 0; i--)
    {
        if((tab[i] == ' ')| (i == 0))
        {
            h = (i == 0) ? i : i + 1;
            while (tab[h] != ' ')
            {
                tab2[j++] = tab[h++];
            }      
        tab2[j++] = ' ';
        }
    }
    printf("%s\n", tab2);
}
