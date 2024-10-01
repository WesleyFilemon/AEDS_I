import java.util.Scanner;
 public class Votaçaochapa
{
  public static void main(String[]args)
   {
    int opçao;
   int chapa1=0;
   int chapa2=0;
   int votob=0;
   int voton=0;

      do{
         System.out.print("\nVotaçao para diretorio academico");
         System.out.print("\n Escolha a sua chapa");
          Scanner leia=new Scanner(System.in);
         System.out.print("\n0-Sair do programa\n"
                         +"1-Chapa 1 \n"
                         +"2-Chapa 2 \n"
                         +"3-Voto em branco\n"
                         +"4-Voto nulo");
        System.out.print("\nSeu voto:\n ");
          opçao=leia.nextInt();
         if(opçao<0 || opçao>4){
         System.out.print("Opçao invalida");}
           switch(opçao){
              case 1:chapa1=chapa1+1; 
                             break;
              case 2:chapa2=chapa2+2;
                             break;
              case 3: votob=votob+1;
                             break;
              case 4:voton=voton+1;}
                            
      }while(opçao!=0);
       if(chapa1>chapa2){
         System.out.print("Chapa 1 ganhadora= "+chapa1);
         System.out.print("\n Votos em branco= "+votob);
         System.out.print("\n Votos nulos= "+voton);}
      if(chapa2>chapa1){
        System.out.print("Chapa 2 ganhadora= "+chapa2);
        System.out.print("\n Votos em branco= "+votob);
        System.out.print("\n Votos nulos= "+voton);}

    }
 }  
        

