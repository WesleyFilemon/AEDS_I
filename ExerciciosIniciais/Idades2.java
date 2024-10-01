import java.util.Scanner;
 public class Idades2
{
  public static void main(String[]args)
   {
   int idade=0;
   int soma=0;
   int encerrar=0;
   int numero=0;
      do{
          Scanner leia=new Scanner(System.in);
          System.out.print("qual numero de pessoas:");
            numero=leia.nextInt();
          System.out.print("digite as idades:");
            idade=leia.nextInt();
           soma=soma+idade;
           System.out.print("total das idades= "+soma);
           System.out.print("\n digite 0 para finalizar e 1 para comtinuar: ");
            encerrar=leia.nextInt();}
          while(encerrar>0);
            System.out.print("idade media: "+soma/numero+"\n");

       System.out.print("obrigado por usar nossos serviços");
   }
}
           

