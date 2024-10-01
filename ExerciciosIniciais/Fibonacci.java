import java.util.Scanner;
 public class Fibonacci
{
  public static void main(String[]args)
   {
      System.out.print("termos Fibonacci");
         Scanner leia=new Scanner(System.in);
      System.out.print("\ndigite o numero de termos:\n");
      int termos=leia.nextInt();
      int primeiro=1;
      int segundo=1;
      int soma=primeiro+segundo;
      int numeros=segundo+soma;

         for(int quantidade=0 ;quantidade==termos;quantidade++ )
  
        soma=soma+numeros;
        numeros=numeros+soma;

            System.out.print(+primeiro+"\n" +segundo+"\n" +soma+"\n"+numeros); 
      }
}
