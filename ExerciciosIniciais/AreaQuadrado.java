import java.util.Scanner;
   public class AreaQuadrado
{
    public static void main(String[]args)
    {
    mensagem();
    double lado=leiaReal();
    double soma=soma(lado);
    Resultado(soma);
    }//fim main
     public static void mensagem(){
       System.out.print("Perimetro de um quadrado");
       }//fim mensagem
     public static double leiaReal(){
      Scanner s=new Scanner(System.in);
      System.out.print("\n digite o valor do lado:");
       double x=s.nextDouble();
     return x; }//fim leiaReal
     public static double soma(double x){
       double z=x*4;
     return z; }//fim soma
     public static void Resultado(double soma){
       System.out.print("O perimetro e= "+soma);
     }//fim Resultado
 }

       
        
