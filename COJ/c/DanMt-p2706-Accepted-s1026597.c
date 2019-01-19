#include <stdio.h>
#define MAX 10000

int main()
{
    int n, x, r;
    while(scanf(" 1/%d", &n) != EOF)
    {
        r = 0;
        for(x = n+1; x <= 2*n; x++) {
            if((n*x)%(x-n) == 0)
                r++;
        }
        printf("%d\n", r);
    }
	  return 0;
}