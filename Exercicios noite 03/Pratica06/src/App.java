import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] vetor = {1,4,12,9,20,7,5,15,9,10};

         System.out.print("Vetor sem a remoção: ");
         for (int num : vetor) {
            System.out.print( num + " ");

         }
             System.out.print("Digite o número que deve ser removido: ");
             int remover = scan.nextInt();

                int[] vetornovo = new int[vetor.length - 1];
                boolean removido = false;
                int j = 0;

                    for (int i = 0; i < vetor.length; i++) {
                        if (vetor [i] == remover && !removido) {
                            removido = true;
                        }

                        if ( j < vetornovo.length) {
                            vetornovo[j] = vetor[i];
                            j++;
                        }

                            if (removido) {
                            System.out.print("O vetor após tirar a primeira ocorrência: " + remover + ": ");
                            for (int num : vetornovo) {
                                System.out.print(num + " ");
                            }   
                            } else {
                                    System.out.print("O número " + remover + "não existe no vetor.");
                                }
                            }
                    }
    }

