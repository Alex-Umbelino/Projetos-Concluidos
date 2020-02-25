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
    //subtração agora
    printf("\n\n\n\nDigite um numero inteiro:");
    scanf("%d",&n1);
    printf("\nDigite o numero que irá subtrir do anterior:");
    scanf("%d",&n2);
    sub=n1-n2;
    printf("\n %d-%d=%d\n\n\n\n" ,n1, n2, sub);
    //multiplicação e divisão


    printf("Quer multiplicar [1] ou dividir? [2]:");
    scanf("%d", &l);
    fflush(stdin);





       if(l==1)
       {   s=n1=n2=0;
           printf("\nDigite um numero inteiro:");
           scanf("%d",&n1);
           printf("\nDigite o segundo numero inteiro:");
           scanf("%d",&n2);


           s=n1*n2;
           printf("\n%dx%d=%d\n\n\n\n", n1, n2, s);

       }
       else
       {
           s=n1=n2=0;
           printf("\nDigite um numero:");
           scanf("%f",&N1);
           printf("\nDigite o segundo numero:");
           scanf("%f",&N2);

           S=(float)N1/N2;
            printf("\n%f/%f=%f\n\n\n\n\n", N1, N2, S);

       }



}
