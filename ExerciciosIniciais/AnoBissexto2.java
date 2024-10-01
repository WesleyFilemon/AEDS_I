import java.util.Scanner;
 public class AnoBissexto2
{
  public static void main(String[]args)
   {
   char novo=0;
   int Ano;
     do{ 
     do{
      Scanner leia=new Scanner(System.in);
      System.out.print("escolha um ano para saber sé e bissexto:2001 ou 2020\n");
         Ano=leia.nextInt();
         }while(Ano!=2001 && Ano!=2020);
           int a=Ano%400;
           int b=Ano%100;
           int c=Ano%4;
  if(a==0){
           System.out.print("O Ano e bissexto");}
           else{
                 if(b==0){
                 System.out.print(" O Ano noa e bissexto");}
                 else{
                 if(c==0){
                 System.out.print(" O Ano e bissexto");}
                 else{
                 System.out.print(" O Ano nao e bissexto");}
                 }
               }
         Scanner leia2=new Scanner(System.in);
         System.out.print("\ndeseja fazer outro Ano=yes,no:");
           novo=leia2.next().charAt(0);
         }while(novo=='y');
     System.out.print("obrigado por usar nosso servisso");
     
   }
   }
