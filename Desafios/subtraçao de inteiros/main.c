#include <stdio.h>
#include <stdlib.h>

int main()
{
     int x,y,contador=0,i,soma=0,k[100];
    do{
        scanf("%d",&x);
      if(x!=0){
        scanf("%d",&y);
          soma=x-y;
         // printf("%d",soma);
          k[contador]=soma;
          contador++;
      }
    }while(x!=0);

    for(i=0;i<contador;i++){
        printf("\n%d",k[i]);
    }

    return 0;
}
