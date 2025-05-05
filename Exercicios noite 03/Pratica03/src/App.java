public class App {
    public static void main(String[] args)  {
        //pela pergunta eu entendi que o vetor é predefinido
        
        int[] vetor = {1,9,90,20,13,80,69,81,4,7,9,12,78,77,88,15,55,4,19,3};
        int par = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] % 2 == 0) {
                    par++;
                }
            }
        System.out.println("Vetor: ");
         for (int numero: vetor) {
            System.out.println(numero);

         }
     System.out.println("A quanridade de números pares são:" + par);
    }
}
