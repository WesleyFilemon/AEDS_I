import java.util.Scanner;
   public class potencia
{
    public static void main(String[]args)
    {
    mensagem();
    int numero=leia();
    int potenciaçao=leia2();
    int soma=soma(numero,potenciaçao);
    Resposta(soma);
    }//fim main
       public static void mensagem(){
          System.out.print("fassa a potenciaçao");
       }//fim mensagem
       public static int leia(){
            Scanner s=new Scanner(System.in);
            System.out.print("\n Digite o numero :");
            int x=s.nextInt();
       return x; }//fim leia
       public static int leia2(){
            Scanner s=new Scanner(System.in);
            System.out.print("\n Digite o numero da potenciaçao:");
            int x=s.nextInt();
       return x; }//fim leia2
       public static int soma(int x,int y){
       int z=1;
          for(int i=1;i<=y;i++){
           z=z*x;
           }
          return z; }//fim soma
        public static void Resposta(int x){
       System.out.print("O Resultado e= "+x);
     }//fim Resultado

    }//fim

   
