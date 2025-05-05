import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println("O vetor é: ");
            for (int num : vetor) {
                System.out.print(num + " ");

            }
            System.out.print(" Digite um número para contar sua aparição no vetor: ");
            int numero = scan.nextInt();

            int contador = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor [i] == numero) {
                    contador++;
                }
            }
            System.out.println("O número " + numero + " aparece " + contador + " vez/vezes no vetor.");
    }
}
