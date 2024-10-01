import java.util.Scanner;
   public class calculadora2
{
    public static void main(String[]args)
    {
    int opçao=0;
    do{
       System.out.print("\t Calculadora\n"
                           +"\t 1-subtraçao\n"
                           +"\t 2-adiçao\n"
                           +"\t 3-multiplicaçao\n"
                           +"\t 4-divisao\n"
                           +"\t 0-sair da caulculadora\n");
         System.out.print("\n sua opçao");
            Scanner leia=new Scanner(System.in);
           opçao=leia.nextInt(); 
             if(opçao==0){
             Scanner entrada=new Scanner(System.in);
                System.out.print("Obrigado por usar a calculadora.");
              }else{
                    System.out.print("digite o primeiro numero");
                    double numero1=leia.nextDouble();
                    System.out.print("digite o segundo numero");
                    double numero2=leia.nextDouble();
                    double Resultado=0;
            switch(opçao)
            {
               case 1:Resultado=numero1-numero2; 
                                          break;
               case 2:Resultado=numero1+numero2;
                                          break;
               case 3:Resultado=numero1*numero2;
                                          break;
               case 4:Resultado=numero1/numero2;
                                          break;
               default: System.out.print("\n operasao invalida \n");
             }
              System.out.print(" Resultado da operaçao:"+Resultado+"\n");

            }
            }while(opçao>=5);
      }
}
              
