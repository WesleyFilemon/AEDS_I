import java.util.Scanner;
 public class PerfilTurma
{
  public static void main(String[]args)
   {
   int idades=0;
   boolean ERRO;
   int a;
   int b;
     do{
         Scanner entrada=new Scanner(System.in);
         System.out.print("\n digite sua idade:");
         idades=entrada.nextInt();
        ERRO=idades<0 || idades>100;
      while(ERRO);
      while(idades!=0){
         do{
            System.out.print("Digite o seu genero [f/m]:");
            int sexo=entrada.next().charAt(0);
            ERRO=sexo!='f' || sexo='m';
          }while(ERRO);
          if(sexo='m'){
          a=a+idade;
          a++;
         }
         else{
         b=b+idade;
         b++;
         }
     }
  }while(idade=='0');
 }
}
         
          
            
