#include <stdio.h>
#include <math.h>

void main()
{
    int n1=0,n2=0,s=0,sub=0,l;
    float N1=0, N2=0,S=0;



    printf("\nDigite um numero inteiro:");
    scanf("%d",&n1);
    printf("\nDigite o segundo numero inteiro:");
    scanf("%d",&n2);

    s=n1+n2;
    printf("\n%d+%d=%d", n1, n2, s);
    n1=n2=0;
    //subtra��o agora
    printf("\n\n\n\nDigite um numero inteiro:");
    scanf("%d",&n1);
    printf("\nDigite o numero que ir� subtrir do anterior:");
    scanf("%d",&n2);
    sub=n1-n2;
    printf("\n %d-%d=%d\n\n\n\n" ,n1, n2, sub);




}
