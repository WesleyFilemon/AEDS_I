 import java.util.Scanner;
 public class AnoBissextoP
{
  public static void main(String[]args)
   {
  char novo=0;
   do{
    Scanner leia=new Scanner(System.in);
        System.out.print("saiba se o Ano e bissexto");
           System.out.print("\ndigite o Ano:");
           int Ano=leia.nextInt();
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
 



       
      
             
           
         
         
           
         
