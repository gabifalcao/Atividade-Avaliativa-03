import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] vetor = new int[8];

        System.out.println("Digite oito números inteiros:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetor[i] = scan.nextInt();

            }

            System.out.println("O vetor na ordem inversa é:");
                for (int i = vetor.length -1; i >= 0; i--) {
                    System.out.print(vetor[i] + " ");

                }
    }
}
