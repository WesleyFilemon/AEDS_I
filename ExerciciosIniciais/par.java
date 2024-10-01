import java.util.Scanner;
   public class par
{
    public static void main(String[]args)
    {
    mensagem();
     double A=leiaReal();
       double soma=soma(A);
       Resultado(soma);
     }//fim do main
     public static void mensagem(){
       System.out.print("Soma de dois numeros");
       }//fim mensagem
     public static double leiaReal(){
        Scanner s=new Scanner(System.in);
       System.out.print("\n digite o numero:");
       double x=s.nextDouble();
       return x; }//fim leiaReal
     public static double soma(double x){
       double z=x%2;
       return z;
     }//fim par
     public static void Resultado(double soma){
     if(soma==0){
     System.out.print("O numero e par");}
     else
     System.out.print("O numero impar");
     }//fim Resultado
     
      
 }//fim
     
       
       
      
       
     
  
    
