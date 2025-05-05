import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetor = new int[10];

        System.out.println("Digite dez números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scan.nextInt();
        }

                for (int i = 0; i < vetor.length - 1; i++) {
                    for (int j = 0; j < vetor.length - 1 - i; j++) {
                        if (vetor[j] > vetor[j + 1]) {
                            int temp = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = temp;
                        }
                    }
                }


        
        System.out.println("Vetor em ordem crescente: ");
        for (int num : vetor) {
            System.out.print(num + " ");

        }
    }
}
