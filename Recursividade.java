package Recursividade;
import java.util.Scanner;

public class Recursividade {
    public static int loop=0;
    public static void main(String[] args) {
        
        /* 
        Progressão aritmética é um tipo de sequência numérica que a partir do segundo elemento cada termo (elemento) é a
        soma do seu antecessor por uma constante.
        (5,7,9,11,13,15,17) essa sequência é uma Progressão aritmética, pois os seus elementos são formados pela soma do seu
        antecessor com a constante 2.
        a1 = 5
        a2 = 5 + 2 = 7
        a3 = 7 + 2 = 9
        a4 = 9 + 2 = 11
        a5 = 11 + 2 = 13
        a6 = 13 + 2 = 15
        a7 = 15 + 2 = 17
        Faça um programa que solicite: O elemento inicial da PA, a constante (razão) e o total de sequencias que se deseja
        gerar e então faça 2 algoritmos para resolver este problema: 1 recursivo e um sem recursividade.
    */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escolha o número inicial:");
        int i= sc.nextInt();
        System.out.print("Escolha a constante:");
        int c=sc.nextInt();
        System.out.print("Escolha o total de sequencias:");
        int s =sc.nextInt();
        int f=0;
        if(s==0){
            System.out.print("O valor final foi:"+i);
        }
        else{
           Recursivo(i,c,s);
           System.out.println("----------------");
           NaoRecursivo(i,c,s);
                
            }
        }

    static void Recursivo(int numero,int constante,int quantidade){
        loop++;
          numero=numero+constante;
          System.out.println(numero);
          if(quantidade>loop){
              Recursivo(numero,constante, quantidade);
          }
        }
    
    static void NaoRecursivo(int numero,int constante, int quantidade){
        int j=0;
        while(quantidade>j){              
                numero=numero+constante;
                j++;
                System.out.println(numero);
                
            }
    }
}
