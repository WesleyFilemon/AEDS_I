import java.util.Scanner;
 public class PA
{
  public static void main(String[]args)
   {
      System.out.print("de os proximos dois numeros de uma PA 5,7");
      Scanner leia=new Scanner(System.in);
      System.out.print("\n digite o primeiro numero:");
       int numero1=leia.nextInt();
       System.out.print("digite o segundo numero");
       int numero2=leia.nextInt();
       do{
         numero2=numero2+2;
         System.out.println(numero2);
       }while(numero2<17);
       Scanner entrada=new Scanner(System.in);
       System.out.print("deseja uma PA maior 1 para yes,2 para no");
         int opçao=entrada.nextInt();
     if(opçao==1)
     do{
         numero2=numero2+2;
         System.out.println(numero2);
      }while(numero2<101);
       System.out.print("obrigado por usar nosso servisso")
     }
}
       