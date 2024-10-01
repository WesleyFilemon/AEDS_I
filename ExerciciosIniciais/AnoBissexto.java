import java.util.Scanner;
   public class AnoBissexto
{
    public static void main(String[]args)
    {
    mensagem();
     double Ano=leiaReal();
     double soma=soma(Ano);
       }//fim main
          public static void mensagem(){
             System.out.print("veja se o Ano e bissexto");
          }//fim mensagem
          public static double leiaReal(){
            Scanner s=new Scanner(System.in);
            System.out.print("\n Digite o Ano:");
            double x=s.nextInt();
          return x; }//fim leiaReal
          public static double soma(double x){
          if(x%4==0)
          System.out.print("Ano e bissixto");
          if(x%100==0)
          System.out.print("Ano e bissixto");
          if(x%400==0)
          System.out.print("Ano e bissixto");
          if(x%4!=0 && x%100!=0 && x%400!=0) 
          System.out.print("Ano nao e bissexto");
          return x;
         }//fim soma
    }//fim        
         

            
