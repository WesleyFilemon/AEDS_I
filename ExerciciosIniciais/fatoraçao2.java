import java.util.Scanner;
 public class fatoraçao;
  public static void main(String[]args)
   {
      do{
          System.out.print("fatore um numero desejado");
           Scanner leia=new Scanner();
           System.out.print("digite o numero para ser fatorado");
           int numeros=leia.nextInt();
            switch(numeros){
              case 1:numeros/2;
                           break;
              case 2:numeros/3;
                           break;
              case 2:numeros/5;
                           break;
              case 4: numeros/7;
            }
            }while(numeros=='1');
            System.out.print("Resultado da fatorassao"+numeros);
   }
 }
                                      

           
