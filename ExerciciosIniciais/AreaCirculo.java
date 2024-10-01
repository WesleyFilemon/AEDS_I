import java.util.Scanner;
   public class AreaCirculo
{
    public static void main(String[]args)
    {
    mensagem();
   double raio=leiaReal();
   double soma=soma(raio);
   Resultado(soma);
   }//fim main
     public static void mensagem(){
       System.out.print("Area de um Circulo");
       }//fim mensagem
     public static double leiaReal(){
        Scanner s=new Scanner(System.in);
        System.out.print("\n digite o valor do Raio:");
        double x=s.nextDouble();
     return x; }//fim leiaReal
     public static double soma(double x){
        x=Math.pow(x,2);
        double z=3.14*x;
     return z; }//fim soma
     public static void Resultado(double x){
       System.out.print("A Area e= "+x);
     }//fim Resultado
  }

       

