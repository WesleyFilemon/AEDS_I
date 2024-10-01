#include <stdio.h>
#include <stdlib.h>

int main()
{
    int linhas ,colunas,i,j,numeros=0,soma=0;
    do{
    scanf("%d",&linhas);
    scanf("%d",&colunas);
    }while(linhas>0 && colunas>0);

    int x[linhas][colunas];

    for(i=0;i<linhas;i++){
         for(j=0;j<colunas;j++){
             scanf("%d",&numeros);
            x[i][j]=numeros;
            soma=soma+x[i][j];

         }
    }

     printf("%d",soma);
    return 0;
}
