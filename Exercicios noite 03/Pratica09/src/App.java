import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> intersecao = new ArrayList<>();

        int [] A = {10,22,63,74,85,6};
        int [] B = {7,85,9,10,6,12};

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B.length; j++);
                    if (A[i] == B[i] && !intersecao.contains(A[i])) {
                        intersecao.add(A[i]);
                    }
            }

            int[] C = new int[intersecao.size()];
            for (int i = 0; i < intersecao.size(); i++) {
                C[i] = intersecao.get(i); }

                System.out.println("O vetor A é: " + Arrays.toString(A));
                System.out.println("O vetor B é: " + Arrays.toString(B));
                System.out.println("A interseção é : " + Arrays.toString(C));
    }
}
