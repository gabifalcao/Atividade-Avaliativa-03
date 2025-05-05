import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int [] A = {1,3,2,5,4};
        int [] B = {9,6,7,2,1};

            ArrayList<Integer> lista = new ArrayList<>();

            for (int valor : A) {
                if (!lista.contains(valor)) {
                    lista.add(valor);
                }
            }

                for (int valor : B) {
                    if (!lista.contains(valor)) {
                        lista.add(valor);
                    }
                }

                    int[] C = new int[lista.size()];
                    for(int j + 0; j < lista.size(); j++) {
                        C[j] = lista.get(j);
                    }



        System.out.println("O vetor A: " + Arrays.toString(A));
        System.out.println("O vetor B: " + Arrays.toString(B));
        System.out.println("O vetor C: " + Arrays.toString(C));

    }
}
