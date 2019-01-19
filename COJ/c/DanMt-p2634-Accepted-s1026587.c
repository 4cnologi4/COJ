#include <stdio.h>

int arg[13];

int main()
{
    int n, i, ID, dia, mes, anual;

    scanf("%d", &n);
    for(i = 0; i < n; i++){
        scanf("%d %d/%d/%d", &ID, &dia, &mes, &anual);
        arg[mes]++;
    }
    for(i = 1; i <= 12; i++){
        printf("%d %d\n", i, arg[i]);
    }
    return 0;
}