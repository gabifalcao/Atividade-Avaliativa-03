import java.util. Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);    
            int[] vetor = new int[15];
            int maior = vetor[0];
            int posicao = 0;

        System.out.println("Digite quinze números inteiros:");
            for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor do " + (i + 1) + ": ");
            vetor[i] = scan.nextInt();

        }
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i] > maior){
                    maior = vetor[i];
                    posicao = i;
                    System.out.println("O maior valor é: " + maior);
                    System.out.println("A posição no vetor é: " + posicao);  
                }
            }
    }
}
