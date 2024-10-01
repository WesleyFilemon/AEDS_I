import java.util.Scanner;
   public class Fatoraçao
{
    public static void main(String[]args)
    {
    mensagem();
    int numero=leia();
    int soma=soma(numero);
     Resposta(soma);
 }//fim main
       public static void mensagem(){
          System.out.print("fassa a fatoraçao");
       }//fim mensagem
        public static int leia(){
            Scanner s=new Scanner(System.in);
            System.out.print("\n Digite o numero que deseja fatorar:");
            int x=s.nextInt();
       return x; }//fim leia
       public static int soma(double x){
        int Resultado=0;
          switch(x){
            case 1:Resultado=2&x=0;
                              break;
            case 2:Resultado=3&x=0;
                             break;
            case 3:Resultado=5&x=0;
                             break;
            case 4:Resulafo=7&x=0;
            return Resultado;
            }//fim while
            }//fim soma
        public static void Resposta(int x){
             System.out.print("O Resultado e= "+x);
         }//fim Resultado
}//fim
            
        

       

