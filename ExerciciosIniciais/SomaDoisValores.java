import java.util.Scanner;
   public class SomaDoisValores
{
    public static void main(String[]args)
    {
    mensagem();
    double A=leReal();
    double B=leReal();
    double soma=soma(A,B);
    Resultado(soma);
    }//fim do main
      public static void mensagem(){
      System.out.print("Soma de dois numeros");
      }//fim mensagem
     public static double leReal(){
       Scanner s=new Scanner(System.in);
       System.out.print("\n digite o valor:");
       double x=s.nextDouble();
       return x; }//fim leReal
     public static double soma(double x,double y){
     double z=x+y;
     return z;}//fim soma
     public static void Resultado(double soma){
     System.out.print("Resultado da soma= "+soma);
     }//fim Resultado
    
   }//fim
