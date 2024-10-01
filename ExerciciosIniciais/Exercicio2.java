import java.util.Scanner;
 public class Exercicio2
{
  public static void main(String[]args)
   {
   double h=0;
      System.out.print("descubra os termos da sequência 1/100, 97/2, 3/94, 91/4, 5/88");
     Scanner entrada=new Scanner(System.in);
      System.out.print("\n digite o numero de termos");
      int termos=entrada.nextInt();
      int a=1;
      int b=100;
     for(   ;a<termos;a++,b-=3){
     if(a%2==1)
      h=h+a/(double)b;
     else
      h=h+b/(double)a;
   }
   System.out.print("Os termos são:"+h);
   }
}  
      