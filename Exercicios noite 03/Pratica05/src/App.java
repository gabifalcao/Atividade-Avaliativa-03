public class App {
    public static void main(String[] args) {
        //pelo oq eu entendi esse tbm não tem entrada pelo usuário.

        int [] numeros = {1,2,34,5,8,9,19,77,88,69,11,60};
        int soma = 0;
        int Acimamedia = 0;

            for (int num: numeros) {
                soma += num;
            }
                double media = (double) soma / numeros.length;

                    for (int num : numeros) {
                        if (num > media) {
                            Acimamedia++;
                        }
                    }

        System.out.println("Vetor: ");
                    for (int num : numeros) {
                        System.out.println( num + "");

                    }
                    System.out.println("Média: " + media);
                    System.out.println("A quantidade de números acima da média é: " + Acimamedia);
    }
}
