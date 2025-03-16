import java.util.Random;
import java.util.Timer;

public class Sistema {
    public static void Instrucao() throws InterruptedException {
      
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        Random decisao = new Random();
        Timer tempo = new Timer();
        int Pc1 = decisao.nextInt(numeros.length);
        int Pc2 = decisao.nextInt(numeros.length);
        int contador = 0+1;
        int contador2 = 0+1;
        int limite = 50;

        while (true) {
            System.out.println("Numero escolhido por PC1 " + Pc1);
            System.out.println("Numero escolhido por PC2 " + Pc2);
            
            Thread.sleep(2000);
            
            if(Pc1 > Pc2) {
                // contador++;
                System.out.println("Ponto para PC1 " + contador++);
               
            }
            else if(Pc2 > Pc1) {
                // contador2++;
                System.out.println("Ponto para PC2 " + contador2++);
              
            }
            else if (Pc1 == Pc2) {
                System.out.println("Empate");
            }
            Pc1 = decisao.nextInt(numeros.length);
            Pc2 = decisao.nextInt(numeros.length);

            if (contador == 11) {
                System.out.println("Vencedor PC1");
                System.exit(0);
            }
            else if (contador2 == 11) {
                System.out.println("Vencedor PC2");
                System.exit(0);
            }
            
        }
        
       
    }
}
