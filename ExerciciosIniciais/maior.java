import java.util.Scanner;
   public class maior
{
    public static void main(String[]args)
    {
    mensagem();
       double A=leReal();
       double B=leReal();
       double maior=maior(A,B);
       EscrevaRes(maior);
       }//fim do main
     public static double leReal(){
       Scanner s=new Scanner(System.in);
       System.out.print("\n digite o valor:");
       double x=s.nextDouble();
       return x; }//fim leReal
     public static double maior(double x,double y){
       double maior=x;
       if(y>x)maior=y;
       return maior; }//fim maior
    public static void EscrevaRes(double maior){
      System.out.print("O maior valor= "+maior);
      }//fim EscrevaRes
    public static void mensagem(){
      System.out.print("Saiba o numero maior");
      }//fim mensagem
  } 
    