#include <stdio.h>

int main()
{
    int n, m, i;
    char res[105], exam[105];
    double sc;

    scanf("%d", &n);
    scanf("%s", res);
    scanf("%d", &m);
    while(m--)
    {
        scanf("%s", exam);
        sc = 0;
        for(i = 0; i < n; i++){
            if(exam[i] == res[i])
                sc += 1;
            else if(exam[i] != '#')
                sc -= 0.25;

        }
        printf("%0.2lf\n", sc);
    }
    return 0;
}