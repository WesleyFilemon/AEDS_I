import java.util.Scanner;
 public class MediaFlag
{
  public static void main(String[]args)
   {
     System.out.print("Saiba a meida de algus valores e o maior e menor numero");
   int numeros=0;
     
     do{
      Scanner entrada=new Scanner(System.in);
         System.out.print("\n digite o valor");
        numeros=entrada.nextInt();
            int maior=0,
          menor=0;
           int media=0;
      for(int i=0;i<=100;i++){
      numeros=entrada.nextInt();
      if(numeros>maior)maior=numeros;
      else
      if(numeros<menor)menor=numeros;{
      media=numeros+numeros;}
      }
    }while(numeros=='0');
    
  }
}
  
       
