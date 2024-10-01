import java.util.Scanner;
 public class Exercicio1
{
  public static void main(String[]args)
   {
      System.out.print("numeros de termos de 1/100");
       Scanner leia=new Scanner(System.in);
      System.out.print("Digite o numero de termos");
      int n=leia.nextInt();
     int d=100;
     double h=0;
     double t;
      for( int fim=1 ;fim<n; fim++ );{
      t=1/(double)d;
      h=h+t;
      d=d-3;
      }
      System.out.print("termos\n"+h);
   }
}