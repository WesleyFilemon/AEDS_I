import java.util.Scanner;
   public class calculadora2
{
    public static void main(String[]args)
    {
    int op�ao=0;
    do{
       System.out.print("\t Calculadora\n"
                           +"\t 1-subtra�ao\n"
                           +"\t 2-adi�ao\n"
                           +"\t 3-multiplica�ao\n"
                           +"\t 4-divisao\n"
                           +"\t 0-sair da caulculadora\n");
         System.out.print("\n sua op�ao");
            Scanner leia=new Scanner(System.in);
           op�ao=leia.nextInt(); 
             if(op�ao==0){
             Scanner entrada=new Scanner(System.in);
                System.out.print("Obrigado por usar a calculadora.");
              }else{
                    System.out.print("digite o primeiro numero");
                    double numero1=leia.nextDouble();
                    System.out.print("digite o segundo numero");
                    double numero2=leia.nextDouble();
                    double Resultado=0;
            switch(op�ao)
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
              System.out.print(" Resultado da opera�ao:"+Resultado+"\n");

            }
            }while(op�ao>=5);
      }
}
              
