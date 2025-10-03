import java.util.Scanner;

public class exnove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int menor = 0;
        boolean primeiro = true;

        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (primeiro) {
                    menor = numero;
                    primeiro = false;
                } else {
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }

        } while (numero != 0);

        if (!primeiro) {
            System.out.println("O menor número digitado foi: " + menor);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
