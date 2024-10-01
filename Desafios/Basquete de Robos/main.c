#include <stdio.h>
#include <stdlib.h>

int main()
{
    int y[100],n,contador=0,i;

    do{
        scanf("%d",&n);
        if(n!=0){
            if(n>0 && n<=800){
                y[contador]=1;
                            contador++;
            }
            else{
                if(n>800 && n<=1400){
                    y[contador]=2;
                                contador++;
                }
                else{
                    if(n>1400 && n<=2000){
                        y[contador]=3;
                                    contador++;
                    }
                }
            }
        }
    }while(n!=0);

     for(i=0;i<contador;i++){
        printf("\n%d",y[i]);
     }

    return 0;
}
