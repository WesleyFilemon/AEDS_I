#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    bool saida=false;
    int contador=0,tamanho=0,i;
    char frase[100];
    do{

        gets(frase);
        tamanho=strlen(frase);

           for(i=0;i<tamanho;i++){
            printf("%c",frase[i]);
           }

         contador++;
    }while(saida==true);

    return 0;
}
