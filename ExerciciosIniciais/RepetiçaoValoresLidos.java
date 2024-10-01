 import java.util.Scanner;
 public class RepetiçaoValoresLidos
{
  public static void main(String[]args)
   {
         Scanner leia=new Scanner(System.in);
        System.out.print("digite o primeiro valor");
        int primeiro=leia.nextInt();
        System.out.print("digite o ultimo valor");
        int ultimo=leia.nextInt();
        do{
        primeiro=primeiro-1;
        System.out.println(primeiro);
       }while(primeiro>ultimo); 
     }
}